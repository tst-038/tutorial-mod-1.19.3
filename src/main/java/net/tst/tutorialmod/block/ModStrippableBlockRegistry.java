package net.tst.tutorialmod.block;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class ModStrippableBlockRegistry {
    public static void registerStrippableBlocks() {
        StrippableBlockRegistry.register(ModBlocks.RED_MAPLE_LOG, ModBlocks.STRIPPED_RED_MAPLE_LOG);
        StrippableBlockRegistry.register(ModBlocks.RED_MAPLE_WOOD, ModBlocks.STRIPPED_RED_MAPLE_WOOD);
    }
}
