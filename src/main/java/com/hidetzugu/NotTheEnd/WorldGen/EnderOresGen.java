package com.hidetzugu.NotTheEnd.WorldGen;

import com.hidetzugu.NotTheEnd.init.ModBlocks;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public class EnderOresGen implements IWorldGenerator{

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {

        switch (world.provider.dimensionId){
            case(0):
                generateSurface(world, random, chunkX * 16, chunkZ * 16);
            break;
                case (-1):
                generateNether(world, random, chunkX * 16, chunkZ * 16);
                break;
            case (1):
                generateEnd(world, random, chunkX * 16, chunkZ * 16);
                break;
        }
    }

    private void generateSurface(World world, Random random, int ChunkX, int ChunkZ){

    }

    private void generateNether(World world, Random random, int ChunkX, int ChunkZ){

    }

    private void generateEnd(World world, Random random, int ChunkX, int ChunkZ){

        for(int k=0;k<100;++k){
            int testblockX= ChunkX + random.nextInt(16);
            int testblockZ= ChunkZ + random.nextInt(16);
            int testblockY= random.nextInt(128);

            (new WorldGenMinable(ModBlocks.Ender_emerald_ore,50, Blocks.end_stone)).generate(world,random,testblockX,testblockY,testblockZ);

        }
    }
}
