package org.ecnumc.sbuild.common.registries;

import net.minecraft.world.entity.EntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static org.ecnumc.sbuild.ECNUForge.MODID;

public final class ECNUEntityTypes {
	//延迟注册系统
	private static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MODID);



	private ECNUEntityTypes() {
	}

	public static void init(IEventBus modBus) {
		ENTITY_TYPES.register(modBus);
	}
}
