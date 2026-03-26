package org.ecnumc.sbuild.common.structures.bridge2;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.level.levelgen.structure.StructurePiece;
import net.minecraft.world.level.levelgen.structure.StructureType;
import org.ecnumc.sbuild.common.registries.ECNUStructures;

import java.util.Optional;

public class Bridge2Structure extends Structure {

    public static final Codec<Bridge2Structure> CODEC = simpleCodec(Bridge2Structure::new);

    public Bridge2Structure(StructureSettings settings) {
        super(settings);
    }

    @Override
    public StructureType<?> type() {
        return ECNUStructures.BRIDGE2_TYPE.get();
    }


    @Override
    public Optional<GenerationStub> findGenerationPoint(GenerationContext context) {

        BlockPos center = context.chunkPos().getMiddleBlockPosition(0);
        int surfaceY = context.chunkGenerator().getBaseHeight(
                center.getX(),
                center.getZ(),
                Heightmap.Types.WORLD_SURFACE_WG,
                context.heightAccessor(),
                context.randomState()
        );

        BlockPos centerPos = new BlockPos(center.getX(), surfaceY, center.getZ());
        //System.out.println("bridge2:try generate at " + centerPos);
        BlockPos waterPos = findWaterSurface(context, centerPos);
        //System.out.println("bridge2:waterPos = " + waterPos);
        if (waterPos == null) {
            return Optional.empty();
        }

        RiverInfo imf = getRiverWidth(context, waterPos);

        //System.out.println("bridge2:width = " + imf.width);

        if (imf.width<12||imf.width >200) {
            return Optional.empty();
        }

        return Optional.of(new GenerationStub(waterPos, builder -> {
            Bridge2Pieces.generate(context, waterPos.above(), imf,builder);
        }));
    }

    private RiverInfo  getRiverWidth(Structure.GenerationContext context, BlockPos pos) {

        int widthX = scanWidth(context, pos, Direction.EAST, Direction.WEST);
        int widthZ = scanWidth(context, pos, Direction.NORTH, Direction.SOUTH);

        if (widthX < widthZ) {
            return new RiverInfo(widthX, Direction.WEST);
        } else {
            return new RiverInfo(widthZ, Direction.NORTH);
        }
    }
    private boolean isRiverBiome(Structure.GenerationContext context, BlockPos pos) {
        Holder<Biome> biome = context.biomeSource().getNoiseBiome(
                pos.getX() >> 2,
                pos.getY() >> 2,
                pos.getZ() >> 2,
                context.randomState().sampler()
        );

        return biome.is(BiomeTags.IS_RIVER);
    }

    private BlockPos findWaterSurface(Structure.GenerationContext context, BlockPos pos) {

        for (int dx = -8; dx <= 8; dx+=4) {
            for (int dz = -8; dz <= 8; dz+=4) {

                int x = pos.getX() + dx;
                int z = pos.getZ() + dz;
                int y = pos.getY() ;

                if (!isRiverBiome(context, new BlockPos(x,y, z))) continue;
               // System.out.println("target pos is in the river biome");

                BlockPos.MutableBlockPos mPos = new BlockPos.MutableBlockPos(x, y+12, z);

                for (int i = 0; i < 20; i++) {

                    if (Bridge2Pieces.isWater(context, mPos)
                            && !Bridge2Pieces.isWater(context, mPos.above())) {
                        return mPos.immutable();
                    }

                    mPos.move(Direction.DOWN);
                }
            }
        }

        return null;
    }

    private boolean isWaterSurface(Structure.GenerationContext context, BlockPos pos) {
        //上面一格不是水但是自己是水
        return Bridge2Pieces.isWater(context, pos)
                && !Bridge2Pieces.isWater(context, pos.above());
    }

    private int scanWidth(Structure.GenerationContext context,
                          BlockPos pos,
                          Direction dir1,
                          Direction dir2) {

        int max = 100;

        int d1 = 0;
        int d2 = 0;

        for (int i = 1; i < max; i++) {
            BlockPos p = pos.relative(dir1, i);

            if (!isWaterSurface(context, p)) {
                d1 = i;
                break;
            }
        }

        for (int i = 1; i < max; i++) {
            BlockPos p = pos.relative(dir2, i);

            if (!isWaterSurface(context, p)) {
                d2 = i;
                break;
            }
        }

        if (d1 == 0 || d2 == 0) return 999;

        return d1 + d2;
    }
    public static class RiverInfo {
        public final int width;
        public final Direction direction;

        public RiverInfo(int width, Direction direction) {
            this.width = width;
            this.direction = direction;
        }
    }
}
