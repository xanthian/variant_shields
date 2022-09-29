package net.xanthian.variant_shields;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.xanthian.variant_shields.shields.Shields;

public class ClientInit implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putItem(Shields.ACACIA_SHIELD, RenderLayer.getCutout());
    }
}
