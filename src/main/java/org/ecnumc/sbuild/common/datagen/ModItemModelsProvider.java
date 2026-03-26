package org.ecnumc.sbuild.common.datagen;

import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.ecnumc.sbuild.ECNUForge;
import org.ecnumc.sbuild.common.registries.ECNUItems;

public class ModItemModelsProvider extends ItemModelProvider {
    public ModItemModelsProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ECNUForge.MODID, existingFileHelper);
    }

    //物品拿在手里的样子
    @Override
    protected void registerModels() {

        basicItem(ECNUItems.ECNUCUSTARDBUN.get());

        //logo
        basicItem(ECNUItems.LOGO1.get());
        basicItem(ECNUItems.LOGO.get());
//        withExistingParent("logo", mcLoc("item/generated"))
//                .texture("layer0", modLoc("logo"));
//
//        withExistingParent("logo1", mcLoc("item/generated"))
//                .texture("layer0", modLoc("logo1"));
    }
}
