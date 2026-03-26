package org.ecnumc.sbuild.common.processorlist;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.structure.templatesystem.*;
import org.ecnumc.sbuild.common.registries.ECNUProcessorList;

public class BridgeHandleFench extends StructureProcessor {

    public static final Codec<BridgeHandleFench> CODEC =
            Codec.unit(() -> new BridgeHandleFench());

    public BridgeHandleFench() {}

    @Override
    public StructureTemplate.StructureBlockInfo processBlock(
            LevelReader level,
            BlockPos offset,
            BlockPos pivot,
            StructureTemplate.StructureBlockInfo original,
            StructureTemplate.StructureBlockInfo current,
            StructurePlaceSettings settings) {

        RandomSource random = settings.getRandom(pivot);

        // 60%概率触发替换
        if (random.nextFloat() >= 0.4f) return current;

        if (current.state().is(BlockTags.FENCES)) {

            BlockState newFence = switch (random.nextInt(6)) {
                case 0 -> Blocks.OAK_FENCE.defaultBlockState();
                case 1 -> Blocks.SPRUCE_FENCE.defaultBlockState();
                case 2 -> Blocks.BIRCH_FENCE.defaultBlockState();
                case 3 -> Blocks.JUNGLE_FENCE.defaultBlockState();
                case 4 -> Blocks.ACACIA_FENCE.defaultBlockState();
                default -> Blocks.DARK_OAK_FENCE.defaultBlockState();
            };

            return new StructureTemplate.StructureBlockInfo(
                    current.pos(),
                    newFence,
                    current.nbt()
            );
        }

        return current;
    }

    @Override
    protected StructureProcessorType<?> getType() {
        return ECNUProcessorList.BRIDGE_HANDLE_FENCH.get();
    }
}