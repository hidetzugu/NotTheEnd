package com.hidetzugu.NotTheEnd.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ModRecipes {

    public static void RegisterSmelting(){
        //metals
        GameRegistry.addSmelting(ModBlocks.Ender_iron_ore, new ItemStack(Items.iron_ingot, 1), 1.0f);
        GameRegistry.addSmelting(ModBlocks.Ender_gold_ore,new ItemStack(Items.gold_ingot,1),1.0f);
        //minerals
        GameRegistry.addSmelting(ModBlocks.Ender_redstone_ore,new ItemStack(Items.redstone,3),1.0f);
        GameRegistry.addSmelting(ModBlocks.Ender_redstone_cluster,new ItemStack(Items.redstone,3),1.0f);

        GameRegistry.addSmelting(ModBlocks.Ender_diamond_ore,new ItemStack(Items.diamond,1),1.0f);
        GameRegistry.addSmelting(ModBlocks.Ender_diamond_cluster,new ItemStack(Items.diamond,1),1.0f);
        GameRegistry.addSmelting(ModBlocks.Ender_emerald_ore,new ItemStack(Items.emerald,1),1.0f);
        GameRegistry.addSmelting(ModBlocks.Ender_emerald_cluster,new ItemStack(Items.emerald,1),1.0f);
        //lapiz (the item) does NOT has a specific item object; instead its a dye object with meta-data 4
        GameRegistry.addSmelting(ModBlocks.Ender_lapis_ore,new ItemStack(Items.dye,3,4),1.0f);
    }

}
