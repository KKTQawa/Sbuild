package org.ecnumc.sbuild.common.registries;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.ecnumc.sbuild.common.blockentities.ChestMagicBlockEntity;
import org.ecnumc.sbuild.common.registries.ECNUBlocks;

import static org.ecnumc.sbuild.ECNUForge.MODID;

public class ECNUBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> REGISTER =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, MODID);

    public static final RegistryObject<BlockEntityType<ChestMagicBlockEntity>> CHEST_MAGIC =
            REGISTER.register("chest_magic",
                    () -> BlockEntityType.Builder.of(
                            ChestMagicBlockEntity::new,
                            ECNUBlocks.CHEST_MAGIC.get() // 绑定方块
                    ).build(null)
            );

    public static void init(IEventBus modBus) {
        REGISTER.register(modBus);
    }
}