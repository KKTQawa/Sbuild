package org.ecnumc.sbuild.common.registries;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import org.ecnumc.sbuild.common.entities.NullsetEntity;

import static org.ecnumc.sbuild.ECNUForge.MODID;

public final class ECNUEntityTypes {
	//延迟注册系统
	private static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MODID);

	public static final RegistryObject<EntityType<NullsetEntity>> NULLSET = ENTITY_TYPES.register(
			"nullset", () -> EntityType.Builder.<NullsetEntity>of(NullsetEntity::new, MobCategory.MISC)
					.sized(0.6F, 1.8F)
					.clientTrackingRange(10)
					.build(new ResourceLocation(MODID, "nullset").toString())
	);

	private ECNUEntityTypes() {
	}

	public static void init(IEventBus modBus) {
		ENTITY_TYPES.register(modBus);
	}
}
