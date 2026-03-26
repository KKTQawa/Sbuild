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
import org.ecnumc.sbuild.common.blocks.BaseLineBlocks;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import static org.ecnumc.sbuild.ECNUForge.MODID;

public class ECNUDoubleLineItems {
    public static class DoubleLineBlueItem extends BlockItem {
        public DoubleLineBlueItem(Block block, Properties properties) {
            super(block,properties);
        }
        @Override
        public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag isAdvanced) {
            //super.appendHoverText(stack, level, components, isAdvanced);
            components.add(Component.translatable("item." + MODID + ".double_line_blue.description").withStyle(ChatFormatting.BLUE));
        }
    }

    public static class DoubleLineRedItem extends BlockItem {
        public DoubleLineRedItem(Block block, Properties properties) {
            super(block,properties);
        }
        @Override
        public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag isAdvanced) {
            //super.appendHoverText(stack, level, components, isAdvanced);
            components.add(Component.translatable("item." + MODID + ".double_line_red.description").withStyle(ChatFormatting.RED));
        }
    }
    public static class DoubleLineYellowItem extends BlockItem {
        public DoubleLineYellowItem(Block block, Properties properties) {
            super(block,properties);
        }
        @Override
        public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag isAdvanced) {
            //super.appendHoverText(stack, level, components, isAdvanced);
            components.add(Component.translatable("item." + MODID + ".double_line_yellow.description").withStyle(ChatFormatting.YELLOW));
        }
    }
    public static class DoubleLineGreenItem extends BlockItem {
        public DoubleLineGreenItem(Block block, Properties properties) {
            super(block,properties);
        }
        @Override
        public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag isAdvanced) {
            //super.appendHoverText(stack, level, components, isAdvanced);
            components.add(Component.translatable("item." + MODID + ".double_line_green.description").withStyle(ChatFormatting.GREEN));
        }
    }
    public static class DoubleLinePurpleItem extends BlockItem {
        public DoubleLinePurpleItem(Block block, Properties properties) {
            super(block,properties);
        }
        @Override
        public void appendHoverText(ItemStack stack, @javax.annotation.Nullable Level level, List<Component> components, TooltipFlag isAdvanced) {
            //super.appendHoverText(stack, level, components, isAdvanced);
            components.add(Component.translatable("item." + MODID + ".double_line_purple.description").withStyle(Style.EMPTY.withColor(TextColor.fromRgb(0xb45cf6))));
        }
    }
    public static class DoubleLineGoldItem extends BlockItem {
        public DoubleLineGoldItem(Block block, Properties properties) {
            super(block,properties);
        }
        @Override
        public void appendHoverText(ItemStack stack, @javax.annotation.Nullable Level level, List<Component> components, TooltipFlag isAdvanced) {
            // super.appendHoverText(stack, level, components, isAdvanced);
            components.add(Component.translatable("item." + MODID + ".double_line_gold.description").withStyle(Style.EMPTY.withColor(TextColor.fromRgb(0xFFD700))));
        }
    }
    public static class DoubleLineOrangeItem extends BlockItem {
        public DoubleLineOrangeItem(Block block, Properties properties) {
            super(block,properties);
        }
        @Override
        public void appendHoverText(ItemStack stack, @javax.annotation.Nullable Level level, List<Component> components, TooltipFlag isAdvanced) {
            //super.appendHoverText(stack, level, components, isAdvanced);
            components.add(
                    Component.translatable("item." + MODID + ".double_line_orange.description")
                            .withStyle(Style.EMPTY.withColor(TextColor.fromRgb(0xFFAA00)))
            );
        }
    }
    public static class DoubleLinePinkItem extends BlockItem {
        public DoubleLinePinkItem(Block block, Properties properties) {
            super(block,properties);
        }
        @Override
        public void appendHoverText(ItemStack stack, @javax.annotation.Nullable Level level, List<Component> components, TooltipFlag isAdvanced) {
            //super.appendHoverText(stack, level, components, isAdvanced);
            components.add(Component.translatable("item." + MODID + ".double_line_pink.description").withStyle(Style.EMPTY.withColor(TextColor.fromRgb(0xFF55FF))));
        }
    }
    public static class DoubleLineWhiteItem extends BlockItem {
        public DoubleLineWhiteItem(Block block, Properties properties) {
            super(block,properties);
        }
        @Override
        public void appendHoverText(ItemStack stack, @javax.annotation.Nullable Level level, List<Component> components, TooltipFlag isAdvanced) {
            //super.appendHoverText(stack, level, components, isAdvanced);
            components.add(Component.translatable("item." + MODID + ".double_line_white.description").withStyle(ChatFormatting.WHITE));
        }
    }
    public static class DoubleLineSkyBlueItem extends BlockItem {
        public DoubleLineSkyBlueItem(Block block, Properties properties) {
            super(block,properties);
        }
        @Override
        public void appendHoverText(ItemStack stack, @javax.annotation.Nullable Level level, List<Component> components, TooltipFlag isAdvanced) {
            //super.appendHoverText(stack, level, components, isAdvanced);
            components.add(Component.translatable("item." + MODID + ".double_line_sky_blue.description").withStyle(Style.EMPTY.withColor(TextColor.fromRgb(0x55FFFF))));
        }
    }
    public static class DoubleLineBlackItem extends BlockItem {
        public DoubleLineBlackItem(Block block, Properties properties) {
            super(block,properties);
        }
        @Override
        public void appendHoverText(ItemStack stack, @javax.annotation.Nullable Level level, List<Component> components, TooltipFlag isAdvanced) {
            //super.appendHoverText(stack, level, components, isAdvanced);
            components.add(Component.translatable("item." + MODID + ".double_line_black.description").withStyle(ChatFormatting.BLACK));
        }
    }
    public static class DoubleLineLightBlueItem extends BlockItem {
        public DoubleLineLightBlueItem(Block block, Properties properties) {
            super(block,properties);
        }
        @Override
        public void appendHoverText(ItemStack stack, @javax.annotation.Nullable Level level, List<Component> components, TooltipFlag isAdvanced) {
            //super.appendHoverText(stack, level, components, isAdvanced);
            components.add(Component.translatable("item." + MODID + ".double_line_light_blue.description").withStyle(Style.EMPTY.withColor(TextColor.fromRgb(0x3399FF))));
        }
    }

    public static class DoubleLineLightPinkItem extends BlockItem {
        public DoubleLineLightPinkItem(Block block, Properties properties) {
            super(block,properties);
        }
        @Override
        public void appendHoverText(ItemStack stack, @javax.annotation.Nullable Level level, List<Component> components, TooltipFlag isAdvanced) {
            //super.appendHoverText(stack, level, components, isAdvanced);
            components.add(Component.translatable("item." + MODID + ".double_line_light_pink.description").withStyle(Style.EMPTY.withColor(TextColor.fromRgb(0xFF55FF))));
        }
    }
    public static class DoubleLineLightRedItem extends BlockItem {
        public DoubleLineLightRedItem(Block block, Properties properties) {
            super(block,properties);
        }
        @Override
        public void appendHoverText(ItemStack stack, @javax.annotation.Nullable Level level, List<Component> components, TooltipFlag isAdvanced) {
            //super.appendHoverText(stack, level, components, isAdvanced);
            components.add(Component.translatable("item." + MODID + ".double_line_light_red.description").withStyle(ChatFormatting.RED));
        }
    }
    public static class DoubleLineLightOrangeItem extends BlockItem {
        public DoubleLineLightOrangeItem(Block block, Properties properties) {
            super(block,properties);
        }
        @Override
        public void appendHoverText(ItemStack stack, @javax.annotation.Nullable Level level, List<Component> components, TooltipFlag isAdvanced) {
            //super.appendHoverText(stack, level, components, isAdvanced);
            components.add(Component.translatable("item." + MODID + ".double_line_light_orange.description").withStyle(Style.EMPTY.withColor(TextColor.fromRgb(0xFFAA00))));
        }
    }
    public static class DoubleLineLightPurpleItem extends BlockItem {
        public DoubleLineLightPurpleItem(Block block, Properties properties) {
            super(block,properties);
        }
        @Override
        public void appendHoverText(ItemStack stack, @javax.annotation.Nullable Level level, List<Component> components, TooltipFlag isAdvanced) {
            //super.appendHoverText(stack, level, components, isAdvanced);
            components.add(Component.translatable("item." + MODID + ".double_line_light_purple.description").withStyle(Style.EMPTY.withColor(TextColor.fromRgb(0xb45cf6))));
        }
    }
    public static class DoubleLineLightGreenItem extends BlockItem {
        public DoubleLineLightGreenItem(Block block, Properties properties) {
            super(block,properties);
        }
        @Override
        public void appendHoverText(ItemStack stack, @javax.annotation.Nullable Level level, List<Component> components, TooltipFlag isAdvanced) {
            //super.appendHoverText(stack, level, components, isAdvanced);
            components.add(Component.translatable("item." + MODID + ".double_line_light_green.description").withStyle(ChatFormatting.GREEN));
        }
    }
}
