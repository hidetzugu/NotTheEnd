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
        /*  This function adds ores the The End's generation
        *   Each for cycle is used for a different ore (higher k=more veins
        *   The int argument in WorldGenMinable is representative of vein size
        */
        for(int k=0;k<10;++k){
            int blockX= ChunkX + random.nextInt(16);
            int blockZ= ChunkZ + random.nextInt(16);
            int blockY= random.nextInt(255);
            (new WorldGenMinable(ModBlocks.Ender_emerald_ore,7, Blocks.end_stone)).generate(world,random,blockX,blockY,blockZ);
        }
        for(int k=0;k<10;++k){
            int blockX= ChunkX + random.nextInt(16);
            int blockZ= ChunkZ + random.nextInt(16);
            int blockY= random.nextInt(255);
            (new WorldGenMinable(ModBlocks.Ender_diamond_ore,7, Blocks.end_stone)).generate(world,random,blockX,blockY,blockZ);
        }
        for(int k=0;k<4;++k){
            int blockX= ChunkX + random.nextInt(16);
            int blockZ= ChunkZ + random.nextInt(16);
            int blockY= random.nextInt(255);
            (new WorldGenMinable(ModBlocks.Ender_emerald_cluster,7, Blocks.end_stone)).generate(world,random,blockX,blockY,blockZ);
        }
        for(int k=0;k<4;++k){
            int blockX= ChunkX + random.nextInt(16);
            int blockZ= ChunkZ + random.nextInt(16);
            int blockY= random.nextInt(255);
            (new WorldGenMinable(ModBlocks.Ender_diamond_cluster,7, Blocks.end_stone)).generate(world,random,blockX,blockY,blockZ);
        }
        for(int k=0;k<25;++k){
            int blockX= ChunkX + random.nextInt(16);
            int blockZ= ChunkZ + random.nextInt(16);
            int blockY= random.nextInt(255);
            (new WorldGenMinable(ModBlocks.Ender_coal_ore,12, Blocks.end_stone)).generate(world,random,blockX,blockY,blockZ);
        }
        for(int k=0;k<10;++k){
            int blockX= ChunkX + random.nextInt(16);
            int blockZ= ChunkZ + random.nextInt(16);
            int blockY= random.nextInt(255);
            (new WorldGenMinable(ModBlocks.Ender_coal_cluster,7, Blocks.end_stone)).generate(world,random,blockX,blockY,blockZ);
        }
        for(int k=0;k<25;++k){
            int blockX= ChunkX + random.nextInt(16);
            int blockZ= ChunkZ + random.nextInt(16);
            int blockY= random.nextInt(128);
            (new WorldGenMinable(ModBlocks.Ender_iron_ore,12, Blocks.end_stone)).generate(world,random,blockX,blockY,blockZ);
        }
        for(int k=0;k<25;++k){
            int blockX= ChunkX + random.nextInt(16);
            int blockZ= ChunkZ + random.nextInt(16);
            int blockY= random.nextInt(255);
            (new WorldGenMinable(ModBlocks.Ender_gold_ore,12, Blocks.end_stone)).generate(world,random,blockX,blockY,blockZ);
        }
    }

}
