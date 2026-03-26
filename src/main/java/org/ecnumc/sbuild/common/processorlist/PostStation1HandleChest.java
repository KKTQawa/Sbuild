package org.ecnumc.sbuild.common.processorlist;


import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureProcessor;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureProcessorType;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate.StructureBlockInfo;
import org.ecnumc.sbuild.common.registries.ECNUProcessorList;
import org.ecnumc.sbuild.common.registries.ECNUBlocks;
import com.mojang.serialization.Dynamic;

import javax.annotation.Nullable;

public class PostStation1HandleChest extends StructureProcessor {
//    // 用于 JSON / 网络序列化
//    public static final Codec<PostStation1HandleChest> CODEC = RecordCodecBuilder.create(instance ->
//            instance.group(
//                    instance.point(new PostStation1HandleChest()) // 直接返回实例
//            ).apply(instance, ignored -> new PostStation1HandleChest()) // 这里用 lambda 忽略参数
//    );

    public static final Codec<PostStation1HandleChest> CODEC =
            Codec.unit(() -> new PostStation1HandleChest());

    public PostStation1HandleChest() {
    }

    public PostStation1HandleChest(Dynamic<?> dynamic) {
        // 可空实现
    }
    @Override
    @Nullable
    public StructureBlockInfo processBlock(
            LevelReader world,
            BlockPos offset,
            BlockPos pos,
            StructureBlockInfo blockInfo,
            StructureBlockInfo relativeBlockInfo,
            StructurePlaceSettings settings) {

        // 获取当前方块
        BlockState state = relativeBlockInfo.state();

        // 只处理 sbuild:chest_magic
        if (state.is(ECNUBlocks.CHEST_MAGIC.get())) {

            double random = Math.random(); // 生成 0-1 的随机数

            if (random < 0.4) {
                // 保留原方块（概率 0.4）
                return relativeBlockInfo;
            } else {
                // 替换为空气（概率 0.6）
                return new StructureBlockInfo(
                        relativeBlockInfo.pos(),
                        Blocks.AIR.defaultBlockState(),
                        relativeBlockInfo.nbt()
                );
            }
        }

        // 非目标方块不变
        return relativeBlockInfo;
    }

    @Override
    protected StructureProcessorType<?> getType() {
        return ECNUProcessorList.POST_STATION1_HANDLE_CHEST.get();
    }
}