package net.tst.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.tst.tutorialmod.block.ModBlocks;
import net.tst.tutorialmod.block.ModFlammableBlockRegistry;
import net.tst.tutorialmod.block.ModStrippableBlockRegistry;
import net.tst.tutorialmod.entity.ModEntities;
import net.tst.tutorialmod.entity.custom.TigerEntity;
import net.tst.tutorialmod.item.ModItemGroup;
import net.tst.tutorialmod.item.ModItems;
import net.tst.tutorialmod.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "tutorial-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger("tutorial-mod");

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroup();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModWorldGeneration.generateModWorldGen();

		ModFlammableBlockRegistry.registerFlammableBlocks();
		ModStrippableBlockRegistry.registerStrippableBlocks();

		FabricDefaultAttributeRegistry.register(ModEntities.TIGER, TigerEntity.setAttributes());
	}
}