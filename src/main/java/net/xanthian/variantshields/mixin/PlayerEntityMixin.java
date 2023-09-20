package net.xanthian.variantshields.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.ItemCooldownManager;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.xanthian.variantshields.shields.VariantShieldItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin extends LivingEntity {
    protected PlayerEntityMixin(EntityType<? extends LivingEntity> entityType, World world) {
        super(entityType, world);
    }

    // Causes durability damage when wielding a variant shield

    @WrapOperation(method = "damageShield", at = @At(value = "INVOKE",target = "Lnet/minecraft/item/ItemStack;isOf(Lnet/minecraft/item/Item;)Z"))
    boolean vshields$damageShield(ItemStack itemStack, Item item, Operation<Boolean> original) {
        return original.call(itemStack, item) || itemStack.getItem() instanceof VariantShieldItem;
    }

    @Redirect(method = "disableShield", at = @At(value = "INVOKE",target = "Lnet/minecraft/entity/player/ItemCooldownManager;set(Lnet/minecraft/item/Item;I)V"))
    public void disableShield(ItemCooldownManager itemCooldownManager, Item item, int duration) {
        Item activeItem = this.activeItemStack.getItem();
        if (activeItem instanceof VariantShieldItem) {
            itemCooldownManager.set(activeItem, ((VariantShieldItem) activeItem).getCooldownTicks() );
        } else {
            itemCooldownManager.set(item, duration);
        }
    }

}