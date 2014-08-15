package com.hidetzugu.NotTheEnd.block.EnderOres;

import com.hidetzugu.NotTheEnd.block.blockNotTheEnd;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.Random;

public class blockEnderRedstoneOre extends blockNotTheEnd {

    public blockEnderRedstoneOre(){

        super();
        this.setBlockName(BLOCK_ID);
        this.setHardness(3.0f);
        this.setResistance(14.0f);
        this.setHarvestLevel("pickaxe",2);

    }

    public static final String BLOCK_ID = "Ender_redstone_ore";

    @Override
    public Item getItemDropped(int metadata, Random random, int fortune){

        return Items.redstone;
    }

    @Override
    public int quantityDropped(int meta, int fortune, Random random){

        return 4+random.nextInt(2)+random.nextInt(fortune+1);
    }
}

