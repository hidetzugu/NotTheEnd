package com.hidetzugu.NotTheEnd.init;

import com.hidetzugu.NotTheEnd.block.EnderOres.blockEnderCoalOre;
import com.hidetzugu.NotTheEnd.item.itemGreenEnderMold;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBed;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.oredict.OreDictionary;
import scala.swing.ListView;

import javax.swing.plaf.basic.BasicComboBoxUI;

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

        GameRegistry.addSmelting(new ItemStack(ModBlocks.Ender_iron_ore),new ItemStack(Items.iron_ingot,1),1.0f);
        GameRegistry.addSmelting(ModBlocks.Ender_gold_ore,new ItemStack(Items.gold_ingot,1),1.0f);

    }
}
