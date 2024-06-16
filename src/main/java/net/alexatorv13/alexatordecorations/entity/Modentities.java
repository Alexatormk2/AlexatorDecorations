package net.alexatorv13.alexatordecorations.entity;

import net.alexatorv13.alexatordecorations.AlexatorDecorations;
import net.alexatorv13.alexatordecorations.entity.custom.ChairEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Modentities {
    public static final EntityType<ChairEntity> CHAIR_ENTITY = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(AlexatorDecorations.MOD_ID, "chair_entity"),
            FabricEntityTypeBuilder.create(SpawnGroup.MISC, ChairEntity::new).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).build());


    public static void registerModEntities() {

        AlexatorDecorations.LOGGER.info("Registering Mod blocks for" + AlexatorDecorations.MOD_ID);
    }

}
