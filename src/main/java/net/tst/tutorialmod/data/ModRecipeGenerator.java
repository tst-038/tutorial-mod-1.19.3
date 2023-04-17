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
        offerSmelting(exporter, List.of(ModItems.RAW_CITRINE, ModBlocks.CITRINE_ORE, ModBlocks.DEEPSLATE_CITRINE_ORE), RecipeCategory.MISC, ModItems.CITRINE,
                0.7f, 200, "citrine");

        offerBlasting(exporter, List.of(ModItems.RAW_CITRINE, ModBlocks.CITRINE_ORE, ModBlocks.DEEPSLATE_CITRINE_ORE), RecipeCategory.MISC, ModItems.CITRINE,
                0.7f, 100, "citrine");

        // Block to Citrine & Citrine to Block recipe
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.CITRINE, RecipeCategory.DECORATIONS,
                ModBlocks.CITRINE_BLOCK);
    }
}