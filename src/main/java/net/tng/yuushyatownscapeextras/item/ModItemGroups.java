package net.tng.yuushyatownscapeextras.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.tng.yuushyatownscapeextras.YuushyaTownscapeExtras;
import net.tng.yuushyatownscapeextras.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup YUUSHYA_TOWNSCAPE_EXTRAS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(YuushyaTownscapeExtras.MOD_ID, "yuushya_townscape_extras"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModBlocks.TRAFFIC_SIGN_00))
                    .displayName(Text.translatable("itemgroup.yuushyatownscapeextras.yuushya_townscape_extras"))
                    .entries((displayContext, entries) -> {

                        entries.add(ModBlocks.TRAFFIC_SIGN_00);

                    }).build());

    public static void registerItemGroups() {
        YuushyaTownscapeExtras.LOGGER.info("Registering Item Groups for " + YuushyaTownscapeExtras.MOD_ID);
    }
}
