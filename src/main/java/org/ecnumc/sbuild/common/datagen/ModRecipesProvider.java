package org.ecnumc.sbuild.common.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import org.ecnumc.sbuild.common.registries.ECNUItems;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class ModRecipesProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipesProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(@NotNull Consumer<FinishedRecipe> consumer) {
        //logo
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ECNUItems.LOGO.get(), 1)
                .requires(Items.PAPER, 3).group("sbuild_logo").unlockedBy("has_paper", has(Items.PAPER)).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ECNUItems.LOGO1.get(), 1)
                .requires(Items.PAPER, 3).group("sbuild_logo1").unlockedBy("has_paper", has(Items.PAPER)).save(consumer);

        //Box
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ECNUItems.CHEST_MAGIC.get())
                .pattern("PPP")
                .pattern("P P")
                .pattern("PPP")
                .define('P', ItemTags.PLANKS)
                .unlockedBy("has_planks", has(ItemTags.PLANKS))
                .save(consumer);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ECNUItems.GRID_GOLD_ITEM.get(), 4)
                .requires(Items.COBBLESTONE, 3).group("ecnu_grid").unlockedBy("has_cobblestone", has(Items.COBBLESTONE)).save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ECNUItems.GRID_RED_ITEM.get(), 4)
                .requires(Items.COBBLESTONE, 3).group("ecnu_grid").unlockedBy("has_cobblestone", has(Items.COBBLESTONE)).save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ECNUItems.GRID_YELLOW_ITEM.get(), 4)
                .requires(Items.COBBLESTONE, 3).group("ecnu_grid").unlockedBy("has_cobblestone", has(Items.COBBLESTONE)).save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ECNUItems.GRID_GREEN_ITEM.get(), 4)
                .requires(Items.COBBLESTONE, 3).group("ecnu_grid").unlockedBy("has_cobblestone", has(Items.COBBLESTONE)).save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ECNUItems.GRID_PURPLE_ITEM.get(), 4)
                .requires(Items.COBBLESTONE, 3).group("ecnu_grid").unlockedBy("has_cobblestone", has(Items.COBBLESTONE)).save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ECNUItems.GRID_BLUE_ITEM.get(), 4)
                .requires(Items.COBBLESTONE, 3).group("ecnu_grid").unlockedBy("has_cobblestone", has(Items.COBBLESTONE)).save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ECNUItems.GRID_ORANGE_ITEM.get(), 4)
                .requires(Items.COBBLESTONE, 3).group("ecnu_grid").unlockedBy("has_cobblestone", has(Items.COBBLESTONE)).save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ECNUItems.GRID_PINK_ITEM.get(), 4)
                .requires(Items.COBBLESTONE, 3).group("ecnu_grid").unlockedBy("has_cobblestone", has(Items.COBBLESTONE)).save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ECNUItems.GRID_WHITE_ITEM.get(), 4)
                .requires(Items.COBBLESTONE, 3).group("ecnu_grid").unlockedBy("has_cobblestone", has(Items.COBBLESTONE)).save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ECNUItems.GRID_SKY_BLUE_ITEM.get(), 4)
                .requires(Items.COBBLESTONE, 3).group("ecnu_grid").unlockedBy("has_cobblestone", has(Items.COBBLESTONE)).save(consumer);

        // ================= Line 系列 =================
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ECNUItems.LINE_BLUE_ITEM.get(), 4)
                .requires(Items.COBBLESTONE, 3).group("ecnu_line").unlockedBy("has_cobblestone", has(Items.COBBLESTONE)).save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ECNUItems.LINE_RED_ITEM.get(), 4)
                .requires(Items.COBBLESTONE, 3).group("ecnu_line").unlockedBy("has_cobblestone", has(Items.COBBLESTONE)).save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ECNUItems.LINE_YELLOW_ITEM.get(), 4)
                .requires(Items.COBBLESTONE, 3).group("ecnu_line").unlockedBy("has_cobblestone", has(Items.COBBLESTONE)).save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ECNUItems.LINE_GREEN_ITEM.get(), 4)
                .requires(Items.COBBLESTONE, 3).group("ecnu_line").unlockedBy("has_cobblestone", has(Items.COBBLESTONE)).save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ECNUItems.LINE_PURPLE_ITEM.get(), 4)
                .requires(Items.COBBLESTONE, 3).group("ecnu_line").unlockedBy("has_cobblestone", has(Items.COBBLESTONE)).save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ECNUItems.LINE_GOLD_ITEM.get(), 4)
                .requires(Items.COBBLESTONE, 3).group("ecnu_line").unlockedBy("has_cobblestone", has(Items.COBBLESTONE)).save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ECNUItems.LINE_ORANGE_ITEM.get(), 4)
                .requires(Items.COBBLESTONE, 3).group("ecnu_line").unlockedBy("has_cobblestone", has(Items.COBBLESTONE)).save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ECNUItems.LINE_PINK_ITEM.get(), 4)
                .requires(Items.COBBLESTONE, 3).group("ecnu_line").unlockedBy("has_cobblestone", has(Items.COBBLESTONE)).save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ECNUItems.LINE_WHITE_ITEM.get(), 4)
                .requires(Items.COBBLESTONE, 3).group("ecnu_line").unlockedBy("has_cobblestone", has(Items.COBBLESTONE)).save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ECNUItems.LINE_SKY_BLUE_ITEM.get(), 4)
                .requires(Items.COBBLESTONE, 3).group("ecnu_line").unlockedBy("has_cobblestone", has(Items.COBBLESTONE)).save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ECNUItems.LINE_LIGHT_BLUE_ITEM.get(), 4)
                .requires(Items.COBBLESTONE, 3).group("ecnu_line").unlockedBy("has_cobblestone", has(Items.COBBLESTONE)).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ECNUItems.LINE_LIGHT_PINK_ITEM.get(), 4)
                .requires(Items.COBBLESTONE, 3).group("ecnu_line").unlockedBy("has_cobblestone", has(Items.COBBLESTONE)).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ECNUItems.LINE_LIGHT_GREEN_ITEM.get(), 4)
                .requires(Items.COBBLESTONE, 3).group("ecnu_line").unlockedBy("has_cobblestone", has(Items.COBBLESTONE)).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ECNUItems.LINE_LIGHT_RED_ITEM.get(), 4)
                .requires(Items.COBBLESTONE, 3).group("ecnu_line").unlockedBy("has_cobblestone", has(Items.COBBLESTONE)).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ECNUItems.LINE_LIGHT_ORANGE_ITEM.get(), 4)
                .requires(Items.COBBLESTONE, 3).group("ecnu_line").unlockedBy("has_cobblestone", has(Items.COBBLESTONE)).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ECNUItems.LINE_LIGHT_PURPLE_ITEM.get(), 4)
                .requires(Items.COBBLESTONE, 3).group("ecnu_line").unlockedBy("has_cobblestone", has(Items.COBBLESTONE)).save(consumer);


        //double 系列
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ECNUItems.DOUBLE_GRID_GOLD_ITEM.get(), 4)
                .requires(Items.COBBLESTONE, 3).group("ecnu_double_grid").unlockedBy("has_cobblestone", has(Items.COBBLESTONE)).save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ECNUItems.DOUBLE_GRID_RED_ITEM.get(), 4)
                .requires(Items.COBBLESTONE, 3).group("ecnu_double_grid").unlockedBy("has_cobblestone", has(Items.COBBLESTONE)).save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ECNUItems.DOUBLE_GRID_YELLOW_ITEM.get(), 4)
                .requires(Items.COBBLESTONE, 3).group("ecnu_double_grid").unlockedBy("has_cobblestone", has(Items.COBBLESTONE)).save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ECNUItems.DOUBLE_GRID_GREEN_ITEM.get(), 4)
                .requires(Items.COBBLESTONE, 3).group("ecnu_double_grid").unlockedBy("has_cobblestone", has(Items.COBBLESTONE)).save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ECNUItems.DOUBLE_GRID_PURPLE_ITEM.get(), 4)
                .requires(Items.COBBLESTONE, 3).group("ecnu_double_grid").unlockedBy("has_cobblestone", has(Items.COBBLESTONE)).save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ECNUItems.DOUBLE_GRID_BLUE_ITEM.get(), 4)
                .requires(Items.COBBLESTONE, 3).group("ecnu_double_grid").unlockedBy("has_cobblestone", has(Items.COBBLESTONE)).save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ECNUItems.DOUBLE_GRID_ORANGE_ITEM.get(), 4)
                .requires(Items.COBBLESTONE, 3).group("ecnu_double_grid").unlockedBy("has_cobblestone", has(Items.COBBLESTONE)).save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ECNUItems.DOUBLE_GRID_PINK_ITEM.get(), 4)
                .requires(Items.COBBLESTONE, 3).group("ecnu_double_grid").unlockedBy("has_cobblestone", has(Items.COBBLESTONE)).save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ECNUItems.DOUBLE_GRID_WHITE_ITEM.get(), 4)
                .requires(Items.COBBLESTONE, 3).group("ecnu_double_grid").unlockedBy("has_cobblestone", has(Items.COBBLESTONE)).save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ECNUItems.DOUBLE_GRID_SKY_BLUE_ITEM.get(), 4)
                .requires(Items.COBBLESTONE, 3).group("ecnu_double_grid").unlockedBy("has_cobblestone", has(Items.COBBLESTONE)).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ECNUItems.DOUBLE_GRID_BLACK_ITEM.get(), 4)
                .requires(Items.COBBLESTONE, 3).group("ecnu_double_grid").unlockedBy("has_cobblestone", has(Items.COBBLESTONE)).save(consumer);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ECNUItems.DOUBLE_LINE_BLUE_ITEM.get(), 4)
                .requires(Items.COBBLESTONE, 3).group("ecnu_double_line").unlockedBy("has_cobblestone", has(Items.COBBLESTONE)).save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ECNUItems.DOUBLE_LINE_RED_ITEM.get(), 4)
                .requires(Items.COBBLESTONE, 3).group("ecnu_double_line").unlockedBy("has_cobblestone", has(Items.COBBLESTONE)).save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ECNUItems.DOUBLE_LINE_YELLOW_ITEM.get(), 4)
                .requires(Items.COBBLESTONE, 3).group("ecnu_double_line").unlockedBy("has_cobblestone", has(Items.COBBLESTONE)).save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ECNUItems.DOUBLE_LINE_GREEN_ITEM.get(), 4)
                .requires(Items.COBBLESTONE, 3).group("ecnu_double_line").unlockedBy("has_cobblestone", has(Items.COBBLESTONE)).save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ECNUItems.DOUBLE_LINE_PURPLE_ITEM.get(), 4)
                .requires(Items.COBBLESTONE, 3).group("ecnu_double_line").unlockedBy("has_cobblestone", has(Items.COBBLESTONE)).save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ECNUItems.DOUBLE_LINE_GOLD_ITEM.get(), 4)
                .requires(Items.COBBLESTONE, 3).group("ecnu_double_line").unlockedBy("has_cobblestone", has(Items.COBBLESTONE)).save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ECNUItems.DOUBLE_LINE_ORANGE_ITEM.get(), 4)
                .requires(Items.COBBLESTONE, 3).group("ecnu_double_line").unlockedBy("has_cobblestone", has(Items.COBBLESTONE)).save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ECNUItems.DOUBLE_LINE_PINK_ITEM.get(), 4)
                .requires(Items.COBBLESTONE, 3).group("ecnu_double_line").unlockedBy("has_cobblestone", has(Items.COBBLESTONE)).save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ECNUItems.DOUBLE_LINE_WHITE_ITEM.get(), 4)
                .requires(Items.COBBLESTONE, 3).group("ecnu_double_line").unlockedBy("has_cobblestone", has(Items.COBBLESTONE)).save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ECNUItems.DOUBLE_LINE_SKY_BLUE_ITEM.get(), 4)
                .requires(Items.COBBLESTONE, 3).group("ecnu_double_line").unlockedBy("has_cobblestone", has(Items.COBBLESTONE)).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ECNUItems.DOUBLE_LINE_BLACK_ITEM.get(), 4)
                .requires(Items.COBBLESTONE, 3).group("ecnu_double_line").unlockedBy("has_cobblestone", has(Items.COBBLESTONE)).save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ECNUItems.DOUBLE_LINE_LIGHT_BLUE_ITEM.get(), 4)
                .requires(Items.COBBLESTONE, 3).group("ecnu_double_line").unlockedBy("has_cobblestone", has(Items.COBBLESTONE)).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ECNUItems.DOUBLE_LINE_LIGHT_PINK_ITEM.get(), 4)
                .requires(Items.COBBLESTONE, 3).group("ecnu_double_line").unlockedBy("has_cobblestone", has(Items.COBBLESTONE)).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ECNUItems.DOUBLE_LINE_LIGHT_GREEN_ITEM.get(), 4)
                .requires(Items.COBBLESTONE, 3).group("ecnu_double_line").unlockedBy("has_cobblestone", has(Items.COBBLESTONE)).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ECNUItems.DOUBLE_LINE_LIGHT_RED_ITEM.get(), 4)
                .requires(Items.COBBLESTONE, 3).group("ecnu_double_line").unlockedBy("has_cobblestone", has(Items.COBBLESTONE)).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ECNUItems.DOUBLE_LINE_LIGHT_ORANGE_ITEM.get(), 4)
                .requires(Items.COBBLESTONE, 3).group("ecnu_double_line").unlockedBy("has_cobblestone", has(Items.COBBLESTONE)).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ECNUItems.DOUBLE_LINE_LIGHT_PURPLE_ITEM.get(), 4)
                .requires(Items.COBBLESTONE, 3).group("ecnu_double_line").unlockedBy("has_cobblestone", has(Items.COBBLESTONE)).save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ECNUItems.BRICK_BLACK_ITEM.get(), 4)
                .requires(Items.COBBLESTONE, 3).group("ecnu_building_block").unlockedBy("has_cobblestone", has(Items.COBBLESTONE)).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ECNUItems.BRICK_YELLOW_ITEM.get(), 4)
                .requires(Items.COBBLESTONE, 3).group("ecnu_building_block").unlockedBy("has_cobblestone", has(Items.COBBLESTONE)).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ECNUItems.SQUARE_BLACK_ITEM.get(), 4)
                .requires(Items.COBBLESTONE, 3).group("ecnu_building_block").unlockedBy("has_cobblestone", has(Items.COBBLESTONE)).save(consumer);


    }
}
