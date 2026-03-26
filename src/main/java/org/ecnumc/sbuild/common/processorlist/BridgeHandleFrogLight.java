package org.ecnumc.sbuild.common.processorlist;

import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureProcessor;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureProcessorType;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import org.ecnumc.sbuild.common.registries.ECNUBlocks;
import org.ecnumc.sbuild.common.registries.ECNUProcessorList;
import org.ecnumc.sbuild.common.tags.ECNUBlockTags;

public class BridgeHandleFrogLight extends StructureProcessor {

    public static final Codec<BridgeHandleFench> CODEC =
            Codec.unit(() -> new BridgeHandleFench());

    public BridgeHandleFrogLight() {}

    @Override
    public StructureTemplate.StructureBlockInfo processBlock(
            LevelReader level,
            BlockPos offset,
            BlockPos pivot,
            StructureTemplate.StructureBlockInfo original,
            StructureTemplate.StructureBlockInfo current,
            StructurePlaceSettings settings) {

        RandomSource random = settings.getRandom(pivot);

        // 20% 概率触发替换
        if (random.nextFloat() >= 0.2f) {
            return current;
        }

        if (!current.state().is(ECNUBlockTags.ECNUGRID_TAG)){
            return current;
        }

        // 再用同一个 seed 生成 5等概率结果
        int type = random.nextInt(3);

        BlockState newState = switch (type) {
            case 0 -> ECNUBlocks.GRID_RED.get().defaultBlockState();

            case 1, 2, 3 -> ECNUBlocks.GRID_BLUE.get().defaultBlockState();

            case 4, 5, 6 -> ECNUBlocks.GRID_WHITE.get().defaultBlockState();

            case 7, 8, 9 -> ECNUBlocks.BRICK_BLACK.get().defaultBlockState();

            case 10 -> ECNUBlocks.GRID_PURPLE.get().defaultBlockState();
            case 11 -> ECNUBlocks.GRID_ORANGE.get().defaultBlockState();
            case 12 -> ECNUBlocks.GRID_YELLOW.get().defaultBlockState();
            case 13 -> ECNUBlocks.GRID_GREEN.get().defaultBlockState();
            case 14 -> ECNUBlocks.GRID_PINK.get().defaultBlockState();
            case 15 -> ECNUBlocks.BRICK_YELLOW.get().defaultBlockState();

            default -> current.state();
        };

        return new StructureTemplate.StructureBlockInfo(
                current.pos(),
                newState,
                current.nbt()
        );
    }

    @Override
    protected StructureProcessorType<?> getType() {
        return ECNUProcessorList.BRIDGE_HANDLE_FROGLIGHT.get();
    }
}
