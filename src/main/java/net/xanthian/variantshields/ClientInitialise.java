package net.xanthian.variantshields;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.item.Item;
import net.xanthian.variantshields.shields.Shields;

import static net.xanthian.variantshields.renderer.VariantShieldsRenderer.registerShieldPredicates;

public class ClientInitialise implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        for (Item shields : Shields.MOD_SHIELDS_ALL.values()) {
            registerShieldPredicates(shields);
        }
    }
}