package net.xanthian.variantshields.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.xanthian.variantshields.shields.Shields;

public class ModLanguageGenerator extends FabricLanguageProvider {
    public ModLanguageGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }
    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {

        for (Item item : Shields.MOD_SHIELDS_ALL.values()) {
            translationBuilder.add(item, generateItemDisplayName(item));
        }
    }

    public static String generateItemDisplayName(Item item) {
        Identifier name = Registries.ITEM.getId(item);
        String itemName = name.getPath();
            String[] parts = itemName.split("_");
            StringBuilder displayName = new StringBuilder();
            for (String part : parts) {
                displayName.append(Character.toUpperCase(part.charAt(0)))
                        .append(part.substring(1))
                        .append(" ");
            }
            return displayName.toString().trim();
    }
}
