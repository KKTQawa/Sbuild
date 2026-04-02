package org.ecnumc.sbuild.common.datagen;

import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;
import org.ecnumc.sbuild.ECNUForge;
import org.ecnumc.sbuild.common.registries.ECNUItems;
import static org.ecnumc.sbuild.ECNUForge.MODID;
public class ModEnUsLangProvider extends LanguageProvider {
    public ModEnUsLangProvider(PackOutput output) {
        super(output, ECNUForge.MODID, "en_us");
    }
    @Override
    protected void addTranslations() {

        this.add("itemGroup." + MODID + ".ecnu", "ECNU Dawn Redwood Blocks");
        //logo
        this.add("item." + MODID + ".mod_logo1", "LOGO");
        this.add("item." + MODID + ".mod_logo1.description", "LOGO");

        this.add("item." + MODID + ".mod_logo", "ECNU Badge");
        this.add("item." + MODID + ".mod_logo.description", "ECNU Badge");

        //paintings
        this.add("item." + MODID + ".painting.logo1", "painting");
        this.add("item." + MODID + ".painting.logo1.description", "Badge");
        this.add("painting." + MODID + ".logo1.title", "Sichuan");
        this.add("painting." + MODID + ".logo1.author", "9090");

        this.add("item." + MODID + ".painting.logo", "painting");
        this.add("item." + MODID + ".painting.logo.description", "ECNU Badge");
        this.add("painting." + MODID + ".logo.title", "ECNU LOGO");
        this.add("painting." + MODID + ".logo.author", "9090");
        //Box
        this.add("item." + MODID + ".chest_magic", "chest");
        this.add("item." + MODID + ".chest_magic.description", "chest");
        this.add("block." + MODID + ".chest_magic", "chest");
        this.add("container." + MODID + ".chest_magic", "chest");
        // ================= Building Block Items =================
        add(ECNUItems.BRICK_YELLOW_ITEM.get(), "Yellow Brick");
        this.add("item." + MODID + ".brick_yellow.description", "Yellow bricks with a strong modern vibe.");

        add(ECNUItems.BRICK_BLACK_ITEM.get(), "Black Brick");
        this.add("item." + MODID + ".brick_black.description", "Black bricks with a strong modern vibe.");

        add(ECNUItems.SQUARE_BLACK_ITEM.get(), "Concrete Wall");
        this.add("item." + MODID + ".square_black.description", "Concrete wall with a strong modern vibe.");
        // ================= Grid Block Items =================
        add(ECNUItems.GRID_BLUE_ITEM.get(), "Blue Grid Block");
        this.add("item." + MODID + ".grid_blue.description", "Blue grid squares with distinctive Shanghai characteristics.");

        add(ECNUItems.GRID_RED_ITEM.get(), "Red Grid Block");
        this.add("item." + MODID + ".grid_red.description", "Red grid squares with distinctive Shanghai characteristics.");

        add(ECNUItems.GRID_YELLOW_ITEM.get(), "Yellow Grid Block");
        this.add("item." + MODID + ".grid_yellow.description", "Yellow grid squares with distinctive Shanghai characteristics.");

        add(ECNUItems.GRID_GREEN_ITEM.get(), "Green Grid Block");
        this.add("item." + MODID + ".grid_green.description", "Green grid squares with distinctive Shanghai characteristics.");

        add(ECNUItems.GRID_PURPLE_ITEM.get(), "Purple Grid Block");
        this.add("item." + MODID + ".grid_purple.description", "Purple grid squares with distinctive Shanghai characteristics.");

        add(ECNUItems.GRID_GOLD_ITEM.get(), "Gold Grid Block");
        this.add("item." + MODID + ".grid_gold.description", "Gold grid squares with distinctive Shanghai characteristics.");

        add(ECNUItems.GRID_ORANGE_ITEM.get(), "Orange Grid Block");
        this.add("item." + MODID + ".grid_orange.description", "Orange grid squares with distinctive Shanghai characteristics.");

        add(ECNUItems.GRID_PINK_ITEM.get(), "Pink Grid Block");
        this.add("item." + MODID + ".grid_pink.description", "Pink grid squares with distinctive Shanghai characteristics.");

        add(ECNUItems.GRID_WHITE_ITEM.get(), "White Grid Block");
        this.add("item." + MODID + ".grid_white.description", "White grid squares with distinctive Shanghai characteristics.");

        add(ECNUItems.GRID_SKY_BLUE_ITEM.get(), "Sky Blue Grid Block");
        this.add("item." + MODID + ".grid_sky_blue.description", "Sky Blue grid squares with distinctive Shanghai characteristics.");

        add(ECNUItems.DOUBLE_GRID_BLUE_ITEM.get(), "Blue Double Grid Block");
        this.add("item." + MODID + ".double_grid_blue.description", "Blue Double Grid Block with distinctive Shanghai characteristics.");

        add(ECNUItems.DOUBLE_GRID_RED_ITEM.get(), "Red Double Grid Block");
        this.add("item." + MODID + ".double_grid_red.description", "Red Double Grid Block with distinctive Shanghai characteristics.");

        add(ECNUItems.DOUBLE_GRID_YELLOW_ITEM.get(), "Yellow Double Grid Block");
        this.add("item." + MODID + ".double_grid_yellow.description", "Yellow Double Grid Block with distinctive Shanghai characteristics.");

        add(ECNUItems.DOUBLE_GRID_GREEN_ITEM.get(), "Green Double Grid Block");
        this.add("item." + MODID + ".double_grid_green.description", "Green Double Grid Block with distinctive Shanghai characteristics.");

        add(ECNUItems.DOUBLE_GRID_PURPLE_ITEM.get(), "Purple Double Grid Block");
        this.add("item." + MODID + ".double_grid_purple.description", "Purple Double Grid Block with distinctive Shanghai characteristics.");

        add(ECNUItems.DOUBLE_GRID_GOLD_ITEM.get(), "Gold Double Grid Block");
        this.add("item." + MODID + ".double_grid_gold.description", "Gold Double Grid Block with distinctive Shanghai characteristics.");

        add(ECNUItems.DOUBLE_GRID_ORANGE_ITEM.get(), "Orange Double Grid Block");
        this.add("item." + MODID + ".double_grid_orange.description", "Orange Double Grid Block with distinctive Shanghai characteristics.");

        add(ECNUItems.DOUBLE_GRID_PINK_ITEM.get(), "Pink Double Grid Block");
        this.add("item." + MODID + ".double_grid_pink.description", "Pink Double Grid Block with distinctive Shanghai characteristics.");

        add(ECNUItems.DOUBLE_GRID_WHITE_ITEM.get(), "White Double Grid Block");
        this.add("item." + MODID + ".double_grid_white.description", "White Double Grid Block with distinctive Shanghai characteristics.");

        add(ECNUItems.DOUBLE_GRID_BLACK_ITEM.get(), "Black Double Grid Block");
        this.add("item." + MODID + ".double_grid_black.description", "Black Double Grid Block with distinctive Shanghai characteristics.");

        add(ECNUItems.DOUBLE_GRID_SKY_BLUE_ITEM.get(), "Sky Blue Double Grid Block");
        this.add("item." + MODID + ".double_grid_sky_blue.description", "Sky Blue Double Grid Block with distinctive Shanghai characteristics.");
        // ================= Line Block Items =================
        add(ECNUItems.LINE_BLUE_ITEM.get(), "Blue Line Block");
        this.add("item." + MODID + ".line_blue.description", "Blue line squares with distinctive Shanghai characteristics.");

        add(ECNUItems.LINE_RED_ITEM.get(), "Red Line Block");
        this.add("item." + MODID + ".line_red.description", "Red line squares with distinctive Shanghai characteristics.");

        add(ECNUItems.LINE_YELLOW_ITEM.get(), "Yellow Line Block");
        this.add("item." + MODID + ".line_yellow.description", "Yellow line squares with distinctive Shanghai characteristics.");

        add(ECNUItems.LINE_GREEN_ITEM.get(), "Green Line Block");
        this.add("item." + MODID + ".line_green.description", "Green line squares with distinctive Shanghai characteristics.");

        add(ECNUItems.LINE_PURPLE_ITEM.get(), "Purple Line Block");
        this.add("item." + MODID + ".line_purple.description", "Purple line squares with distinctive Shanghai characteristics.");

        add(ECNUItems.LINE_GOLD_ITEM.get(), "Gold Line Block");
        this.add("item." + MODID + ".line_gold.description", "Gold line squares with distinctive Shanghai characteristics.");

        add(ECNUItems.LINE_ORANGE_ITEM.get(), "Orange Line Block");
        this.add("item." + MODID + ".line_orange.description", "Orange line squares with distinctive Shanghai characteristics.");

        add(ECNUItems.LINE_PINK_ITEM.get(), "Pink Line Block");
        this.add("item." + MODID + ".line_pink.description", "Pink line squares with distinctive Shanghai characteristics.");

        add(ECNUItems.LINE_WHITE_ITEM.get(), "White Line Block");
        this.add("item." + MODID + ".line_white.description", "White line squares with distinctive Shanghai characteristics.");

        add(ECNUItems.LINE_SKY_BLUE_ITEM.get(), "Sky Blue Line Block");
        this.add("item." + MODID + ".line_sky_blue.description", "Sky Blue line squares with distinctive Shanghai characteristics.");

        add(ECNUItems.LINE_LIGHT_BLUE_ITEM.get(), "Light Blue Line Block");
        this.add("item." + MODID + ".line_light_blue.description", "Light Blue line squares with distinctive Shanghai characteristics.");

        add(ECNUItems.LINE_LIGHT_RED_ITEM.get(), "Light Red Line Block");
        this.add("item." + MODID + ".line_light_red.description", "Light Red line squares with distinctive Shanghai characteristics.");

        add(ECNUItems.LINE_LIGHT_PINK_ITEM.get(), "Light Pink Line Block");
        this.add("item." + MODID + ".line_light_pink.description", "Light Pink line squares with distinctive Shanghai characteristics.");

        add(ECNUItems.LINE_LIGHT_ORANGE_ITEM.get(), "Light Orange Line Block");
        this.add("item." + MODID + ".line_light_orange.description", "Light Orange line squares with distinctive Shanghai characteristics.");

        add(ECNUItems.LINE_LIGHT_PURPLE_ITEM.get(), "Light Purple Line Block");
        this.add("item." + MODID + ".line_light_purple.description", "Light Purple line squares with distinctive Shanghai characteristics.");

        add(ECNUItems.LINE_LIGHT_GREEN_ITEM.get(), "Light Green Line Block");
        this.add("item." + MODID + ".line_light_green.description", "Light Green line squares with distinctive Shanghai characteristics.");
        // =================Double Line Block Items =================
        add(ECNUItems.DOUBLE_LINE_BLUE_ITEM.get(), "Blue Double Line Block");
        this.add("item." + MODID + ".double_line_blue.description", "Blue Double Line Block with distinctive Shanghai characteristics.");

        add(ECNUItems.DOUBLE_LINE_RED_ITEM.get(), "Red Double Line Block");
        this.add("item." + MODID + ".double_line_red.description", "Red Double Line Block with distinctive Shanghai characteristics.");

        add(ECNUItems.DOUBLE_LINE_YELLOW_ITEM.get(), "Yellow Double Line Block");
        this.add("item." + MODID + ".double_line_yellow.description", "Yellow Double Line Block with distinctive Shanghai characteristics.");

        add(ECNUItems.DOUBLE_LINE_GREEN_ITEM.get(), "Green Double Line Block");
        this.add("item." + MODID + ".double_line_green.description", "Green Double Line Block with distinctive Shanghai characteristics.");

        add(ECNUItems.DOUBLE_LINE_PURPLE_ITEM.get(), "Purple Double Line Block");
        this.add("item." + MODID + ".double_line_purple.description", "Purple Double Line Block with distinctive Shanghai characteristics.");

        add(ECNUItems.DOUBLE_LINE_GOLD_ITEM.get(), "Gold Double Line Block");
        this.add("item." + MODID + ".double_line_gold.description", "Gold Double Line Block with distinctive Shanghai characteristics.");

        add(ECNUItems.DOUBLE_LINE_ORANGE_ITEM.get(), "Orange Double Line Block");
        this.add("item." + MODID + ".double_line_orange.description", "Orange Double Line Block with distinctive Shanghai characteristics.");

        add(ECNUItems.DOUBLE_LINE_PINK_ITEM.get(), "Pink Double Line Block");
        this.add("item." + MODID + ".double_line_pink.description", "Pink Double Line Block with distinctive Shanghai characteristics.");

        add(ECNUItems.DOUBLE_LINE_WHITE_ITEM.get(), "White Double Line Block");
        this.add("item." + MODID + ".double_line_white.description", "White Double Line Block with distinctive Shanghai characteristics.");

        add(ECNUItems.DOUBLE_LINE_SKY_BLUE_ITEM.get(), "Sky Blue Double Line Block");
        this.add("item." + MODID + ".double_line_sky_blue.description", "Sky Blue Double Line Block with distinctive Shanghai characteristics.");

        add(ECNUItems.DOUBLE_LINE_BLACK_ITEM.get(), "Black Double Line Block");
        this.add("item." + MODID + ".double_line_black.description", "Black Double Line Block with distinctive Shanghai characteristics.");

        add(ECNUItems.DOUBLE_LINE_LIGHT_BLUE_ITEM.get(), "Light Blue Double Line Block");
        this.add("item." + MODID + ".double_line_light_blue.description", "Light Blue Double Line Block with distinctive Shanghai characteristics.");

        add(ECNUItems.DOUBLE_LINE_LIGHT_RED_ITEM.get(), "Light Red Double Line Block");
        this.add("item." + MODID + ".double_line_light_red.description", "Light Red Double Line Block with distinctive Shanghai characteristics.");

        add(ECNUItems.DOUBLE_LINE_LIGHT_PINK_ITEM.get(), "Light Pink Double Line Block");
        this.add("item." + MODID + ".double_line_light_pink.description", "Light Pink Double Line Block with distinctive Shanghai characteristics.");

        add(ECNUItems.DOUBLE_LINE_LIGHT_ORANGE_ITEM.get(), "Light Orange Double Line Block");
        this.add("item." + MODID + ".double_line_light_orange.description", "Light Orange Double Line Block with distinctive Shanghai characteristics.");

        add(ECNUItems.DOUBLE_LINE_LIGHT_PURPLE_ITEM.get(), "Light Purple Double Line Block");
        this.add("item." + MODID + ".double_line_light_purple.description", "Light Purple Double Line Block with distinctive Shanghai characteristics.");

        add(ECNUItems.DOUBLE_LINE_LIGHT_GREEN_ITEM.get(), "Light Green Double Line Block");
        this.add("item." + MODID + ".double_line_light_green.description", "Light Green Double Line Block with distinctive Shanghai characteristics.");

    }
}
