package net.tng.yuushyatownscapeextras.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.tng.yuushyatownscapeextras.YuushyaTownscapeExtras;

public class ModItems {

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(YuushyaTownscapeExtras.MOD_ID, name), item);
    }

    public static void registerModItems() {
        YuushyaTownscapeExtras.LOGGER.info("Registering Mod Items for " + YuushyaTownscapeExtras.MOD_ID);
    }
}
