package net.jaywok.wokmod.util;

import net.jaywok.wokmod.WokMod;

import java.io.File;

public class ModRecipes {
    public static void registerModRecipes() {
        countFilesInDirectory("C:\\Users\\jayde\\OneDrive\\Documents\\wokmod-fabric\\src\\main\\resources\\data\\wokmod\\recipes");
    }

    public static void countFilesInDirectory(String directoryPath) {
        File directory = new File(directoryPath);

        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();
            int fileCount = 0;

            if (files != null) {
                for (File file : files) {
                    if (file.isFile()) {
                        fileCount++;
                    }
                }
                WokMod.LOGGER.info("WokMod | Registering Mod Recipes for " + WokMod.MOD_ID + " | (" + fileCount + " recipes)");
            }
        }
    }
}
