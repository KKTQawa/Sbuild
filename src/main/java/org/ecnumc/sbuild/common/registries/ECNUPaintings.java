package org.ecnumc.sbuild.common.registries;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static org.ecnumc.sbuild.ECNUForge.MODID;
public class ECNUPaintings {
    public static final DeferredRegister<PaintingVariant> ECNU_PAINTINGS =
            DeferredRegister.create(Registries.PAINTING_VARIANT, MODID);

    public static final RegistryObject<PaintingVariant> LOGO1 =
            ECNU_PAINTINGS.register("logo1",
                    () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> LOGO =
            ECNU_PAINTINGS.register("logo",
                    () -> new PaintingVariant(16, 16));
    public static void init(IEventBus modBus) {
        ECNU_PAINTINGS.register(modBus);
    }
}
