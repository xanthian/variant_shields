package net.xanthian.variantshields.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryWrapper;
import net.xanthian.variantshields.shields.Shields;
import net.xanthian.variantshields.util.ModItemTags;

import java.util.concurrent.CompletableFuture;


public class ModItemTagGenerator  extends FabricTagProvider.ItemTagProvider {
    public ModItemTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        for(Item shields : Shields.MOD_SHIELDS_ALL.values()) {
            getOrCreateTagBuilder(ModItemTags.SHIELDS)
                    .add(shields);
        }

        for(Item shields : Shields.MOD_WOODEN_SHIELDS.values()) {
            getOrCreateTagBuilder(ModItemTags.WOODEN_SHIELDS)
                    .add(shields);
        }

        for(Item shields : Shields.MOD_STONE_SHIELDS.values()) {
            getOrCreateTagBuilder(ModItemTags.STONE_SHIELDS)
                    .add(shields);
        }

        for(Item shields : Shields.MOD_GOLDEN_SHIELDS.values()) {
            getOrCreateTagBuilder(ModItemTags.GOLDEN_SHIELDS)
                    .add(shields);
        }

        for(Item shields : Shields.MOD_IRON_SHIELDS.values()) {
            getOrCreateTagBuilder(ModItemTags.IRON_SHIELDS)
                    .add(shields);
        }
        for(Item shields : Shields.MOD_DIAMOND_SHIELDS.values()) {
            getOrCreateTagBuilder(ModItemTags.DIAMOND_SHIELDS)
                    .add(shields);
        }

        for(Item shields : Shields.MOD_NETHERITE_SHIELDS.values()) {
            getOrCreateTagBuilder(ModItemTags.NETHERITE_SHIELDS)
                    .add(shields);
        }
    }
}