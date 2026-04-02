package org.ecnumc.sbuild.common.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;

import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.ecnumc.sbuild.ECNUForge;
import org.ecnumc.sbuild.common.registries.ECNUBlocks;
import org.ecnumc.sbuild.common.registries.ECNUItems;
import org.ecnumc.sbuild.common.tags.ECNUBlockTags;
import org.ecnumc.sbuild.common.tags.ECNUItemTags;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> itemTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, itemTags, ECNUForge.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider lookupProvider) {
        //自定义

        // Grid 系列
        tag(ECNUItemTags.ECNUGRID_TAG)
                .add(
                        ECNUItems.GRID_BLUE_ITEM.get(),
                        ECNUItems.GRID_RED_ITEM.get(),
                        ECNUItems.GRID_YELLOW_ITEM.get(),
                        ECNUItems.GRID_GREEN_ITEM.get(),
                        ECNUItems.GRID_PURPLE_ITEM.get(),
                        ECNUItems.GRID_GOLD_ITEM.get(),
                        ECNUItems.GRID_ORANGE_ITEM.get(),
                        ECNUItems.GRID_PINK_ITEM.get(),
                        ECNUItems.GRID_WHITE_ITEM.get(),
                        ECNUItems.GRID_SKY_BLUE_ITEM.get()
                );
        tag(ECNUItemTags.ECNUDOUBLEGRID_TAG)
                .add(
                        ECNUItems.DOUBLE_GRID_BLUE_ITEM.get(),
                        ECNUItems.DOUBLE_GRID_RED_ITEM.get(),
                        ECNUItems.DOUBLE_GRID_YELLOW_ITEM.get(),
                        ECNUItems.DOUBLE_GRID_GREEN_ITEM.get(),
                        ECNUItems.DOUBLE_GRID_PURPLE_ITEM.get(),
                        ECNUItems.DOUBLE_GRID_GOLD_ITEM.get(),
                        ECNUItems.DOUBLE_GRID_ORANGE_ITEM.get(),
                        ECNUItems.DOUBLE_GRID_PINK_ITEM.get(),
                        ECNUItems.DOUBLE_GRID_WHITE_ITEM.get(),
                        ECNUItems.DOUBLE_GRID_SKY_BLUE_ITEM.get(),
                        ECNUItems.DOUBLE_GRID_BLACK_ITEM.get()
                );
        // Line 系列
        tag(ECNUItemTags.ECNULINE_TAG)
                .add(
                        ECNUItems.LINE_BLUE_ITEM.get(),
                        ECNUItems.LINE_RED_ITEM.get(),
                        ECNUItems.LINE_YELLOW_ITEM.get(),
                        ECNUItems.LINE_GREEN_ITEM.get(),
                        ECNUItems.LINE_PURPLE_ITEM.get(),
                        ECNUItems.LINE_GOLD_ITEM.get(),
                        ECNUItems.LINE_ORANGE_ITEM.get(),
                        ECNUItems.LINE_PINK_ITEM.get(),
                        ECNUItems.LINE_WHITE_ITEM.get(),
                        ECNUItems.LINE_SKY_BLUE_ITEM.get(),
                        ECNUItems.LINE_LIGHT_BLUE_ITEM.get()
                );
        tag(ECNUItemTags.ECNUDOUBLELINE_TAG)
                .add(
                        ECNUItems.DOUBLE_LINE_BLUE_ITEM.get(),
                        ECNUItems.DOUBLE_LINE_RED_ITEM.get(),
                        ECNUItems.DOUBLE_LINE_YELLOW_ITEM.get(),
                        ECNUItems.DOUBLE_LINE_GREEN_ITEM.get(),
                        ECNUItems.DOUBLE_LINE_PURPLE_ITEM.get(),
                        ECNUItems.DOUBLE_LINE_GOLD_ITEM.get(),
                        ECNUItems.DOUBLE_LINE_ORANGE_ITEM.get(),
                        ECNUItems.DOUBLE_LINE_PINK_ITEM.get(),
                        ECNUItems.DOUBLE_LINE_WHITE_ITEM.get(),
                        ECNUItems.DOUBLE_LINE_SKY_BLUE_ITEM.get(),
                        ECNUItems.DOUBLE_LINE_LIGHT_BLUE_ITEM.get(),
                        ECNUItems.DOUBLE_LINE_LIGHT_GREEN_ITEM.get(),
                        ECNUItems.DOUBLE_LINE_LIGHT_PURPLE_ITEM.get(),
                        ECNUItems.DOUBLE_LINE_LIGHT_PINK_ITEM.get(),
                        ECNUItems.DOUBLE_LINE_LIGHT_ORANGE_ITEM.get(),
                        ECNUItems.DOUBLE_LINE_LIGHT_RED_ITEM.get(),
                        ECNUItems.DOUBLE_LINE_BLACK_ITEM.get()
                );
        // Building Block
        tag(ECNUItemTags.ECNUBUILDING_TAG)
                .add(
                        ECNUItems.BRICK_BLACK_ITEM.get(),
                        ECNUItems.BRICK_YELLOW_ITEM.get(),
                        ECNUItems.SQUARE_BLACK_ITEM.get()
                );
    }
}
