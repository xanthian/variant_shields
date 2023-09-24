package net.xanthian.variantshields.util;

import net.minecraft.entity.attribute.ClampedEntityAttribute;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.xanthian.variantshields.Initialise;

import java.util.LinkedHashMap;
import java.util.Map;

public class ModEntityAttributes {

    public static final EntityAttribute SHIELD_COOLDOWN =
            new ClampedEntityAttribute("variantshields.cooldown", 1.0, 0.0, 140.0).setTracked(true);

    public static Map<String, EntityAttribute> ATTRIBUTES = new LinkedHashMap<>();

    static {
        ATTRIBUTES.put("cooldown", SHIELD_COOLDOWN);
    }

        public static void registerAttributes() {
            for (Map.Entry<String, EntityAttribute> pair : ATTRIBUTES.entrySet()) {
                Registry.register(Registries.ATTRIBUTE, Initialise.id(pair.getKey()), pair.getValue());
        }
    }
}
