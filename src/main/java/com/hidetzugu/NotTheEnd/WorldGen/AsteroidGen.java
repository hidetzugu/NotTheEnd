package com.hidetzugu.NotTheEnd.WorldGen;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public class AsteroidGen implements IWorldGenerator {

    private static int smallAsteroidRarity=4;

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

        if(random.nextInt(smallAsteroidRarity) == 0){

            generateSmallAsteroid(world, random, ChunkX, ChunkZ);
        }

    }

    public void generateSmallAsteroid(World world, Random random, int ChunkX, int ChunkZ){

        int blockX= ChunkX + random.nextInt(16);
        int blockZ= ChunkZ + random.nextInt(16);
        int blockY= 12 + random.nextInt(200);

        int asteroidsize= 12 + random.nextInt(200);

        (new WorldGenMinable(Blocks.end_stone,asteroidsize, Blocks.air)).generate(world, random, blockX, blockY, blockZ);

    }

    public void generateBigAsteroid(World world, Random random, int ChunkX, int ChunkZ){


    }
}
