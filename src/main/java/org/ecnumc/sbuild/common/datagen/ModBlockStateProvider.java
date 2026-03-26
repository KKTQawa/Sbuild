package org.ecnumc.sbuild.common.datagen;

import net.minecraft.core.Direction;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockModelBuilder;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.ecnumc.sbuild.ECNUForge;
import org.ecnumc.sbuild.common.blocks.BaseLineBlocks;
import org.ecnumc.sbuild.common.registries.ECNUBlocks;


public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ECNUForge.MODID, existingFileHelper);
    }

    private void line_function(Block block, String color) {

        String name = "line_" + color;

        if (color.contains("light_")) {
            color = color.replace("light_", "");
        }

        BlockModelBuilder model = models().orientable(name,
                modLoc("block/" + name),     // side
                modLoc("block/" + name),     // front
                modLoc("block/grid_" + color) // top
        );

        getVariantBuilder(block).forAllStates(state -> {
            Direction dir = state.getValue(BaseLineBlocks.FACING);

            return switch (dir) {
                case DOWN -> ConfiguredModel.builder().modelFile(model).build();
                case UP -> ConfiguredModel.builder().modelFile(model).build();
                case NORTH -> ConfiguredModel.builder().modelFile(model).rotationX(90).build();
                case SOUTH -> ConfiguredModel.builder().modelFile(model).rotationX(90).build();
                case WEST -> ConfiguredModel.builder().modelFile(model).rotationX(90).rotationY(90).build();
                case EAST -> ConfiguredModel.builder().modelFile(model).rotationX(90).rotationY(90).build();
            };
        });

        // item模型
        simpleBlockItem(block, model);
    }
    private void double_line_function(Block block, String color) {

        String name = "double_line_" + color;

        if (color.contains("light_")) {
            color = color.replace("light_", "");
        }

        BlockModelBuilder model = models().orientable(name,
                modLoc("block/" + name),     // side
                modLoc("block/" + name),     // front
                modLoc("block/double_grid_" + color) // top
        );

        getVariantBuilder(block).forAllStates(state -> {
            Direction dir = state.getValue(BaseLineBlocks.FACING);

            return switch (dir) {
                case DOWN -> ConfiguredModel.builder().modelFile(model).build();
                case UP -> ConfiguredModel.builder().modelFile(model).build();
                case NORTH -> ConfiguredModel.builder().modelFile(model).rotationX(90).build();
                case SOUTH -> ConfiguredModel.builder().modelFile(model).rotationX(90).build();
                case WEST -> ConfiguredModel.builder().modelFile(model).rotationX(90).rotationY(90).build();
                case EAST -> ConfiguredModel.builder().modelFile(model).rotationX(90).rotationY(90).build();
            };
        });

        // item模型
        simpleBlockItem(block, model);
    }

    @Override
    protected void registerStatesAndModels() {
        //Box
        simpleBlockWithItem(ECNUBlocks.CHEST_MAGIC.get(),
                models().orientable("chest_magic",
                        modLoc("block/box/box_1"),
                        modLoc("block/box/box_1"),
                        modLoc("block/box/box_2")

                )
        );
        //Building Block
        simpleBlockWithItem(ECNUBlocks.BRICK_BLACK.get(), cubeAll(ECNUBlocks.BRICK_BLACK.get()));
        simpleBlockWithItem(ECNUBlocks.BRICK_YELLOW.get(), cubeAll(ECNUBlocks.BRICK_YELLOW.get()));
        simpleBlockWithItem(ECNUBlocks.SQUARE_BLACK.get(),
                models().orientable("square_black",
                modLoc("block/square_black"),
                modLoc("block/square_black"),
                modLoc("block/square_black_bottom")
        ) );

        // ================= Grid Blocks =================
        simpleBlockWithItem(ECNUBlocks.GRID_BLUE.get(), cubeAll(ECNUBlocks.GRID_BLUE.get()));
        simpleBlockWithItem(ECNUBlocks.GRID_RED.get(), cubeAll(ECNUBlocks.GRID_RED.get()));
        simpleBlockWithItem(ECNUBlocks.GRID_YELLOW.get(), cubeAll(ECNUBlocks.GRID_YELLOW.get()));
        simpleBlockWithItem(ECNUBlocks.GRID_GREEN.get(), cubeAll(ECNUBlocks.GRID_GREEN.get()));
        simpleBlockWithItem(ECNUBlocks.GRID_PURPLE.get(), cubeAll(ECNUBlocks.GRID_PURPLE.get()));
        simpleBlockWithItem(ECNUBlocks.GRID_GOLD.get(), cubeAll(ECNUBlocks.GRID_GOLD.get()));
        simpleBlockWithItem(ECNUBlocks.GRID_ORANGE.get(), cubeAll(ECNUBlocks.GRID_ORANGE.get()));
        simpleBlockWithItem(ECNUBlocks.GRID_PINK.get(), cubeAll(ECNUBlocks.GRID_PINK.get()));
        simpleBlockWithItem(ECNUBlocks.GRID_WHITE.get(), cubeAll(ECNUBlocks.GRID_WHITE.get()));
        simpleBlockWithItem(ECNUBlocks.GRID_SKY_BLUE.get(), cubeAll(ECNUBlocks.GRID_SKY_BLUE.get()));

        // Double Grid Blocks
        simpleBlockWithItem(ECNUBlocks.DOUBLE_GRID_BLUE.get(), cubeAll(ECNUBlocks.DOUBLE_GRID_BLUE.get()));
        simpleBlockWithItem(ECNUBlocks.DOUBLE_GRID_RED.get(), cubeAll(ECNUBlocks.DOUBLE_GRID_RED.get()));
        simpleBlockWithItem(ECNUBlocks.DOUBLE_GRID_YELLOW.get(), cubeAll(ECNUBlocks.DOUBLE_GRID_YELLOW.get()));
        simpleBlockWithItem(ECNUBlocks.DOUBLE_GRID_GREEN.get(), cubeAll(ECNUBlocks.DOUBLE_GRID_GREEN.get()));
        simpleBlockWithItem(ECNUBlocks.DOUBLE_GRID_PURPLE.get(), cubeAll(ECNUBlocks.DOUBLE_GRID_PURPLE.get()));
        simpleBlockWithItem(ECNUBlocks.DOUBLE_GRID_GOLD.get(), cubeAll(ECNUBlocks.DOUBLE_GRID_GOLD.get()));
        simpleBlockWithItem(ECNUBlocks.DOUBLE_GRID_ORANGE.get(), cubeAll(ECNUBlocks.DOUBLE_GRID_ORANGE.get()));
        simpleBlockWithItem(ECNUBlocks.DOUBLE_GRID_PINK.get(), cubeAll(ECNUBlocks.DOUBLE_GRID_PINK.get()));
        simpleBlockWithItem(ECNUBlocks.DOUBLE_GRID_WHITE.get(), cubeAll(ECNUBlocks.DOUBLE_GRID_WHITE.get()));
        simpleBlockWithItem(ECNUBlocks.DOUBLE_GRID_SKY_BLUE.get(), cubeAll(ECNUBlocks.DOUBLE_GRID_SKY_BLUE.get()));
        simpleBlockWithItem(ECNUBlocks.DOUBLE_GRID_BLACK.get(), cubeAll(ECNUBlocks.DOUBLE_GRID_BLACK.get()));

        // ================= Line Blocks =================
        line_function(ECNUBlocks.LINE_BLUE.get(), "blue");
        line_function(ECNUBlocks.LINE_RED.get(), "red");
        line_function(ECNUBlocks.LINE_GREEN.get(), "green");
        line_function(ECNUBlocks.LINE_YELLOW.get(), "yellow");
        line_function(ECNUBlocks.LINE_PURPLE.get(), "purple");
        line_function(ECNUBlocks.LINE_ORANGE.get(), "orange");
        line_function(ECNUBlocks.LINE_PINK.get(), "pink");
        line_function(ECNUBlocks.LINE_GOLD.get(), "gold");
        line_function(ECNUBlocks.LINE_WHITE.get(), "white");
        line_function(ECNUBlocks.LINE_SKY_BLUE.get(), "sky_blue");

        //Light系列
        line_function(ECNUBlocks.LINE_LIGHT_PURPLE.get(), "light_purple");
        line_function(ECNUBlocks.LINE_LIGHT_ORANGE.get(), "light_orange");
        line_function(ECNUBlocks.LINE_LIGHT_PINK.get(), "light_pink");
        line_function(ECNUBlocks.LINE_LIGHT_RED.get(), "light_red");
        line_function(ECNUBlocks.LINE_LIGHT_BLUE.get(), "light_blue");
        line_function(ECNUBlocks.LINE_LIGHT_GREEN.get(), "light_green");

        //double line
        double_line_function(ECNUBlocks.DOUBLE_LINE_BLUE.get(), "blue");
        double_line_function(ECNUBlocks.DOUBLE_LINE_RED.get(), "red");
        double_line_function(ECNUBlocks.DOUBLE_LINE_GREEN.get(), "green");
        double_line_function(ECNUBlocks.DOUBLE_LINE_YELLOW.get(), "yellow");
        double_line_function(ECNUBlocks.DOUBLE_LINE_PURPLE.get(), "purple");
        double_line_function(ECNUBlocks.DOUBLE_LINE_ORANGE.get(), "orange");
        double_line_function(ECNUBlocks.DOUBLE_LINE_PINK.get(), "pink");
        double_line_function(ECNUBlocks.DOUBLE_LINE_GOLD.get(), "gold");
        double_line_function(ECNUBlocks.DOUBLE_LINE_WHITE.get(), "white");
        double_line_function(ECNUBlocks.DOUBLE_LINE_SKY_BLUE.get(), "sky_blue");
        double_line_function(ECNUBlocks.DOUBLE_LINE_BLACK.get(), "black");

        //Light系列
        double_line_function(ECNUBlocks.DOUBLE_LINE_LIGHT_PURPLE.get(), "light_purple");
        double_line_function(ECNUBlocks.DOUBLE_LINE_LIGHT_ORANGE.get(), "light_orange");
        double_line_function(ECNUBlocks.DOUBLE_LINE_LIGHT_PINK.get(), "light_pink");
        double_line_function(ECNUBlocks.DOUBLE_LINE_LIGHT_RED.get(), "light_red");
        double_line_function(ECNUBlocks.DOUBLE_LINE_LIGHT_BLUE.get(), "light_blue");
        double_line_function(ECNUBlocks.DOUBLE_LINE_LIGHT_GREEN.get(), "light_green");

        //Light系列
//        simpleBlockWithItem(ECNUBlocks.LINE_LIGHT_BLUE.get(),
//                models().orientable("line_light_blue_block",
//                        modLoc("block/line_light_blue"),
//                        modLoc("block/line_light_blue"),
//                        modLoc("block/grid_blue")
//                )
//        );
//        simpleBlockWithItem(ECNUBlocks.LINE_LIGHT_ORANGE.get(),
//                models().orientable("line_light_orange_block",
//                        modLoc("block/line_light_orange"),
//                        modLoc("block/line_light_orange"),
//                        modLoc("block/grid_orange")
//                )
//        );
//        simpleBlockWithItem(ECNUBlocks.LINE_LIGHT_RED.get(),
//                models().orientable("line_light_red_block",
//                        modLoc("block/line_light_red"),
//                        modLoc("block/line_light_red"),
//                        modLoc("block/grid_red")
//                )
//        );
//        simpleBlockWithItem(ECNUBlocks.LINE_LIGHT_GREEN.get(),
//                models().orientable("line_light_green_block",
//                        modLoc("block/line_light_green"),
//                        modLoc("block/line_light_green"),
//                        modLoc("block/grid_green")
//                )
//        );
//        simpleBlockWithItem(ECNUBlocks.LINE_LIGHT_PURPLE.get(),
//                models().orientable("line_light_purple_block",
//                        modLoc("block/line_light_purple"),
//                        modLoc("block/line_light_purple"),
//                        modLoc("block/grid_purple")
//                )
//        );
//        simpleBlockWithItem(ECNUBlocks.LINE_LIGHT_PINK.get(),
//                models().orientable("line_light_pink_block",
//                        modLoc("block/line_light_pink"),
//                        modLoc("block/line_light_pink"),
//                        modLoc("block/grid_pink")
//                )
//        );

    }
}
