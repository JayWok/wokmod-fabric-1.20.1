package net.jaywok.wokmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.jaywok.wokmod.WokMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems
{
    public static final Item STONES = registerItem("stones", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientsTabItemGroup(FabricItemGroupEntries entries)
    {
        entries.add(STONES);
    }

    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, new Identifier(WokMod.MOD_ID, name), item);
    }

    public static void registerModItems()
    {
        WokMod.LOGGER.info("WokMod | Registering Mod Items for " + WokMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientsTabItemGroup);
    }
}
