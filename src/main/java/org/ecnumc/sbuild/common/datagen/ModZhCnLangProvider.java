package org.ecnumc.sbuild.common.datagen;

import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;
import org.ecnumc.sbuild.ECNUForge;
import org.ecnumc.sbuild.common.registries.ECNUItems;
import static org.ecnumc.sbuild.ECNUForge.MODID;
public class ModZhCnLangProvider extends LanguageProvider {
    public ModZhCnLangProvider(PackOutput output) {
        super(output, ECNUForge.MODID, "zh_cn");
    }
    @Override
    protected void addTranslations() {

        this.add("itemGroup." + MODID, "水杉方块");

        this.add("item." + MODID + ".painting.logo1", "画");
        this.add("item." + MODID + ".painting.logo1.description", "徽章");
        this.add("painting." + MODID + ".logo1.title", "川");
        this.add("painting." + MODID + ".logo1.author", "9090");

        this.add("item." + MODID + ".painting.logo", "画");
        this.add("item." + MODID + ".painting.logo.description", "ECNU 校徽");
        this.add("painting." + MODID + ".logo.title", "ECNU LOGO");
        this.add("painting." + MODID + ".logo.author", "9090");

        this.add("item." + MODID + ".logo1", "LOGO");
        this.add("item." + MODID + ".mod_logo1.description", "LOGO");

        this.add("item." + MODID + ".logo", "ECNU 校徽");
        this.add("item." + MODID + ".mod_logo.description", "ECNU 校徽");
        //Box
        this.add("item." + MODID + ".chest_magic", "盒子");
        this.add("item." + MODID + ".chest_magic.description", "盒子");
        this.add("block." + MODID + ".chest_magic", "盒子");
        this.add("container." + MODID + ".chest_magic", "盒子");

        // ================= Building Block Items =================
        add(ECNUItems.BRICK_YELLOW_ITEM.get(), "黄砖");
        this.add("item." + MODID + ".brick_yellow.description", "极具现代气息的黄砖");

        add(ECNUItems.BRICK_BLACK_ITEM.get(), "黑线砖");
        this.add("item." + MODID + ".brick_black.description", "极具现代气息的黑线砖");

        add(ECNUItems.SQUARE_BLACK_ITEM.get(), "水泥墙");
        this.add("item." + MODID + ".square_black.description", "极具现代气息的水泥墙");


        // ================= Grid Block Items =================
        add(ECNUItems.GRID_BLUE_ITEM.get(), "蓝色网格块");
        this.add("item." + MODID + ".grid_blue.description", "极具上海特色的蓝色网格方块");

        add(ECNUItems.GRID_RED_ITEM.get(), "红色网格块");
        this.add("item." + MODID + ".grid_red.description", "极具上海特色的红色网格方块");

        add(ECNUItems.GRID_YELLOW_ITEM.get(), "黄色网格块");
        this.add("item." + MODID + ".grid_yellow.description", "极具上海特色的黄色网格方块");

        add(ECNUItems.GRID_GREEN_ITEM.get(), "绿色网格块");
        this.add("item." + MODID + ".grid_green.description", "极具上海特色的绿色网格方块");

        add(ECNUItems.GRID_PURPLE_ITEM.get(), "紫色网格块");
        this.add("item." + MODID + ".grid_purple.description", "极具上海特色的紫色网格方块");

        add(ECNUItems.GRID_GOLD_ITEM.get(), "金色网格块");
        this.add("item." + MODID + ".grid_gold.description", "极具上海特色的金色网格方块");

        add(ECNUItems.GRID_ORANGE_ITEM.get(), "橙色网格块");
        this.add("item." + MODID + ".grid_orange.description", "极具上海特色的橙色网格方块");

        add(ECNUItems.GRID_PINK_ITEM.get(), "粉色网格块");
        this.add("item." + MODID + ".grid_pink.description", "极具上海特色的粉色网格方块");

        add(ECNUItems.GRID_WHITE_ITEM.get(), "白色网格块");
        this.add("item." + MODID + ".grid_white.description", "极具上海特色的白色网格方块");

        add(ECNUItems.GRID_SKY_BLUE_ITEM.get(), "天蓝色网格块");
        this.add("item." + MODID + ".grid_sky_blue.description", "极具上海特色的天蓝色网格方块");
        // ================= Double Grid Block Items =================
        add(ECNUItems.DOUBLE_GRID_BLUE_ITEM.get(), "蓝色双网格块");
        this.add("item." + MODID + ".double_grid_blue.description", "极具上海特色的蓝色双网格方块");

        add(ECNUItems.DOUBLE_GRID_RED_ITEM.get(), "红色双网格块");
        this.add("item." + MODID + ".double_grid_red.description", "极具上海特色的红色双网格方块");

        add(ECNUItems.DOUBLE_GRID_YELLOW_ITEM.get(), "黄色双网格块");
        this.add("item." + MODID + ".double_grid_yellow.description", "极具上海特色的黄色双网格方块");

        add(ECNUItems.DOUBLE_GRID_GREEN_ITEM.get(), "绿色双网格块");
        this.add("item." + MODID + ".double_grid_green.description", "极具上海特色的绿色双网格方块");

        add(ECNUItems.DOUBLE_GRID_PURPLE_ITEM.get(), "紫色双网格块");
        this.add("item." + MODID + ".double_grid_purple.description", "极具上海特色的紫色双网格方块");

        add(ECNUItems.DOUBLE_GRID_GOLD_ITEM.get(), "金色双网格块");
        this.add("item." + MODID + ".double_grid_gold.description", "极具上海特色的金色双网格方块");

        add(ECNUItems.DOUBLE_GRID_ORANGE_ITEM.get(), "橙色双网格块");
        this.add("item." + MODID + ".double_grid_orange.description", "极具上海特色的橙色双网格方块");

        add(ECNUItems.DOUBLE_GRID_PINK_ITEM.get(), "粉色双网格块");
        this.add("item." + MODID + ".double_grid_pink.description", "极具上海特色的粉色双网格方块");

        add(ECNUItems.DOUBLE_GRID_WHITE_ITEM.get(), "白色双网格块");
        this.add("item." + MODID + ".double_grid_white.description", "极具上海特色的白色双网格方块");

        add(ECNUItems.DOUBLE_GRID_SKY_BLUE_ITEM.get(), "天蓝色双网格块");
        this.add("item." + MODID + ".double_grid_sky_blue.description", "极具上海特色的天蓝色双网格方块");

        add(ECNUItems.DOUBLE_GRID_BLACK_ITEM.get(), "黑色双网格块");
        this.add("item." + MODID + ".double_grid_black.description", "极具上海特色的黑色双网格方块");

        // ================= Line Block Items =================
        add(ECNUItems.LINE_BLUE_ITEM.get(), "蓝色线块");
        this.add("item." + MODID + ".line_blue.description", "极具上海特色的蓝色线块");

        add(ECNUItems.LINE_RED_ITEM.get(), "红色线块");
        this.add("item." + MODID + ".line_red.description", "极具上海特色的红色线块");

        add(ECNUItems.LINE_YELLOW_ITEM.get(), "黄色线块");
        this.add("item." + MODID + ".line_yellow.description", "极具上海特色的黄色线块");

        add(ECNUItems.LINE_GREEN_ITEM.get(), "绿色线块");
        this.add("item." + MODID + ".line_green.description", "极具上海特色的绿色线块");

        add(ECNUItems.LINE_PURPLE_ITEM.get(), "紫色线块");
        this.add("item." + MODID + ".line_purple.description", "极具上海特色的紫色线块");

        add(ECNUItems.LINE_GOLD_ITEM.get(), "金色线块");
        this.add("item." + MODID + ".line_gold.description", "极具上海特色的金色线块");

        add(ECNUItems.LINE_ORANGE_ITEM.get(), "橙色线块");
        this.add("item." + MODID + ".line_orange.description", "极具上海特色的橙色线块");

        add(ECNUItems.LINE_PINK_ITEM.get(), "粉色线块");
        this.add("item." + MODID + ".line_pink.description", "极具上海特色的粉色线块");

        add(ECNUItems.LINE_WHITE_ITEM.get(), "白色线块");
        this.add("item." + MODID + ".line_white.description", "极具上海特色的白色线块");

        add(ECNUItems.LINE_SKY_BLUE_ITEM.get(), "天蓝色线块");
        this.add("item." + MODID + ".line_sky_blue.description", "极具上海特色的天蓝色线块");

        add(ECNUItems.LINE_LIGHT_BLUE_ITEM.get(), "浅蓝色线块");
        this.add("item." + MODID + ".line_light_blue.description", "极具上海特色的浅蓝色线块");

        add(ECNUItems.LINE_LIGHT_RED_ITEM.get(), "浅红色线块");
        this.add("item." + MODID + ".line_light_red.description", "极具上海特色的浅红色线块");

        add(ECNUItems.LINE_LIGHT_PINK_ITEM.get(), "浅粉色线块");
        this.add("item." + MODID + ".line_light_pink.description", "极具上海特色的浅粉色线块");

        add(ECNUItems.LINE_LIGHT_ORANGE_ITEM.get(), "浅橙色线块");
        this.add("item." + MODID + ".line_light_orange.description", "极具上海特色的浅橙色线块");

        add(ECNUItems.LINE_LIGHT_PURPLE_ITEM.get(), "浅紫色线块");
        this.add("item." + MODID + ".line_light_purple.description", "极具上海特色的浅紫色线块");

        add(ECNUItems.LINE_LIGHT_GREEN_ITEM.get(), "浅绿色线块");
        this.add("item." + MODID + ".line_light_green.description", "极具上海特色的浅绿色线块");

        // =================Double Line Block Items =================
        add(ECNUItems.DOUBLE_LINE_BLUE_ITEM.get(), "蓝色双线块");
        this.add("item." + MODID + ".double_line_blue.description", "极具上海特色的蓝色双线块");

        add(ECNUItems.DOUBLE_LINE_RED_ITEM.get(), "红色双线块");
        this.add("item." + MODID + ".double_line_red.description", "极具上海特色的红色双线块");

        add(ECNUItems.DOUBLE_LINE_YELLOW_ITEM.get(), "黄色双线块");
        this.add("item." + MODID + ".double_line_yellow.description", "极具上海特色的黄色双线块");

        add(ECNUItems.DOUBLE_LINE_GREEN_ITEM.get(), "绿色双线块");
        this.add("item." + MODID + ".double_line_green.description", "极具上海特色的绿色双线块");

        add(ECNUItems.DOUBLE_LINE_PURPLE_ITEM.get(), "紫色双线块");
        this.add("item." + MODID + ".double_line_purple.description", "极具上海特色的紫色双线块");

        add(ECNUItems.DOUBLE_LINE_GOLD_ITEM.get(), "金色双线块");
        this.add("item." + MODID + ".double_line_gold.description", "极具上海特色的金色双线块");

        add(ECNUItems.DOUBLE_LINE_ORANGE_ITEM.get(), "橙色双线块");
        this.add("item." + MODID + ".double_line_orange.description", "极具上海特色的橙色双线块");

        add(ECNUItems.DOUBLE_LINE_PINK_ITEM.get(), "粉色双线块");
        this.add("item." + MODID + ".double_line_pink.description", "极具上海特色的粉色双线块");

        add(ECNUItems.DOUBLE_LINE_WHITE_ITEM.get(), "白色双线块");
        this.add("item." + MODID + ".double_line_white.description", "极具上海特色的白色双线块");

        add(ECNUItems.DOUBLE_LINE_SKY_BLUE_ITEM.get(), "天蓝色双线块");
        this.add("item." + MODID + ".double_line_sky_blue.description", "极具上海特色的天蓝色双线块");

        add(ECNUItems.DOUBLE_LINE_BLACK_ITEM.get(), "黑色双线块");
        this.add("item." + MODID + ".double_line_black.description", "极具上海特色的黑色双线块");

        add(ECNUItems.DOUBLE_LINE_LIGHT_BLUE_ITEM.get(), "浅蓝色双线块");
        this.add("item." + MODID + ".double_line_light_blue.description", "极具上海特色的浅蓝色双线块");

        add(ECNUItems.DOUBLE_LINE_LIGHT_RED_ITEM.get(), "浅红色双线块");
        this.add("item." + MODID + ".double_line_light_red.description", "极具上海特色的浅红色双线块");

        add(ECNUItems.DOUBLE_LINE_LIGHT_PINK_ITEM.get(), "浅粉色双线块");
        this.add("item." + MODID + ".double_line_light_pink.description", "极具上海特色的浅粉色双线块");

        add(ECNUItems.DOUBLE_LINE_LIGHT_ORANGE_ITEM.get(), "浅橙色双线块");
        this.add("item." + MODID + ".double_line_light_orange.description", "极具上海特色的浅橙色双线块");

        add(ECNUItems.DOUBLE_LINE_LIGHT_PURPLE_ITEM.get(), "浅紫色双线块");
        this.add("item." + MODID + ".double_line_light_purple.description", "极具上海特色的浅紫色双线块");

        add(ECNUItems.DOUBLE_LINE_LIGHT_GREEN_ITEM.get(), "浅绿色双线块");
        this.add("item." + MODID + ".double_line_light_green.description", "极具上海特色的浅绿色双线块");

    }
}
