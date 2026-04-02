package org.ecnumc.sbuild.common;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import org.ecnumc.sbuild.common.registries.*;


import static org.ecnumc.sbuild.ECNUForge.MODID;

/**
 * Mod Content
 * @author liudongyu
 */
@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class ECNUContent {

	public static void modConstruction(IEventBus modBus) {

		ECNUEntityTypes.init(modBus);
		ECNUBlocks.init(modBus);
		ECNUItems.init(modBus);
		ECNUBlockEntities.init(modBus);
		ECNUCreativeModeTabs.init(modBus);
		ECNUPaintings.init(modBus);
		ECNUProcessorList.init(modBus);
		ECNUStructures.init(modBus);
	}

	private ECNUContent() {
	}

	@SubscribeEvent
	public static void onAttributeCreate(EntityAttributeCreationEvent event) {
	}

}
