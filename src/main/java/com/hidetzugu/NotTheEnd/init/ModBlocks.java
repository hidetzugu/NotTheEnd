package com.hidetzugu.NotTheEnd.init;

import com.hidetzugu.NotTheEnd.block.Clusters.blockEnderDiamondCluster;
import com.hidetzugu.NotTheEnd.block.Clusters.blockEnderRedstoneCluster;
import com.hidetzugu.NotTheEnd.block.Ores.*;
import com.hidetzugu.NotTheEnd.block.Clusters.blockEnderCoalCluster;
import com.hidetzugu.NotTheEnd.block.Clusters.blockEnderEmeraldCluster;
import com.hidetzugu.NotTheEnd.block.blockNotTheEnd;
import com.hidetzugu.NotTheEnd.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

    public static final blockNotTheEnd Ender_iron_ore = new blockEnderIronOre();
    public static final blockNotTheEnd Ender_gold_ore = new blockEnderGoldOre();
    public static final blockNotTheEnd Ender_coal_cluster = new blockEnderCoalCluster();
    public static final blockNotTheEnd Ender_lapis_ore = new blockEnderLapisOre();
    public static final blockNotTheEnd Ender_diamond_cluster = new blockEnderDiamondCluster();
    public static final blockNotTheEnd Ender_emerald_cluster = new blockEnderEmeraldCluster();
    public static final blockNotTheEnd Ender_redstone_cluster = new blockEnderRedstoneCluster();

    public static void init(){

        GameRegistry.registerBlock(Ender_iron_ore, blockEnderIronOre.BLOCK_ID);
        GameRegistry.registerBlock(Ender_gold_ore,blockEnderGoldOre.BLOCK_ID);
        GameRegistry.registerBlock(Ender_lapis_ore,blockEnderLapisOre.BLOCK_ID);
        GameRegistry.registerBlock(Ender_coal_cluster, blockEnderCoalCluster.BLOCK_ID);
        GameRegistry.registerBlock(Ender_diamond_cluster, blockEnderDiamondCluster.BLOCK_ID);
        GameRegistry.registerBlock(Ender_emerald_cluster, blockEnderEmeraldCluster.BLOCK_ID);
        GameRegistry.registerBlock(Ender_redstone_cluster, blockEnderRedstoneCluster.BLOCK_ID);


    }
}
