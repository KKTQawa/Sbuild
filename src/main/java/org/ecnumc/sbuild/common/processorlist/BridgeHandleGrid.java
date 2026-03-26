package org.ecnumc.sbuild.common.processorlist;

import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureProcessor;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureProcessorType;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import org.ecnumc.sbuild.common.registries.ECNUProcessorList;

public class BridgeHandleGrid  extends StructureProcessor {

    public static final Codec<BridgeHandleFench> CODEC =
            Codec.unit(() -> new BridgeHandleFench());

    public BridgeHandleGrid() {}

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

        if (!current.state().is(Blocks.VERDANT_FROGLIGHT)
                && !current.state().is(Blocks.PEARLESCENT_FROGLIGHT)
                && !current.state().is(Blocks.OCHRE_FROGLIGHT)) {
            return current;
        }

        // 再用同一个 seed 生成 5等概率结果
        int type = random.nextInt(3);

        BlockState newState = switch (type) {
            case 0 -> Blocks.VERDANT_FROGLIGHT.defaultBlockState();
            case 1 -> Blocks.PEARLESCENT_FROGLIGHT.defaultBlockState();
            case 2 -> Blocks.OCHRE_FROGLIGHT.defaultBlockState();
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
        return ECNUProcessorList.BRIDGE_HANDLE_GRID.get();
    }
}
