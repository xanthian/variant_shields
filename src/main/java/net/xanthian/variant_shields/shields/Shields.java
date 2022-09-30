package net.xanthian.variant_shields.shields;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.variant_shields.Init;
import net.xanthian.variant_shields.materials.ModShieldMaterial;

public class Shields {

    public static final Item ACACIA_WOOD_SHIELD = registerItem("acacia_wood_shield", new VariantShieldItem(ModShieldMaterial.WOOD));
    public static final Item BIRCH_WOOD_SHIELD = registerItem("birch_wood_shield", new VariantShieldItem(ModShieldMaterial.WOOD));
    public static final Item CRIMSON_WOOD_SHIELD = registerItem("crimson_wood_shield", new VariantShieldItem(ModShieldMaterial.WOOD));
    public static final Item DARK_OAK_WOOD_SHIELD = registerItem("dark_oak_wood_shield", new VariantShieldItem(ModShieldMaterial.WOOD));
    public static final Item JUNGLE_WOOD_SHIELD = registerItem("jungle_wood_shield", new VariantShieldItem(ModShieldMaterial.WOOD));
    public static final Item MANGROVE_WOOD_SHIELD = registerItem("mangrove_wood_shield", new VariantShieldItem(ModShieldMaterial.WOOD));
    public static final Item OAK_WOOD_SHIELD = registerItem("oak_wood_shield", new VariantShieldItem(ModShieldMaterial.WOOD));
    public static final Item SPRUCE_WOOD_SHIELD = registerItem("spruce_wood_shield", new VariantShieldItem(ModShieldMaterial.WOOD));
    public static final Item WARPED_WOOD_SHIELD = registerItem("warped_wood_shield", new VariantShieldItem(ModShieldMaterial.WOOD));

    public static final Item ACACIA_STONE_SHIELD = registerItem("acacia_stone_shield", new VariantShieldItem(ModShieldMaterial.STONE));
    public static final Item BIRCH_STONE_SHIELD = registerItem("birch_stone_shield", new VariantShieldItem(ModShieldMaterial.STONE));
    public static final Item CRIMSON_STONE_SHIELD = registerItem("crimson_stone_shield", new VariantShieldItem(ModShieldMaterial.STONE));
    public static final Item DARK_OAK_STONE_SHIELD = registerItem("dark_oak_stone_shield", new VariantShieldItem(ModShieldMaterial.STONE));
    public static final Item JUNGLE_STONE_SHIELD = registerItem("jungle_stone_shield", new VariantShieldItem(ModShieldMaterial.STONE));
    public static final Item MANGROVE_STONE_SHIELD = registerItem("mangrove_stone_shield", new VariantShieldItem(ModShieldMaterial.STONE));
    public static final Item OAK_STONE_SHIELD = registerItem("oak_stone_shield", new VariantShieldItem(ModShieldMaterial.STONE));
    public static final Item SPRUCE_STONE_SHIELD = registerItem("spruce_stone_shield", new VariantShieldItem(ModShieldMaterial.STONE));
    public static final Item WARPED_STONE_SHIELD = registerItem("warped_stone_shield", new VariantShieldItem(ModShieldMaterial.STONE));

    public static final Item ACACIA_SHIELD = registerItem("acacia_shield", new VariantShieldItem(ModShieldMaterial.IRON));
    public static final Item BIRCH_SHIELD = registerItem("birch_shield", new VariantShieldItem(ModShieldMaterial.IRON));
    public static final Item CRIMSON_SHIELD = registerItem("crimson_shield", new VariantShieldItem(ModShieldMaterial.IRON));
    public static final Item DARK_OAK_SHIELD = registerItem("dark_oak_shield", new VariantShieldItem(ModShieldMaterial.IRON));
    public static final Item JUNGLE_SHIELD = registerItem("jungle_shield", new VariantShieldItem(ModShieldMaterial.IRON));
    public static final Item MANGROVE_SHIELD = registerItem("mangrove_shield", new VariantShieldItem(ModShieldMaterial.IRON));
    public static final Item OAK_SHIELD = registerItem("oak_shield", new VariantShieldItem(ModShieldMaterial.IRON));
    public static final Item SPRUCE_SHIELD = registerItem("spruce_shield", new VariantShieldItem(ModShieldMaterial.IRON));
    public static final Item WARPED_SHIELD = registerItem("warped_shield", new VariantShieldItem(ModShieldMaterial.IRON));

    public static final Item ACACIA_GOLD_SHIELD = registerItem("acacia_gold_shield", new VariantShieldItem(ModShieldMaterial.GOLD));
    public static final Item BIRCH_GOLD_SHIELD = registerItem("birch_gold_shield", new VariantShieldItem(ModShieldMaterial.GOLD));
    public static final Item CRIMSON_GOLD_SHIELD = registerItem("crimson_gold_shield", new VariantShieldItem(ModShieldMaterial.GOLD));
    public static final Item DARK_OAK_GOLD_SHIELD = registerItem("dark_oak_gold_shield", new VariantShieldItem(ModShieldMaterial.GOLD));
    public static final Item JUNGLE_GOLD_SHIELD = registerItem("jungle_gold_shield", new VariantShieldItem(ModShieldMaterial.GOLD));
    public static final Item MANGROVE_GOLD_SHIELD = registerItem("mangrove_gold_shield", new VariantShieldItem(ModShieldMaterial.GOLD));
    public static final Item OAK_GOLD_SHIELD = registerItem("oak_gold_shield", new VariantShieldItem(ModShieldMaterial.GOLD));
    public static final Item SPRUCE_GOLD_SHIELD = registerItem("spruce_gold_shield", new VariantShieldItem(ModShieldMaterial.GOLD));
    public static final Item WARPED_GOLD_SHIELD = registerItem("warped_gold_shield", new VariantShieldItem(ModShieldMaterial.GOLD));

    public static final Item ACACIA_DIAMOND_SHIELD = registerItem("acacia_diamond_shield", new VariantShieldItem(ModShieldMaterial.DIAMOND));
    public static final Item BIRCH_DIAMOND_SHIELD = registerItem("birch_diamond_shield", new VariantShieldItem(ModShieldMaterial.DIAMOND));
    public static final Item CRIMSON_DIAMOND_SHIELD = registerItem("crimson_diamond_shield", new VariantShieldItem(ModShieldMaterial.DIAMOND));
    public static final Item DARK_OAK_DIAMOND_SHIELD = registerItem("dark_oak_diamond_shield", new VariantShieldItem(ModShieldMaterial.DIAMOND));
    public static final Item JUNGLE_DIAMOND_SHIELD = registerItem("jungle_diamond_shield", new VariantShieldItem(ModShieldMaterial.DIAMOND));
    public static final Item MANGROVE_DIAMOND_SHIELD = registerItem("mangrove_diamond_shield", new VariantShieldItem(ModShieldMaterial.DIAMOND));
    public static final Item OAK_DIAMOND_SHIELD = registerItem("oak_diamond_shield", new VariantShieldItem(ModShieldMaterial.DIAMOND));
    public static final Item SPRUCE_DIAMOND_SHIELD = registerItem("spruce_diamond_shield", new VariantShieldItem(ModShieldMaterial.DIAMOND));
    public static final Item WARPED_DIAMOND_SHIELD = registerItem("warped_diamond_shield", new VariantShieldItem(ModShieldMaterial.DIAMOND));

    public static final Item ACACIA_NETHERITE_SHIELD = registerItem("acacia_netherite_shield", new VariantShieldItem(ModShieldMaterial.NETHERITE));
    public static final Item BIRCH_NETHERITE_SHIELD = registerItem("birch_netherite_shield", new VariantShieldItem(ModShieldMaterial.NETHERITE));
    public static final Item CRIMSON_NETHERITE_SHIELD = registerItem("crimson_netherite_shield", new VariantShieldItem(ModShieldMaterial.NETHERITE));
    public static final Item DARK_OAK_NETHERITE_SHIELD = registerItem("dark_oak_netherite_shield", new VariantShieldItem(ModShieldMaterial.NETHERITE));
    public static final Item JUNGLE_NETHERITE_SHIELD = registerItem("jungle_netherite_shield", new VariantShieldItem(ModShieldMaterial.NETHERITE));
    public static final Item MANGROVE_NETHERITE_SHIELD = registerItem("mangrove_netherite_shield", new VariantShieldItem(ModShieldMaterial.NETHERITE));
    public static final Item OAK_NETHERITE_SHIELD = registerItem("oak_netherite_shield", new VariantShieldItem(ModShieldMaterial.NETHERITE));
    public static final Item SPRUCE_NETHERITE_SHIELD = registerItem("spruce_netherite_shield", new VariantShieldItem(ModShieldMaterial.NETHERITE));
    public static final Item WARPED_NETHERITE_SHIELD = registerItem("warped_netherite_shield", new VariantShieldItem(ModShieldMaterial.NETHERITE));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }

    public static void registerShieldItems() {
    }
}
