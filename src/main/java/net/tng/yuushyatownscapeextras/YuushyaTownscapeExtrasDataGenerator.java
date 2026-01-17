package net.tng.yuushyatownscapeextras;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.tng.yuushyatownscapeextras.datagen.ModBlockTagProvider;
import net.tng.yuushyatownscapeextras.datagen.ModItemTagProvider;
import net.tng.yuushyatownscapeextras.datagen.ModModelProvider;

public class YuushyaTownscapeExtrasDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModItemTagProvider::new);
		pack.addProvider(ModModelProvider::new);
	}
}
