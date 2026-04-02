package org.ecnumc.sbuild.common.registries;

import net.minecraft.core.registries.Registries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextColor;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static org.ecnumc.sbuild.ECNUForge.MODID;

/**
 * Mod Creative Mode Tabs
 * @author liudongyu
 */

public final class ECNUCreativeModeTabs {
	private static final DeferredRegister<CreativeModeTab> REGISTER = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

	public static final RegistryObject<CreativeModeTab> ECNU = REGISTER.register(
			"main", () -> CreativeModeTab.builder()
					.withTabsBefore(CreativeModeTabs.COLORED_BLOCKS)
					.title(Component.translatable("itemGroup." + MODID).withStyle(Style.EMPTY.withColor(TextColor.fromRgb(0xFF5555))) )
					.icon(() -> new ItemStack(ECNUItems.LOGO1.get()))
					.displayItems((flags, output) -> {

						// ================= Paintings =================
//						ItemStack paintingStack = new ItemStack(Items.PAINTING);
//						CompoundTag entityTag = new CompoundTag();
//						entityTag.putString("variant", MODID + ":logo1");
//						paintingStack.addTagElement("EntityTag", entityTag);
//						paintingStack.setHoverName(Component.translatable("item." + MODID + ".painting.logo1"));
//						output.accept(paintingStack);
//
//						ItemStack paintingStack1 = new ItemStack(Items.PAINTING);
//						CompoundTag entityTag1 = new CompoundTag();
//						entityTag1.putString("variant", MODID + ":logo");
//						paintingStack1.addTagElement("EntityTag", entityTag1);
//						paintingStack1.setHoverName(Component.translatable("item." + MODID + ".painting.logo"));
//						output.accept(paintingStack1);
						//logo
						output.accept(ECNUItems.LOGO.get());
						output.accept(ECNUItems.LOGO1.get());

						// ================= Chest =================
						output.accept(ECNUItems.CHEST_MAGIC.get());

						// ================= Foods =================
						//output.accept(ECNUItems.ECNUCUSTARDBUN.get());
						//Building Block Items
						output.accept(ECNUItems.BRICK_BLACK_ITEM.get());
						output.accept(ECNUItems.BRICK_YELLOW_ITEM.get());
						output.accept(ECNUItems.SQUARE_BLACK_ITEM.get());

						// ================= Grid Items =================
						output.accept(ECNUItems.GRID_BLUE_ITEM.get());
						output.accept(ECNUItems.GRID_RED_ITEM.get());
						output.accept(ECNUItems.GRID_YELLOW_ITEM.get());
						output.accept(ECNUItems.GRID_GREEN_ITEM.get());
						output.accept(ECNUItems.GRID_PURPLE_ITEM.get());
						output.accept(ECNUItems.GRID_GOLD_ITEM.get());
						output.accept(ECNUItems.GRID_ORANGE_ITEM.get());
						output.accept(ECNUItems.GRID_PINK_ITEM.get());
						output.accept(ECNUItems.GRID_WHITE_ITEM.get());
						output.accept(ECNUItems.GRID_SKY_BLUE_ITEM.get());
						//Double Grid Items
						output.accept(ECNUItems.DOUBLE_GRID_BLUE_ITEM.get());
						output.accept(ECNUItems.DOUBLE_GRID_RED_ITEM.get());
						output.accept(ECNUItems.DOUBLE_GRID_YELLOW_ITEM.get());
						output.accept(ECNUItems.DOUBLE_GRID_GREEN_ITEM.get());
						output.accept(ECNUItems.DOUBLE_GRID_PURPLE_ITEM.get());
						output.accept(ECNUItems.DOUBLE_GRID_GOLD_ITEM.get());
						output.accept(ECNUItems.DOUBLE_GRID_ORANGE_ITEM.get());
						output.accept(ECNUItems.DOUBLE_GRID_PINK_ITEM.get());
						output.accept(ECNUItems.DOUBLE_GRID_WHITE_ITEM.get());
						output.accept(ECNUItems.DOUBLE_GRID_SKY_BLUE_ITEM.get());
						output.accept(ECNUItems.DOUBLE_GRID_BLACK_ITEM.get());

						// ================= Line Items =================
						output.accept(ECNUItems.LINE_BLUE_ITEM.get());
						output.accept(ECNUItems.LINE_RED_ITEM.get());
						output.accept(ECNUItems.LINE_YELLOW_ITEM.get());
						output.accept(ECNUItems.LINE_GREEN_ITEM.get());
						output.accept(ECNUItems.LINE_PURPLE_ITEM.get());
						output.accept(ECNUItems.LINE_GOLD_ITEM.get());
						output.accept(ECNUItems.LINE_ORANGE_ITEM.get());
						output.accept(ECNUItems.LINE_PINK_ITEM.get());
						output.accept(ECNUItems.LINE_WHITE_ITEM.get());
						output.accept(ECNUItems.LINE_SKY_BLUE_ITEM.get());
						output.accept(ECNUItems.LINE_LIGHT_BLUE_ITEM.get());
						output.accept(ECNUItems.LINE_LIGHT_RED_ITEM.get());
						output.accept(ECNUItems.LINE_LIGHT_PINK_ITEM.get());
						output.accept(ECNUItems.LINE_LIGHT_GREEN_ITEM.get());
						output.accept(ECNUItems.LINE_LIGHT_PURPLE_ITEM.get());
						output.accept(ECNUItems.LINE_LIGHT_ORANGE_ITEM.get());
						//double line Items
						output.accept(ECNUItems.DOUBLE_LINE_BLUE_ITEM.get());
						output.accept(ECNUItems.DOUBLE_LINE_RED_ITEM.get());
						output.accept(ECNUItems.DOUBLE_LINE_YELLOW_ITEM.get());
						output.accept(ECNUItems.DOUBLE_LINE_GREEN_ITEM.get());
						output.accept(ECNUItems.DOUBLE_LINE_PURPLE_ITEM.get());
						output.accept(ECNUItems.DOUBLE_LINE_GOLD_ITEM.get());
						output.accept(ECNUItems.DOUBLE_LINE_ORANGE_ITEM.get());
						output.accept(ECNUItems.DOUBLE_LINE_PINK_ITEM.get());
						output.accept(ECNUItems.DOUBLE_LINE_WHITE_ITEM.get());
						output.accept(ECNUItems.DOUBLE_LINE_SKY_BLUE_ITEM.get());
						output.accept(ECNUItems.DOUBLE_LINE_LIGHT_BLUE_ITEM.get());
						output.accept(ECNUItems.DOUBLE_LINE_LIGHT_RED_ITEM.get());
						output.accept(ECNUItems.DOUBLE_LINE_LIGHT_PINK_ITEM.get());
						output.accept(ECNUItems.DOUBLE_LINE_LIGHT_GREEN_ITEM.get());
						output.accept(ECNUItems.DOUBLE_LINE_LIGHT_PURPLE_ITEM.get());
						output.accept(ECNUItems.DOUBLE_LINE_LIGHT_ORANGE_ITEM.get());
						output.accept(ECNUItems.DOUBLE_LINE_BLACK_ITEM.get());
					})
					.build()
	);

	private ECNUCreativeModeTabs() {
	}

	/**
	 * Register the creative mode tabs on mod constructing.
	 * @param modBus	the mod bus
	 */
	public static void init(IEventBus modBus) {
		REGISTER.register(modBus);
	}
}
