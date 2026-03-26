package org.ecnumc.sbuild.common.structures.bridge2;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.structure.BoundingBox;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.level.levelgen.structure.StructurePiece;
import net.minecraft.world.level.levelgen.structure.TemplateStructurePiece;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePieceSerializationContext;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePiecesBuilder;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockIgnoreProcessor;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplateManager;
import net.minecraft.world.level.material.FluidState;
import org.ecnumc.sbuild.common.processorlist.*;
import org.ecnumc.sbuild.common.registries.ECNUProcessorList;
import org.ecnumc.sbuild.common.registries.ECNUStructures;

import java.util.Optional;

import static net.minecraft.world.level.block.Rotation.CLOCKWISE_90;
import static net.minecraft.world.level.block.Rotation.COUNTERCLOCKWISE_90;

public class Bridge2Pieces {

    private static int get_temp_length(String tmp) {
        switch(tmp) {
            // 直线桥段
            case "bridge2/bridge2_straight_8m": return 8;

            // 左右移动桥段
            case "bridge2/bridge2_move_left_2_6m": return 6;
            case "bridge2/bridge2_move_right_2_6m": return 6;

            // 左右转弯桥段
            case "bridge2/bridge2_turn_left": return 7;
            case "bridge2/bridge2_turn_right": return 7;

            // 桥头/桥尾
            case "bridge2/bridge2_head": return 3;
            case "bridge2/bridge2_tail": return 3;

            default:
                return 8;
        }
    }

    public static void generate(
            Structure.GenerationContext context,
            BlockPos startPos,
            Bridge2Structure.RiverInfo info,
            StructurePiecesBuilder builder
    ) {

        RandomSource random = context.random();

        Rotation rotation = switch (info.direction) {
            case WEST -> Rotation.NONE;
            case EAST -> Rotation.CLOCKWISE_180;
            case NORTH -> CLOCKWISE_90;
            case SOUTH -> COUNTERCLOCKWISE_90;
            default -> Rotation.NONE;
        };

        BlockPos new_start_pos = startPos.above(4);

        BlockPos pos = new_start_pos;
        Direction nowDir = info.direction;

        // ===== 起始 piece =====
        builder.addPiece(new Bridge2Piece(
                context.structureTemplateManager(),
                new ResourceLocation("sbuild", "bridge2/bridge2_straight_8m"),
                pos,
                rotation
        ));

        int maxSegments = Math.max(50,(int) Math.ceil(info.width /8.0));

        boolean has_turn_left = false;
        boolean has_turn_right = false;

        // ===== 向前生成 =====
        //先确定放什么，再移动
        for (int i = 0; i < maxSegments; i++) {

            if (isLand2(context, pos, nowDir)||isLand(context,pos)){
                break;
            }

            Direction left = nowDir.getCounterClockWise();
            Direction right = nowDir.getClockWise();

            float r = random.nextFloat();

            // ===== 左移（先左2，再前6）=====
            if (r < 0.1f) {
                pos = pos.relative(nowDir, 6);
               // System.out.println("尝试在" + pos.toString()+"生成bridge2/bridge2_move_left_2_6m,旋转："+rotation);
                builder.addPiece(new Bridge2Piece(
                        context.structureTemplateManager(),
                        new ResourceLocation("sbuild", "bridge2/bridge2_move_left_2_6m"),
                        pos,
                        rotation
                ));
                pos = pos.relative(left, 2);
            }

            // ===== 右移（右2，前6）=====
            else if (r < 0.2f) {
                pos = pos.relative(nowDir, 6);
                pos = pos.relative(right, 2);
               // System.out.println("尝试在" + pos.toString()+"生成bridge2/bridge2_move_right_2_6m,旋转："+rotation);

                builder.addPiece(new Bridge2Piece(
                        context.structureTemplateManager(),
                        new ResourceLocation("sbuild", "bridge2/bridge2_move_right_2_6m"),
                        pos,
                        rotation
                ));
            }
            // ===== 直线 =====
            else {
                pos = pos.relative(nowDir, 8);
               // System.out.println("尝试在" + pos.toString()+"生成bridge2/bridge2_straight_8m,旋转："+rotation);

                builder.addPiece(new Bridge2Piece(
                        context.structureTemplateManager(),
                        new ResourceLocation("sbuild", "bridge2/bridge2_straight_8m"),
                        pos,
                        rotation
                ));
            }
        }

        // ===== 桥尾 =====
        pos = pos.relative(nowDir, 3);
        while (!isLand(context,pos)) {
           // System.out.println("尝试在" + pos.toString()+"生成bridge2/bridge2_tail,旋转："+rotation);

            builder.addPiece(new Bridge2Piece(
                    context.structureTemplateManager(),
                    new ResourceLocation("sbuild", "bridge2/bridge2_tail"),
                    pos,
                    rotation
            ));
            pos = pos.relative(nowDir, 2).below(2);
        }
       // System.out.println("尝试在" + pos.toString()+"生成bridge2/bridge2_tail,旋转："+rotation);

        builder.addPiece(new Bridge2Piece(
                context.structureTemplateManager(),
                new ResourceLocation("sbuild", "bridge2/bridge2_tail"),
                pos,
                rotation
        ));

        // ===== 向后 =====
        pos = new_start_pos;

        has_turn_left = false;
        has_turn_right = false;

        nowDir = info.direction.getOpposite();
        pos = pos.relative(nowDir, 8);

        // ===== 反向生成 =====
        for (int i = 0; i < maxSegments; i++) {

            if (isLand2(context, pos, nowDir)||isLand(context,pos)) break;

            Direction left = nowDir.getCounterClockWise();
            Direction right = nowDir.getClockWise();

            float r = random.nextFloat();

            if (r < 0.15f) {
               // System.out.println("尝试在" + pos.toString()+"生成bridge2/bridge2_move_left_2_6m,旋转："+rotation);
                pos = pos.relative(left, 2);
                builder.addPiece(new Bridge2Piece(
                        context.structureTemplateManager(),
                        new ResourceLocation("sbuild", "bridge2/bridge2_move_left_2_6m"),
                        pos,
                        rotation
                ));
                pos = pos.relative(nowDir, 6);
            }

            // ===== 右移（右2，前6）=====
            else if (r < 0.3f) {

               // System.out.println("尝试在" + pos.toString()+"生成bridge2/bridge2_move_right_2_6m,旋转："+rotation);

                builder.addPiece(new Bridge2Piece(
                        context.structureTemplateManager(),
                        new ResourceLocation("sbuild", "bridge2/bridge2_move_right_2_6m"),
                        pos,
                        rotation
                ));
                pos = pos.relative(right, 2);
                pos = pos.relative(nowDir, 6);
            }
            // ===== 直线 =====
            else {
               // System.out.println("尝试在" + pos.toString()+"生成bridge2/bridge2_straight_8m,旋转："+rotation);

                builder.addPiece(new Bridge2Piece(
                        context.structureTemplateManager(),
                        new ResourceLocation("sbuild", "bridge2/bridge2_straight_8m"),
                        pos,
                        rotation
                ));
                pos = pos.relative(nowDir, 8);
            }
        }

        // ===== 桥头 =====
        while (!isLand(context,pos)) {
          //  System.out.println("尝试在" + pos.toString()+"生成bridge2/bridge2_head,旋转："+rotation);
            builder.addPiece(new Bridge2Piece(
                    context.structureTemplateManager(),
                    new ResourceLocation("sbuild", "bridge2/bridge2_head"),
                    pos,
                    rotation
            ));

            pos = pos.relative(nowDir, 2).below(2);
        }
       // System.out.println("尝试在" + pos.toString()+"生成bridge2/bridge2_head,旋转："+rotation);

        builder.addPiece(new Bridge2Piece(
                context.structureTemplateManager(),
                new ResourceLocation("sbuild", "bridge2/bridge2_head"),
                pos,
                rotation
        ));
    }

    public static boolean isWater(Structure.GenerationContext context, BlockPos pos) {

        var column = context.chunkGenerator().getBaseColumn(
                pos.getX(),
                pos.getZ(),
                context.heightAccessor(),
                context.randomState()
        );

        return column.getBlock(pos.getY()).getFluidState().is(FluidTags.WATER);
    }

    public static boolean isLand(Structure.GenerationContext context, BlockPos pos) {

        var column = context.chunkGenerator().getBaseColumn(
                pos.getX(),
                pos.getZ(),
                context.heightAccessor(),
                context.randomState()
        );

        BlockState state = column.getBlock(pos.getY());
        return !state.isAir() && state.getFluidState().isEmpty();
    }

    public static boolean isLand2(Structure.GenerationContext context, BlockPos pos, Direction dir) {

        BlockPos checkPos = pos.relative(dir, 8).below(4);

        int y = checkPos.getY();

        var column = context.chunkGenerator().getBaseColumn(
                checkPos.getX(),
                checkPos.getZ(),
                context.heightAccessor(),
                context.randomState()
        );

        int minY = context.heightAccessor().getMinBuildHeight();
        int maxY = context.heightAccessor().getMaxBuildHeight() - 1;
        y = Math.max(minY, Math.min(maxY, y));

        BlockState state = column.getBlock(y);
        return !state.isAir() && state.getFluidState().isEmpty();
    }


    public static class  Bridge2Piece extends TemplateStructurePiece {

        public Bridge2Piece(
                StructureTemplateManager manager,
                ResourceLocation id,
                BlockPos pos,
                Rotation rotation
        ) {
            super(
                    ECNUStructures.BRIDGE2_PIECE.get(),
                    0,
                    manager,
                    id,
                    id.toString(),
                    makeSettings(rotation),
                    pos
            );
        }

        public Bridge2Piece(StructureTemplateManager manager, CompoundTag tag) {
            super(
                    ECNUStructures.BRIDGE2_PIECE.get(),
                    tag,
                    manager,
                    (id) -> makeSettings(Rotation.valueOf(tag.getString("Rot")))
            );
        }

        //定义nbt如何放置
        private static StructurePlaceSettings makeSettings(Rotation rotation) {
            return new StructurePlaceSettings()
                    .setRotation(rotation)
                    .setMirror(Mirror.NONE)
                    .setKeepLiquids(true)
                    .addProcessor(BlockIgnoreProcessor.STRUCTURE_BLOCK)
                    .addProcessor(new PostStation1HandleChest())
                    .addProcessor(new BridgeHandleBrickWall())
                    .addProcessor(new BridgeHandleFrogLight())
                    .addProcessor(new BridgeHandleGrid());
        }


        //将配置写入nbt文件
        @Override
        protected void addAdditionalSaveData(StructurePieceSerializationContext context, CompoundTag tag) {
            super.addAdditionalSaveData(context, tag);
            tag.putString("Rot", this.placeSettings.getRotation().name());
        }

        @Override
        protected void handleDataMarker(String name, BlockPos pos, ServerLevelAccessor level, RandomSource random, BoundingBox boundingBox) {
            switch (name) {
                case "bridge2/bridge2_head" -> {

                }
                case "bridge2/bridge2_move_left_2-6m",
                     "bridge2/bridge2_move_right_2-6m",
                     "bridge2/bridge2_turn_left",
                     "bridge2/bridge2_turn_right" -> {

                    if (random.nextFloat() < 0.2f) {

                        int centerX = (boundingBox.minX() + boundingBox.maxX()) / 2;
                        int centerZ = (boundingBox.minZ() + boundingBox.maxZ()) / 2;

                        int y = level.getHeight(Heightmap.Types.WORLD_SURFACE, centerX, centerZ);

                        BlockPos spawnPos = new BlockPos(centerX, y, centerZ);

                        // 创建掠夺者
                        var pillager = net.minecraft.world.entity.EntityType.PILLAGER.create(level.getLevel());

                        if (pillager != null) {
                            pillager.moveTo(
                                    spawnPos.getX() + 0.5,
                                    spawnPos.getY(),
                                    spawnPos.getZ() + 0.5,
                                    random.nextFloat() * 360F,
                                    0
                            );

                            // 不消失
                            pillager.setPersistenceRequired();

                            level.addFreshEntity(pillager);
                        }
                    }
                }
                case "bridge2/bridge2_straight_8m"-> {

                }
                case "bridge2/bridge2_tail" -> {

                }
            }
        }
    }
}