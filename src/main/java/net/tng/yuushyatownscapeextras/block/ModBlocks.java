package net.tng.yuushyatownscapeextras.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.tng.yuushyatownscapeextras.YuushyaTownscapeExtras;
import net.tng.yuushyatownscapeextras.block.custom.TrafficSign;

public class ModBlocks {
    public static final Block TRAFFIC_SIGN_00 = registerBlocks("traffic_sign_00",
            new TrafficSign(AbstractBlock.Settings.create().nonOpaque()));

    private static Block registerBlocks(String name, Block block){
        Identifier id = Identifier.of(YuushyaTownscapeExtras.MOD_ID, name);
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, id, block);
    }

    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(YuushyaTownscapeExtras.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }


    public static void registerModBlocks(){
        YuushyaTownscapeExtras.LOGGER.info("Registering ModBlocks for " +  YuushyaTownscapeExtras.MOD_ID);
    }
}
