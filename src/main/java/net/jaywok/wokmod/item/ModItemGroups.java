package net.jaywok.wokmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.jaywok.wokmod.WokMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups
{
    public static final ItemGroup WOKMOD_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(WokMod.MOD_ID, "wokmod"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.wokmod"))
                    .icon(() -> new ItemStack(ModItems.STONE_ROD)).entries((displayContext, entries) -> {
                        entries.add(ModItems.STONES);
                        entries.add(ModItems.STONE_ROD);

                    }).build());

    public static void registerItemGroups()
    {
        WokMod.LOGGER.info("WokMod | Registering Item Group for " + WokMod.MOD_ID);
    }
}
