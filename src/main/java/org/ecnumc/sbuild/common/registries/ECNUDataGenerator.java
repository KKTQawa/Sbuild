package org.ecnumc.sbuild.common.registries;


import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.ecnumc.sbuild.ECNUForge;
import org.ecnumc.sbuild.common.datagen.*;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
@Mod.EventBusSubscriber(modid = ECNUForge.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ECNUDataGenerator {
    @SubscribeEvent
    public static void getAllProvider(GatherDataEvent event) {
        DataGenerator gen = event.getGenerator();
        PackOutput output=gen.getPackOutput();
        ExistingFileHelper existingFileHelper=event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider>lookupProvider=event.getLookupProvider();
        //服务端
        gen.addProvider(event.includeServer(),new ModRecipesProvider(output));
        gen.addProvider(event.includeServer(),
                new LootTableProvider(output, Set.of(), List.of(
                        // 方块掉落
                        new LootTableProvider.SubProviderEntry(ModBlockLootTablesProvider::new, LootContextParamSets.BLOCK),

                        // 独立箱子战利品（你要的）
                        new LootTableProvider.SubProviderEntry(
                                ModLootTableProvider.ChestLootTableLow1::new,
                                LootContextParamSets.CHEST
                        ),
                        new LootTableProvider.SubProviderEntry(
                                ModLootTableProvider.ChestLootTableLow2::new,
                                LootContextParamSets.CHEST
                        ),
                        new LootTableProvider.SubProviderEntry(
                                ModLootTableProvider.ChestLootTableLow3::new,
                                LootContextParamSets.CHEST
                        ),
                        new LootTableProvider.SubProviderEntry(
                                ModLootTableProvider.ChestLootTableLow4::new,
                                LootContextParamSets.CHEST
                        ),
                        new LootTableProvider.SubProviderEntry(
                                ModLootTableProvider.ChestLootTableLow5::new,
                                LootContextParamSets.CHEST
                        ),
                        new LootTableProvider.SubProviderEntry(
                                ModLootTableProvider.ChestLootTableLow6::new,
                                LootContextParamSets.CHEST
                        ),
                        new LootTableProvider.SubProviderEntry(
                                ModLootTableProvider.ChestLootTableLow7::new,
                                LootContextParamSets.CHEST
                        ),
                        new LootTableProvider.SubProviderEntry(
                                ModLootTableProvider.ChestLootTableLow8::new,
                                LootContextParamSets.CHEST
                        ),
                        new LootTableProvider.SubProviderEntry(
                                ModLootTableProvider.ChestLootTableLow9::new,
                                LootContextParamSets.CHEST
                        ),


                        new LootTableProvider.SubProviderEntry(
                                ModLootTableProvider.ChestLootTableMedium1::new,
                                LootContextParamSets.CHEST
                        ),
                        new LootTableProvider.SubProviderEntry(
                                ModLootTableProvider.ChestLootTableMedium2::new,
                                LootContextParamSets.CHEST
                        ),


                        new LootTableProvider.SubProviderEntry(
                                ModLootTableProvider.ChestLootTableHigh1::new,
                                LootContextParamSets.CHEST
                        ),
                        new LootTableProvider.SubProviderEntry(
                                ModLootTableProvider.ChestLootTableHigh2::new,
                                LootContextParamSets.CHEST
                        ),
                        new LootTableProvider.SubProviderEntry(
                                ModLootTableProvider.ChestLootTableHigh3::new,
                                LootContextParamSets.CHEST
                        ),
                        new LootTableProvider.SubProviderEntry(
                                ModLootTableProvider.ChestLootTableHigh4::new,
                                LootContextParamSets.CHEST
                        ),

                        new LootTableProvider.SubProviderEntry(
                                ModLootTableProvider.ChestLootTableTotal::new,
                                LootContextParamSets.CHEST
                        )
                ))
        );

        BlockTagsProvider blockTagsProvider = gen.addProvider(event.includeServer(),
                new ModBlockTagsProvider(output, lookupProvider, existingFileHelper));
        gen.addProvider(event.includeServer(), new ModItemTagsProvider(output, lookupProvider,blockTagsProvider.contentsGetter(), existingFileHelper));
        //客户端
        gen.addProvider(event.includeClient(),new ModBlockStateProvider(output,existingFileHelper));
        gen.addProvider(event.includeClient(),new ModItemModelsProvider(output,existingFileHelper));
        gen.addProvider(event.includeClient(),new ModEnUsLangProvider(output));
        gen.addProvider(event.includeClient(),new ModZhCnLangProvider(output));

    }
}
