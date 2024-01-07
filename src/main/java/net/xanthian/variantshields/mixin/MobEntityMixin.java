package net.xanthian.variantshields.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.ItemCooldownManager;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShieldItem;
import net.xanthian.variantshields.shields.VariantShieldItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(MobEntity.class)
public class MobEntityMixin {

    // Disables player shields if hit by an axe

    @WrapOperation(method = "disablePlayerShield", at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;isOf(Lnet/minecraft/item/Item;)Z"))
    boolean vshields$disablePlayerShield(ItemStack itemStack, Item item, Operation<Boolean> original) {
        return original.call(itemStack, item) || itemStack.getItem() instanceof VariantShieldItem;
    }

    // Sets cooldown of shield based on material tier

    @Redirect(method = "disablePlayerShield", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/player/ItemCooldownManager;set(Lnet/minecraft/item/Item;I)V"))
    private void vshields$disablePlayerShield2(ItemCooldownManager itemCooldownManager, Item item, int duration, PlayerEntity player, ItemStack mobStack, ItemStack playerStack) {
        if (playerStack.getItem() instanceof ShieldItem) {
            itemCooldownManager.set(playerStack.getItem(), ((VariantShieldItem) playerStack.getItem()).getCooldownTicks());
        } else {
            itemCooldownManager.set(item, duration);
        }
    }
}