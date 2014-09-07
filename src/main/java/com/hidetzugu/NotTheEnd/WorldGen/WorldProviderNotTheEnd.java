package com.hidetzugu.NotTheEnd.WorldGen;

import net.minecraft.world.WorldProviderEnd;
import net.minecraft.world.chunk.IChunkProvider;

public class WorldProviderNotTheEnd extends WorldProviderEnd {

    @Override
    public void registerWorldChunkManager(){

        this.worldChunkMgr= new WorldChunckManagerNotTheEnd();
        this.hasNoSky=true;
        this.dimensionId=1;
    }

    @Override
    public IChunkProvider createChunkGenerator(){

        return new ChunkProviderNotTheEnd(this.worldObj,this.worldObj.getSeed());
    }


}
