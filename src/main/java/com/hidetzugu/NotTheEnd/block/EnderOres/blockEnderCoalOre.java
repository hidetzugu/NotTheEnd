package com.hidetzugu.NotTheEnd.block.EnderOres;

import com.hidetzugu.NotTheEnd.block.blockNotTheEnd;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.Random;

public class blockEnderCoalOre extends blockNotTheEnd {

    public blockEnderCoalOre(){

        super();
        this.setBlockName(BLOCK_ID);
        this.setHardness(3.0f);
        this.setResistance(14.0f);
    }

    public static final String BLOCK_ID = "Ender_coal_ore";

    @Override
    public Item getItemDropped(int metadata, Random random, int fortune){

        return Items.coal;
    }

    @Override
    public int quantityDropped(int meta, int fortune, Random random){

        int result=random.nextInt(fortune+2);
        return result > 0 ? result : 1;
    }
}
