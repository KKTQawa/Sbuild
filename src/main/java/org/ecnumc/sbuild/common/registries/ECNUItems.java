package org.ecnumc.sbuild.common.registries;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.ecnumc.sbuild.common.items.ModLogo1Item;
import org.ecnumc.sbuild.common.items.ModLogoItem;
import org.ecnumc.sbuild.common.items.NullsetItem;
import org.ecnumc.sbuild.common.items.blockentities.ChestMagicItem;
import org.ecnumc.sbuild.common.items.building.ECNUBuildingItems;
import org.ecnumc.sbuild.common.items.building.ECNUDoubleGridItems;
import org.ecnumc.sbuild.common.items.building.ECNUDoubleLineItems;
import org.ecnumc.sbuild.common.items.building.grid.*;
import org.ecnumc.sbuild.common.items.building.line.*;
import org.ecnumc.sbuild.common.items.foods.EcnuCustardBun;


import static org.ecnumc.sbuild.ECNUForge.MODID;

/**
 * Mod Items
 * @author liudongyu
 */
public final class ECNUItems {
    private static final DeferredRegister<Item> REGISTER = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    //entities
	public static final RegistryObject<NullsetItem> NULLSET = REGISTER.register("nullset", () -> new NullsetItem(new Item.Properties()));
	//Box
	public static final RegistryObject<ChestMagicItem> CHEST_MAGIC = REGISTER.register("chest_magic", () -> new ChestMagicItem(ECNUBlocks.CHEST_MAGIC.get(), new Item.Properties()));
	//logo
	public static final RegistryObject<ModLogoItem> LOGO = REGISTER.register("logo", () -> new ModLogoItem(new Item.Properties()));
	public static final RegistryObject<ModLogo1Item> LOGO1 = REGISTER.register("logo1", () -> new ModLogo1Item(new Item.Properties()));
	//building block
	public static final RegistryObject<ECNUBuildingItems.BrickBlackItem> BRICK_BLACK_ITEM = REGISTER.register(
			"brick_black",
			() -> new ECNUBuildingItems.BrickBlackItem(ECNUBlocks.BRICK_BLACK.get(), new Item.Properties())
	);
	public static final RegistryObject<ECNUBuildingItems.BrickYellowItem> BRICK_YELLOW_ITEM = REGISTER.register(
			"brick_yellow",
			() -> new ECNUBuildingItems.BrickYellowItem(ECNUBlocks.BRICK_YELLOW.get(), new Item.Properties())
	);
	public static final RegistryObject<ECNUBuildingItems.SquareBlackItem> SQUARE_BLACK_ITEM = REGISTER.register(
			"square_black",
			() -> new ECNUBuildingItems.SquareBlackItem(ECNUBlocks.SQUARE_BLACK.get(), new Item.Properties())
	);

	public static final RegistryObject<GridBlueItem> GRID_BLUE_ITEM = REGISTER.register(
			"grid_blue",
			() -> new GridBlueItem(ECNUBlocks.GRID_BLUE.get(), new Item.Properties())
	);

	public static final RegistryObject<GridRedItem> GRID_RED_ITEM = REGISTER.register(
			"grid_red",
			() -> new GridRedItem(ECNUBlocks.GRID_RED.get(), new Item.Properties())
	);

	public static final RegistryObject<GridYellowItem> GRID_YELLOW_ITEM = REGISTER.register(
			"grid_yellow",
			() -> new GridYellowItem(ECNUBlocks.GRID_YELLOW.get(), new Item.Properties())
	);

	public static final RegistryObject<GridGreenItem> GRID_GREEN_ITEM = REGISTER.register(
			"grid_green",
			() -> new GridGreenItem(ECNUBlocks.GRID_GREEN.get(), new Item.Properties())
	);

	public static final RegistryObject<GridPurpleItem> GRID_PURPLE_ITEM = REGISTER.register(
			"grid_purple",
			() -> new GridPurpleItem(ECNUBlocks.GRID_PURPLE.get(), new Item.Properties())
	);

	public static final RegistryObject<GridGoldItem> GRID_GOLD_ITEM = REGISTER.register(
			"grid_gold",
			() -> new GridGoldItem(ECNUBlocks.GRID_GOLD.get(), new Item.Properties())
	);

	public static final RegistryObject<GridOrangeItem> GRID_ORANGE_ITEM = REGISTER.register(
			"grid_orange",
			() -> new GridOrangeItem(ECNUBlocks.GRID_ORANGE.get(), new Item.Properties())
	);

	public static final RegistryObject<GridPinkItem> GRID_PINK_ITEM = REGISTER.register(
			"grid_pink",
			() -> new GridPinkItem(ECNUBlocks.GRID_PINK.get(), new Item.Properties())
	);

	public static final RegistryObject<GridWhiteItem> GRID_WHITE_ITEM = REGISTER.register(
			"grid_white",
			() -> new GridWhiteItem(ECNUBlocks.GRID_WHITE.get(), new Item.Properties())
	);

	public static final RegistryObject<GridSkyBlueItem> GRID_SKY_BLUE_ITEM = REGISTER.register(
			"grid_sky_blue",
			() -> new GridSkyBlueItem(ECNUBlocks.GRID_SKY_BLUE.get(), new Item.Properties())
	);

	//Double Grid Items
	public static final RegistryObject<ECNUDoubleGridItems.DoubleGridBlueItem> DOUBLE_GRID_BLUE_ITEM = REGISTER.register(
			"double_grid_blue",
			() -> new ECNUDoubleGridItems.DoubleGridBlueItem(ECNUBlocks.DOUBLE_GRID_BLUE.get(), new Item.Properties())
	);

	public static final RegistryObject<ECNUDoubleGridItems.DoubleGridRedItem> DOUBLE_GRID_RED_ITEM = REGISTER.register(
			"double_grid_red",
			() -> new ECNUDoubleGridItems.DoubleGridRedItem(ECNUBlocks.DOUBLE_GRID_RED.get(), new Item.Properties())
	);

	public static final RegistryObject<ECNUDoubleGridItems.DoubleGridYellowItem> DOUBLE_GRID_YELLOW_ITEM = REGISTER.register(
			"double_grid_yellow",
			() -> new ECNUDoubleGridItems.DoubleGridYellowItem(ECNUBlocks.DOUBLE_GRID_YELLOW.get(), new Item.Properties())
	);

	public static final RegistryObject<ECNUDoubleGridItems.DoubleGridGreenItem> DOUBLE_GRID_GREEN_ITEM = REGISTER.register(
			"double_grid_green",
			() -> new ECNUDoubleGridItems.DoubleGridGreenItem(ECNUBlocks.DOUBLE_GRID_GREEN.get(), new Item.Properties())
	);

	public static final RegistryObject<ECNUDoubleGridItems.DoubleGridPurpleItem> DOUBLE_GRID_PURPLE_ITEM = REGISTER.register(
			"double_grid_purple",
			() -> new ECNUDoubleGridItems.DoubleGridPurpleItem(ECNUBlocks.DOUBLE_GRID_PURPLE.get(), new Item.Properties())
	);

	public static final RegistryObject<ECNUDoubleGridItems.DoubleGridGoldItem> DOUBLE_GRID_GOLD_ITEM = REGISTER.register(
			"double_grid_gold",
			() -> new ECNUDoubleGridItems.DoubleGridGoldItem(ECNUBlocks.DOUBLE_GRID_GOLD.get(), new Item.Properties())
	);

	public static final RegistryObject<ECNUDoubleGridItems.DoubleGridOrangeItem> DOUBLE_GRID_ORANGE_ITEM = REGISTER.register(
			"double_grid_orange",
			() -> new ECNUDoubleGridItems.DoubleGridOrangeItem(ECNUBlocks.DOUBLE_GRID_ORANGE.get(), new Item.Properties())
	);

	public static final RegistryObject<ECNUDoubleGridItems.DoubleGridPinkItem> DOUBLE_GRID_PINK_ITEM = REGISTER.register(
			"double_grid_pink",
			() -> new ECNUDoubleGridItems.DoubleGridPinkItem(ECNUBlocks.DOUBLE_GRID_PINK.get(), new Item.Properties())
	);

	public static final RegistryObject<ECNUDoubleGridItems.DoubleGridWhiteItem> DOUBLE_GRID_WHITE_ITEM = REGISTER.register(
			"double_grid_white",
			() -> new ECNUDoubleGridItems.DoubleGridWhiteItem(ECNUBlocks.DOUBLE_GRID_WHITE.get(), new Item.Properties())
	);

	public static final RegistryObject<ECNUDoubleGridItems.DoubleGridSkyBlueItem> DOUBLE_GRID_SKY_BLUE_ITEM = REGISTER.register(
			"double_grid_sky_blue",
			() -> new ECNUDoubleGridItems.DoubleGridSkyBlueItem(ECNUBlocks.DOUBLE_GRID_SKY_BLUE.get(), new Item.Properties())
	);
	public static final RegistryObject<ECNUDoubleGridItems.DoubleGridBlackItem> DOUBLE_GRID_BLACK_ITEM = REGISTER.register(
			"double_grid_black",
			() -> new ECNUDoubleGridItems.DoubleGridBlackItem(ECNUBlocks.DOUBLE_GRID_BLACK.get(), new Item.Properties())
	);
	// ================= Line Block Items =================
	public static final RegistryObject<LineBlueItem> LINE_BLUE_ITEM = REGISTER.register(
			"line_blue",
			() -> new LineBlueItem(ECNUBlocks.LINE_BLUE.get(), new Item.Properties())
	);

	public static final RegistryObject<LineRedItem> LINE_RED_ITEM = REGISTER.register(
			"line_red",
			() -> new LineRedItem(ECNUBlocks.LINE_RED.get(), new Item.Properties())
	);

	public static final RegistryObject<LineYellowItem> LINE_YELLOW_ITEM = REGISTER.register(
			"line_yellow",
			() -> new LineYellowItem(ECNUBlocks.LINE_YELLOW.get(), new Item.Properties())
	);

	public static final RegistryObject<LineGreenItem> LINE_GREEN_ITEM = REGISTER.register(
			"line_green",
			() -> new LineGreenItem(ECNUBlocks.LINE_GREEN.get(), new Item.Properties())
	);

	public static final RegistryObject<LinePurpleItem> LINE_PURPLE_ITEM = REGISTER.register(
			"line_purple",
			() -> new LinePurpleItem(ECNUBlocks.LINE_PURPLE.get(), new Item.Properties())
	);

	public static final RegistryObject<LineGlodItem> LINE_GOLD_ITEM = REGISTER.register(
			"line_gold",
			() -> new LineGlodItem(ECNUBlocks.LINE_GOLD.get(), new Item.Properties())
	);

	public static final RegistryObject<LineOrangeItem> LINE_ORANGE_ITEM = REGISTER.register(
			"line_orange",
			() -> new LineOrangeItem(ECNUBlocks.LINE_ORANGE.get(), new Item.Properties())
	);

	public static final RegistryObject<LinePinkItem> LINE_PINK_ITEM = REGISTER.register(
			"line_pink",
			() -> new LinePinkItem(ECNUBlocks.LINE_PINK.get(), new Item.Properties())
	);

	public static final RegistryObject<LineWhiteItem> LINE_WHITE_ITEM = REGISTER.register(
			"line_white",
			() -> new LineWhiteItem(ECNUBlocks.LINE_WHITE.get(), new Item.Properties())
	);

	public static final RegistryObject<LineSkyBlueItem> LINE_SKY_BLUE_ITEM = REGISTER.register(
			"line_sky_blue",
			() -> new LineSkyBlueItem(ECNUBlocks.LINE_SKY_BLUE.get(), new Item.Properties())
	);

	public static final RegistryObject<LineLightBlueItem> LINE_LIGHT_BLUE_ITEM = REGISTER.register(
			"line_light_blue",
			() -> new LineLightBlueItem(ECNUBlocks.LINE_LIGHT_BLUE.get(), new Item.Properties())
	);

	public static final RegistryObject<LineLightOrangeItem> LINE_LIGHT_ORANGE_ITEM = REGISTER.register(
			"line_light_orange",
			() -> new LineLightOrangeItem(ECNUBlocks.LINE_LIGHT_ORANGE.get(), new Item.Properties())
	);
	public static final RegistryObject<LineLightRedItem> LINE_LIGHT_RED_ITEM = REGISTER.register(
			"line_light_red",
			() -> new LineLightRedItem(ECNUBlocks.LINE_LIGHT_RED.get(), new Item.Properties())
	);
	public static final RegistryObject<LineLightGreenItem> LINE_LIGHT_GREEN_ITEM = REGISTER.register(
			"line_light_green",
			() -> new LineLightGreenItem(ECNUBlocks.LINE_LIGHT_GREEN.get(), new Item.Properties())
	);
	public static final RegistryObject<LineLightPinkItem> LINE_LIGHT_PINK_ITEM = REGISTER.register(
			"line_light_pink",
			() -> new LineLightPinkItem(ECNUBlocks.LINE_LIGHT_PINK.get(), new Item.Properties())
	);
	public static final RegistryObject<LineLightPurpleItem> LINE_LIGHT_PURPLE_ITEM = REGISTER.register(
			"line_light_purple",
			() -> new LineLightPurpleItem(ECNUBlocks.LINE_LIGHT_PURPLE.get(), new Item.Properties())
	);
	//double Line item
	public static final RegistryObject<ECNUDoubleLineItems.DoubleLineBlueItem> DOUBLE_LINE_BLUE_ITEM = REGISTER.register(
			"double_line_blue",
			() -> new ECNUDoubleLineItems.DoubleLineBlueItem(ECNUBlocks.DOUBLE_LINE_BLUE.get(), new Item.Properties())
	);

	public static final RegistryObject<ECNUDoubleLineItems.DoubleLineRedItem> DOUBLE_LINE_RED_ITEM = REGISTER.register(
			"double_line_red",
			() -> new ECNUDoubleLineItems.DoubleLineRedItem(ECNUBlocks.DOUBLE_LINE_RED.get(), new Item.Properties())
	);

	public static final RegistryObject<ECNUDoubleLineItems.DoubleLineYellowItem> DOUBLE_LINE_YELLOW_ITEM = REGISTER.register(
			"double_line_yellow",
			() -> new ECNUDoubleLineItems.DoubleLineYellowItem(ECNUBlocks.DOUBLE_LINE_YELLOW.get(), new Item.Properties())
	);

	public static final RegistryObject<ECNUDoubleLineItems.DoubleLineGreenItem> DOUBLE_LINE_GREEN_ITEM = REGISTER.register(
			"double_line_green",
			() -> new ECNUDoubleLineItems.DoubleLineGreenItem(ECNUBlocks.DOUBLE_LINE_GREEN.get(), new Item.Properties())
	);

	public static final RegistryObject<ECNUDoubleLineItems.DoubleLinePurpleItem> DOUBLE_LINE_PURPLE_ITEM = REGISTER.register(
			"double_line_purple",
			() -> new ECNUDoubleLineItems.DoubleLinePurpleItem(ECNUBlocks.DOUBLE_LINE_PURPLE.get(), new Item.Properties())
	);

	public static final RegistryObject<ECNUDoubleLineItems.DoubleLineGoldItem> DOUBLE_LINE_GOLD_ITEM = REGISTER.register(
			"double_line_gold",
			() -> new ECNUDoubleLineItems.DoubleLineGoldItem(ECNUBlocks.DOUBLE_LINE_GOLD.get(), new Item.Properties())
	);

	public static final RegistryObject<ECNUDoubleLineItems.DoubleLineOrangeItem> DOUBLE_LINE_ORANGE_ITEM = REGISTER.register(
			"double_line_orange",
			() -> new ECNUDoubleLineItems.DoubleLineOrangeItem(ECNUBlocks.DOUBLE_LINE_ORANGE.get(), new Item.Properties())
	);

	public static final RegistryObject<ECNUDoubleLineItems.DoubleLinePinkItem> DOUBLE_LINE_PINK_ITEM = REGISTER.register(
			"double_line_pink",
			() -> new ECNUDoubleLineItems.DoubleLinePinkItem(ECNUBlocks.DOUBLE_LINE_PINK.get(), new Item.Properties())
	);

	public static final RegistryObject<ECNUDoubleLineItems.DoubleLineWhiteItem> DOUBLE_LINE_WHITE_ITEM = REGISTER.register(
			"double_line_white",
			() -> new ECNUDoubleLineItems.DoubleLineWhiteItem(ECNUBlocks.DOUBLE_LINE_WHITE.get(), new Item.Properties())
	);

	public static final RegistryObject<ECNUDoubleLineItems.DoubleLineSkyBlueItem> DOUBLE_LINE_SKY_BLUE_ITEM = REGISTER.register(
			"double_line_sky_blue",
			() -> new ECNUDoubleLineItems.DoubleLineSkyBlueItem(ECNUBlocks.DOUBLE_LINE_SKY_BLUE.get(), new Item.Properties())
	);

	public static final RegistryObject<ECNUDoubleLineItems.DoubleLineLightBlueItem> DOUBLE_LINE_LIGHT_BLUE_ITEM = REGISTER.register(
			"double_line_light_blue",
			() -> new ECNUDoubleLineItems.DoubleLineLightBlueItem(ECNUBlocks.DOUBLE_LINE_LIGHT_BLUE.get(), new Item.Properties())
	);

	public static final RegistryObject<ECNUDoubleLineItems.DoubleLineLightOrangeItem> DOUBLE_LINE_LIGHT_ORANGE_ITEM = REGISTER.register(
			"double_line_light_orange",
			() -> new ECNUDoubleLineItems.DoubleLineLightOrangeItem(ECNUBlocks.DOUBLE_LINE_LIGHT_ORANGE.get(), new Item.Properties())
	);
	public static final RegistryObject<ECNUDoubleLineItems.DoubleLineLightRedItem> DOUBLE_LINE_LIGHT_RED_ITEM = REGISTER.register(
			"double_line_light_red",
			() -> new ECNUDoubleLineItems.DoubleLineLightRedItem(ECNUBlocks.DOUBLE_LINE_LIGHT_RED.get(), new Item.Properties())
	);
	public static final RegistryObject<ECNUDoubleLineItems.DoubleLineLightGreenItem> DOUBLE_LINE_LIGHT_GREEN_ITEM = REGISTER.register(
			"double_line_light_green",
			() -> new ECNUDoubleLineItems.DoubleLineLightGreenItem(ECNUBlocks.DOUBLE_LINE_LIGHT_GREEN.get(), new Item.Properties())
	);
	public static final RegistryObject<ECNUDoubleLineItems.DoubleLineLightPinkItem> DOUBLE_LINE_LIGHT_PINK_ITEM = REGISTER.register(
			"double_line_light_pink",
			() -> new ECNUDoubleLineItems.DoubleLineLightPinkItem(ECNUBlocks.DOUBLE_LINE_LIGHT_PINK.get(), new Item.Properties())
	);
	public static final RegistryObject<ECNUDoubleLineItems.DoubleLineLightPurpleItem> DOUBLE_LINE_LIGHT_PURPLE_ITEM = REGISTER.register(
			"double_line_light_purple",
			() -> new ECNUDoubleLineItems.DoubleLineLightPurpleItem(ECNUBlocks.DOUBLE_LINE_LIGHT_PURPLE.get(), new Item.Properties())
	);
	public static final RegistryObject<ECNUDoubleLineItems.DoubleLineBlackItem> DOUBLE_LINE_BLACK_ITEM = REGISTER.register(
			"double_line_black",
			() -> new ECNUDoubleLineItems.DoubleLineBlackItem(ECNUBlocks.DOUBLE_LINE_BLACK.get(), new Item.Properties())
	);
	//foods
	public static final RegistryObject<EcnuCustardBun> ECNUCUSTARDBUN = REGISTER.register("ecnu_custard_bun", () -> new EcnuCustardBun(new Item.Properties().food(EcnuCustardBun.ECNUCUSTARDBUN_properties)));

	private ECNUItems() {
	}

	/**
	 * Register the items on mod constructing.
	 * @param modBus	the mod bus
	 */
	public static void init(IEventBus modBus) {
		REGISTER.register(modBus);
	}
}
