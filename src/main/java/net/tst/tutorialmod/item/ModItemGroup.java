package net.tst.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.tst.tutorialmod.TutorialMod;

public class ModItemGroup {
    public static ItemGroup URANIUM;

    public static void registerItemGroup() {
        URANIUM = FabricItemGroup.builder(new Identifier(TutorialMod.MOD_ID, "uranium"))
                .displayName(Text.translatable("itemgroup.uranium"))
                .icon(() -> new ItemStack(ModItems.RAW_URANIUM)).build();
    }
}
