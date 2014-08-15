package com.hidetzugu.NotTheEnd.block.EnderOres;

import com.hidetzugu.NotTheEnd.block.blockNotTheEnd;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.Random;

public class blockEnderLapisOre extends blockNotTheEnd {

    public blockEnderLapisOre(){

        super();
        this.setBlockName(BLOCK_ID);
        this.setHardness(3.0f);
        this.setResistance(14.0f);
        this.setHarvestLevel("pickaxe",1);

    }

    public static final String BLOCK_ID = "Ender_lapis_ore";

    //keep one instance of lapis to use for the drop
    private static final ItemStack lapisdrop= new ItemStack(Items.dye,1,4);

    @Override
    public Item getItemDropped(int metadata, Random random, int fortune){

        return lapisdrop.getItem();
    }

    @Override
    public int quantityDropped(int meta, int fortune, Random random){

        return 4+random.nextInt(5);
    }
}
