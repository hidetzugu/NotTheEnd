package com.hidetzugu.NotTheEnd.init;

import com.hidetzugu.NotTheEnd.block.EnderOres.*;
import com.hidetzugu.NotTheEnd.block.blockCrystalSpawner;
import com.hidetzugu.NotTheEnd.block.blockNotTheEnd;
import com.hidetzugu.NotTheEnd.block.blockObsidianBrick;
import com.hidetzugu.NotTheEnd.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

    //ores
    public static final blockNotTheEnd Ender_iron_ore = new blockEnderIronOre();
    public static final blockNotTheEnd Ender_gold_ore = new blockEnderGoldOre();
    public static final blockNotTheEnd Ender_coal_ore = new blockEnderCoalOre();
    public static final blockNotTheEnd Ender_diamond_ore = new blockEnderDiamondOre();
    public static final blockNotTheEnd Ender_emerald_ore = new blockEnderEmeraldOre();
    public static final blockNotTheEnd Ender_redstone_ore = new blockEnderRedstoneOre();
    public static final blockNotTheEnd Ender_lapis_ore = new blockEnderLapisOre();
    //clusters
    public static final blockNotTheEnd Ender_coal_cluster = new blockEnderCoalCluster();
    public static final blockNotTheEnd Ender_diamond_cluster = new blockEnderDiamondCluster();
    public static final blockNotTheEnd Ender_emerald_cluster = new blockEnderEmeraldCluster();
    public static final blockNotTheEnd Ender_redstone_cluster = new blockEnderRedstoneCluster();
    //other stuff
    public static final blockNotTheEnd Crystal_Spawner = new blockCrystalSpawner();
    public static final blockNotTheEnd Obsidian_Brick = new blockObsidianBrick();

    public static void init(){

        //ores
        GameRegistry.registerBlock(Ender_iron_ore, blockEnderIronOre.BLOCK_ID);
        GameRegistry.registerBlock(Ender_gold_ore,blockEnderGoldOre.BLOCK_ID);
        GameRegistry.registerBlock(Ender_coal_ore,blockEnderCoalOre.BLOCK_ID);
        GameRegistry.registerBlock(Ender_diamond_ore,blockEnderDiamondOre.BLOCK_ID);
        GameRegistry.registerBlock(Ender_emerald_ore,blockEnderEmeraldOre.BLOCK_ID);
        GameRegistry.registerBlock(Ender_redstone_ore,blockEnderRedstoneOre.BLOCK_ID);
        GameRegistry.registerBlock(Ender_lapis_ore,blockEnderLapisOre.BLOCK_ID);
        //clusters
        GameRegistry.registerBlock(Ender_coal_cluster, blockEnderCoalCluster.BLOCK_ID);
        GameRegistry.registerBlock(Ender_diamond_cluster, blockEnderDiamondCluster.BLOCK_ID);
        GameRegistry.registerBlock(Ender_emerald_cluster, blockEnderEmeraldCluster.BLOCK_ID);
        GameRegistry.registerBlock(Ender_redstone_cluster, blockEnderRedstoneCluster.BLOCK_ID);
        //contruction blocks
        GameRegistry.registerBlock(Obsidian_Brick, blockObsidianBrick.BLOCK_ID);
        //other stuff
        GameRegistry.registerBlock(Crystal_Spawner, blockCrystalSpawner.BLOCK_ID);

    }
}
