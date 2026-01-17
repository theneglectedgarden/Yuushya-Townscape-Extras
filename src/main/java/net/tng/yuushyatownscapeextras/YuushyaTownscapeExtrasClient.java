package net.tng.yuushyatownscapeextras;

import net.fabricmc.api.ClientModInitializer;
import net.tng.yuushyatownscapeextras.block.ModBlocks;
import net.tng.yuushyatownscapeextras.item.ModItems;

public class YuushyaTownscapeExtrasClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
    }
}
