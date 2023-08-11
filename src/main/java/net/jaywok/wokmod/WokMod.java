package net.jaywok.wokmod;

import net.fabricmc.api.ModInitializer;

import net.jaywok.wokmod.item.ModItemGroups;
import net.jaywok.wokmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WokMod implements ModInitializer
{
	public static final String MOD_ID = "wokmod";
    public static final Logger LOGGER = LoggerFactory.getLogger("wokmod");

	@Override
	public void onInitialize()
	{
		LOGGER.info("WokMod | Loaded " + MOD_ID);

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}