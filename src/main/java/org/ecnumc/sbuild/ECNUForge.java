package org.ecnumc.sbuild;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.ecnumc.sbuild.common.ECNUContent;

/**
 * Mod Main Class
 * @author liudongyu
 */
@SuppressWarnings("java:S1118")//忽略警告：类是final的，没有子类
@Mod(ECNUForge.MODID)//注册Mod
public class ECNUForge {
	public static final String MODID = "sbuild";

	public ECNUForge() {
		IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
		ECNUContent.modConstruction(modBus);
	}
}
