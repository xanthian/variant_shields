package net.xanthian.variant_shields;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.xanthian.variant_shields.shields.Shields;

public class ClientInit implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putItem(Shields.ACACIA_SHIELD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putItem(Shields.BIRCH_SHIELD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putItem(Shields.CRIMSON_SHIELD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putItem(Shields.DARK_OAK_SHIELD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putItem(Shields.JUNGLE_SHIELD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putItem(Shields.MANGROVE_SHIELD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putItem(Shields.OAK_SHIELD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putItem(Shields.SPRUCE_SHIELD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putItem(Shields.WARPED_SHIELD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putItem(Shields.ACACIA_STONE_SHIELD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putItem(Shields.BIRCH_STONE_SHIELD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putItem(Shields.CRIMSON_STONE_SHIELD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putItem(Shields.DARK_OAK_STONE_SHIELD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putItem(Shields.JUNGLE_STONE_SHIELD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putItem(Shields.MANGROVE_STONE_SHIELD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putItem(Shields.OAK_STONE_SHIELD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putItem(Shields.SPRUCE_STONE_SHIELD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putItem(Shields.WARPED_STONE_SHIELD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putItem(Shields.ACACIA_GOLD_SHIELD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putItem(Shields.BIRCH_GOLD_SHIELD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putItem(Shields.CRIMSON_GOLD_SHIELD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putItem(Shields.DARK_OAK_GOLD_SHIELD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putItem(Shields.JUNGLE_GOLD_SHIELD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putItem(Shields.MANGROVE_GOLD_SHIELD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putItem(Shields.OAK_GOLD_SHIELD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putItem(Shields.SPRUCE_GOLD_SHIELD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putItem(Shields.WARPED_GOLD_SHIELD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putItem(Shields.ACACIA_DIAMOND_SHIELD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putItem(Shields.BIRCH_DIAMOND_SHIELD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putItem(Shields.CRIMSON_DIAMOND_SHIELD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putItem(Shields.DARK_OAK_DIAMOND_SHIELD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putItem(Shields.JUNGLE_DIAMOND_SHIELD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putItem(Shields.MANGROVE_DIAMOND_SHIELD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putItem(Shields.OAK_DIAMOND_SHIELD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putItem(Shields.SPRUCE_DIAMOND_SHIELD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putItem(Shields.WARPED_DIAMOND_SHIELD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putItem(Shields.ACACIA_NETHERITE_SHIELD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putItem(Shields.BIRCH_NETHERITE_SHIELD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putItem(Shields.CRIMSON_NETHERITE_SHIELD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putItem(Shields.DARK_OAK_NETHERITE_SHIELD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putItem(Shields.JUNGLE_NETHERITE_SHIELD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putItem(Shields.MANGROVE_NETHERITE_SHIELD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putItem(Shields.OAK_NETHERITE_SHIELD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putItem(Shields.SPRUCE_NETHERITE_SHIELD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putItem(Shields.WARPED_NETHERITE_SHIELD, RenderLayer.getCutout());
    }
}
