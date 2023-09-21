package net.xanthian.variantshields.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.xanthian.variantshields.shields.Shields;
import net.xanthian.variantshields.util.ModItemTags;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {


        offerWoodenShieldRecipe(exporter, Shields.ACACIA_WOOD_SHIELD, Items.ACACIA_PLANKS);
        offerStoneShieldRecipe(exporter, Shields.ACACIA_STONE_SHIELD, Items.ACACIA_PLANKS);
        offerGoldenShieldRecipe(exporter, Shields.ACACIA_GOLDEN_SHIELD, Items.ACACIA_PLANKS);
        offerIronShieldRecipe(exporter, Shields.ACACIA_IRON_SHIELD, Items.ACACIA_PLANKS);
        offerDiamondShieldRecipe(exporter, Shields.ACACIA_DIAMOND_SHIELD, Items.ACACIA_PLANKS);
        offerNetheriteShieldRecipe(exporter,Shields.ACACIA_DIAMOND_SHIELD,Shields.ACACIA_NETHERITE_SHIELD);

        offerWoodenShieldRecipe(exporter, Shields.BAMBOO_WOOD_SHIELD, Items.BAMBOO_PLANKS);
        offerStoneShieldRecipe(exporter, Shields.BAMBOO_STONE_SHIELD, Items.BAMBOO_PLANKS);
        offerGoldenShieldRecipe(exporter, Shields.BAMBOO_GOLDEN_SHIELD, Items.BAMBOO_PLANKS);
        offerIronShieldRecipe(exporter, Shields.BAMBOO_IRON_SHIELD, Items.BAMBOO_PLANKS);
        offerDiamondShieldRecipe(exporter, Shields.BAMBOO_DIAMOND_SHIELD, Items.BAMBOO_PLANKS);
        offerNetheriteShieldRecipe(exporter,Shields.BAMBOO_DIAMOND_SHIELD,Shields.BAMBOO_NETHERITE_SHIELD);

        offerWoodenShieldRecipe(exporter, Shields.BIRCH_WOOD_SHIELD, Items.BIRCH_PLANKS);
        offerStoneShieldRecipe(exporter, Shields.BIRCH_STONE_SHIELD, Items.BIRCH_PLANKS);
        offerGoldenShieldRecipe(exporter, Shields.BIRCH_GOLDEN_SHIELD, Items.BIRCH_PLANKS);
        offerIronShieldRecipe(exporter, Shields.BIRCH_IRON_SHIELD, Items.BIRCH_PLANKS);
        offerDiamondShieldRecipe(exporter, Shields.BIRCH_DIAMOND_SHIELD, Items.BIRCH_PLANKS);
        offerNetheriteShieldRecipe(exporter,Shields.BIRCH_DIAMOND_SHIELD,Shields.BIRCH_NETHERITE_SHIELD);

        offerWoodenShieldRecipe(exporter, Shields.CHERRY_WOOD_SHIELD, Items.CHERRY_PLANKS);
        offerStoneShieldRecipe(exporter, Shields.CHERRY_STONE_SHIELD, Items.CHERRY_PLANKS);
        offerGoldenShieldRecipe(exporter, Shields.CHERRY_GOLDEN_SHIELD, Items.CHERRY_PLANKS);
        offerIronShieldRecipe(exporter, Shields.CHERRY_IRON_SHIELD, Items.CHERRY_PLANKS);
        offerDiamondShieldRecipe(exporter, Shields.CHERRY_DIAMOND_SHIELD, Items.CHERRY_PLANKS);
        offerNetheriteShieldRecipe(exporter,Shields.CHERRY_DIAMOND_SHIELD,Shields.CHERRY_NETHERITE_SHIELD);

        offerWoodenShieldRecipe(exporter, Shields.CRIMSON_WOOD_SHIELD, Items.CRIMSON_PLANKS);
        offerStoneShieldRecipe(exporter, Shields.CRIMSON_STONE_SHIELD, Items.CRIMSON_PLANKS);
        offerGoldenShieldRecipe(exporter, Shields.CRIMSON_GOLDEN_SHIELD, Items.CRIMSON_PLANKS);
        offerIronShieldRecipe(exporter, Shields.CRIMSON_IRON_SHIELD, Items.CRIMSON_PLANKS);
        offerDiamondShieldRecipe(exporter, Shields.CRIMSON_DIAMOND_SHIELD, Items.CRIMSON_PLANKS);
        offerNetheriteShieldRecipe(exporter,Shields.CRIMSON_DIAMOND_SHIELD,Shields.CRIMSON_NETHERITE_SHIELD);

        offerWoodenShieldRecipe(exporter, Shields.DARK_OAK_WOOD_SHIELD, Items.DARK_OAK_PLANKS);
        offerStoneShieldRecipe(exporter, Shields.DARK_OAK_STONE_SHIELD, Items.DARK_OAK_PLANKS);
        offerGoldenShieldRecipe(exporter, Shields.DARK_OAK_GOLDEN_SHIELD, Items.DARK_OAK_PLANKS);
        offerIronShieldRecipe(exporter, Shields.DARK_OAK_IRON_SHIELD, Items.DARK_OAK_PLANKS);
        offerDiamondShieldRecipe(exporter, Shields.DARK_OAK_DIAMOND_SHIELD, Items.DARK_OAK_PLANKS);
        offerNetheriteShieldRecipe(exporter,Shields.DARK_OAK_DIAMOND_SHIELD,Shields.DARK_OAK_NETHERITE_SHIELD);

        offerWoodenShieldRecipe(exporter, Shields.JUNGLE_WOOD_SHIELD, Items.JUNGLE_PLANKS);
        offerStoneShieldRecipe(exporter, Shields.JUNGLE_STONE_SHIELD, Items.JUNGLE_PLANKS);
        offerGoldenShieldRecipe(exporter, Shields.JUNGLE_GOLDEN_SHIELD, Items.JUNGLE_PLANKS);
        offerIronShieldRecipe(exporter, Shields.JUNGLE_IRON_SHIELD, Items.JUNGLE_PLANKS);
        offerDiamondShieldRecipe(exporter, Shields.JUNGLE_DIAMOND_SHIELD, Items.JUNGLE_PLANKS);
        offerNetheriteShieldRecipe(exporter,Shields.JUNGLE_DIAMOND_SHIELD,Shields.JUNGLE_NETHERITE_SHIELD);

        offerWoodenShieldRecipe(exporter, Shields.MANGROVE_WOOD_SHIELD, Items.MANGROVE_PLANKS);
        offerStoneShieldRecipe(exporter, Shields.MANGROVE_STONE_SHIELD, Items.MANGROVE_PLANKS);
        offerGoldenShieldRecipe(exporter, Shields.MANGROVE_GOLDEN_SHIELD, Items.MANGROVE_PLANKS);
        offerIronShieldRecipe(exporter, Shields.MANGROVE_IRON_SHIELD, Items.MANGROVE_PLANKS);
        offerDiamondShieldRecipe(exporter, Shields.MANGROVE_DIAMOND_SHIELD, Items.MANGROVE_PLANKS);
        offerNetheriteShieldRecipe(exporter,Shields.MANGROVE_DIAMOND_SHIELD,Shields.MANGROVE_NETHERITE_SHIELD);

        offerWoodenShieldRecipe(exporter, Shields.OAK_WOOD_SHIELD, Items.OAK_PLANKS);
        offerStoneShieldRecipe(exporter, Shields.OAK_STONE_SHIELD, Items.OAK_PLANKS);
        offerGoldenShieldRecipe(exporter, Shields.OAK_GOLDEN_SHIELD, Items.OAK_PLANKS);
        offerIronShieldRecipe(exporter, Shields.OAK_IRON_SHIELD, Items.OAK_PLANKS);
        offerDiamondShieldRecipe(exporter, Shields.OAK_DIAMOND_SHIELD, Items.OAK_PLANKS);
        offerNetheriteShieldRecipe(exporter,Shields.OAK_DIAMOND_SHIELD,Shields.OAK_NETHERITE_SHIELD);

        offerWoodenShieldRecipe(exporter, Shields.SPRUCE_WOOD_SHIELD, Items.SPRUCE_PLANKS);
        offerStoneShieldRecipe(exporter, Shields.SPRUCE_STONE_SHIELD, Items.SPRUCE_PLANKS);
        offerGoldenShieldRecipe(exporter, Shields.SPRUCE_GOLDEN_SHIELD, Items.SPRUCE_PLANKS);
        offerIronShieldRecipe(exporter, Shields.SPRUCE_IRON_SHIELD, Items.SPRUCE_PLANKS);
        offerDiamondShieldRecipe(exporter, Shields.SPRUCE_DIAMOND_SHIELD, Items.SPRUCE_PLANKS);
        offerNetheriteShieldRecipe(exporter,Shields.SPRUCE_DIAMOND_SHIELD,Shields.SPRUCE_NETHERITE_SHIELD);

        offerWoodenShieldRecipe(exporter, Shields.WARPED_WOOD_SHIELD, Items.WARPED_PLANKS);
        offerStoneShieldRecipe(exporter, Shields.WARPED_STONE_SHIELD, Items.WARPED_PLANKS);
        offerGoldenShieldRecipe(exporter, Shields.WARPED_GOLDEN_SHIELD, Items.WARPED_PLANKS);
        offerIronShieldRecipe(exporter, Shields.WARPED_IRON_SHIELD, Items.WARPED_PLANKS);
        offerDiamondShieldRecipe(exporter, Shields.WARPED_DIAMOND_SHIELD, Items.WARPED_PLANKS);
        offerNetheriteShieldRecipe(exporter,Shields.WARPED_DIAMOND_SHIELD,Shields.WARPED_NETHERITE_SHIELD);

        // Uncrafting Recipe
        ModRecipeGenerator.offerUncraftingRecipe(exporter, RecipeCategory.DECORATIONS, ModItemTags.IRON_SHIELDS, Items.SHIELD);
    }

    public static void offerWoodenShieldRecipe(RecipeExporter exporter, ItemConvertible shield, ItemConvertible plank) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, shield)
                .input('W', plank)
                .pattern("WWW").pattern("WWW").pattern(" W ")
                .criterion("has_plank", VanillaRecipeProvider.conditionsFromItem(plank))
                .offerTo(exporter);
    }
    public static void offerStoneShieldRecipe(RecipeExporter exporter, ItemConvertible shield, ItemConvertible plank) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, shield)
                .input('W', plank)
                .input('S', Items.STONE)
                .pattern("WSW").pattern("WWW").pattern(" W ")
                .criterion("has_stone", VanillaRecipeProvider.conditionsFromItem(Items.STONE))
                .offerTo(exporter);
    }
    public static void offerIronShieldRecipe(RecipeExporter exporter, ItemConvertible shield, ItemConvertible plank) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, shield)
                .input('W', plank)
                .input('I', Items.IRON_INGOT)
                .pattern("WIW").pattern("WWW").pattern(" W ")
                .criterion("has_iron_ingot", VanillaRecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter);
    }
    public static void offerGoldenShieldRecipe(RecipeExporter exporter, ItemConvertible shield, ItemConvertible plank) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, shield)
                .input('W', plank)
                .input('G', Items.GOLD_INGOT)
                .pattern("WGW").pattern("WWW").pattern(" W ")
                .criterion("has_gold_ingot", VanillaRecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter);
    }
    public static void offerDiamondShieldRecipe(RecipeExporter exporter, ItemConvertible shield, ItemConvertible plank) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, shield)
                .input('W', plank)
                .input('D', Items.DIAMOND)
                .pattern("WDW").pattern("WWW").pattern(" W ")
                .criterion("has_diamond", VanillaRecipeProvider.conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter);
    }
    public static void offerNetheriteShieldRecipe(RecipeExporter exporter, ItemConvertible diamondShield, Item shield) {
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), Ingredient.ofItems(diamondShield), Ingredient.ofItems(Items.NETHERITE_INGOT), RecipeCategory.COMBAT, shield)
                .criterion("has_netherite_ingot", VanillaRecipeProvider.conditionsFromItem(Items.NETHERITE_INGOT))
                .offerTo(exporter, FabricRecipeProvider.getItemPath(shield) + "_smithing");
    }
    public static void offerUncraftingRecipe(RecipeExporter exporter, RecipeCategory category, TagKey<Item> input, ItemConvertible output) {
        ShapelessRecipeJsonBuilder.create(category, output, 1)
                .input(input)
                .criterion("has_variant_item", InventoryChangedCriterion.Conditions.items(output))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(output)));
    }
}