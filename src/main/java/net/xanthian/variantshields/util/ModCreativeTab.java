package net.xanthian.variantshields.util;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.xanthian.variantshields.shields.Shields;

import static net.xanthian.variantshields.Initialise.MOD_ID;

public class ModCreativeTab {

    public static final ItemGroup ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MOD_ID, "variantshields"),

            FabricItemGroup.builder()
                    .displayName(Text.translatable("variantshields.item_group"))
                    .icon(() -> new ItemStack(Shields.MANGROVE_DIAMOND_SHIELD))
                    .entries((context, entries) -> {
                        entries.add(Shields.ACACIA_WOOD_SHIELD);
                        entries.add(Shields.BAMBOO_WOOD_SHIELD);
                        entries.add(Shields.BIRCH_WOOD_SHIELD);
                        entries.add(Shields.CHERRY_WOOD_SHIELD);
                        entries.add(Shields.CRIMSON_WOOD_SHIELD);
                        entries.add(Shields.DARK_OAK_WOOD_SHIELD);
                        entries.add(Shields.JUNGLE_WOOD_SHIELD);
                        entries.add(Shields.MANGROVE_WOOD_SHIELD);
                        entries.add(Shields.OAK_WOOD_SHIELD);
                        entries.add(Shields.SPRUCE_WOOD_SHIELD);
                        entries.add(Shields.WARPED_WOOD_SHIELD);
                        entries.add(Shields.ACACIA_STONE_SHIELD);
                        entries.add(Shields.BAMBOO_STONE_SHIELD);
                        entries.add(Shields.BIRCH_STONE_SHIELD);
                        entries.add(Shields.CHERRY_STONE_SHIELD);
                        entries.add(Shields.CRIMSON_STONE_SHIELD);
                        entries.add(Shields.DARK_OAK_STONE_SHIELD);
                        entries.add(Shields.JUNGLE_STONE_SHIELD);
                        entries.add(Shields.MANGROVE_STONE_SHIELD);
                        entries.add(Shields.OAK_STONE_SHIELD);
                        entries.add(Shields.SPRUCE_STONE_SHIELD);
                        entries.add(Shields.WARPED_STONE_SHIELD);
                        entries.add(Shields.ACACIA_IRON_SHIELD);
                        entries.add(Shields.BAMBOO_IRON_SHIELD);
                        entries.add(Shields.BIRCH_IRON_SHIELD);
                        entries.add(Shields.CHERRY_IRON_SHIELD);
                        entries.add(Shields.CRIMSON_IRON_SHIELD);
                        entries.add(Shields.DARK_OAK_IRON_SHIELD);
                        entries.add(Shields.JUNGLE_IRON_SHIELD);
                        entries.add(Shields.MANGROVE_IRON_SHIELD);
                        entries.add(Items.SHIELD);
                        //entries.add(Shields.OAK_IRON_SHIELD);
                        entries.add(Shields.SPRUCE_IRON_SHIELD);
                        entries.add(Shields.WARPED_IRON_SHIELD);
                        entries.add(Shields.ACACIA_GOLDEN_SHIELD);
                        entries.add(Shields.BAMBOO_GOLDEN_SHIELD);
                        entries.add(Shields.BIRCH_GOLDEN_SHIELD);
                        entries.add(Shields.CHERRY_GOLDEN_SHIELD);
                        entries.add(Shields.CRIMSON_GOLDEN_SHIELD);
                        entries.add(Shields.DARK_OAK_GOLDEN_SHIELD);
                        entries.add(Shields.JUNGLE_GOLDEN_SHIELD);
                        entries.add(Shields.MANGROVE_GOLDEN_SHIELD);
                        entries.add(Shields.OAK_GOLDEN_SHIELD);
                        entries.add(Shields.SPRUCE_GOLDEN_SHIELD);
                        entries.add(Shields.WARPED_GOLDEN_SHIELD);
                        entries.add(Shields.ACACIA_DIAMOND_SHIELD);
                        entries.add(Shields.BAMBOO_DIAMOND_SHIELD);
                        entries.add(Shields.BIRCH_DIAMOND_SHIELD);
                        entries.add(Shields.CHERRY_DIAMOND_SHIELD);
                        entries.add(Shields.CRIMSON_DIAMOND_SHIELD);
                        entries.add(Shields.DARK_OAK_DIAMOND_SHIELD);
                        entries.add(Shields.JUNGLE_DIAMOND_SHIELD);
                        entries.add(Shields.MANGROVE_DIAMOND_SHIELD);
                        entries.add(Shields.OAK_DIAMOND_SHIELD);
                        entries.add(Shields.SPRUCE_DIAMOND_SHIELD);
                        entries.add(Shields.WARPED_DIAMOND_SHIELD);
                        entries.add(Shields.ACACIA_NETHERITE_SHIELD);
                        entries.add(Shields.BAMBOO_NETHERITE_SHIELD);
                        entries.add(Shields.BIRCH_NETHERITE_SHIELD);
                        entries.add(Shields.CHERRY_NETHERITE_SHIELD);
                        entries.add(Shields.CRIMSON_NETHERITE_SHIELD);
                        entries.add(Shields.DARK_OAK_NETHERITE_SHIELD);
                        entries.add(Shields.JUNGLE_NETHERITE_SHIELD);
                        entries.add(Shields.MANGROVE_NETHERITE_SHIELD);
                        entries.add(Shields.OAK_NETHERITE_SHIELD);
                        entries.add(Shields.SPRUCE_NETHERITE_SHIELD);
                        entries.add(Shields.WARPED_NETHERITE_SHIELD);
                    }).texture("variantshields.png").noRenderedName().build());

    public static void registerItemGroup() {
    }
}
