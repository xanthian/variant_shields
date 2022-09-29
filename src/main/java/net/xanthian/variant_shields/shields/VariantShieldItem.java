package net.xanthian.variant_shields.shields;

import com.github.crimsondawn45.fabricshieldlib.lib.object.FabricShieldItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemStack;
import net.xanthian.variant_shields.Init;
import net.xanthian.variant_shields.materials.ModShieldTiers;


public class VariantShieldItem extends FabricShieldItem {
    private final ModShieldTiers tier;

    public VariantShieldItem(int cooldownTicks, ModShieldTiers tier) {
        super(new FabricItemSettings().maxDamage(tier.getItemDurability()).group(Init.VARIANT_SHIELDS), cooldownTicks, tier.getEnchantabilty());
        this.tier = tier;
    }
    @Override
    public boolean canRepair(ItemStack item, ItemStack repairItem) {
        return this.tier.getRepairIngredient().test(repairItem);
    }
    @Override
    public int getCooldownTicks() {
        return this.tier.getCooldownTicks();
    }

    @Override
    public boolean displayTooltip() {
        return false;
    }
}
