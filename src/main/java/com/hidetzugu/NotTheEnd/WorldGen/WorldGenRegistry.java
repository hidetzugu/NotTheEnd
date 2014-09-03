package com.hidetzugu.NotTheEnd.WorldGen;

import cpw.mods.fml.common.registry.GameRegistry;

public class WorldGenRegistry {

    public static void RegisterWorldGen(){

        GameRegistry.registerWorldGenerator(new AsteroidGen(),0);
        GameRegistry.registerWorldGenerator(new EnderOresGen(),1);

    }
}
