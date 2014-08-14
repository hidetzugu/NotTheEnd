package com.hidetzugu.NotTheEnd.init;

import net.minecraftforge.oredict.OreDictionary;

public class OreRegistration {

    //Register stuff in the ore dictionary
    public static void RegisterOres(){

        //register ores
        OreDictionary.registerOre("oreIron",ModBlocks.Ender_iron_ore);
        OreDictionary.registerOre("oreGold",ModBlocks.Ender_gold_ore);
        OreDictionary.registerOre("oreCoal",ModBlocks.Ender_coal_ore);
        OreDictionary.registerOre("oreDiamond",ModBlocks.Ender_diamond_ore);
        OreDictionary.registerOre("oreEmerald",ModBlocks.Ender_emerald_ore);
        OreDictionary.registerOre("oreRedstone",ModBlocks.Ender_redstone_ore);
        OreDictionary.registerOre("oreLapis",ModBlocks.Ender_lapis_ore);
        //register clusters (this may be changed later)
        OreDictionary.registerOre("oreCoal",ModBlocks.Ender_coal_cluster);
        OreDictionary.registerOre("oreDiamond",ModBlocks.Ender_diamond_cluster);
        OreDictionary.registerOre("oreEmerald",ModBlocks.Ender_emerald_cluster);
        OreDictionary.registerOre("oreRedstone",ModBlocks.Ender_redstone_cluster);

    }
}
