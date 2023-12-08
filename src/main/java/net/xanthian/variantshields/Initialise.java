package net.xanthian.variantshields;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.text.Text;
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

        ResourceManagerHelper.registerBuiltinResourcePack(new Identifier(MOD_ID, "minecraft"), FabricLoader.getInstance().getModContainer(MOD_ID).orElseThrow(), Text.translatable("variantshields.resourcepacks"), ResourcePackActivationType.ALWAYS_ENABLED);
    }
}