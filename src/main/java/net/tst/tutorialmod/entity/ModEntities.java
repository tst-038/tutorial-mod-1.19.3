package net.tst.tutorialmod.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.fabric.impl.object.builder.FabricEntityType;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.tst.tutorialmod.TutorialMod;
import net.tst.tutorialmod.entity.custom.TigerEntity;

public class ModEntities {
    public static final EntityType<TigerEntity> TIGER = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(TutorialMod.MOD_ID, "tiger"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, TigerEntity::new)
                    // Dimensions of hitbox
                    .dimensions(EntityDimensions.fixed(1.5f, 1.75f)).build());
}
