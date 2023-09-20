package net.xanthian.variantshields.datagen;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.xanthian.variantshields.shields.Shields;
import net.xanthian.variantshields.util.ModModels;
import net.xanthian.variantshields.util.ModTextureKey;

import java.util.Map;

public class ModModelGenerator extends FabricModelProvider {
    public ModModelGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        for (Item shield : Shields.MOD_SHIELDS_ALL.values()) {
            registerShieldItem(itemModelGenerator, shield);
        }
    }

    private void registerShieldItem(ItemModelGenerator itemModelGenerator, Item shield) {
        Identifier notblocking = ModelIds.getItemModelId(shield);
        Identifier blocking = ModelIds.getItemSubModelId(shield, "_blocking");

        JsonObject json = new JsonObject();
        json.addProperty("parent", "variantshields:item/variant_shield");
        json.addProperty("gui_light", "front");

        JsonObject textures = new JsonObject();
        textures.addProperty("shield", notblocking.toString());
        textures.addProperty("particle", "#shield");
        json.add("textures", textures);

        JsonArray overrides = new JsonArray();
        JsonObject override = new JsonObject();
        JsonObject predicate = new JsonObject();
        predicate.addProperty("blocking", 1);
        override.add("predicate", predicate);
        override.addProperty("model", blocking.toString());
        overrides.add(override);
        json.add("overrides", overrides);
        itemModelGenerator.writer.accept(notblocking, () -> json);

        JsonObject jsonObject2 = ModModels.SHIELD_BLOCKING.createJson(blocking, Map.of(ModTextureKey.SHIELD, notblocking, TextureKey.PARTICLE, notblocking));
        jsonObject2.addProperty("gui_light", "front");
        itemModelGenerator.writer.accept(blocking, () -> jsonObject2);
    }
}