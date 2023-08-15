package net.jaywok.wokmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.jaywok.wokmod.WokMod;
import net.jaywok.wokmod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
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
                        // Items
                        entries.add(ModItems.STONES);
                        entries.add(ModItems.STONE_ROD);
                        // Tools
                        entries.add(ModItems.SR_WOODEN_PICKAXE);
                        entries.add(ModItems.SR_GOLDEN_PICKAXE);
                        entries.add(ModItems.SR_STONE_PICKAXE);
                        entries.add(ModItems.SR_IRON_PICKAXE);
                        entries.add(ModItems.SR_DIAMOND_PICKAXE);
                        entries.add(ModItems.SR_NETHERITE_PICKAXE);
                        entries.add(ModItems.SR_WOODEN_AXE);
                        entries.add(ModItems.SR_GOLDEN_AXE);
                        entries.add(ModItems.SR_STONE_AXE);
                        entries.add(ModItems.SR_IRON_AXE);
                        entries.add(ModItems.SR_DIAMOND_AXE);
                        entries.add(ModItems.SR_NETHERITE_AXE);
                        entries.add(ModItems.SR_WOODEN_SHOVEL);
                        entries.add(ModItems.SR_GOLDEN_SHOVEL);
                        entries.add(ModItems.SR_STONE_SHOVEL);
                        entries.add(ModItems.SR_IRON_SHOVEL);
                        entries.add(ModItems.SR_DIAMOND_SHOVEL);
                        entries.add(ModItems.SR_NETHERITE_SHOVEL);
                        entries.add(ModItems.SR_WOODEN_SWORD);
                        entries.add(ModItems.SR_GOLDEN_SWORD);
                        entries.add(ModItems.SR_STONE_SWORD);
                        entries.add(ModItems.SR_IRON_SWORD);
                        entries.add(ModItems.SR_DIAMOND_SWORD);
                        entries.add(ModItems.SR_NETHERITE_SWORD);
                        entries.add(ModItems.SR_WOODEN_HOE);
                        entries.add(ModItems.SR_GOLDEN_HOE);
                        entries.add(ModItems.SR_STONE_HOE);
                        entries.add(ModItems.SR_IRON_HOE);
                        entries.add(ModItems.SR_DIAMOND_HOE);
                        entries.add(ModItems.SR_NETHERITE_HOE);
                        // Blocks
                        entries.add(ModBlocks.COMPACT_COBBLESTONE_1X);
                        entries.add(ModBlocks.COMPACT_COBBLESTONE_2X);
                        entries.add(ModBlocks.COMPACT_COBBLESTONE_3X);

                    }).build());

    public static void registerItemGroups()
    {
        WokMod.LOGGER.info("WokMod | Registering Mod Item Group for " + WokMod.MOD_ID + " | (" + (ModBlocks.countRegisteredBlocks() + ModItems.countRegisteredItems()) + " total)");
    }
}
