package org.ecnumc.sbuild.common.datagen;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.LootTableSubProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.EmptyLootItem;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootTableReference;
import net.minecraft.world.level.storage.loot.entries.TagEntry;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.function.BiConsumer;

import static org.ecnumc.sbuild.ECNUForge.MODID;

public class ModLootTableProvider {

    //total
    public static class ChestLootTableTotal implements LootTableSubProvider {

        @Override
        public void generate(BiConsumer<ResourceLocation, LootTable.Builder> consumer) {

            consumer.accept(new ResourceLocation(MODID, "chests/total"),
                    LootTable.lootTable().withPool(

                            LootPool.lootPool()
                                    .setRolls(ConstantValue.exactly(1))

                                    // ❌ 空箱子
                                    .add(EmptyLootItem.emptyItem().setWeight(6))

                                    // 🟢 Low（低级）
                                    .add(LootTableReference.lootTableReference(
                                            new ResourceLocation(MODID, "chests/low_1")).setWeight(3))
                                    .add(LootTableReference.lootTableReference(
                                            new ResourceLocation(MODID, "chests/low_2")).setWeight(3))
                                    .add(LootTableReference.lootTableReference(
                                            new ResourceLocation(MODID, "chests/low_3")).setWeight(3))
                                    .add(LootTableReference.lootTableReference(
                                            new ResourceLocation(MODID, "chests/low_4")).setWeight(3))
                                    .add(LootTableReference.lootTableReference(
                                            new ResourceLocation(MODID, "chests/low_5")).setWeight(3))
                                    .add(LootTableReference.lootTableReference(
                                            new ResourceLocation(MODID, "chests/low_6")).setWeight(3))
                                    .add(LootTableReference.lootTableReference(
                                            new ResourceLocation(MODID, "chests/low_7")).setWeight(3))
                                    .add(LootTableReference.lootTableReference(
                                            new ResourceLocation(MODID, "chests/low_8")).setWeight(3))
                                    .add(LootTableReference.lootTableReference(
                                            new ResourceLocation(MODID, "chests/low_9")).setWeight(3))

                                    // 🟡 Medium
                                    .add(LootTableReference.lootTableReference(
                                            new ResourceLocation(MODID, "chests/medium_1")).setWeight(2))
                                    .add(LootTableReference.lootTableReference(
                                            new ResourceLocation(MODID, "chests/medium_2")).setWeight(2))

                                    // 🔴 High
                                    .add(LootTableReference.lootTableReference(
                                            new ResourceLocation(MODID, "chests/high_1")).setWeight(2))
                                    .add(LootTableReference.lootTableReference(
                                            new ResourceLocation(MODID, "chests/high_2")).setWeight(2))
                                    .add(LootTableReference.lootTableReference(
                                            new ResourceLocation(MODID, "chests/high_3")).setWeight(2))
                                    .add(LootTableReference.lootTableReference(
                                            new ResourceLocation(MODID, "chests/high_4")).setWeight(2))
                    )
            );
        }
    }
    //Low
    public static class ChestLootTableLow1 implements LootTableSubProvider {

        @Override
        public void generate(BiConsumer<ResourceLocation, LootTable.Builder> consumer) {

            consumer.accept(new ResourceLocation(MODID, "chests/low_1"),
                    LootTable.lootTable()
                            .withPool(
                                    LootPool.lootPool()
                                            .setRolls(ConstantValue.exactly(3))
                                            .add(LootItem.lootTableItem(Items.PAPER).setWeight(2)
                                                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 5))))
                                            .add(LootItem.lootTableItem(Items.SUGAR_CANE).setWeight(2)
                                                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(2, 6))))
                                            .add(TagEntry.expandTag(ItemTags.COMPASSES).setWeight(1)
                                                    .when(LootItemRandomChanceCondition.randomChance(0.2f))
                                                    .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1))))
                                            .add(EmptyLootItem.emptyItem().setWeight(4))
            ));
        }
    }
    public static class ChestLootTableLow2 implements LootTableSubProvider {
        @Override
        public void generate(BiConsumer<ResourceLocation, LootTable.Builder> consumer) {
            consumer.accept(new ResourceLocation(MODID, "chests/low_2"),
                    LootTable.lootTable().withPool(
                            LootPool.lootPool().setRolls(ConstantValue.exactly(4))

                                    .add(LootItem.lootTableItem(Items.BREAD).setWeight(3)
                                            .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 4))))

                                    .add(LootItem.lootTableItem(Items.APPLE).setWeight(3))

                                    .add(LootItem.lootTableItem(Items.COOKED_BEEF).setWeight(2))

                                    .add(EmptyLootItem.emptyItem().setWeight(4))
                    ));
        }
    }
    public static class ChestLootTableLow3 implements LootTableSubProvider {
        @Override
        public void generate(BiConsumer<ResourceLocation, LootTable.Builder> consumer) {
            consumer.accept(new ResourceLocation(MODID, "chests/low_3"),
                    LootTable.lootTable().withPool(
                            LootPool.lootPool()
                                    .setRolls(ConstantValue.exactly(2))

                                    // 🗡️ 武器
                                    .add(LootItem.lootTableItem(Items.WOODEN_SWORD).setWeight(5))
                                    .add(LootItem.lootTableItem(Items.STONE_SWORD).setWeight(3))
                                    .add(LootItem.lootTableItem(Items.WOODEN_AXE).setWeight(4))

                                    // 🛠️ 工具
                                    .add(LootItem.lootTableItem(Items.WOODEN_PICKAXE).setWeight(6))
                                    .add(LootItem.lootTableItem(Items.STONE_PICKAXE).setWeight(5))
                                    .add(LootItem.lootTableItem(Items.IRON_PICKAXE).setWeight(3))
                                    .add(LootItem.lootTableItem(Items.GOLDEN_PICKAXE).setWeight(2))
                                    .add(LootItem.lootTableItem(Items.WOODEN_AXE).setWeight(6))
                                    .add(LootItem.lootTableItem(Items.STONE_AXE).setWeight(5))
                                    .add(LootItem.lootTableItem(Items.IRON_AXE).setWeight(3))
                                    .add(LootItem.lootTableItem(Items.GOLDEN_AXE).setWeight(2))
                                    .add(LootItem.lootTableItem(Items.WOODEN_SHOVEL).setWeight(6))
                                    .add(LootItem.lootTableItem(Items.STONE_SHOVEL).setWeight(5))
                                    .add(LootItem.lootTableItem(Items.IRON_SHOVEL).setWeight(3))
                                    .add(LootItem.lootTableItem(Items.GOLDEN_SHOVEL).setWeight(2))
                                    .add(LootItem.lootTableItem(Items.WOODEN_HOE).setWeight(5))
                                    .add(LootItem.lootTableItem(Items.STONE_HOE).setWeight(4))
                                    .add(LootItem.lootTableItem(Items.IRON_HOE).setWeight(3))
                                    .add(LootItem.lootTableItem(Items.GOLDEN_HOE).setWeight(2))
                                    // 🍖 食物
                                    .add(LootItem.lootTableItem(Items.BREAD).setWeight(5))
                                    .add(LootItem.lootTableItem(Items.APPLE).setWeight(4))
                                    .add(LootItem.lootTableItem(Items.COOKED_BEEF).setWeight(2))
                                    .add(LootItem.lootTableItem(Items.COOKED_PORKCHOP).setWeight(2))

                                    // 🪨 基础资源
                                    .add(LootItem.lootTableItem(Items.COAL).setWeight(6))
                                    .add(LootItem.lootTableItem(Items.IRON_NUGGET).setWeight(5))
                                    .add(LootItem.lootTableItem(Items.FLINT).setWeight(6))
                                    .add(LootItem.lootTableItem(Items.STICK).setWeight(7))

                                    // 🧱 杂物 / 建材
                                    .add(LootItem.lootTableItem(Items.COBBLESTONE).setWeight(6))
                                    .add(LootItem.lootTableItem(Items.OAK_PLANKS).setWeight(5))

                                    // ✨ 稀有小惊喜
                                    .add(LootItem.lootTableItem(Items.LAPIS_LAZULI).setWeight(2))
                                    .add(LootItem.lootTableItem(Items.REDSTONE).setWeight(2))

                                    // ❌ 空奖励（保持低级箱子“穷”感）
                                    .add(EmptyLootItem.emptyItem().setWeight(8))
                    ));
        }
    }
    public static class ChestLootTableLow4 implements LootTableSubProvider {
        @Override
        public void generate(BiConsumer<ResourceLocation, LootTable.Builder> consumer) {
            consumer.accept(new ResourceLocation(MODID, "chests/low_4"),
                    LootTable.lootTable().withPool(
                            LootPool.lootPool().setRolls(ConstantValue.exactly(3))

                                    .add(LootItem.lootTableItem(Items.BOW).setWeight(2))
                                    .add(LootItem.lootTableItem(Items.ARROW).setWeight(4)
                                            .apply(SetItemCountFunction.setCount(UniformGenerator.between(7, 32))))

                                    .add(EmptyLootItem.emptyItem().setWeight(4))
                    ));
        }
    }
    public static class ChestLootTableLow5 implements LootTableSubProvider {
        @Override
        public void generate(BiConsumer<ResourceLocation, LootTable.Builder> consumer) {
            consumer.accept(new ResourceLocation(MODID, "chests/low_5"),
                    LootTable.lootTable().withPool(
                            LootPool.lootPool().setRolls(ConstantValue.exactly(4))

                                    // 🌱 树苗类（自然生态）
                                    .add(TagEntry.expandTag(ItemTags.SAPLINGS).setWeight(3))
                                    .add(LootItem.lootTableItem(Items.BONE_MEAL).setWeight(3))
                                    .add(LootItem.lootTableItem(Items.WHEAT_SEEDS).setWeight(4))
                                    .add(LootItem.lootTableItem(Items.BEETROOT_SEEDS).setWeight(3))
                                    .add(LootItem.lootTableItem(Items.PUMPKIN_SEEDS).setWeight(2))
                                    .add(LootItem.lootTableItem(Items.MELON_SEEDS).setWeight(2))

                                    // 🌿 自然掉落/基础资源
                                    .add(LootItem.lootTableItem(Items.STICK).setWeight(5))
                                    .add(LootItem.lootTableItem(Items.DIRT).setWeight(2))
                                    .add(LootItem.lootTableItem(Items.SAND).setWeight(2))
                                    .add(LootItem.lootTableItem(Items.GRAVEL).setWeight(2))

                                    // 🍎 食物基础资源
                                    .add(LootItem.lootTableItem(Items.APPLE).setWeight(2))
                                    .add(LootItem.lootTableItem(Items.BREAD).setWeight(1))

                                    // 🧵 生存材料
                                    .add(LootItem.lootTableItem(Items.STRING).setWeight(3))
                                    .add(LootItem.lootTableItem(Items.ROTTEN_FLESH).setWeight(2))

                                    .add(EmptyLootItem.emptyItem().setWeight(4))
                    ));
        }
    }
    public static class ChestLootTableLow6 implements LootTableSubProvider {
        @Override
        public void generate(BiConsumer<ResourceLocation, LootTable.Builder> consumer) {
            consumer.accept(new ResourceLocation(MODID, "chests/low_6"),
                    LootTable.lootTable().withPool(
                            LootPool.lootPool().setRolls(ConstantValue.exactly(2))

                                    // 🧪 药水类（核心）
                                    .add(LootItem.lootTableItem(Items.POTION).setWeight(3))
                                    .add(LootItem.lootTableItem(Items.SPLASH_POTION).setWeight(2))
                                    .add(LootItem.lootTableItem(Items.LINGERING_POTION).setWeight(1))

                                    // 🧴 容器残留
                                    .add(LootItem.lootTableItem(Items.GLASS_BOTTLE).setWeight(5))
                                    .add(LootItem.lootTableItem(Items.POTION).setWeight(2))

                                    // ⚗️ 炼金材料
                                    .add(LootItem.lootTableItem(Items.REDSTONE).setWeight(3))
                                    .add(LootItem.lootTableItem(Items.GLOWSTONE_DUST).setWeight(3))
                                    .add(LootItem.lootTableItem(Items.SUGAR).setWeight(3))
                                    .add(LootItem.lootTableItem(Items.FERMENTED_SPIDER_EYE).setWeight(2))

                                    // 🍄 生物/实验残留
                                    .add(LootItem.lootTableItem(Items.SPIDER_EYE).setWeight(3))
                                    .add(LootItem.lootTableItem(Items.ROTTEN_FLESH).setWeight(2))

                                    // ❌ 空奖励（失败实验）
                                    .add(EmptyLootItem.emptyItem().setWeight(5))
                    ));
        }
    }
    public static class ChestLootTableLow7 implements LootTableSubProvider {
        @Override
        public void generate(BiConsumer<ResourceLocation, LootTable.Builder> consumer) {
            consumer.accept(new ResourceLocation(MODID, "chests/low_7"),
                    LootTable.lootTable().withPool(
                            LootPool.lootPool().setRolls(ConstantValue.exactly(3))

                                    // 🪵 木材建筑资源（核心）
                                    .add(TagEntry.expandTag(ItemTags.PLANKS).setWeight(4)
                                            .apply(SetItemCountFunction.setCount(UniformGenerator.between(8, 32))))

                                    .add(LootItem.lootTableItem(Items.OAK_LOG).setWeight(3)
                                            .apply(SetItemCountFunction.setCount(UniformGenerator.between(2, 10))))

                                    .add(LootItem.lootTableItem(Items.STICK).setWeight(4)
                                            .apply(SetItemCountFunction.setCount(UniformGenerator.between(6, 20))))

                                    // 🪨 石质建筑资源
                                    .add(LootItem.lootTableItem(Items.COBBLESTONE).setWeight(4)
                                            .apply(SetItemCountFunction.setCount(UniformGenerator.between(10, 40))))

                                    .add(LootItem.lootTableItem(Items.STONE).setWeight(3)
                                            .apply(SetItemCountFunction.setCount(UniformGenerator.between(6, 20))))

                                    .add(LootItem.lootTableItem(Items.GRAVEL).setWeight(3))
                                    .add(LootItem.lootTableItem(Items.DIRT).setWeight(2))

                                    // 🧱 建筑辅助材料
                                    .add(LootItem.lootTableItem(Items.OAK_FENCE).setWeight(2)
                                            .apply(SetItemCountFunction.setCount(UniformGenerator.between(2, 8))))

                                    .add(LootItem.lootTableItem(Items.TORCH).setWeight(3)
                                            .apply(SetItemCountFunction.setCount(UniformGenerator.between(4, 16))))

                                    .add(LootItem.lootTableItem(Items.GLASS).setWeight(2))

                                    // ❌ 空（废弃/破损箱）
                                    .add(EmptyLootItem.emptyItem().setWeight(3))
                    ));
        }
    }
    public static class ChestLootTableLow8 implements LootTableSubProvider {
        @Override
        public void generate(BiConsumer<ResourceLocation, LootTable.Builder> consumer) {
            consumer.accept(new ResourceLocation(MODID, "chests/low_8"),
                    LootTable.lootTable().withPool(
                            LootPool.lootPool().setRolls(ConstantValue.exactly(4))

                                    .add(LootItem.lootTableItem(Items.WHEAT_SEEDS).setWeight(4))
                                    .add(LootItem.lootTableItem(Items.CARROT).setWeight(3))

                                    .add(EmptyLootItem.emptyItem().setWeight(4))
                    ));
        }
    }
    public static class ChestLootTableLow9 implements LootTableSubProvider {
        @Override
        public void generate(BiConsumer<ResourceLocation, LootTable.Builder> consumer) {
            consumer.accept(new ResourceLocation(MODID, "chests/low_9"),
                    LootTable.lootTable().withPool(
                            LootPool.lootPool().setRolls(ConstantValue.exactly(3))

                                    // ⛏️ 基础燃料与矿物
                                    .add(LootItem.lootTableItem(Items.COAL).setWeight(5))
                                    .add(LootItem.lootTableItem(Items.CHARCOAL).setWeight(3))

                                    // 🪨 铁系资源（核心）
                                    .add(LootItem.lootTableItem(Items.IRON_INGOT).setWeight(3))
                                    .add(LootItem.lootTableItem(Items.RAW_IRON).setWeight(3))

                                    // 🪙 其他基础矿物
                                    .add(LootItem.lootTableItem(Items.COPPER_INGOT).setWeight(3))
                                    .add(LootItem.lootTableItem(Items.RAW_COPPER).setWeight(3))

                                    .add(LootItem.lootTableItem(Items.REDSTONE).setWeight(4))
                                    .add(LootItem.lootTableItem(Items.LAPIS_LAZULI).setWeight(3))
                                    .add(LootItem.lootTableItem(Items.FLINT).setWeight(3))

                                    // 🧪 少量“工业残留”
                                    .add(LootItem.lootTableItem(Items.STRING).setWeight(2))
                                    .add(LootItem.lootTableItem(Items.IRON_NUGGET).setWeight(4))

                                    // ❌ 空（矿井废弃箱）
                                    .add(EmptyLootItem.emptyItem().setWeight(4))
                    ));
        }
    }
    //Medium
    public static class ChestLootTableMedium1 implements LootTableSubProvider {
        @Override
        public void generate(BiConsumer<ResourceLocation, LootTable.Builder> consumer) {
            consumer.accept(new ResourceLocation(MODID, "chests/medium_1"),
                    LootTable.lootTable().withPool(
                            LootPool.lootPool().setRolls(ConstantValue.exactly(3))

                                    // 🍎 稀有恢复类（核心）
                                    .add(LootItem.lootTableItem(Items.GOLDEN_APPLE).setWeight(1))
                                    .add(LootItem.lootTableItem(Items.ENCHANTED_GOLDEN_APPLE).setWeight(1))

                                    // 🍖 食物补给（稳定恢复）
                                    .add(LootItem.lootTableItem(Items.COOKED_PORKCHOP).setWeight(3)
                                            .apply(SetItemCountFunction.setCount(UniformGenerator.between(2, 5))))

                                    .add(LootItem.lootTableItem(Items.BREAD).setWeight(4)
                                            .apply(SetItemCountFunction.setCount(UniformGenerator.between(3, 8))))

                                    .add(LootItem.lootTableItem(Items.COOKED_BEEF).setWeight(3)
                                            .apply(SetItemCountFunction.setCount(UniformGenerator.between(2, 5))))

                                    // 🧃 快速恢复/辅助
                                    .add(LootItem.lootTableItem(Items.HONEY_BOTTLE).setWeight(2))
                                    .add(LootItem.lootTableItem(Items.APPLE).setWeight(3))

                                    // 💊 小型战斗补给
                                    .add(LootItem.lootTableItem(Items.MUSHROOM_STEW).setWeight(2))

                                    // ❌ 空（控制奖励密度）
                                    .add(EmptyLootItem.emptyItem().setWeight(5))
                    ));
        }
    }
    public static class ChestLootTableMedium2 implements LootTableSubProvider {
        @Override
        public void generate(BiConsumer<ResourceLocation, LootTable.Builder> consumer) {
            consumer.accept(new ResourceLocation(MODID, "chests/medium_2"),
                    LootTable.lootTable().withPool(
                            LootPool.lootPool().setRolls(ConstantValue.exactly(2))

                                    // 📚 知识核心
                                    .add(LootItem.lootTableItem(Items.BOOK).setWeight(3))
                                    .add(LootItem.lootTableItem(Items.WRITABLE_BOOK).setWeight(2))
                                    .add(LootItem.lootTableItem(Items.INK_SAC).setWeight(2))

                                    // 📄 制作材料（书系）
                                    .add(LootItem.lootTableItem(Items.PAPER).setWeight(4)
                                            .apply(SetItemCountFunction.setCount(UniformGenerator.between(3, 10))))

                                    .add(LootItem.lootTableItem(Items.FEATHER).setWeight(3))

                                    // 🧪 附魔/魔法前置材料
                                    .add(LootItem.lootTableItem(Items.LAPIS_LAZULI).setWeight(2))
                                    .add(LootItem.lootTableItem(Items.REDSTONE).setWeight(2))

                                    // 📦 实用补充
                                    .add(LootItem.lootTableItem(Items.BOOKSHELF).setWeight(1))

                                    // ❌ 空（废弃书库）
                                    .add(EmptyLootItem.emptyItem().setWeight(4))
                    ));
        }
    }
    //High
    public static class ChestLootTableHigh1 implements LootTableSubProvider {
        @Override
        public void generate(BiConsumer<ResourceLocation, LootTable.Builder> consumer) {
            consumer.accept(new ResourceLocation(MODID, "chests/high_1"),
                    LootTable.lootTable().withPool(
                            LootPool.lootPool().setRolls(ConstantValue.exactly(2))

                                    // 💎 顶级稀有（核心）
                                    .add(LootItem.lootTableItem(Items.ENCHANTED_GOLDEN_APPLE)
                                            .setWeight(1)
                                            .when(LootItemRandomChanceCondition.randomChance(0.08f)))

                                    // 🟡 高级恢复
                                    .add(LootItem.lootTableItem(Items.GOLDEN_APPLE)
                                            .setWeight(2))

                                    .add(LootItem.lootTableItem(Items.GOLDEN_CARROT)
                                            .setWeight(3)
                                            .apply(SetItemCountFunction.setCount(UniformGenerator.between(2, 6))))

                                    // 🍖 高端生存补给
                                    .add(LootItem.lootTableItem(Items.COOKED_BEEF)
                                            .setWeight(3)
                                            .apply(SetItemCountFunction.setCount(UniformGenerator.between(3, 8))))

                                    .add(LootItem.lootTableItem(Items.HONEY_BOTTLE)
                                            .setWeight(2))

                                    // 🧪 稀有功能性物品
                                    .add(LootItem.lootTableItem(Items.ENDER_PEARL)
                                            .setWeight(2))

                                    // ❌ 空（控制稀有度）
                                    .add(EmptyLootItem.emptyItem().setWeight(6))
                    ));
        }
    }
    public static class ChestLootTableHigh2 implements LootTableSubProvider {
        @Override
        public void generate(BiConsumer<ResourceLocation, LootTable.Builder> consumer) {
            consumer.accept(new ResourceLocation(MODID, "chests/high_2"),
                    LootTable.lootTable().withPool(
                            LootPool.lootPool().setRolls(ConstantValue.exactly(1))

                                    // ⚔️ 主武器（核心）
                                    .add(LootItem.lootTableItem(Items.DIAMOND_SWORD)
                                            .setWeight(1))

                                    .add(LootItem.lootTableItem(Items.IRON_SWORD)
                                            .setWeight(3))

                                    // 🏹 远程武器
                                    .add(LootItem.lootTableItem(Items.BOW)
                                            .setWeight(3))

                                    .add(LootItem.lootTableItem(Items.CROSSBOW)
                                            .setWeight(2))

                                    // 🛡️ 防御装备
                                    .add(LootItem.lootTableItem(Items.SHIELD)
                                            .setWeight(2))

                                    // 🧪 战斗辅助
                                    .add(LootItem.lootTableItem(Items.ARROW)
                                            .setWeight(4)
                                            .apply(SetItemCountFunction.setCount(UniformGenerator.between(8, 24))))

                                    // ⚙️ 稀有工具型战斗物
                                    .add(LootItem.lootTableItem(Items.IRON_AXE)
                                            .setWeight(2))

                                    // ❌ 空（控制稀有度）
                                    .add(EmptyLootItem.emptyItem().setWeight(6))
                    ));
        }
    }
    public static class ChestLootTableHigh3 implements LootTableSubProvider {
        @Override
        public void generate(BiConsumer<ResourceLocation, LootTable.Builder> consumer) {
            consumer.accept(new ResourceLocation(MODID, "chests/high_3"),
                    LootTable.lootTable().withPool(
                            LootPool.lootPool().setRolls(ConstantValue.exactly(1))

                                    // 💎 稀有消耗品（高价值）
                                    .add(LootItem.lootTableItem(Items.ENCHANTED_GOLDEN_APPLE)
                                            .setWeight(1))

                                    .add(LootItem.lootTableItem(Items.TOTEM_OF_UNDYING)
                                            .setWeight(1))

                                    // ✨ 稀有材料（探索/进阶合成）
                                    .add(LootItem.lootTableItem(Items.NETHER_STAR)
                                            .setWeight(1))

                                    .add(LootItem.lootTableItem(Items.ENDER_EYE)
                                            .setWeight(2))

                                    .add(LootItem.lootTableItem(Items.DRAGON_BREATH)
                                            .setWeight(2))

                                    // 🧭 探索类物品（结构/定位相关）
                                    .add(LootItem.lootTableItem(Items.MAP)
                                            .setWeight(2))

                                    .add(LootItem.lootTableItem(Items.COMPASS)
                                            .setWeight(2))

                                    // 📦 高价值材料
                                    .add(LootItem.lootTableItem(Items.ANCIENT_DEBRIS)
                                            .setWeight(2))

                                    .add(LootItem.lootTableItem(Items.DIAMOND)
                                            .setWeight(4)
                                            .apply(SetItemCountFunction.setCount(UniformGenerator.between(2, 5))))

                                    // ❌ 很低概率空（增强稀有感）
                                    .add(EmptyLootItem.emptyItem()
                                            .setWeight(6))
                    ));
        }
    }
    public static class ChestLootTableHigh4 implements LootTableSubProvider {
        @Override
        public void generate(BiConsumer<ResourceLocation, LootTable.Builder> consumer) {
            consumer.accept(new ResourceLocation(MODID, "chests/high_4"),
                    LootTable.lootTable().withPool(
                            LootPool.lootPool().setRolls(ConstantValue.exactly(1))

                                    // 💎 稀有矿物（核心价值）
                                    .add(LootItem.lootTableItem(Items.DIAMOND)
                                            .setWeight(5)
                                            .apply(SetItemCountFunction.setCount(UniformGenerator.between(3, 8))))

                                    .add(LootItem.lootTableItem(Items.EMERALD)
                                            .setWeight(4)
                                            .apply(SetItemCountFunction.setCount(UniformGenerator.between(4, 10))))

                                    .add(LootItem.lootTableItem(Items.GOLD_INGOT)
                                            .setWeight(6)
                                            .apply(SetItemCountFunction.setCount(UniformGenerator.between(8, 20))))

                                    .add(LootItem.lootTableItem(Items.IRON_INGOT)
                                            .setWeight(8)
                                            .apply(SetItemCountFunction.setCount(UniformGenerator.between(16, 32))))

                                    // ⛏️ 稀有矿石类
                                    .add(LootItem.lootTableItem(Items.ANCIENT_DEBRIS)
                                            .setWeight(2)
                                            .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 2))))

                                    .add(LootItem.lootTableItem(Items.COAL)
                                            .setWeight(6)
                                            .apply(SetItemCountFunction.setCount(UniformGenerator.between(16, 48))))

                                    // 💰 货币（如果你模组有自定义货币可替换）
                                    .add(LootItem.lootTableItem(Items.RAW_GOLD)
                                            .setWeight(5)
                                            .apply(SetItemCountFunction.setCount(UniformGenerator.between(10, 25))))

                                    .add(LootItem.lootTableItem(Items.RAW_IRON)
                                            .setWeight(6)
                                            .apply(SetItemCountFunction.setCount(UniformGenerator.between(16, 40))))

                                    // ❌ 极低空奖励（保持稀有感）
                                    .add(EmptyLootItem.emptyItem()
                                            .setWeight(3))
                    ));
        }
    }



}
