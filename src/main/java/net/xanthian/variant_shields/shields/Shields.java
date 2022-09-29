package net.xanthian.variant_shields.shields;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.variant_shields.Init;
import net.xanthian.variant_shields.materials.ModShieldMaterial;

public class Shields {

    public static final Item ACACIA_SHIELD = registerItem("acacia_shield", new VariantShieldItem(1, ModShieldMaterial.ACACIA));
    public static final Item BIRCH_SHIELD = registerItem("birch_shield", new VariantShieldItem(1, ModShieldMaterial.BIRCH));
    public static final Item CRIMSON_SHIELD = registerItem("crimson_shield", new VariantShieldItem(1, ModShieldMaterial.CRIMSON));
    public static final Item DARK_OAK_SHIELD = registerItem("dark_oak_shield", new VariantShieldItem(1, ModShieldMaterial.DARK_OAK));
    public static final Item JUNGLE_SHIELD = registerItem("jungle_shield", new VariantShieldItem(1, ModShieldMaterial.JUNGLE));
    public static final Item MANGROVE_SHIELD = registerItem("mangrove_shield", new VariantShieldItem(1, ModShieldMaterial.MANGROVE));
    public static final Item OAK_SHIELD = registerItem("oak_shield", new VariantShieldItem(1, ModShieldMaterial.OAK));
    public static final Item SPRUCE_SHIELD = registerItem("spruce_shield", new VariantShieldItem(1, ModShieldMaterial.SPRUCE));
    public static final Item WARPED_SHIELD = registerItem("warped_shield", new VariantShieldItem(1, ModShieldMaterial.WARPED));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }

    public static void registerShieldItems() {
    }
}
