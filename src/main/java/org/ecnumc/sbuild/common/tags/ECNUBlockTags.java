package org.ecnumc.sbuild.common.tags;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

import static org.ecnumc.sbuild.ECNUForge.MODID;

public class ECNUBlockTags {
    public static final TagKey<Block> ECNUGRID_TAG=bind(MODID + "_grid");
    public static final TagKey<Block> ECNULINE_TAG=bind(MODID + "_line");
    public static final TagKey<Block> ECNUDOUBLEGRID_TAG=bind(MODID + "_double_grid");
    public static final TagKey<Block> ECNUDOUBLELINE_TAG=bind(MODID + "_double_line");
    public static final TagKey<Block> ECNUBUILDING_TAG=bind(MODID + "_building_block");


    private static TagKey<Block>bind(String pName) {
        return TagKey.create(Registries.BLOCK, new ResourceLocation(MODID, pName));
    }
}
