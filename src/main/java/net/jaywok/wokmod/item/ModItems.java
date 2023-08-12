package net.jaywok.wokmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.jaywok.wokmod.WokMod;
import net.jaywok.wokmod.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems
{
    public static final Item STONES = registerItem("stones", new Item(new FabricItemSettings()));
    public static final Item STONE_ROD = registerItem("stone_rod", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientsTabItemGroup(FabricItemGroupEntries entries)
    {
        entries.add(STONES);
        entries.add(STONE_ROD);
    }

    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, new Identifier(WokMod.MOD_ID, name), item);
    }

    public static void registerModItems()
    {
        WokMod.LOGGER.info("WokMod | Registering Mod Items for " + WokMod.MOD_ID + " | (" + countRegisteredItems() + " items)");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientsTabItemGroup);
    }

    // New method to count the number of items
    public static int countRegisteredItems()
    {
        int count = 0;
        for (java.lang.reflect.Field field : ModItems.class.getDeclaredFields()) {
            if (Item.class.isAssignableFrom(field.getType())) {
                count++;
            }
        }
        return count;
    }
}
