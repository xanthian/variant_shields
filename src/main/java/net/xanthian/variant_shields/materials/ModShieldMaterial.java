package net.xanthian.variant_shields.materials;

import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.tag.ItemTags;

import java.util.function.Supplier;

public enum ModShieldMaterial implements ModShieldTiers {

    //Vanilla
    WOOD(59, 15,100, () -> Ingredient.fromTag(ItemTags.PLANKS)),
    STONE( 131, 5,100, () -> Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS)),
    IRON(250, 14, 90,() -> Ingredient.ofItems(Items.IRON_INGOT)),
    DIAMOND(1561, 10,75, () -> Ingredient.ofItems(Items.DIAMOND)),
    GOLD(32, 22, 110,() -> Ingredient.ofItems(Items.GOLD_INGOT)),
    NETHERITE(2031, 15,50, () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),

    // Mod
    ACACIA(59, 15,100, () -> Ingredient.ofItems(Items.ACACIA_PLANKS)),
    BIRCH(59, 15,100, () -> Ingredient.ofItems(Items.BIRCH_PLANKS)),
    CRIMSON(59, 15,100, () -> Ingredient.ofItems(Items.CRIMSON_PLANKS)),
    DARK_OAK(59, 15,100, () -> Ingredient.ofItems(Items.DARK_OAK_PLANKS)),
    JUNGLE(59, 15,100, () -> Ingredient.ofItems(Items.JUNGLE_PLANKS)),
    MANGROVE(59, 15,100, () -> Ingredient.ofItems(Items.MANGROVE_PLANKS)),
    OAK(59, 15,100, () -> Ingredient.ofItems(Items.OAK_PLANKS)),
    SPRUCE(59, 15,100, () -> Ingredient.ofItems(Items.SPRUCE_PLANKS)),
    WARPED(59, 15,100, () -> Ingredient.ofItems(Items.WARPED_PLANKS));

    private final int itemDurability;
    private final int enchantability;
    private final int cooldownTicks;
    private final Supplier<Ingredient> repairIngredient;

    ModShieldMaterial(int itemDurability, int enchantability,int cooldown, Supplier<Ingredient> repairIngredient) {
        this.itemDurability = itemDurability;
        this.enchantability = enchantability;
        this.cooldownTicks = cooldown;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getItemDurability() {
        return this.itemDurability;
    }

    @Override
    public int getEnchantabilty() {
        return this.enchantability;
    }

    @Override
    public int getCooldownTicks() {
        return this.cooldownTicks;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
