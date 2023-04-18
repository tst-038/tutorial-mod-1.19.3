package net.tst.tutorialmod.world;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import net.tst.tutorialmod.TutorialMod;
import net.tst.tutorialmod.block.ModBlocks;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> RED_MAPLE_KEY = registerKey("red_maple");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {

        register(context, RED_MAPLE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.RED_MAPLE_LOG),
                // int baseHeight, int firstRandomHeight, int secondRandomHeight
                new StraightTrunkPlacer(4, 2, 2),
                BlockStateProvider.of(ModBlocks.RED_MAPLE_LEAVES),
                // radius, offset, height
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 3),
                new TwoLayersFeatureSize(1, 1, 2)
        ).build());

    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(TutorialMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
