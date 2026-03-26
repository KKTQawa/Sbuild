package org.ecnumc.sbuild.common.structures.bridge1;

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
import org.ecnumc.sbuild.common.processorlist.BridgeHandleFench;
import org.ecnumc.sbuild.common.registries.ECNUProcessorList;
import org.ecnumc.sbuild.common.registries.ECNUStructures;

import java.util.Optional;

public class Bridge1Pieces {

    public static void generate(
            Structure.GenerationContext context,
            BlockPos startPos,
            Bridge1Structure.RiverInfo info,
            StructurePiecesBuilder builder
    ) {

        // 根据方向确定旋转（因为模板默认朝 WEST）
        Rotation rotation = switch (info.direction) {
            case WEST -> Rotation.NONE;
            case EAST -> Rotation.CLOCKWISE_180;
            case NORTH -> Rotation.CLOCKWISE_90;
            case SOUTH -> Rotation.COUNTERCLOCKWISE_90;
            default -> Rotation.NONE;
        };

        BlockPos pos = startPos;
        Direction nowDir = info.direction;

        // ===== 中心 5m =====
       // System.out.println("尝试在" + pos.toString()+"生成bridge1_straight_5m,旋转："+rotation);
        builder.addPiece(new Bridge1Piece(
                context.structureTemplateManager(),
                new ResourceLocation("sbuild", "bridge1/bridge1_straight_5m"),
                pos,
                rotation
        ));

        pos = pos.relative(nowDir, 8);

        int width = info.width;
        int maxSegments = Math.max(50,(int) Math.ceil(width /8.0));

        // ===== 向前 =====
        for (int i = 0; i < maxSegments; i++) {
            if (isLand(context, pos)){
                BlockPos tp=pos.relative(nowDir.getOpposite(), 3);
                if(!isLand(context, tp)){
                   // System.out.println("尝试在" + pos.toString()+"生成bridge1_straight_8m,旋转："+rotation);
                    builder.addPiece(new Bridge1Piece(
                            context.structureTemplateManager(),
                            new ResourceLocation("sbuild", "bridge1/bridge1_straight_8m"),
                            pos,
                            rotation
                    ));
                    break;
                }else{
                    //回退
                    pos = pos.relative(nowDir.getOpposite(), 8);
                    break;
                }
            }
            //System.out.println("尝试在" + pos.toString()+"生成bridge1_straight_8m,旋转："+rotation);
            builder.addPiece(new Bridge1Piece(
                    context.structureTemplateManager(),
                    new ResourceLocation("sbuild", "bridge1/bridge1_straight_8m"),
                    pos,
                    rotation
            ));

            pos = pos.relative(nowDir, 8);
        }
        pos = pos.relative(nowDir, 3);
        // ===== 桥尾 =====
       // System.out.println("尝试在" + pos.toString()+"生成bridge1_tail,旋转："+rotation);
        builder.addPiece(new Bridge1Piece(
                context.structureTemplateManager(),
                new ResourceLocation("sbuild", "bridge1/bridge1_tail"),
                pos,
                rotation
        ));

        // ===== 向后 =====
        pos = startPos;

//        Direction nowDir = switch (nowDir) {
//            case WEST -> Direction.EAST;
//            case EAST -> Direction.WEST;
//            case NORTH -> Direction.SOUTH;
//            case SOUTH -> Direction.NORTH;
//            default -> Direction.WEST;
//        };
        nowDir = nowDir.getOpposite();
        pos = pos.relative(nowDir, 5);

        for (int i = 0; i < maxSegments; i++) {

            if (isLand(context, pos)){
                break;
            }
            //System.out.println("尝试在" + pos.toString()+"生成bridge1_straight_8m,旋转："+rotation);
            builder.addPiece(new Bridge1Piece(
                    context.structureTemplateManager(),
                    new ResourceLocation("sbuild", "bridge1/bridge1_straight_8m"),
                    pos,
                    rotation
            ));
            pos = pos.relative(nowDir, 8);
        }
        // ===== 前桥头 =====
        //System.out.println("尝试在" + pos.toString()+"生成bridge1_head,旋转："+rotation);

        builder.addPiece(new Bridge1Piece(
                context.structureTemplateManager(),
                new ResourceLocation("sbuild", "bridge1/bridge1_head"),
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

    public static class  Bridge1Piece extends TemplateStructurePiece {

        public Bridge1Piece(
                StructureTemplateManager manager,
                ResourceLocation id,
                BlockPos pos,
                Rotation rotation
        ) {
            super(
                    ECNUStructures.BRIDGE1_PIECE.get(),
                    0,
                    manager,
                    id,
                    id.toString(),
                    makeSettings(rotation),
                    pos
            );
        }

        public Bridge1Piece(StructureTemplateManager manager, CompoundTag tag) {
            super(
                    ECNUStructures.BRIDGE1_PIECE.get(),
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
                    .addProcessor(new BridgeHandleFench());
        }


        //将配置写入nbt文件
        @Override
        protected void addAdditionalSaveData(StructurePieceSerializationContext context, CompoundTag tag) {
            super.addAdditionalSaveData(context, tag);
            tag.putString("Rot", this.placeSettings.getRotation().name());
        }
        private void spawnChest(ServerLevelAccessor level, BlockPos pos, RandomSource random, String lootTableId) {

            level.setBlock(pos, net.minecraft.world.level.block.Blocks.CHEST.defaultBlockState(), 2);

            net.minecraft.world.level.block.entity.RandomizableContainerBlockEntity.setLootTable(
                    level,
                    random,
                    pos,
                    new net.minecraft.resources.ResourceLocation(lootTableId)
            );
        }
        @Override
        protected void handleDataMarker(String name, BlockPos pos, ServerLevelAccessor level, RandomSource random, BoundingBox boundingBox) {

            switch (name) {
                case "bridge1/bridge1_head" -> {

                }
                case "bridge1/bridge1_turn_left_6-3"-> {

                }
                case "bridge1/bridge1_turn_right_6-3" -> {

                }

                case "bridge1/bridge1_straight_5m" -> {
                    int centerX = (boundingBox.minX() + boundingBox.maxX()) / 2;
                    int centerZ = (boundingBox.minZ() + boundingBox.maxZ()) / 2;

                    int y = level.getHeight(Heightmap.Types.WORLD_SURFACE, centerX, centerZ);

                    BlockPos spawnPos = new BlockPos(centerX, y, centerZ);
                    if (random.nextFloat() < 0.1f) {
                        spawnChest(level, spawnPos, random, "minecraft:chests/stronghold_crossing");
                    }
                }

                case "bridge1/bridge1_straight_8m" -> {
                    int centerX = (boundingBox.minX() + boundingBox.maxX()) / 2;
                    int centerZ = (boundingBox.minZ() + boundingBox.maxZ()) / 2;

                    int y = level.getHeight(Heightmap.Types.WORLD_SURFACE, centerX, centerZ);

                    BlockPos spawnPos = new BlockPos(centerX, y, centerZ);
                    if (random.nextFloat() < 0.05f) {
                        spawnChest(level, spawnPos, random, "sbuild:chests/total");
                    }
                }
            }
        }
    }
}