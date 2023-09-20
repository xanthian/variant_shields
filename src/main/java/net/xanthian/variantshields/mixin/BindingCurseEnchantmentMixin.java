package net.xanthian.variantshields.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.enchantment.BindingCurseEnchantment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.xanthian.variantshields.shields.VariantShieldItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(BindingCurseEnchantment.class)
public class BindingCurseEnchantmentMixin {

    // Removes ability to receive curse of binding on variant shields

    @WrapOperation(method = "isAcceptableItem", at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;isOf(Lnet/minecraft/item/Item;)Z"))
    boolean vsas$customShield(ItemStack itemStack, Item item, Operation<Boolean> original) {
        return original.call(itemStack, item) || (itemStack.getItem() instanceof VariantShieldItem);
    }
}