package com.hidetzugu.NotTheEnd.init;

import com.hidetzugu.NotTheEnd.block.Ores.blockEnderCoalOre;
import com.hidetzugu.NotTheEnd.block.Ores.blockEnderDiamondOre;
import com.hidetzugu.NotTheEnd.block.Ores.blockEnderGoldOre;
import com.hidetzugu.NotTheEnd.block.Ores.blockEnderIronOre;
import com.hidetzugu.NotTheEnd.block.blockNotTheEnd;
import com.hidetzugu.NotTheEnd.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

    public static final blockNotTheEnd Ender_iron_ore = new blockEnderIronOre();
    public static final blockNotTheEnd Ender_gold_ore = new blockEnderGoldOre();
    public static final blockNotTheEnd Ender_coal_ore = new blockEnderCoalOre();
    public static final blockNotTheEnd Ender_diamond_ore = new blockEnderDiamondOre();

    public static void init(){

        GameRegistry.registerBlock(Ender_iron_ore, blockEnderIronOre.BLOCK_ID);
        GameRegistry.registerBlock(Ender_gold_ore,blockEnderGoldOre.BLOCK_ID);
        GameRegistry.registerBlock(Ender_coal_ore,blockEnderCoalOre.BLOCK_ID);
        GameRegistry.registerBlock(Ender_diamond_ore,blockEnderDiamondOre.BLOCK_ID);

    }
}
