package org.ecnumc.sbuild.common.registries;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.ProcessorLists;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureProcessorType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static org.ecnumc.sbuild.ECNUForge.MODID;

import org.ecnumc.sbuild.common.processorlist.BridgeHandleBrickWall;
import org.ecnumc.sbuild.common.processorlist.BridgeHandleFench;
import org.ecnumc.sbuild.common.processorlist.PostStation1HandleChest;

public class ECNUProcessorList {

    // 创建 DeferredRegister
    public static final DeferredRegister<StructureProcessorType<?>> PROCESSOR_TYPES =
            DeferredRegister.create(Registries.STRUCTURE_PROCESSOR, MODID);

//    public static final RegistryObject<StructureProcessorType<PostStation1HandleChest>> POST_STATION1_HANDLE_CHEST =
//            PROCESSOR_TYPES.register("post_station1_handle_chest",
//                    () -> StructureProcessorType.register("post_station1_handle_chest", PostStation1HandleChest.CODEC)
//            );

    public static final RegistryObject<StructureProcessorType<BridgeHandleFench>> POST_STATION1_HANDLE_CHEST =
            PROCESSOR_TYPES.register("post_station1_handle_chest",
                    () -> () -> BridgeHandleFench.CODEC);

    public static final RegistryObject<StructureProcessorType<BridgeHandleFench>> BRIDGE_HANDLE_FENCH =
            PROCESSOR_TYPES.register("bridge_handle_fench",
                    () -> () -> BridgeHandleFench.CODEC);

    public static final RegistryObject<StructureProcessorType<BridgeHandleFench>> BRIDGE_HANDLE_BRICK_WALL=
            PROCESSOR_TYPES.register("bridge_handle_brick_wall",
                    () -> () -> BridgeHandleBrickWall.CODEC);

    public static final RegistryObject<StructureProcessorType<BridgeHandleFench>> BRIDGE_HANDLE_FROGLIGHT=
            PROCESSOR_TYPES.register("bridge_handle_froglight",
                    () -> () -> BridgeHandleBrickWall.CODEC);

    public static final RegistryObject<StructureProcessorType<BridgeHandleFench>> BRIDGE_HANDLE_GRID=
            PROCESSOR_TYPES.register("bridge_handle_grid",
                    () -> () -> BridgeHandleBrickWall.CODEC);

    public static void init(IEventBus modBus) {
        PROCESSOR_TYPES.register(modBus);
    }

}