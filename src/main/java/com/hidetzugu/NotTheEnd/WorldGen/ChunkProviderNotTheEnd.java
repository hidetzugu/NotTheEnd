package com.hidetzugu.NotTheEnd.WorldGen;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.ChunkProviderEnd;

import java.util.Random;

public class ChunkProviderNotTheEnd extends ChunkProviderEnd implements IChunkProvider{

    //possibly temporaty
    private Random endRNG;
    private World endWorld;
    private BiomeGenBase[] biomesForGeneration;

    public ChunkProviderNotTheEnd(World world, long seed) {
        super(world, seed);
    }

    @Override
    public Chunk provideChunk(int p_73154_1_, int p_73154_2_){

        this.endRNG.setSeed((long)p_73154_1_ * 341873128712L + (long)p_73154_2_ * 132897987541L);
        Block[] ablock = new Block[32768];
        byte[] meta = new byte[ablock.length];
        this.biomesForGeneration = this.endWorld.getWorldChunkManager().loadBlockGeneratorData(this.biomesForGeneration, p_73154_1_ * 16, p_73154_2_ * 16, 16, 16);
        this.func_147420_a(p_73154_1_, p_73154_2_, ablock, this.biomesForGeneration);
        this.replaceBiomeBlocks(p_73154_1_, p_73154_2_, ablock, this.biomesForGeneration, meta);
        Chunk chunk = new Chunk(this.endWorld, ablock, meta, p_73154_1_, p_73154_2_);
        byte[] abyte = chunk.getBiomeArray();

        for (int k = 0; k < abyte.length; ++k)
        {
            abyte[k] = (byte)this.biomesForGeneration[k].biomeID;
        }

        chunk.generateSkylightMap();
        return chunk;
    }
}
