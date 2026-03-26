package org.ecnumc.sbuild.common.registries;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.ecnumc.sbuild.common.blocks.*;
import org.ecnumc.sbuild.common.items.building.ECNUBuildingItems;

import static org.ecnumc.sbuild.ECNUForge.MODID;

public class ECNUBlocks {
    public static final DeferredRegister<Block> REGISTER = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);

    //building block
    public static final RegistryObject<Block> BRICK_BLACK = REGISTER.register(
            "brick_black",
            () -> new ECNUBuildingBlocks.BrickBlackBlock(BlockBehaviour.Properties.of()
                    .strength(2.0f, 400.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_GRAY)
            )
    );
    public static final RegistryObject<Block> BRICK_YELLOW = REGISTER.register(
            "brick_yellow",
            () -> new ECNUBuildingBlocks.BrickYellowBlock(BlockBehaviour.Properties.of()
                    .strength(2.0f, 400.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_GRAY)
            )
    );
    public static final RegistryObject<Block> SQUARE_BLACK = REGISTER.register(
            "square_black",
            () -> new ECNUBuildingBlocks.SquareBlackBlock(BlockBehaviour.Properties.of()
                    .strength(2.0f, 400.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_GRAY)
            )
    );
// ================= Grid Blocks =================

    public static final RegistryObject<Block> GRID_BLUE = REGISTER.register(
            "grid_blue",
            () -> new ECNUGridBlocks.GridBlueBlock(BlockBehaviour.Properties.of()
                    .strength(2.0f, 400.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_GRAY)
            )
    );

    public static final RegistryObject<Block> GRID_RED = REGISTER.register(
            "grid_red",
            () -> new ECNUGridBlocks.GridRedBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(2.0f, 400.0f)
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_GRAY)
            )
    );

    public static final RegistryObject<Block> GRID_YELLOW = REGISTER.register(
            "grid_yellow",
            () -> new ECNUGridBlocks.GridYellowBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(2.0f, 400.0f)
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_GRAY)
            )
    );

    public static final RegistryObject<Block> GRID_GREEN = REGISTER.register(
            "grid_green",
            () -> new ECNUGridBlocks.GridGreenBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(2.0f, 400.0f)
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_GRAY)
            )
    );

    public static final RegistryObject<Block> GRID_PURPLE = REGISTER.register(
            "grid_purple",
            () -> new ECNUGridBlocks.GridPurpleBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(2.0f, 400.0f)
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_GRAY)
            )
    );

    public static final RegistryObject<Block> GRID_GOLD = REGISTER.register(
            "grid_gold",
            () -> new ECNUGridBlocks.GridGoldBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(2.0f, 400.0f)
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_GRAY)
            )
    );

    public static final RegistryObject<Block> GRID_ORANGE = REGISTER.register(
            "grid_orange",
            () -> new ECNUGridBlocks.GridOrangeBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(2.0f, 400.0f)
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_GRAY)
            )
    );

    public static final RegistryObject<Block> GRID_PINK = REGISTER.register(
            "grid_pink",
            () -> new ECNUGridBlocks.GridPinkBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(2.0f, 400.0f)
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_GRAY)
            )
    );

    public static final RegistryObject<Block> GRID_WHITE = REGISTER.register(
            "grid_white",
            () -> new ECNUGridBlocks.GridWhiteBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(2.0f, 400.0f)
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_GRAY)
            )
    );

    public static final RegistryObject<Block> GRID_SKY_BLUE = REGISTER.register(
            "grid_sky_blue",
            () -> new ECNUGridBlocks.GridSkyBlueBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(2.0f, 400.0f)
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_GRAY)
            )
    );
    // Double Grid Blocks
    public static final RegistryObject<Block> DOUBLE_GRID_BLUE = REGISTER.register(
            "double_grid_blue",
            () -> new ECNUGridBlocks.DoubleGridBlueBlock(BlockBehaviour.Properties.of()
                    .strength(2.0f, 400.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_GRAY)
            )
    );

    public static final RegistryObject<Block> DOUBLE_GRID_RED = REGISTER.register(
            "double_grid_red",
            () -> new ECNUGridBlocks.DoubleGridRedBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(2.0f, 400.0f)
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_GRAY)
            )
    );

    public static final RegistryObject<Block> DOUBLE_GRID_YELLOW = REGISTER.register(
            "double_grid_yellow",
            () -> new ECNUGridBlocks.DoubleGridYellowBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(2.0f, 400.0f)
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_GRAY)
            )
    );

    public static final RegistryObject<Block> DOUBLE_GRID_GREEN = REGISTER.register(
            "double_grid_green",
            () -> new ECNUGridBlocks.DoubleGridGreenBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(2.0f, 400.0f)
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_GRAY)
            )
    );

    public static final RegistryObject<Block> DOUBLE_GRID_PURPLE = REGISTER.register(
            "double_grid_purple",
            () -> new ECNUGridBlocks.DoubleGridPurpleBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(2.0f, 400.0f)
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_GRAY)
            )
    );

    public static final RegistryObject<Block> DOUBLE_GRID_GOLD = REGISTER.register(
            "double_grid_gold",
            () -> new ECNUGridBlocks.DoubleGridGoldBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(2.0f, 400.0f)
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_GRAY)
            )
    );

    public static final RegistryObject<Block> DOUBLE_GRID_ORANGE = REGISTER.register(
            "double_grid_orange",
            () -> new ECNUGridBlocks.DoubleGridOrangeBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(2.0f, 400.0f)
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_GRAY)
            )
    );

    public static final RegistryObject<Block> DOUBLE_GRID_PINK = REGISTER.register(
            "double_grid_pink",
            () -> new ECNUGridBlocks.DoubleGridPinkBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(2.0f, 400.0f)
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_GRAY)
            )
    );

    public static final RegistryObject<Block> DOUBLE_GRID_WHITE = REGISTER.register(
            "double_grid_white",
            () -> new ECNUGridBlocks.DoubleGridWhiteBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(2.0f, 400.0f)
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_GRAY)
            )
    );

    public static final RegistryObject<Block> DOUBLE_GRID_SKY_BLUE = REGISTER.register(
            "double_grid_sky_blue",
            () -> new ECNUGridBlocks.DoubleGridSkyBlueBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(2.0f, 400.0f)
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_GRAY)
            )
    );
    public static final RegistryObject<Block> DOUBLE_GRID_BLACK = REGISTER.register(
            "double_grid_black",
            () -> new ECNUGridBlocks.DoubleGridBlackBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(2.0f, 400.0f)
                    .sound(SoundType.STONE)
                    .mapColor(MapColor.COLOR_GRAY)
            )
    );
// ================= Line Blocks =================

    public static final RegistryObject<Block> LINE_BLUE = REGISTER.register(
            "line_blue",
            () -> new ECNULineBlocks.LineBlueBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.STONE)
                    .strength(2.0f, 400.0f)
            )
    );

    public static final RegistryObject<Block> LINE_RED = REGISTER.register(
            "line_red",
            () -> new ECNULineBlocks.LineRedBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.STONE)
                    .strength(2.0f, 400.0f)
            )
    );

    public static final RegistryObject<Block> LINE_YELLOW = REGISTER.register(
            "line_yellow",
            () -> new ECNULineBlocks.LineYellowBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.STONE)
                    .strength(2.0f, 400.0f)
            )
    );

    public static final RegistryObject<Block> LINE_GREEN = REGISTER.register(
            "line_green",
            () -> new ECNULineBlocks.LineGreenBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.STONE)
                    .strength(2.0f, 400.0f)
            )
    );

    public static final RegistryObject<Block> LINE_PURPLE = REGISTER.register(
            "line_purple",
            () -> new ECNULineBlocks.LinePurpleBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.STONE)
                    .strength(2.0f, 400.0f)
            )
    );

    public static final RegistryObject<Block> LINE_GOLD = REGISTER.register(
            "line_gold",
            () -> new ECNULineBlocks.LineGoldBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.STONE)
                    .strength(2.0f, 400.0f)
            )
    );

    public static final RegistryObject<Block> LINE_ORANGE = REGISTER.register(
            "line_orange",
            () -> new ECNULineBlocks.LineOrangeBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.STONE)
                    .strength(2.0f, 400.0f)
            )
    );

    public static final RegistryObject<Block> LINE_PINK = REGISTER.register(
            "line_pink",
            () -> new ECNULineBlocks.LinePinkBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.STONE)
                    .strength(2.0f, 400.0f)
            )
    );

    public static final RegistryObject<Block> LINE_WHITE = REGISTER.register(
            "line_white",
            () -> new ECNULineBlocks.LineWhiteBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.STONE)
                    .strength(2.0f, 400.0f)
            )
    );

    public static final RegistryObject<Block> LINE_SKY_BLUE = REGISTER.register(
            "line_sky_blue",
            () -> new ECNULineBlocks.LineSkyBlueBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.STONE)
                    .strength(2.0f, 400.0f)
            )
    );

    public static final RegistryObject<Block> LINE_LIGHT_BLUE = REGISTER.register(
            "line_light_blue",
            () -> new ECNULineBlocks.LineLightBlueBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.STONE)
                    .strength(2.0f, 400.0f)
            )
    );
    public static final RegistryObject<Block> LINE_LIGHT_RED = REGISTER.register(
            "line_light_red",
            () -> new ECNULineBlocks.LineLightRedBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.STONE)
                    .strength(2.0f, 400.0f)
            )
    );
    public static final RegistryObject<Block> LINE_LIGHT_PINK = REGISTER.register(
            "line_light_pink",
            () -> new ECNULineBlocks.LineLightPinkBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.STONE)
                    .strength(2.0f, 400.0f)
            )
    );
    public static final RegistryObject<Block> LINE_LIGHT_ORANGE = REGISTER.register(
            "line_light_orange",
            () -> new ECNULineBlocks.LineLightOrangeBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.STONE)
                    .strength(2.0f, 400.0f)
            )
    );
    public static final RegistryObject<Block> LINE_LIGHT_GREEN = REGISTER.register(
            "line_light_green",
            () -> new ECNULineBlocks.LineLightGreenBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.STONE)
                    .strength(2.0f, 400.0f)
            )
    );
    public static final RegistryObject<Block> LINE_LIGHT_PURPLE = REGISTER.register(
            "line_light_purple",
            () -> new ECNULineBlocks.LineLightPurpleBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.STONE)
                    .strength(2.0f, 400.0f)
            )
    );

    //Double Line
    public static final RegistryObject<Block> DOUBLE_LINE_BLUE = REGISTER.register(
            "double_line_blue",
            () -> new ECNULineBlocks.DoubleLineBlueBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.STONE)
                    .strength(2.0f, 400.0f)
            )
    );

    public static final RegistryObject<Block> DOUBLE_LINE_RED = REGISTER.register(
            "double_line_red",
            () -> new ECNULineBlocks.DoubleLineRedBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.STONE)
                    .strength(2.0f, 400.0f)
            )
    );

    public static final RegistryObject<Block> DOUBLE_LINE_YELLOW = REGISTER.register(
            "double_line_yellow",
            () -> new ECNULineBlocks.DoubleLineYellowBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.STONE)
                    .strength(2.0f, 400.0f)
            )
    );

    public static final RegistryObject<Block> DOUBLE_LINE_GREEN = REGISTER.register(
            "double_line_green",
            () -> new ECNULineBlocks.DoubleLineGreenBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.STONE)
                    .strength(2.0f, 400.0f)
            )
    );

    public static final RegistryObject<Block> DOUBLE_LINE_PURPLE = REGISTER.register(
            "double_line_purple",
            () -> new ECNULineBlocks.DoubleLinePurpleBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.STONE)
                    .strength(2.0f, 400.0f)
            )
    );

    public static final RegistryObject<Block> DOUBLE_LINE_GOLD = REGISTER.register(
            "double_line_gold",
            () -> new ECNULineBlocks.DoubleLineGoldBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.STONE)
                    .strength(2.0f, 400.0f)
            )
    );

    public static final RegistryObject<Block> DOUBLE_LINE_ORANGE = REGISTER.register(
            "double_line_orange",
            () -> new ECNULineBlocks.DoubleLineOrangeBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.STONE)
                    .strength(2.0f, 400.0f)
            )
    );

    public static final RegistryObject<Block> DOUBLE_LINE_PINK = REGISTER.register(
            "double_line_pink",
            () -> new ECNULineBlocks.DoubleLinePinkBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.STONE)
                    .strength(2.0f, 400.0f)
            )
    );

    public static final RegistryObject<Block> DOUBLE_LINE_WHITE = REGISTER.register(
            "double_line_white",
            () -> new ECNULineBlocks.DoubleLineWhiteBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.STONE)
                    .strength(2.0f, 400.0f)
            )
    );

    public static final RegistryObject<Block> DOUBLE_LINE_SKY_BLUE = REGISTER.register(
            "double_line_sky_blue",
            () -> new ECNULineBlocks.DoubleLineSkyBlueBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.STONE)
                    .strength(2.0f, 400.0f)
            )
    );

    public static final RegistryObject<Block> DOUBLE_LINE_LIGHT_BLUE = REGISTER.register(
            "double_line_light_blue",
            () -> new ECNULineBlocks.DoubleLineLightBlueBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.STONE)
                    .strength(2.0f, 400.0f)
            )
    );
    public static final RegistryObject<Block> DOUBLE_LINE_LIGHT_RED = REGISTER.register(
            "double_line_light_red",
            () -> new ECNULineBlocks.DoubleLineLightRedBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.STONE)
                    .strength(2.0f, 400.0f)
            )
    );
    public static final RegistryObject<Block> DOUBLE_LINE_LIGHT_PINK = REGISTER.register(
            "double_line_light_pink",
            () -> new ECNULineBlocks.DoubleLineLightPinkBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.STONE)
                    .strength(2.0f, 400.0f)
            )
    );
    public static final RegistryObject<Block> DOUBLE_LINE_LIGHT_ORANGE = REGISTER.register(
            "double_line_light_orange",
            () -> new ECNULineBlocks.DoubleLineLightOrangeBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.STONE)
                    .strength(2.0f, 400.0f)
            )
    );
    public static final RegistryObject<Block> DOUBLE_LINE_LIGHT_GREEN = REGISTER.register(
            "double_line_light_green",
            () -> new ECNULineBlocks.DoubleLineLightGreenBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.STONE)
                    .strength(2.0f, 400.0f)
            )
    );
    public static final RegistryObject<Block> DOUBLE_LINE_LIGHT_PURPLE = REGISTER.register(
            "double_line_light_purple",
            () -> new ECNULineBlocks.DoubleLineLightPurpleBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.STONE)
                    .strength(2.0f, 400.0f)
            )
    );
    public static final RegistryObject<Block> DOUBLE_LINE_BLACK = REGISTER.register(
            "double_line_black",
            () -> new ECNULineBlocks.DoubleLineBlackBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.COLOR_GRAY)
                    .sound(SoundType.STONE)
                    .strength(2.0f, 400.0f)
            )
    );
    //Box
    public static final RegistryObject<Block> CHEST_MAGIC = REGISTER.register(
            "chest_magic",
            () -> new ChestMagicBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.WOOD)
                    .sound(SoundType.WOOD)
                    .strength(2.0f, 1200.0f)
                    .ignitedByLava()
                    .noOcclusion()
            )
    );

    private ECNUBlocks() {
    }

    public static void init(IEventBus modBus) {
        REGISTER.register(modBus);
    }
}
