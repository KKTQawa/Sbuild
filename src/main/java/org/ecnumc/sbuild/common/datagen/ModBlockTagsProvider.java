package org.ecnumc.sbuild.common.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.ecnumc.sbuild.ECNUForge;
import org.ecnumc.sbuild.common.registries.ECNUBlocks;
import org.ecnumc.sbuild.common.tags.ECNUBlockTags;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider>lookupProvider, @Nullable ExistingFileHelper helper) {
        super(output, lookupProvider, ECNUForge.MODID, helper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider lookupProvider) {
        //原版
        tag(BlockTags.MINEABLE_WITH_AXE)
                .replace(false)
                        .add(
                                ECNUBlocks.CHEST_MAGIC.get()
                        );

        tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .replace(false)
                .add(
                        ECNUBlocks.CHEST_MAGIC.get(),

                        ECNUBlocks.GRID_BLUE.get(),
                        ECNUBlocks.GRID_RED.get(),
                        ECNUBlocks.GRID_YELLOW.get(),
                        ECNUBlocks.GRID_GREEN.get(),
                        ECNUBlocks.GRID_PURPLE.get(),
                        ECNUBlocks.GRID_GOLD.get(),
                        ECNUBlocks.GRID_ORANGE.get(),
                        ECNUBlocks.GRID_PINK.get(),
                        ECNUBlocks.GRID_WHITE.get(),
                        ECNUBlocks.GRID_SKY_BLUE.get(),
                        ECNUBlocks.LINE_BLUE.get(),
                        ECNUBlocks.LINE_RED.get(),
                        ECNUBlocks.LINE_YELLOW.get(),
                        ECNUBlocks.LINE_GREEN.get(),
                        ECNUBlocks.LINE_PURPLE.get(),
                        ECNUBlocks.LINE_GOLD.get(),
                        ECNUBlocks.LINE_ORANGE.get(),
                        ECNUBlocks.LINE_PINK.get(),
                        ECNUBlocks.LINE_WHITE.get(),
                        ECNUBlocks.LINE_SKY_BLUE.get(),
                        ECNUBlocks.LINE_LIGHT_BLUE.get(),
                        ECNUBlocks.LINE_LIGHT_GREEN.get(),
                        ECNUBlocks.LINE_LIGHT_PURPLE.get(),
                        ECNUBlocks.LINE_LIGHT_PINK.get(),
                        ECNUBlocks.LINE_LIGHT_ORANGE.get(),
                        ECNUBlocks.LINE_LIGHT_RED.get(),

                        ECNUBlocks.DOUBLE_GRID_BLACK.get(),
                        ECNUBlocks.DOUBLE_GRID_RED.get(),
                        ECNUBlocks.DOUBLE_GRID_YELLOW.get(),
                        ECNUBlocks.DOUBLE_GRID_GREEN.get(),
                        ECNUBlocks.DOUBLE_GRID_PURPLE.get(),
                        ECNUBlocks.DOUBLE_GRID_GOLD.get(),
                        ECNUBlocks.DOUBLE_GRID_ORANGE.get(),
                        ECNUBlocks.DOUBLE_GRID_PINK.get(),
                        ECNUBlocks.DOUBLE_GRID_WHITE.get(),
                        ECNUBlocks.DOUBLE_GRID_SKY_BLUE.get(),
                        ECNUBlocks.DOUBLE_GRID_BLACK.get(),
                        ECNUBlocks.DOUBLE_LINE_BLUE.get(),
                        ECNUBlocks.DOUBLE_LINE_RED.get(),
                        ECNUBlocks.DOUBLE_LINE_YELLOW.get(),
                        ECNUBlocks.DOUBLE_LINE_GREEN.get(),
                        ECNUBlocks.DOUBLE_LINE_PURPLE.get(),
                        ECNUBlocks.DOUBLE_LINE_GOLD.get(),
                        ECNUBlocks.DOUBLE_LINE_ORANGE.get(),
                        ECNUBlocks.DOUBLE_LINE_PINK.get(),
                        ECNUBlocks.DOUBLE_LINE_WHITE.get(),
                        ECNUBlocks.DOUBLE_LINE_SKY_BLUE.get(),
                        ECNUBlocks.DOUBLE_LINE_LIGHT_BLUE.get(),
                        ECNUBlocks.DOUBLE_LINE_LIGHT_GREEN.get(),
                        ECNUBlocks.DOUBLE_LINE_LIGHT_PURPLE.get(),
                        ECNUBlocks.DOUBLE_LINE_LIGHT_PINK.get(),
                        ECNUBlocks.DOUBLE_LINE_LIGHT_ORANGE.get(),
                        ECNUBlocks.DOUBLE_LINE_LIGHT_RED.get(),
                        ECNUBlocks.DOUBLE_LINE_BLACK.get(),

                        ECNUBlocks.BRICK_BLACK.get(),
                        ECNUBlocks.BRICK_YELLOW.get(),
                        ECNUBlocks.SQUARE_BLACK.get()
                );

        // 需要石镐或更高级工具
        tag(BlockTags.NEEDS_STONE_TOOL)
                .replace(false)
                .add(
                        ECNUBlocks.GRID_BLUE.get(),
                        ECNUBlocks.GRID_RED.get(),
                        ECNUBlocks.GRID_YELLOW.get(),
                        ECNUBlocks.GRID_GREEN.get(),
                        ECNUBlocks.GRID_PURPLE.get(),
                        ECNUBlocks.GRID_GOLD.get(),
                        ECNUBlocks.GRID_ORANGE.get(),
                        ECNUBlocks.GRID_PINK.get(),
                        ECNUBlocks.GRID_WHITE.get(),
                        ECNUBlocks.GRID_SKY_BLUE.get(),
                        ECNUBlocks.LINE_BLUE.get(),
                        ECNUBlocks.LINE_RED.get(),
                        ECNUBlocks.LINE_YELLOW.get(),
                        ECNUBlocks.LINE_GREEN.get(),
                        ECNUBlocks.LINE_PURPLE.get(),
                        ECNUBlocks.LINE_GOLD.get(),
                        ECNUBlocks.LINE_ORANGE.get(),
                        ECNUBlocks.LINE_PINK.get(),
                        ECNUBlocks.LINE_WHITE.get(),
                        ECNUBlocks.LINE_SKY_BLUE.get(),
                        ECNUBlocks.LINE_LIGHT_BLUE.get(),
                        ECNUBlocks.LINE_LIGHT_GREEN.get(),
                        ECNUBlocks.LINE_LIGHT_PURPLE.get(),
                        ECNUBlocks.LINE_LIGHT_PINK.get(),
                        ECNUBlocks.LINE_LIGHT_ORANGE.get(),
                        ECNUBlocks.LINE_LIGHT_RED.get(),

                        ECNUBlocks.DOUBLE_GRID_BLACK.get(),
                        ECNUBlocks.DOUBLE_GRID_RED.get(),
                        ECNUBlocks.DOUBLE_GRID_YELLOW.get(),
                        ECNUBlocks.DOUBLE_GRID_GREEN.get(),
                        ECNUBlocks.DOUBLE_GRID_PURPLE.get(),
                        ECNUBlocks.DOUBLE_GRID_GOLD.get(),
                        ECNUBlocks.DOUBLE_GRID_ORANGE.get(),
                        ECNUBlocks.DOUBLE_GRID_PINK.get(),
                        ECNUBlocks.DOUBLE_GRID_WHITE.get(),
                        ECNUBlocks.DOUBLE_GRID_SKY_BLUE.get(),
                        ECNUBlocks.DOUBLE_GRID_BLACK.get(),
                        ECNUBlocks.DOUBLE_LINE_BLUE.get(),
                        ECNUBlocks.DOUBLE_LINE_RED.get(),
                        ECNUBlocks.DOUBLE_LINE_YELLOW.get(),
                        ECNUBlocks.DOUBLE_LINE_GREEN.get(),
                        ECNUBlocks.DOUBLE_LINE_PURPLE.get(),
                        ECNUBlocks.DOUBLE_LINE_GOLD.get(),
                        ECNUBlocks.DOUBLE_LINE_ORANGE.get(),
                        ECNUBlocks.DOUBLE_LINE_PINK.get(),
                        ECNUBlocks.DOUBLE_LINE_WHITE.get(),
                        ECNUBlocks.DOUBLE_LINE_SKY_BLUE.get(),
                        ECNUBlocks.DOUBLE_LINE_LIGHT_BLUE.get(),
                        ECNUBlocks.DOUBLE_LINE_LIGHT_GREEN.get(),
                        ECNUBlocks.DOUBLE_LINE_LIGHT_PURPLE.get(),
                        ECNUBlocks.DOUBLE_LINE_LIGHT_PINK.get(),
                        ECNUBlocks.DOUBLE_LINE_LIGHT_ORANGE.get(),
                        ECNUBlocks.DOUBLE_LINE_LIGHT_RED.get(),
                        ECNUBlocks.DOUBLE_LINE_BLACK.get(),

                        ECNUBlocks.BRICK_BLACK.get(),
                        ECNUBlocks.BRICK_YELLOW.get(),
                        ECNUBlocks.SQUARE_BLACK.get()
                );
        // ================= 自定义标签 =================
        // Grid 系列
        tag(ECNUBlockTags.ECNUGRID_TAG)
                .add(
                        ECNUBlocks.GRID_BLUE.get(),
                        ECNUBlocks.GRID_RED.get(),
                        ECNUBlocks.GRID_YELLOW.get(),
                        ECNUBlocks.GRID_GREEN.get(),
                        ECNUBlocks.GRID_PURPLE.get(),
                        ECNUBlocks.GRID_GOLD.get(),
                        ECNUBlocks.GRID_ORANGE.get(),
                        ECNUBlocks.GRID_PINK.get(),
                        ECNUBlocks.GRID_WHITE.get(),
                        ECNUBlocks.GRID_SKY_BLUE.get()
                );
        tag(ECNUBlockTags.ECNUDOUBLEGRID_TAG)
                .add(
                        ECNUBlocks.DOUBLE_GRID_BLUE.get(),
                        ECNUBlocks.DOUBLE_GRID_RED.get(),
                        ECNUBlocks.DOUBLE_GRID_YELLOW.get(),
                        ECNUBlocks.DOUBLE_GRID_GREEN.get(),
                        ECNUBlocks.DOUBLE_GRID_PURPLE.get(),
                        ECNUBlocks.DOUBLE_GRID_GOLD.get(),
                        ECNUBlocks.DOUBLE_GRID_ORANGE.get(),
                        ECNUBlocks.DOUBLE_GRID_PINK.get(),
                        ECNUBlocks.DOUBLE_GRID_WHITE.get(),
                        ECNUBlocks.DOUBLE_GRID_SKY_BLUE.get(),
                        ECNUBlocks.DOUBLE_GRID_BLACK.get()
                );
        // Line 系列
        tag(ECNUBlockTags.ECNULINE_TAG)
                .add(
                        ECNUBlocks.LINE_BLUE.get(),
                        ECNUBlocks.LINE_RED.get(),
                        ECNUBlocks.LINE_YELLOW.get(),
                        ECNUBlocks.LINE_GREEN.get(),
                        ECNUBlocks.LINE_PURPLE.get(),
                        ECNUBlocks.LINE_GOLD.get(),
                        ECNUBlocks.LINE_ORANGE.get(),
                        ECNUBlocks.LINE_PINK.get(),
                        ECNUBlocks.LINE_WHITE.get(),
                        ECNUBlocks.LINE_SKY_BLUE.get(),
                        ECNUBlocks.LINE_LIGHT_BLUE.get(),
                        ECNUBlocks.LINE_LIGHT_GREEN.get(),
                        ECNUBlocks.LINE_LIGHT_PURPLE.get(),
                        ECNUBlocks.LINE_LIGHT_PINK.get(),
                        ECNUBlocks.LINE_LIGHT_ORANGE.get(),
                        ECNUBlocks.LINE_LIGHT_RED.get()
                );
        tag(ECNUBlockTags.ECNUDOUBLELINE_TAG)
                .add(
                        ECNUBlocks.DOUBLE_LINE_BLUE.get(),
                        ECNUBlocks.DOUBLE_LINE_RED.get(),
                        ECNUBlocks.DOUBLE_LINE_YELLOW.get(),
                        ECNUBlocks.DOUBLE_LINE_GREEN.get(),
                        ECNUBlocks.DOUBLE_LINE_PURPLE.get(),
                        ECNUBlocks.DOUBLE_LINE_GOLD.get(),
                        ECNUBlocks.DOUBLE_LINE_ORANGE.get(),
                        ECNUBlocks.DOUBLE_LINE_PINK.get(),
                        ECNUBlocks.DOUBLE_LINE_WHITE.get(),
                        ECNUBlocks.DOUBLE_LINE_SKY_BLUE.get(),
                        ECNUBlocks.DOUBLE_LINE_LIGHT_BLUE.get(),
                        ECNUBlocks.DOUBLE_LINE_LIGHT_GREEN.get(),
                        ECNUBlocks.DOUBLE_LINE_LIGHT_PURPLE.get(),
                        ECNUBlocks.DOUBLE_LINE_LIGHT_PINK.get(),
                        ECNUBlocks.DOUBLE_LINE_LIGHT_ORANGE.get(),
                        ECNUBlocks.DOUBLE_LINE_LIGHT_RED.get(),
                        ECNUBlocks.DOUBLE_LINE_BLACK.get()
                );
        // Building Block
        tag(ECNUBlockTags.ECNUBUILDING_TAG)
                .add(
                        ECNUBlocks.BRICK_BLACK.get(),
                        ECNUBlocks.BRICK_YELLOW.get(),
                        ECNUBlocks.SQUARE_BLACK.get()
                );

    }
}
