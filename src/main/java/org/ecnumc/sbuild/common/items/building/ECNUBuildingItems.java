package org.ecnumc.sbuild.common.items.building;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextColor;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;

import javax.annotation.Nullable;
import java.util.List;

import static org.ecnumc.sbuild.ECNUForge.MODID;

public class ECNUBuildingItems {
    public static class BrickBlackItem extends BlockItem {
        public BrickBlackItem(Block block, Properties properties) {
            super(block,properties);
        }

        @Override
        public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag isAdvanced) {
            //super.appendHoverText(stack, level, components, isAdvanced);
            components.add(Component.translatable("item." + MODID + ".brick_black.description").withStyle(Style.EMPTY.withColor(TextColor.fromRgb(0x6F4E37))));
        }
    }

    public static class BrickYellowItem extends BlockItem {
        public BrickYellowItem(Block block, Properties properties) {
            super(block,properties);
        }

        @Override
        public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag isAdvanced) {
            //super.appendHoverText(stack, level, components, isAdvanced);
            components.add(Component.translatable("item." + MODID + ".brick_yellow.description").withStyle(Style.EMPTY.withColor(TextColor.fromRgb(0xFFD700))));
        }
    }

    public static class SquareBlackItem extends BlockItem {
        public SquareBlackItem(Block block, Properties properties) {
            super(block,properties);
        }

        @Override
        public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag isAdvanced) {
            //super.appendHoverText(stack, level, components, isAdvanced);
            components.add(Component.translatable("item." + MODID + ".square_black.description").withStyle(Style.EMPTY.withColor(TextColor.fromRgb(0x6F4E37))));
        }
    }
}
