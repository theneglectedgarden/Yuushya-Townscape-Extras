package net.tng.yuushyatownscapeextras;

import net.fabricmc.api.ModInitializer;

import net.tng.yuushyatownscapeextras.block.ModBlocks;
import net.tng.yuushyatownscapeextras.item.ModItemGroups;
import net.tng.yuushyatownscapeextras.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class YuushyaTownscapeExtras implements ModInitializer {
	public static final String MOD_ID = "yuushya-townscape-extras";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}