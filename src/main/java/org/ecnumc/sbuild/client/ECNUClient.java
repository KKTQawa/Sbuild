package org.ecnumc.sbuild.client;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.ecnumc.sbuild.common.registries.ECNUEntityTypes;

import static org.ecnumc.sbuild.ECNUForge.MODID;

/**
 * Mod Client
 * @author liudongyu
 */
@Mod.EventBusSubscriber(modid = MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class ECNUClient {
	/**
	 * Register layer definitions for mod entities.
	 * @param event	register layer definitions event
	 */
	@SubscribeEvent
	public static void onRegisterLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {

	}

	/**
	 * Register renderers for mod entities.
	 * @param event	register renderers event
	 */
	@SubscribeEvent
	public static void onRegisterRenderer(EntityRenderersEvent.RegisterRenderers event) {

	}

	private ECNUClient() {
	}
}
