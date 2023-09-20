package net.xanthian.variantshields.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.entity.ai.brain.task.RemoveOffHandItemTask;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.xanthian.variantshields.shields.VariantShieldItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(RemoveOffHandItemTask.class)
public class RemoveOffHandItemTaskMixin {

    @WrapOperation(method = "create", at = @At(value = "HEAD", target = "Lnet/minecraft/item/ItemStack;isOf(Lnet/minecraft/item/Item;)Z"))
    static boolean vshields$create(ItemStack itemStack, Item item, Operation<Boolean> original) {
        return original.call(itemStack, item) || itemStack.getItem() instanceof VariantShieldItem;
    }
}