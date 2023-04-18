package net.tst.tutorialmod.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.tst.tutorialmod.block.ModBlocks;
import net.tst.tutorialmod.item.ModItems;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        // Smelting & Blasting
        offerSmelting(exporter, List.of(ModItems.RAW_URANIUM, ModBlocks.URANIUM_ORE, ModBlocks.DEEPSLATE_URANIUM_ORE), RecipeCategory.MISC, ModItems.URANIUM_INGOT,
                0.7f, 200, "uranium");

        offerBlasting(exporter, List.of(ModItems.RAW_URANIUM, ModBlocks.URANIUM_ORE, ModBlocks.DEEPSLATE_URANIUM_ORE), RecipeCategory.MISC, ModItems.URANIUM_INGOT,
                0.7f, 100, "uranium");

        // Block to Uranium & Uranium to Block recipe
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.URANIUM_INGOT, RecipeCategory.DECORATIONS,
                ModBlocks.URANIUM_BLOCK);
    }
}