package net.xanthian.variantshields.renderer;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class VariantShieldsRenderer {

    public static void registerShieldPredicates(Item shield) {
        ModelPredicateProviderRegistry.register(shield, new Identifier ("blocking"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem()
                        && entity.getActiveItem() == stack
                        ? 1.0f : 0.0f);
    }
}
