package net.xanthian.variantshields.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.ItemCooldownManager;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.xanthian.variantshields.shields.VariantShieldItem;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin extends LivingEntity {

    @Shadow
    @Final
    private PlayerInventory inventory;

    protected PlayerEntityMixin(EntityType<? extends LivingEntity> entityType, World world) {
        super(entityType, world);
    }

    // Causes durability damage when wielding a variant shield

    @WrapOperation(method = "damageShield", at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;isOf(Lnet/minecraft/item/Item;)Z"))
    boolean vshields$damageShield(ItemStack itemStack, Item item, Operation<Boolean> original) {
        return original.call(itemStack, item) || itemStack.getItem() instanceof VariantShieldItem;
    }

    // Disables shield after axe attack

    @Redirect(method = "disableShield", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/player/ItemCooldownManager;set(Lnet/minecraft/item/Item;I)V"))
    public void disableShield(ItemCooldownManager instance, Item item, int duration) {
        Item activeItem = this.activeItemStack.getItem();

        if (activeItem instanceof VariantShieldItem) {
            instance.set(activeItem, ((VariantShieldItem) activeItem).getCooldownTicks());

            for (int i = 0; i < this.inventory.size(); i++) {
                ItemStack stack = this.inventory.getStack(i);
                Item inventoryItem = stack.getItem();

                if (inventoryItem instanceof VariantShieldItem && inventoryItem != activeItem) {
                    instance.set(inventoryItem, ((VariantShieldItem) inventoryItem).getCooldownTicks());
                    instance.set(item, duration);
                }
            }
        } else {
            instance.set(item, duration);
            for (int i = 0; i < this.inventory.size(); i++) {
                ItemStack stack = this.inventory.getStack(i);
                Item inventoryItem = stack.getItem();

                if (inventoryItem instanceof VariantShieldItem && inventoryItem != activeItem) {
                    instance.set(inventoryItem, ((VariantShieldItem) inventoryItem).getCooldownTicks());
                }
            }
        }
    }
}