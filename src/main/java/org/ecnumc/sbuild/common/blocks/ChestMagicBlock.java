package org.ecnumc.sbuild.common.blocks;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.ChestBlock;
import net.minecraft.world.phys.BlockHitResult;
import org.ecnumc.sbuild.common.blockentities.ChestMagicBlockEntity;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.core.BlockPos;

import static net.minecraft.world.Containers.dropContents;

public class ChestMagicBlock extends BaseEntityBlock {

    public ChestMagicBlock(Properties properties) {
        super(properties);
    }

    @Override
    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL; // 用JSON模型
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new ChestMagicBlockEntity(pos, state);
    }

    //右键点击
    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos,
                                 Player player, InteractionHand hand, BlockHitResult hit) {

        //服务器端
        if (!level.isClientSide) {
            BlockEntity be = level.getBlockEntity(pos);
            if (be instanceof ChestMagicBlockEntity chest) {
                // 🎵 播放开箱声音
                level.playSound(
                        null, // 所有人都能听到
                        pos,
                        SoundEvents.CHEST_OPEN,
                        SoundSource.BLOCKS,
                        0.5F,
                        level.random.nextFloat() * 0.1F + 0.9F
                );

                player.openMenu(chest);
            }
        }
        //报告交互已经处理
        return InteractionResult.sidedSuccess(level.isClientSide);
    }

    //箱子掉落
    @Override
    public void onRemove(BlockState state, Level level, BlockPos pos,
                         BlockState newState, boolean isMoving) {

        if (!state.is(newState.getBlock())) {
            BlockEntity be = level.getBlockEntity(pos);

            if (be instanceof ChestMagicBlockEntity chest) {
                dropContents(level, pos, chest);
            }

            super.onRemove(state, level, pos, newState, isMoving);
        }
    }
}
