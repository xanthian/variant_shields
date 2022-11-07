package net.xanthian.variant_shields.materials;

import net.minecraft.recipe.Ingredient;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.function.Supplier;

public enum ModShieldMaterial implements ModShieldTiers {

    // dura based on tool material figures e.g. base iron tool is 250, base shield is 336 = base * 1.34, all values are *1.34 for fair spread
    // DURABILITY > ENCHANTABILITY > COOLDOWN > TOUGHNESS > ARMOR > KNOCKBACK RES > REPAIR MATERIAL >
    WOOD(79, 16,120,0,0,0, () ->
            Ingredient.fromTag(TagKey.of(Registry.ITEM_KEY, new Identifier("variant_shields", "wood_shields")))),

    STONE( 175, 6,120,0,0,0, () ->
            Ingredient.fromTag(TagKey.of(Registry.ITEM_KEY, new Identifier("variant_shields", "stone_shields")))),

    IRON(336, 15, 100,0,0,0,() ->
            Ingredient.fromTag(TagKey.of(Registry.ITEM_KEY, new Identifier("variant_shields", "iron_shields")))),

    DIAMOND(2091, 11,70,1,2,0, () ->
            Ingredient.fromTag(TagKey.of(Registry.ITEM_KEY, new Identifier("variant_shields", "diamond_shields")))),

    GOLD(42, 23, 80,0,0,0, () ->
            Ingredient.fromTag(TagKey.of(Registry.ITEM_KEY, new Identifier("variant_shields", "gold_shields")))),

    NETHERITE(2721, 16,60,2,2,0.05F, () ->
            Ingredient.fromTag(TagKey.of(Registry.ITEM_KEY, new Identifier("variant_shields", "netherite_shields"))));

    private final int itemDurability;
    private final int enchantability;
    private final int cooldownTicks;
    private final float toughness;
    private final int armor;
    private final float knockbackres;
    private final Supplier<Ingredient> repairIngredient;

    ModShieldMaterial(int itemDurability, int enchantability,int cooldown, float toughness, int armor, float knockbackres, Supplier<Ingredient> repairIngredient) {
        this.itemDurability = itemDurability;
        this.enchantability = enchantability;
        this.cooldownTicks = cooldown;
        this.toughness = toughness;
        this.armor = armor;
        this.knockbackres = knockbackres;
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
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public int getArmor() {
        return this.armor;
    }

    @Override
    public float getKnockbackRes() {
        return this.knockbackres;
    }


    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
