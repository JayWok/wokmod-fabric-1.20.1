package net.jaywok.wokmod;

import net.fabricmc.api.ModInitializer;

import net.jaywok.wokmod.block.ModBlocks;
import net.jaywok.wokmod.item.ModItemGroups;
import net.jaywok.wokmod.item.ModItems;
import net.jaywok.wokmod.util.ModRecipes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class WokMod implements ModInitializer
{
	public static final String MOD_ID = "wokmod";
    public static final Logger LOGGER = LoggerFactory.getLogger("wokmod");

	@Override
	public void onInitialize()
	{
		LOGGER.info("________________________________________________________________________________");
		LOGGER.info("                            WokMod | Loaded " + MOD_ID);
		LOGGER.info("________________________________________________________________________________");

		ModItemGroups.registerItemGroups();
		ModRecipes.registerModRecipes();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		LOGGER.info("________________________________________________________________________________");
	}
}

