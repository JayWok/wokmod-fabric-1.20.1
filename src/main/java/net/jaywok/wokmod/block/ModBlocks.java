package net.jaywok.wokmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.jaywok.wokmod.WokMod;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks
{
    public static final Block COMPACT_COBBLESTONE_1X = registerBlock("compact_cobblestone_1x",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block COMPACT_COBBLESTONE_2X = registerBlock("compact_cobblestone_2x",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block COMPACT_COBBLESTONE_3X = registerBlock("compact_cobblestone_3x",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));

    private static Block registerBlock(String name, Block block)
    {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(WokMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block)
    {
        return Registry.register(Registries.ITEM, new Identifier(WokMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks()
    {
        WokMod.LOGGER.info("WokMod | Registering Mod Blocks for " + WokMod.MOD_ID + " | (" + countRegisteredBlocks() + " blocks)");
    }

    // New method to count the number of blocks
    public static int countRegisteredBlocks()
    {
        int count = 0;
        for (java.lang.reflect.Field field : ModBlocks.class.getDeclaredFields()) {
            if (Block.class.isAssignableFrom(field.getType())) {
                count++;
            }
        }
        return count;
    }
}
