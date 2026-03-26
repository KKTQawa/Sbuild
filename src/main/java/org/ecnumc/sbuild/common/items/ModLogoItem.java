package org.ecnumc.sbuild.common.items;

import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.decoration.Painting;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import org.ecnumc.sbuild.common.registries.ECNUPaintings;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.List;

import static org.ecnumc.sbuild.ECNUForge.MODID;

public class ModLogoItem extends Item {

    public ModLogoItem(Item.Properties properties) {
        super(properties);
    }
    @Override
    public @NotNull InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        BlockPos pos = context.getClickedPos();
        Direction face = context.getClickedFace();

        if (face == Direction.UP || face == Direction.DOWN) {
            return InteractionResult.FAIL; // 画只能贴墙
        }

        BlockPos placePos = pos.relative(face);

        Painting painting = new Painting(
                level,
                placePos,
                face,
                ECNUPaintings.LOGO.getHolder().get()
        );

        if (painting.survives()) {
            if (!level.isClientSide) {
                level.addFreshEntity(painting);
                painting.playPlacementSound();
            }

            context.getItemInHand().shrink(1);
            return InteractionResult.SUCCESS;
        }

        return InteractionResult.CONSUME;
    }

    @Override
    public void appendHoverText(@NotNull ItemStack stack, @Nullable Level level, @NotNull List<Component> components, @NotNull TooltipFlag isAdvanced) {
        //super.appendHoverText(stack, level, components, isAdvanced);
        components.add(Component.translatable("item." + MODID + ".mod_logo.description").withStyle(ChatFormatting.AQUA));
    }

}
