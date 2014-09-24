package com.hidetzugu.NotTheEnd.Handlers;

import com.hidetzugu.NotTheEnd.WorldGen.VanillaReplacements.BiomeGenNotTheEnd;
import com.hidetzugu.NotTheEnd.WorldGen.VanillaReplacements.WorldProviderNotTheEnd;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.DimensionManager;

public class replacementsHandler {
    /* This class handles the replacement of various
     * vanilla objects for ALMOST similar counterparts
     */

    //Biome almost similar to Sky but with BiomeNotTheEndDecorator
    public static final BiomeGenBase NotTheEndSky = (new BiomeGenNotTheEnd(9)).setColor(8421631).setBiomeName("Sky").setDisableRain();

    public static void ProviderHandler(){
        //Replaces the End Dimension for an "almost" End one
        DimensionManager.unregisterProviderType(1);
        DimensionManager.registerProviderType(1,WorldProviderNotTheEnd.class,true);
    }
}
