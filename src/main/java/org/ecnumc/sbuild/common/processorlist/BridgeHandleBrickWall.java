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
import org.ecnumc.sbuild.common.registries.ECNUProcessorList;

public class BridgeHandleBrickWall extends StructureProcessor {

    public static final Codec<BridgeHandleFench> CODEC =
            Codec.unit(() -> new BridgeHandleFench());

    public BridgeHandleBrickWall() {}

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

        if (!current.state().is(BlockTags.WALLS)) {
            return current;
        }

        // 再用同一个 seed 生成 5等概率结果
        int type = random.nextInt(5);

        BlockState newState = switch (type) {
            case 0 -> Blocks.PRISMARINE_WALL.defaultBlockState();        // 海晶石砖墙（替代写法）
            case 1 -> Blocks.STONE_BRICK_WALL.defaultBlockState();       // 石砖墙
            case 2 -> Blocks.MOSSY_STONE_BRICK_WALL.defaultBlockState(); // 可选变种
            case 3 -> Blocks.BRICK_WALL.defaultBlockState();             // 红砖墙
            case 4 -> Blocks.END_STONE_BRICK_WALL.defaultBlockState();   // 末地石砖墙
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
        return ECNUProcessorList.BRIDGE_HANDLE_BRICK_WALL.get();
    }
}
