package com.hidetzugu.NotTheEnd.WorldGen.VanillaReplacements;

import com.hidetzugu.NotTheEnd.Handlers.replacementsHandler;
import net.minecraft.world.WorldProviderEnd;
import net.minecraft.world.biome.WorldChunkManagerHell;

public class WorldProviderNotTheEnd extends WorldProviderEnd {

    /* Similar to WorldProviderEnd but
     * replaces the Sky biome with NotTheEndSky
     */

    @Override
    public void registerWorldChunkManager(){

        this.worldChunkMgr= new WorldChunkManagerHell(replacementsHandler.NotTheEndSky,0.0f);
        this.hasNoSky=true;
        this.dimensionId=1;
    }

}
