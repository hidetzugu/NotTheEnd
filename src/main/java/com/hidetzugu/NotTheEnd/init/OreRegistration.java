package com.hidetzugu.NotTheEnd.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
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

    public static void RegisterSmelting(){
        //metals
        GameRegistry.addSmelting(new ItemStack(ModBlocks.Ender_iron_ore),new ItemStack(Items.iron_ingot,1),1.0f);
        GameRegistry.addSmelting(ModBlocks.Ender_gold_ore,new ItemStack(Items.gold_ingot,1),1.0f);
        //minerals
        GameRegistry.addSmelting(ModBlocks.Ender_redstone_ore,new ItemStack(Items.redstone,3),1.0f);
        GameRegistry.addSmelting(ModBlocks.Ender_redstone_cluster,new ItemStack(Items.redstone,5),1.0f);

        GameRegistry.addSmelting(ModBlocks.Ender_diamond_ore,new ItemStack(Items.diamond,1),1.0f);
        GameRegistry.addSmelting(ModBlocks.Ender_diamond_cluster,new ItemStack(Items.diamond,2),1.0f);
        GameRegistry.addSmelting(ModBlocks.Ender_emerald_ore,new ItemStack(Items.emerald,1),1.0f);
        GameRegistry.addSmelting(ModBlocks.Ender_emerald_cluster,new ItemStack(Items.emerald,2),1.0f);
            //lapiz (the item) does NOT has a specific item object; instead its a dye object with meta-data 4
        GameRegistry.addSmelting(ModBlocks.Ender_lapis_ore,new ItemStack(Items.dye,3,4),1.0f);


    }
}
