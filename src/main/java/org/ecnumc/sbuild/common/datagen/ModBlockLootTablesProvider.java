package org.ecnumc.sbuild.common.datagen;


import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraftforge.registries.RegistryObject;
import org.ecnumc.sbuild.common.registries.ECNUBlocks;
import javax.annotation.Nonnull;
import java.util.Set;
import net.minecraft.world.level.storage.loot.entries.DynamicLoot;
public class ModBlockLootTablesProvider extends BlockLootSubProvider {
    public ModBlockLootTablesProvider() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        //Box
        this.dropSelf(ECNUBlocks.CHEST_MAGIC.get());
        // ================= Grid Blocks =================
        this.dropSelf(ECNUBlocks.GRID_BLUE.get());
        this.dropSelf(ECNUBlocks.GRID_RED.get());
        this.dropSelf(ECNUBlocks.GRID_YELLOW.get());
        this.dropSelf(ECNUBlocks.GRID_GREEN.get());
        this.dropSelf(ECNUBlocks.GRID_PURPLE.get());
        this.dropSelf(ECNUBlocks.GRID_GOLD.get());
        this.dropSelf(ECNUBlocks.GRID_ORANGE.get());
        this.dropSelf(ECNUBlocks.GRID_PINK.get());
        this.dropSelf(ECNUBlocks.GRID_WHITE.get());
        this.dropSelf(ECNUBlocks.GRID_SKY_BLUE.get());

        this.dropSelf(ECNUBlocks.DOUBLE_GRID_BLUE.get());
        this.dropSelf(ECNUBlocks.DOUBLE_GRID_RED.get());
        this.dropSelf(ECNUBlocks.DOUBLE_GRID_YELLOW.get());
        this.dropSelf(ECNUBlocks.DOUBLE_GRID_GREEN.get());
        this.dropSelf(ECNUBlocks.DOUBLE_GRID_PURPLE.get());
        this.dropSelf(ECNUBlocks.DOUBLE_GRID_GOLD.get());
        this.dropSelf(ECNUBlocks.DOUBLE_GRID_ORANGE.get());
        this.dropSelf(ECNUBlocks.DOUBLE_GRID_PINK.get());
        this.dropSelf(ECNUBlocks.DOUBLE_GRID_WHITE.get());
        this.dropSelf(ECNUBlocks.DOUBLE_GRID_SKY_BLUE.get());
        this.dropSelf(ECNUBlocks.DOUBLE_GRID_BLACK.get());
        // ================= Line Blocks =================
        this.dropSelf(ECNUBlocks.LINE_BLUE.get());
        this.dropSelf(ECNUBlocks.LINE_RED.get());
        this.dropSelf(ECNUBlocks.LINE_YELLOW.get());
        this.dropSelf(ECNUBlocks.LINE_GREEN.get());
        this.dropSelf(ECNUBlocks.LINE_PURPLE.get());
        this.dropSelf(ECNUBlocks.LINE_GOLD.get());
        this.dropSelf(ECNUBlocks.LINE_ORANGE.get());
        this.dropSelf(ECNUBlocks.LINE_PINK.get());
        this.dropSelf(ECNUBlocks.LINE_WHITE.get());
        this.dropSelf(ECNUBlocks.LINE_SKY_BLUE.get());
        this.dropSelf(ECNUBlocks.LINE_LIGHT_BLUE.get());
        this.dropSelf(ECNUBlocks.LINE_LIGHT_RED.get());
        this.dropSelf(ECNUBlocks.LINE_LIGHT_GREEN.get());
        this.dropSelf(ECNUBlocks.LINE_LIGHT_PINK.get());
        this.dropSelf(ECNUBlocks.LINE_LIGHT_PURPLE.get());
        this.dropSelf(ECNUBlocks.LINE_LIGHT_ORANGE.get());

        this.dropSelf(ECNUBlocks.DOUBLE_LINE_BLUE.get());
        this.dropSelf(ECNUBlocks.DOUBLE_LINE_RED.get());
        this.dropSelf(ECNUBlocks.DOUBLE_LINE_YELLOW.get());
        this.dropSelf(ECNUBlocks.DOUBLE_LINE_GREEN.get());
        this.dropSelf(ECNUBlocks.DOUBLE_LINE_PURPLE.get());
        this.dropSelf(ECNUBlocks.DOUBLE_LINE_GOLD.get());
        this.dropSelf(ECNUBlocks.DOUBLE_LINE_ORANGE.get());
        this.dropSelf(ECNUBlocks.DOUBLE_LINE_PINK.get());
        this.dropSelf(ECNUBlocks.DOUBLE_LINE_WHITE.get());
        this.dropSelf(ECNUBlocks.DOUBLE_LINE_SKY_BLUE.get());
        this.dropSelf(ECNUBlocks.DOUBLE_LINE_LIGHT_BLUE.get());
        this.dropSelf(ECNUBlocks.DOUBLE_LINE_LIGHT_RED.get());
        this.dropSelf(ECNUBlocks.DOUBLE_LINE_LIGHT_GREEN.get());
        this.dropSelf(ECNUBlocks.DOUBLE_LINE_LIGHT_PINK.get());
        this.dropSelf(ECNUBlocks.DOUBLE_LINE_LIGHT_PURPLE.get());
        this.dropSelf(ECNUBlocks.DOUBLE_LINE_LIGHT_ORANGE.get());
        this.dropSelf(ECNUBlocks.DOUBLE_LINE_BLACK.get());
        //Building Blocks
        this.dropSelf(ECNUBlocks.BRICK_BLACK.get());
        this.dropSelf(ECNUBlocks.BRICK_YELLOW.get());
        this.dropSelf(ECNUBlocks.SQUARE_BLACK.get());
    }

        @Override
        protected @Nonnull Iterable<Block> getKnownBlocks() {
            return ECNUBlocks.REGISTER.getEntries().stream().map(RegistryObject::get).toList();
        }
}
