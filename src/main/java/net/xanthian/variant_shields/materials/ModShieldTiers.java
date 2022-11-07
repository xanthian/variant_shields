package net.xanthian.variant_shields.materials;

import net.minecraft.recipe.Ingredient;

public interface ModShieldTiers {

        int getItemDurability();
        int getEnchantabilty();
        int getCooldownTicks();
        float getToughness();
        int getArmor();
        float getKnockbackRes();
        Ingredient getRepairIngredient();
}