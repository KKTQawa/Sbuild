package org.ecnumc.sbuild.common.tags;


import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

import static org.ecnumc.sbuild.ECNUForge.MODID;

public class ECNUItemTags {
    public static final TagKey<Item>ECNUCUSTARDBUN_TAG=bind(MODID + "_custardbun");

    public static final TagKey<Item> ECNUGRID_TAG=bind(MODID + "_grid");
    public static final TagKey<Item> ECNULINE_TAG=bind(MODID + "_line");
    public static final TagKey<Item> ECNUDOUBLELINE_TAG=bind(MODID + "_double_line");
    public static final TagKey<Item> ECNUDOUBLEGRID_TAG=bind(MODID + "_double_grid");
    public static final TagKey<Item> ECNUBUILDING_TAG=bind(MODID + "_building_block");

    private static TagKey<Item>bind(String pName) {
        return TagKey.create(Registries.ITEM, new ResourceLocation(MODID, pName));
    }
}
