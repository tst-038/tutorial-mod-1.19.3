package net.tst.tutorialmod.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.ModelIds;
import net.tst.tutorialmod.block.ModBlocks;
import net.tst.tutorialmod.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.URANIUM_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.URANIUM_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_URANIUM_ORE);

        blockStateModelGenerator.registerLog(ModBlocks.RED_MAPLE_LOG).log(ModBlocks.RED_MAPLE_LOG)
                .wood(ModBlocks.RED_MAPLE_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_RED_MAPLE_LOG).log(ModBlocks.STRIPPED_RED_MAPLE_LOG)
                .wood(ModBlocks.STRIPPED_RED_MAPLE_WOOD);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RED_MAPLE_PLANKS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RED_MAPLE_LEAVES);

        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.RED_MAPLE_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerParentedItemModel(ModItems.TIGER_SPAWN_EGG, ModelIds.getMinecraftNamespacedItem("template_spawn_egg"));
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.URANIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_URANIUM, Models.GENERATED);
    }
}