package net.xanthian.variantshields;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.xanthian.variantshields.shields.Shields;
import net.xanthian.variantshields.util.ModCreativeTab;
import net.xanthian.variantshields.util.ModEntityAttributes;

public class Initialise implements ModInitializer {

    public static final String MOD_ID = "variantshields";

    public static Identifier id(String key) {
        return new Identifier(MOD_ID, key);
    }

    @Override
    public void onInitialize() {

        Shields.registerShieldItems();
        ModCreativeTab.registerItemGroup();
        ModEntityAttributes.registerAttributes();
    }
}