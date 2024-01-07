package net.xanthian.variantshields.shields;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShieldItem;
import net.minecraft.text.Text;
import net.xanthian.variantshields.materials.ModShieldTiers;
import net.xanthian.variantshields.util.ModEntityAttributes;

import java.util.UUID;

public class VariantShieldItem extends ShieldItem {
    private static final UUID TOUGH_MODIFIER = UUID.fromString("e75fb7ad-c6fc-4da4-982b-77a6273a389f");
    private static final UUID ARMOR_MODIFIER = UUID.fromString("0b04b918-c112-4803-88cb-2fc9ccbb12cf");
    private static final UUID KNOCKBACK_MODIFIER = UUID.fromString("e7487d71-bfbc-45cf-b2fb-12249a3fd096");
    private static final UUID SHIELD_COOLDOWN_MODIFIER = UUID.fromString("862fa992-57e9-11ee-8c99-0242ac120002");
    private final ModShieldTiers tier;

    public VariantShieldItem(ModShieldTiers tier) {
        super(new FabricItemSettings().maxDamage(tier.getItemDurability()));
        this.tier = tier;
    }

    @Override
    public Multimap<EntityAttribute, EntityAttributeModifier> getAttributeModifiers(EquipmentSlot slot) {
        ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();
        Multimap<EntityAttribute, EntityAttributeModifier> modifiers = super.getAttributeModifiers(slot);
        builder.putAll(modifiers);

        if (slot == EquipmentSlot.OFFHAND) {
            if (tier.getArmor() > 0) {
                builder.put(EntityAttributes.GENERIC_ARMOR,
                        new EntityAttributeModifier(ARMOR_MODIFIER, "Armor", tier.getArmor(),
                                EntityAttributeModifier.Operation.ADDITION));
            }
            if (tier.getToughness() > 0) {
                builder.put(EntityAttributes.GENERIC_ARMOR_TOUGHNESS,
                        new EntityAttributeModifier(TOUGH_MODIFIER, "Toughness", tier.getToughness(),
                                EntityAttributeModifier.Operation.ADDITION));
            }
            if (tier.getKnockbackRes() > 0) {
                builder.put(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE,
                        new EntityAttributeModifier(KNOCKBACK_MODIFIER, "Knockback", tier.getKnockbackRes(),
                                EntityAttributeModifier.Operation.ADDITION));
            }
            if (tier.getCooldownTicks() > 1) {
                builder.put(ModEntityAttributes.SHIELD_COOLDOWN,
                        new EntityAttributeModifier(SHIELD_COOLDOWN_MODIFIER, Text.translatable("variantshields.cooldown").getString(), tier.getCooldownTicks(),
                                EntityAttributeModifier.Operation.ADDITION));
            }
            return builder.build();
        }
        return super.getAttributeModifiers(slot);
    }

    @Override
    public int getEnchantability() {
        return tier.getEnchantabilty();
    }

    @Override
    public boolean canRepair(ItemStack stack, ItemStack ingredient) {
        return tier.getRepairIngredient().test(ingredient);
    }

    public int getCooldownTicks() {
        return tier.getCooldownTicks();
    }
}
