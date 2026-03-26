package org.ecnumc.sbuild.common.registries;

import net.minecraft.core.registries.Registries;
import net.minecraft.nbt.CompoundTag;

import net.minecraft.world.level.levelgen.structure.StructureType;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePieceSerializationContext;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePieceType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import org.ecnumc.sbuild.common.structures.bridge1.Bridge1Pieces;
import org.ecnumc.sbuild.common.structures.bridge2.Bridge2Pieces;
import org.ecnumc.sbuild.common.structures.bridge1.Bridge1Structure;
import org.ecnumc.sbuild.common.structures.bridge2.Bridge2Structure;

import static org.ecnumc.sbuild.ECNUForge.MODID;

public class ECNUStructures {

    public static final DeferredRegister<StructureType<?>> STRUCTURE_TYPES_REGISTER =
            DeferredRegister.create(Registries.STRUCTURE_TYPE, MODID);

    public static final DeferredRegister<StructurePieceType> STRUTURE_PIECE_TYPE_REGISTER =
            DeferredRegister.create(Registries.STRUCTURE_PIECE, MODID);

    public static final RegistryObject<StructurePieceType> BRIDGE1_PIECE =
            STRUTURE_PIECE_TYPE_REGISTER.register("bridge1_piece",
                    () -> (StructurePieceSerializationContext context, CompoundTag tag) ->
                            new Bridge1Pieces.Bridge1Piece(context.structureTemplateManager(), tag)
            );

    public static final RegistryObject<StructureType<Bridge1Structure>> BRIDGE1_TYPE =
            STRUCTURE_TYPES_REGISTER.register("bridge1",
                    () -> () -> Bridge1Structure.CODEC);

    public static final RegistryObject<StructurePieceType> BRIDGE2_PIECE =
            STRUTURE_PIECE_TYPE_REGISTER.register("bridge2_piece",
                    () -> (StructurePieceSerializationContext context, CompoundTag tag) ->
                            new Bridge2Pieces.Bridge2Piece(context.structureTemplateManager(), tag)
            );

    public static final RegistryObject<StructureType<Bridge2Structure>> BRIDGE2_TYPE =
            STRUCTURE_TYPES_REGISTER.register("bridge2",
                    () -> () -> Bridge2Structure.CODEC);

    public static void init(IEventBus bus) {
        STRUCTURE_TYPES_REGISTER.register(bus);
        STRUTURE_PIECE_TYPE_REGISTER.register(bus);
    }
}