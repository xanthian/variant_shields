package net.xanthian.variant_shields;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.xanthian.variant_shields.shields.Shields;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Init  implements ModInitializer {

    public static final String MOD_ID = "variant_shields";
    public static Identifier ID(String path) {
        return new Identifier(MOD_ID, path);
    }
    public static final ItemGroup VARIANT_SHIELDS = FabricItemGroupBuilder.build(new Identifier(Init.MOD_ID, "variant_shields"), () -> new ItemStack(Items.SHIELD));
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        Shields.registerShieldItems();

        LOGGER.info(MOD_ID + " loaded.");
    }

}
