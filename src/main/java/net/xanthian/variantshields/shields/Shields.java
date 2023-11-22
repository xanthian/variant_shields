package net.xanthian.variantshields.shields;

import com.google.common.collect.Maps;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.xanthian.variantshields.Initialise;
import net.xanthian.variantshields.materials.ModShieldMaterial;
import java.util.Map;

public class Shields {

    public static Map<Identifier, Item> MOD_SHIELDS_ALL = Maps.newHashMap();
    public static Map<Identifier, Item> MOD_WOODEN_SHIELDS = Maps.newHashMap();
    public static Map<Identifier, Item> MOD_STONE_SHIELDS = Maps.newHashMap();
    public static Map<Identifier, Item> MOD_IRON_SHIELDS = Maps.newHashMap();
    public static Map<Identifier, Item> MOD_GOLDEN_SHIELDS = Maps.newHashMap();
    public static Map<Identifier, Item> MOD_DIAMOND_SHIELDS = Maps.newHashMap();
    public static Map<Identifier, Item> MOD_NETHERITE_SHIELDS = Maps.newHashMap();

    public static final Item ACACIA_WOOD_SHIELD = registerWoodenShield("acacia_wood_shield", new VariantShieldItem(ModShieldMaterial.WOOD));
    public static final Item BAMBOO_WOOD_SHIELD = registerWoodenShield("bamboo_wood_shield", new VariantShieldItem(ModShieldMaterial.WOOD));
    public static final Item BIRCH_WOOD_SHIELD = registerWoodenShield("birch_wood_shield", new VariantShieldItem(ModShieldMaterial.WOOD));
    public static final Item CHERRY_WOOD_SHIELD = registerWoodenShield("cherry_wood_shield", new VariantShieldItem(ModShieldMaterial.WOOD));
    public static final Item CRIMSON_WOOD_SHIELD = registerWoodenShield("crimson_wood_shield", new VariantShieldItem(ModShieldMaterial.WOOD));
    public static final Item DARK_OAK_WOOD_SHIELD = registerWoodenShield("dark_oak_wood_shield", new VariantShieldItem(ModShieldMaterial.WOOD));
    public static final Item JUNGLE_WOOD_SHIELD = registerWoodenShield("jungle_wood_shield", new VariantShieldItem(ModShieldMaterial.WOOD));
    public static final Item MANGROVE_WOOD_SHIELD = registerWoodenShield("mangrove_wood_shield", new VariantShieldItem(ModShieldMaterial.WOOD));
    public static final Item OAK_WOOD_SHIELD = registerWoodenShield("oak_wood_shield", new VariantShieldItem(ModShieldMaterial.WOOD));
    public static final Item SPRUCE_WOOD_SHIELD = registerWoodenShield("spruce_wood_shield", new VariantShieldItem(ModShieldMaterial.WOOD));
    public static final Item WARPED_WOOD_SHIELD = registerWoodenShield("warped_wood_shield", new VariantShieldItem(ModShieldMaterial.WOOD));

    public static final Item ACACIA_STONE_SHIELD = registerStoneShield("acacia_stone_shield", new VariantShieldItem(ModShieldMaterial.STONE));
    public static final Item BAMBOO_STONE_SHIELD = registerStoneShield("bamboo_stone_shield", new VariantShieldItem(ModShieldMaterial.STONE));
    public static final Item BIRCH_STONE_SHIELD = registerStoneShield("birch_stone_shield", new VariantShieldItem(ModShieldMaterial.STONE));
    public static final Item CHERRY_STONE_SHIELD = registerStoneShield("cherry_stone_shield", new VariantShieldItem(ModShieldMaterial.STONE));
    public static final Item CRIMSON_STONE_SHIELD = registerStoneShield("crimson_stone_shield", new VariantShieldItem(ModShieldMaterial.STONE));
    public static final Item DARK_OAK_STONE_SHIELD = registerStoneShield("dark_oak_stone_shield", new VariantShieldItem(ModShieldMaterial.STONE));
    public static final Item JUNGLE_STONE_SHIELD = registerStoneShield("jungle_stone_shield", new VariantShieldItem(ModShieldMaterial.STONE));
    public static final Item MANGROVE_STONE_SHIELD = registerStoneShield("mangrove_stone_shield", new VariantShieldItem(ModShieldMaterial.STONE));
    public static final Item OAK_STONE_SHIELD = registerStoneShield("oak_stone_shield", new VariantShieldItem(ModShieldMaterial.STONE));
    public static final Item SPRUCE_STONE_SHIELD = registerStoneShield("spruce_stone_shield", new VariantShieldItem(ModShieldMaterial.STONE));
    public static final Item WARPED_STONE_SHIELD = registerStoneShield("warped_stone_shield", new VariantShieldItem(ModShieldMaterial.STONE));

    public static final Item ACACIA_IRON_SHIELD = registerIronShield("acacia_iron_shield", new VariantShieldItem(ModShieldMaterial.IRON));
    public static final Item BAMBOO_IRON_SHIELD = registerIronShield("bamboo_iron_shield", new VariantShieldItem(ModShieldMaterial.IRON));
    public static final Item BIRCH_IRON_SHIELD = registerIronShield("birch_iron_shield", new VariantShieldItem(ModShieldMaterial.IRON));
    public static final Item CHERRY_IRON_SHIELD = registerIronShield("cherry_iron_shield", new VariantShieldItem(ModShieldMaterial.IRON));
    public static final Item CRIMSON_IRON_SHIELD = registerIronShield("crimson_iron_shield", new VariantShieldItem(ModShieldMaterial.IRON));
    public static final Item DARK_OAK_IRON_SHIELD = registerIronShield("dark_oak_iron_shield", new VariantShieldItem(ModShieldMaterial.IRON));
    public static final Item JUNGLE_IRON_SHIELD = registerIronShield("jungle_iron_shield", new VariantShieldItem(ModShieldMaterial.IRON));
    public static final Item MANGROVE_IRON_SHIELD = registerIronShield("mangrove_iron_shield", new VariantShieldItem(ModShieldMaterial.IRON));
    public static final Item SPRUCE_IRON_SHIELD = registerIronShield("spruce_iron_shield", new VariantShieldItem(ModShieldMaterial.IRON));
    public static final Item WARPED_IRON_SHIELD = registerIronShield("warped_iron_shield", new VariantShieldItem(ModShieldMaterial.IRON));

    public static final Item ACACIA_GOLDEN_SHIELD = registerGoldenShield("acacia_golden_shield", new VariantShieldItem(ModShieldMaterial.GOLD));
    public static final Item BAMBOO_GOLDEN_SHIELD = registerGoldenShield("bamboo_golden_shield", new VariantShieldItem(ModShieldMaterial.GOLD));
    public static final Item BIRCH_GOLDEN_SHIELD = registerGoldenShield("birch_golden_shield", new VariantShieldItem(ModShieldMaterial.GOLD));
    public static final Item CHERRY_GOLDEN_SHIELD = registerGoldenShield("cherry_golden_shield", new VariantShieldItem(ModShieldMaterial.GOLD));
    public static final Item CRIMSON_GOLDEN_SHIELD = registerGoldenShield("crimson_golden_shield", new VariantShieldItem(ModShieldMaterial.GOLD));
    public static final Item DARK_OAK_GOLDEN_SHIELD = registerGoldenShield("dark_oak_golden_shield", new VariantShieldItem(ModShieldMaterial.GOLD));
    public static final Item JUNGLE_GOLDEN_SHIELD = registerGoldenShield("jungle_golden_shield", new VariantShieldItem(ModShieldMaterial.GOLD));
    public static final Item MANGROVE_GOLDEN_SHIELD = registerGoldenShield("mangrove_golden_shield", new VariantShieldItem(ModShieldMaterial.GOLD));
    public static final Item OAK_GOLDEN_SHIELD = registerGoldenShield("oak_golden_shield", new VariantShieldItem(ModShieldMaterial.GOLD));
    public static final Item SPRUCE_GOLDEN_SHIELD = registerGoldenShield("spruce_golden_shield", new VariantShieldItem(ModShieldMaterial.GOLD));
    public static final Item WARPED_GOLDEN_SHIELD = registerGoldenShield("warped_golden_shield", new VariantShieldItem(ModShieldMaterial.GOLD));

    public static final Item ACACIA_DIAMOND_SHIELD = registerDiamondShield("acacia_diamond_shield", new VariantShieldItem(ModShieldMaterial.DIAMOND));
    public static final Item BAMBOO_DIAMOND_SHIELD = registerDiamondShield("bamboo_diamond_shield", new VariantShieldItem(ModShieldMaterial.DIAMOND));
    public static final Item BIRCH_DIAMOND_SHIELD = registerDiamondShield("birch_diamond_shield", new VariantShieldItem(ModShieldMaterial.DIAMOND));
    public static final Item CHERRY_DIAMOND_SHIELD = registerDiamondShield("cherry_diamond_shield", new VariantShieldItem(ModShieldMaterial.DIAMOND));
    public static final Item CRIMSON_DIAMOND_SHIELD = registerDiamondShield("crimson_diamond_shield", new VariantShieldItem(ModShieldMaterial.DIAMOND));
    public static final Item DARK_OAK_DIAMOND_SHIELD = registerDiamondShield("dark_oak_diamond_shield", new VariantShieldItem(ModShieldMaterial.DIAMOND));
    public static final Item JUNGLE_DIAMOND_SHIELD = registerDiamondShield("jungle_diamond_shield", new VariantShieldItem(ModShieldMaterial.DIAMOND));
    public static final Item MANGROVE_DIAMOND_SHIELD = registerDiamondShield("mangrove_diamond_shield", new VariantShieldItem(ModShieldMaterial.DIAMOND));
    public static final Item OAK_DIAMOND_SHIELD = registerDiamondShield("oak_diamond_shield", new VariantShieldItem(ModShieldMaterial.DIAMOND));
    public static final Item SPRUCE_DIAMOND_SHIELD = registerDiamondShield("spruce_diamond_shield", new VariantShieldItem(ModShieldMaterial.DIAMOND));
    public static final Item WARPED_DIAMOND_SHIELD = registerDiamondShield("warped_diamond_shield", new VariantShieldItem(ModShieldMaterial.DIAMOND));

    public static final Item ACACIA_NETHERITE_SHIELD = registerNetheriteShield("acacia_netherite_shield", new VariantShieldItem(ModShieldMaterial.NETHERITE));
    public static final Item BAMBOO_NETHERITE_SHIELD = registerNetheriteShield("bamboo_netherite_shield", new VariantShieldItem(ModShieldMaterial.NETHERITE));
    public static final Item BIRCH_NETHERITE_SHIELD = registerNetheriteShield("birch_netherite_shield", new VariantShieldItem(ModShieldMaterial.NETHERITE));
    public static final Item CHERRY_NETHERITE_SHIELD = registerNetheriteShield("cherry_netherite_shield", new VariantShieldItem(ModShieldMaterial.NETHERITE));
    public static final Item CRIMSON_NETHERITE_SHIELD = registerNetheriteShield("crimson_netherite_shield", new VariantShieldItem(ModShieldMaterial.NETHERITE));
    public static final Item DARK_OAK_NETHERITE_SHIELD = registerNetheriteShield("dark_oak_netherite_shield", new VariantShieldItem(ModShieldMaterial.NETHERITE));
    public static final Item JUNGLE_NETHERITE_SHIELD = registerNetheriteShield("jungle_netherite_shield", new VariantShieldItem(ModShieldMaterial.NETHERITE));
    public static final Item MANGROVE_NETHERITE_SHIELD = registerNetheriteShield("mangrove_netherite_shield", new VariantShieldItem(ModShieldMaterial.NETHERITE));
    public static final Item OAK_NETHERITE_SHIELD = registerNetheriteShield("oak_netherite_shield", new VariantShieldItem(ModShieldMaterial.NETHERITE));
    public static final Item SPRUCE_NETHERITE_SHIELD = registerNetheriteShield("spruce_netherite_shield", new VariantShieldItem(ModShieldMaterial.NETHERITE));
    public static final Item WARPED_NETHERITE_SHIELD = registerNetheriteShield("warped_netherite_shield", new VariantShieldItem(ModShieldMaterial.NETHERITE));

    private static Item registerWoodenShield(String name, Item item) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name.toLowerCase());
        MOD_SHIELDS_ALL.put(identifier, item);
        MOD_WOODEN_SHIELDS.put(identifier, item);
        return Registry.register(Registries.ITEM, new Identifier(Initialise.MOD_ID, name), item);
    }
    private static Item registerStoneShield(String name, Item item) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name.toLowerCase());
        MOD_SHIELDS_ALL.put(identifier, item);
        MOD_STONE_SHIELDS.put(identifier, item);
        return Registry.register(Registries.ITEM, new Identifier(Initialise.MOD_ID, name), item);
    }
    private static Item registerIronShield(String name, Item item) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name.toLowerCase());
        MOD_SHIELDS_ALL.put(identifier, item);
        MOD_IRON_SHIELDS.put(identifier, item);
        return Registry.register(Registries.ITEM, new Identifier(Initialise.MOD_ID, name), item);
    }
    private static Item registerGoldenShield(String name, Item item) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name.toLowerCase());
        MOD_SHIELDS_ALL.put(identifier, item);
        MOD_GOLDEN_SHIELDS.put(identifier, item);
        return Registry.register(Registries.ITEM, new Identifier(Initialise.MOD_ID, name), item);
    }
    private static Item registerDiamondShield(String name, Item item) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name.toLowerCase());
        MOD_SHIELDS_ALL.put(identifier, item);
        MOD_DIAMOND_SHIELDS.put(identifier, item);
        return Registry.register(Registries.ITEM, new Identifier(Initialise.MOD_ID, name), item);
    }
    private static Item registerNetheriteShield(String name, Item item) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name.toLowerCase());
        MOD_SHIELDS_ALL.put(identifier, item);
        MOD_NETHERITE_SHIELDS.put(identifier, item);
        return Registry.register(Registries.ITEM, new Identifier(Initialise.MOD_ID, name), item);
    }

    public static void registerShieldItems() {
    }
}