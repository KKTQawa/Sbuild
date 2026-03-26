package org.ecnumc.sbuild.common.items.building;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextColor;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

import javax.annotation.Nullable;
import java.util.List;

import static org.ecnumc.sbuild.ECNUForge.MODID;

public class ECNUDoubleGridItems {
    public static class DoubleGridBlueItem extends BlockItem {
        public DoubleGridBlueItem(Block block, Properties properties) {
            super(block,properties);
        }

        @Override
        public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag isAdvanced) {
            //super.appendHoverText(stack, level, components, isAdvanced);
            components.add(Component.translatable("item." + MODID + ".double_grid_blue.description").withStyle(ChatFormatting.BLUE));
        }
    }

    public static class DoubleGridRedItem extends BlockItem {
        public DoubleGridRedItem(Block block, Properties properties) {
            super(block,properties);
        }

        @Override
        public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag isAdvanced) {
            //super.appendHoverText(stack, level, components, isAdvanced);
            components.add(Component.translatable("item." + MODID + ".double_grid_red.description").withStyle(ChatFormatting.RED));
        }
    }
    public static class DoubleGridYellowItem extends BlockItem {
        public DoubleGridYellowItem(Block block, Properties properties) {
            super(block,properties);
        }

        @Override
        public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag isAdvanced) {
            //super.appendHoverText(stack, level, components, isAdvanced);
            components.add(Component.translatable("item." + MODID + ".double_grid_yellow.description").withStyle(ChatFormatting.YELLOW));
        }
    }
    public static class DoubleGridGreenItem extends BlockItem {
        public DoubleGridGreenItem(Block block, Properties properties) {
            super(block,properties);
        }

        @Override
        public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag isAdvanced) {
            //super.appendHoverText(stack, level, components, isAdvanced);
            components.add(Component.translatable("item." + MODID + ".double_grid_green.description").withStyle(ChatFormatting.GREEN));
        }
    }
    public static class DoubleGridPurpleItem extends BlockItem {
        public DoubleGridPurpleItem(Block block, Properties properties) {
            super(block,properties);
        }
        @Override
        public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag isAdvanced) {
            //super.appendHoverText(stack, level, components, isAdvanced);
            components.add(Component.translatable("item." + MODID + ".double_grid_purple.description").withStyle(Style.EMPTY.withColor(TextColor.fromRgb(0xb45cf6))));
        }
    }
    public static class DoubleGridGoldItem extends BlockItem {
        public DoubleGridGoldItem(Block block, Properties properties) {
            super(block,properties);
        }
        @Override
        public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag isAdvanced) {
            // super.appendHoverText(stack, level, components, isAdvanced);
            components.add(Component.translatable("item." + MODID + ".double_grid_gold.description").withStyle(Style.EMPTY.withColor(TextColor.fromRgb(0xFFD700))));
        }
    }
    public static class DoubleGridOrangeItem extends BlockItem {
        public DoubleGridOrangeItem(Block block, Properties properties) {
            super(block,properties);
        }
        @Override
        public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag isAdvanced) {
            //super.appendHoverText(stack, level, components, isAdvanced);
            components.add(
                    Component.translatable("item." + MODID + ".double_grid_orange.description")
                            .withStyle(Style.EMPTY.withColor(TextColor.fromRgb(0xFFAA00)))
            );
        }
    }
    public static class DoubleGridPinkItem extends BlockItem {
        public DoubleGridPinkItem(Block block, Properties properties) {
            super(block,properties);
        }
        @Override
        public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag isAdvanced) {
            //super.appendHoverText(stack, level, components, isAdvanced);
            components.add(Component.translatable("item." + MODID + ".double_grid_pink.description").withStyle(Style.EMPTY.withColor(TextColor.fromRgb(0xFF55FF))));
        }
    }
    public static class DoubleGridWhiteItem extends BlockItem {
        public DoubleGridWhiteItem(Block block, Properties properties) {
            super(block,properties);
        }
        @Override
        public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag isAdvanced) {
            //super.appendHoverText(stack, level, components, isAdvanced);
            components.add(Component.translatable("item." + MODID + ".double_grid_white.description").withStyle(ChatFormatting.WHITE));
        }
    }
    public static class DoubleGridSkyBlueItem extends BlockItem {
        public DoubleGridSkyBlueItem(Block block, Properties properties) {
            super(block,properties);
        }
        @Override
        public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag isAdvanced) {
            //super.appendHoverText(stack, level, components, isAdvanced);
            components.add(Component.translatable("item." + MODID + ".double_grid_sky_blue.description").withStyle(Style.EMPTY.withColor(TextColor.fromRgb(0x55FFFF))));
        }
    }
    public static class DoubleGridBlackItem extends BlockItem {
        public DoubleGridBlackItem(Block block, Properties properties) {
            super(block,properties);
        }
        @Override
        public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag isAdvanced) {
            //super.appendHoverText(stack, level, components, isAdvanced);
            components.add(Component.translatable("item." + MODID + ".double_grid_black.description").withStyle(ChatFormatting.BLACK));
        }
    }
}
