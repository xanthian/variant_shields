package net.xanthian.variantshields;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.xanthian.variantshields.datagen.ModItemTagGenerator;
import net.xanthian.variantshields.datagen.ModLanguageGenerator;
import net.xanthian.variantshields.datagen.ModModelGenerator;
import net.xanthian.variantshields.datagen.ModRecipeGenerator;

public class DataGenInitialise implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(ModRecipeGenerator::new);
        pack.addProvider(ModModelGenerator::new);
        pack.addProvider(ModItemTagGenerator::new);
        pack.addProvider(ModLanguageGenerator::new);

    }
}