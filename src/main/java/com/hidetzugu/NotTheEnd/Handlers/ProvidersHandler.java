package com.hidetzugu.NotTheEnd.Handlers;

import com.hidetzugu.NotTheEnd.WorldGen.VanillaReplacements.WorldProviderNotTheEnd;
import net.minecraftforge.common.DimensionManager;

public class ProvidersHandler {

    public static void init(){

        unregisterProviders();
        registerProviders();

    }

    private static void unregisterProviders(){

        DimensionManager.unregisterProviderType(1);
    }

    private static void registerProviders(){

        DimensionManager.registerProviderType(1,WorldProviderNotTheEnd.class,true);
    }
}
