package net.jaywok.wokmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.jaywok.wokmod.WokMod;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems
{
    // Ingredients
    public static final Item STONES = registerItem("stones", new Item(new FabricItemSettings()));
    public static final Item STONE_ROD = registerItem("stone_rod", new Item(new FabricItemSettings()));

    // Pickaxes (default 1, 4.0f)
    public static final Item SR_WOODEN_PICKAXE = registerItem("sr_wooden_pickaxe", new PickaxeItem(
            ToolMaterials.WOOD,1, -2.8f,  new FabricItemSettings()
            .maxCount(1)
            .maxDamage(ToolMaterials.WOOD.getDurability()*2)));
    public static final Item SR_GOLDEN_PICKAXE = registerItem("sr_golden_pickaxe", new PickaxeItem(
            ToolMaterials.GOLD,1, -2.8f,  new FabricItemSettings()
            .maxCount(1)
            .maxDamage(ToolMaterials.GOLD.getDurability()*2)));
    public static final Item SR_STONE_PICKAXE = registerItem("sr_stone_pickaxe", new PickaxeItem(
            ToolMaterials.STONE,1, -2.8f,  new FabricItemSettings()
            .maxCount(1)
            .maxDamage(ToolMaterials.STONE.getDurability()*2)));
    public static final Item SR_IRON_PICKAXE = registerItem("sr_iron_pickaxe", new PickaxeItem(
            ToolMaterials.IRON,1, -2.8f,  new FabricItemSettings()
            .maxCount(1)
            .maxDamage(ToolMaterials.IRON.getDurability()*2)));
    public static final Item SR_DIAMOND_PICKAXE = registerItem("sr_diamond_pickaxe", new PickaxeItem(
            ToolMaterials.DIAMOND,1, -2.8f,  new FabricItemSettings()
            .maxCount(1)
            .maxDamage(ToolMaterials.DIAMOND.getDurability()*2)));
    public static final Item SR_NETHERITE_PICKAXE = registerItem("sr_netherite_pickaxe", new PickaxeItem(
            ToolMaterials.NETHERITE,1, -2.8f,  new FabricItemSettings()
            .maxCount(1)
            .maxDamage(ToolMaterials.NETHERITE.getDurability()*2)));

    // Axes (default 1, 4.0f)
    public static final Item SR_WOODEN_AXE = registerItem("sr_wooden_axe", new AxeItem(
            ToolMaterials.WOOD,6, -3.2f,  new FabricItemSettings()
            .maxCount(1)
            .maxDamage(ToolMaterials.WOOD.getDurability()*2)));
    public static final Item SR_GOLDEN_AXE = registerItem("sr_golden_axe", new AxeItem(
            ToolMaterials.GOLD,6, -3.0f,  new FabricItemSettings()
            .maxCount(1)
            .maxDamage(ToolMaterials.GOLD.getDurability()*2)));
    public static final Item SR_STONE_AXE = registerItem("sr_stone_axe", new AxeItem(
            ToolMaterials.STONE,7, -3.1f,  new FabricItemSettings()
            .maxCount(1)
            .maxDamage(ToolMaterials.STONE.getDurability()*2)));
    public static final Item SR_IRON_AXE = registerItem("sr_iron_axe", new AxeItem(
            ToolMaterials.IRON,6, -3.2f,  new FabricItemSettings()
            .maxCount(1)
            .maxDamage(ToolMaterials.IRON.getDurability()*2)));
    public static final Item SR_DIAMOND_AXE = registerItem("sr_diamond_axe", new AxeItem(
            ToolMaterials.DIAMOND,5, -3.0f,  new FabricItemSettings()
            .maxCount(1)
            .maxDamage(ToolMaterials.DIAMOND.getDurability()*2)));
    public static final Item SR_NETHERITE_AXE = registerItem("sr_netherite_axe", new AxeItem(
            ToolMaterials.NETHERITE,5, -3.0f,  new FabricItemSettings()
            .maxCount(1)
            .maxDamage(ToolMaterials.NETHERITE.getDurability()*2)));

    // Hoes (default 1, 4.0f)
    public static final Item SR_WOODEN_HOE = registerItem("sr_wooden_hoe", new HoeItem(
            ToolMaterials.WOOD,0, -3.0f,  new FabricItemSettings()
            .maxCount(1)
            .maxDamage(ToolMaterials.WOOD.getDurability()*2)));
    public static final Item SR_GOLDEN_HOE = registerItem("sr_golden_hoe", new HoeItem(
            ToolMaterials.GOLD,0, -3.0f,  new FabricItemSettings()
            .maxCount(1)
            .maxDamage(ToolMaterials.GOLD.getDurability()*2)));
    public static final Item SR_STONE_HOE = registerItem("sr_stone_hoe", new HoeItem(
            ToolMaterials.STONE,-1, -2.0f,  new FabricItemSettings()
            .maxCount(1)
            .maxDamage(ToolMaterials.STONE.getDurability()*2)));
    public static final Item SR_IRON_HOE = registerItem("sr_iron_hoe", new HoeItem(
            ToolMaterials.IRON,-2, -1.0f,  new FabricItemSettings()
            .maxCount(1)
            .maxDamage(ToolMaterials.IRON.getDurability()*2)));
    public static final Item SR_DIAMOND_HOE = registerItem("sr_diamond_hoe", new HoeItem(
            ToolMaterials.DIAMOND,-3, 0.0f,  new FabricItemSettings()
            .maxCount(1)
            .maxDamage(ToolMaterials.DIAMOND.getDurability()*2)));
    public static final Item SR_NETHERITE_HOE = registerItem("sr_netherite_hoe", new HoeItem(
            ToolMaterials.NETHERITE,-4, -0.0f,  new FabricItemSettings()
            .maxCount(1)
            .maxDamage(ToolMaterials.NETHERITE.getDurability()*2)));

    // Shovels (default 1, 4.0f)
    public static final Item SR_WOODEN_SHOVEL = registerItem("sr_wooden_shovel", new ShovelItem(
            ToolMaterials.WOOD,1.5f, -3.0f,  new FabricItemSettings()
            .maxCount(1)
            .maxDamage(ToolMaterials.WOOD.getDurability()*2)));
    public static final Item SR_GOLDEN_SHOVEL = registerItem("sr_golden_shovel", new ShovelItem(
            ToolMaterials.GOLD,1.5f, -3.0f,  new FabricItemSettings()
            .maxCount(1)
            .maxDamage(ToolMaterials.GOLD.getDurability()*2)));
    public static final Item SR_STONE_SHOVEL = registerItem("sr_stone_shovel", new ShovelItem(
            ToolMaterials.STONE,1.5f, -3.0f,  new FabricItemSettings()
            .maxCount(1)
            .maxDamage(ToolMaterials.STONE.getDurability()*2)));
    public static final Item SR_IRON_SHOVEL = registerItem("sr_iron_shovel", new ShovelItem(
            ToolMaterials.IRON,1.5f, -3.0f,  new FabricItemSettings()
            .maxCount(1)
            .maxDamage(ToolMaterials.IRON.getDurability()*2)));
    public static final Item SR_DIAMOND_SHOVEL = registerItem("sr_diamond_shovel", new ShovelItem(
            ToolMaterials.DIAMOND,1.5f, -3.0f,  new FabricItemSettings()
            .maxCount(1)
            .maxDamage(ToolMaterials.DIAMOND.getDurability()*2)));
    public static final Item SR_NETHERITE_SHOVEL = registerItem("sr_netherite_shovel", new ShovelItem(
            ToolMaterials.NETHERITE,1.5f, -3.0f,  new FabricItemSettings()
            .maxCount(1)
            .maxDamage(ToolMaterials.NETHERITE.getDurability()*2)));

    // Swords (default 1, 4.0f)
    public static final Item SR_WOODEN_SWORD = registerItem("sr_wooden_sword", new SwordItem(
            ToolMaterials.WOOD,3, -2.4f,  new FabricItemSettings()
            .maxCount(1)
            .maxDamage(ToolMaterials.WOOD.getDurability()*2)));
    public static final Item SR_GOLDEN_SWORD = registerItem("sr_golden_sword", new SwordItem(
            ToolMaterials.GOLD,3, -2.4f,  new FabricItemSettings()
            .maxCount(1)
            .maxDamage(ToolMaterials.GOLD.getDurability()*2)));
    public static final Item SR_STONE_SWORD = registerItem("sr_stone_sword", new SwordItem(
            ToolMaterials.STONE,3, -2.4f,  new FabricItemSettings()
            .maxCount(1)
            .maxDamage(ToolMaterials.STONE.getDurability()*2)));
    public static final Item SR_IRON_SWORD = registerItem("sr_iron_sword", new SwordItem(
            ToolMaterials.IRON,3, -2.4f,  new FabricItemSettings()
            .maxCount(1)
            .maxDamage(ToolMaterials.IRON.getDurability()*2)));
    public static final Item SR_DIAMOND_SWORD = registerItem("sr_diamond_sword", new SwordItem(
            ToolMaterials.DIAMOND,3, -2.4f,  new FabricItemSettings()
            .maxCount(1)
            .maxDamage(ToolMaterials.DIAMOND.getDurability()*2)));
    public static final Item SR_NETHERITE_SWORD = registerItem("sr_netherite_sword", new SwordItem(
            ToolMaterials.NETHERITE,3, -2.4f,  new FabricItemSettings()
            .maxCount(1)
            .maxDamage(ToolMaterials.NETHERITE.getDurability()*2)));

    // Armor
    public static final Item STONE_CHESTPLATE = registerItem("stone_chestplate", new ArmorItem(
            ModArmorMaterial.STONE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()
            .maxCount(1)
            .maxDamage(ToolMaterials.WOOD.getDurability())));
    public static final Item STONE_HELMET = registerItem("stone_helmet", new ArmorItem(
            ModArmorMaterial.STONE, ArmorItem.Type.HELMET, new FabricItemSettings()
            .maxCount(1)
            .maxDamage(ToolMaterials.WOOD.getDurability())));
    public static final Item STONE_BOOTS = registerItem("stone_boots", new ArmorItem(
            ModArmorMaterial.STONE, ArmorItem.Type.BOOTS, new FabricItemSettings()
            .maxCount(1)
            .maxDamage(ToolMaterials.WOOD.getDurability())));
    public static final Item STONE_LEGGINGS = registerItem("stone_leggings", new ArmorItem(
            ModArmorMaterial.STONE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()
            .maxCount(1)
            .maxDamage(ToolMaterials.WOOD.getDurability())));

    public static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, new Identifier(WokMod.MOD_ID, name), item);
    }

    public static void registerModItems()
    {
        WokMod.LOGGER.info("WokMod | Registering Mod Items for " + WokMod.MOD_ID + " | (" + countRegisteredItems() + " items)");
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
