package net.tst.tutorialmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.tst.tutorialmod.TutorialMod;
import net.tst.tutorialmod.block.ModBlocks;
import net.tst.tutorialmod.entity.ModEntities;

public class ModItems {
    public static final Item URANIUM_INGOT = registerItem("uranium_ingot",
            new Item(new FabricItemSettings()));
    public static final Item RAW_URANIUM = registerItem("raw_uranium",
            new Item(new FabricItemSettings()));

    public static final Item TIGER_SPAWN_EGG = registerItem("tiger_spawn_egg",
            new SpawnEggItem(ModEntities.TIGER, 0xD57E36, 0x100D00,
                    new FabricItemSettings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(ModItemGroup.URANIUM, URANIUM_INGOT);
        addToItemGroup(ModItemGroup.URANIUM, RAW_URANIUM);
        addToItemGroup(ModItemGroup.URANIUM, TIGER_SPAWN_EGG);
    }

    private static void addToItemGroup(ItemGroup group, Item item){
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID);

        addItemsToItemGroup();
    }
}
