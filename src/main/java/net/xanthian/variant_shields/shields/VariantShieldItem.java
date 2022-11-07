package net.xanthian.variant_shields.shields;

import com.github.crimsondawn45.fabricshieldlib.lib.object.FabricShieldItem;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.ItemStack;
import net.xanthian.variant_shields.Init;
import net.xanthian.variant_shields.materials.ModShieldTiers;

import java.util.UUID;


public class VariantShieldItem extends FabricShieldItem {
    private final ModShieldTiers tier;

    private static final UUID TOUGH_MODIFIER = UUID.fromString("e75fb7ad-c6fc-4da4-982b-77a6273a389f");
    private static final UUID ARMOR_MODIFIER = UUID.fromString("0b04b918-c112-4803-88cb-2fc9ccbb12cf");
    private static final UUID KNOCKBACK_MODIFIER = UUID.fromString("e7487d71-bfbc-45cf-b2fb-12249a3fd096");


    public VariantShieldItem(ModShieldTiers tier) {
        super(new FabricItemSettings().maxDamage(tier.getItemDurability()).group(Init.VARIANT_SHIELDS), tier.getCooldownTicks(), tier.getEnchantabilty());
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
    public Multimap<EntityAttribute, EntityAttributeModifier> getAttributeModifiers(EquipmentSlot slot) {
        ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();
        Multimap<EntityAttribute, EntityAttributeModifier> modifiers = super.getAttributeModifiers(slot);
        builder.putAll(modifiers);

        if(slot == EquipmentSlot.OFFHAND) {
            if (tier.getArmor() > 0) {
                builder.put(EntityAttributes.GENERIC_ARMOR,
                        new EntityAttributeModifier(ARMOR_MODIFIER, "Armor Increase", tier.getArmor(),
                                EntityAttributeModifier.Operation.ADDITION));
            }
            if (tier.getToughness() > 0) {
                builder.put(EntityAttributes.GENERIC_ARMOR_TOUGHNESS,
                        new EntityAttributeModifier(TOUGH_MODIFIER, "Toughness Increase", tier.getToughness(),
                                EntityAttributeModifier.Operation.ADDITION));
            }
            if(tier.getKnockbackRes() > 0) {
                builder.put(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE,
                        new EntityAttributeModifier(KNOCKBACK_MODIFIER, "Knockback Increase", tier.getKnockbackRes(),
                                EntityAttributeModifier.Operation.ADDITION));
            }
        }
        return builder.build();
    }
}
