package org.ecnumc.sbuild.common.blockentities;

import net.minecraft.core.BlockPos;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.ContainerHelper;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ChestMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.ChestBlockEntity;
import net.minecraft.world.level.block.entity.RandomizableContainerBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

import static org.ecnumc.sbuild.ECNUForge.MODID;
public class ChestMagicBlockEntity extends RandomizableContainerBlockEntity {
    private NonNullList<ItemStack> items = NonNullList.withSize(36, ItemStack.EMPTY);
    public ChestMagicBlockEntity(BlockPos pos, BlockState state) {
        super(org.ecnumc.sbuild.common.registries.ECNUBlockEntities.CHEST_MAGIC.get(), pos, state);
    }

    @Override
    protected Component getDefaultName() {
        return Component.translatable("container." + MODID + ".chest_magic");
    }

    @Override
    protected NonNullList<ItemStack> getItems() {
        return this.items;
    }

    @Override
    protected void setItems(NonNullList<ItemStack> items) {
        this.items = items;
    }

    // GUI
    @Override
    protected AbstractContainerMenu createMenu(int id, Inventory player) {
        return new ChestMenu(MenuType.GENERIC_9x4, id, player, this, 4);
    }

    // 必须调用父类 load/saveAdditional
    @Override
    public void load(CompoundTag tag) {
        super.load(tag); // 读取 lootTable
        this.items = NonNullList.withSize(this.getContainerSize(), ItemStack.EMPTY);
        if (!this.tryLoadLootTable(tag)) {
            // 只有当 Loot Table 没有时，才加载 Items
            ContainerHelper.loadAllItems(tag, this.items);
        }
    }

    @Override
    protected void saveAdditional(CompoundTag tag) {
        super.saveAdditional(tag); // 保存 lootTable
        if (!this.trySaveLootTable(tag)) {
            // 只有当 Loot Table 没有时，才保存 Items
            ContainerHelper.saveAllItems(tag, this.items);
        }
    }

    @Override
    public int getContainerSize() {
        return 36;
    }
}