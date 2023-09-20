package net.xanthian.variantshields.util;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import static net.xanthian.variantshields.Initialise.MOD_ID;

public class ModItemTags {

    public static final TagKey<Item> SHIELDS = register("shields");
    public static final TagKey<Item> WOODEN_SHIELDS = register("wooden_shields");
    public static final TagKey<Item> STONE_SHIELDS = register("stone_shields");
    public static final TagKey<Item> GOLDEN_SHIELDS = register("golden_shields");
    public static final TagKey<Item> IRON_SHIELDS = register("iron_shields");
    public static final TagKey<Item> DIAMOND_SHIELDS = register("diamond_shields");
    public static final TagKey<Item> NETHERITE_SHIELDS = register("netherite_shields");

    private static TagKey<Item> register(String name) {
        return TagKey.of(RegistryKeys.ITEM, new Identifier(MOD_ID, name));
    }
}
