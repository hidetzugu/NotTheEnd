package com.hidetzugu.NotTheEnd.block.EnderOres;

import com.hidetzugu.NotTheEnd.block.blockNotTheEnd;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;

import java.util.Random;

public class blockEnderRedstoneCluster extends blockNotTheEnd{

    public blockEnderRedstoneCluster(){

        super();
        this.setBlockName(BLOCK_ID);
        this.setHardness(3.0f);
        this.setResistance(14.0f);
        this.setHarvestLevel("pickaxe",2);
    }

    public static final String BLOCK_ID = "Ender_redstone_cluster";

    @Override
    public Item getItemDropped(int metadata, Random random, int fortune){

        return Items.redstone;
    }

    @Override
    public int quantityDropped(int meta, int fortune, Random random){

        return 4+random.nextInt(2)+random.nextInt(fortune+3);
    }

    @Override
    public boolean canEntityDestroy(IBlockAccess world, int x, int y, int z, Entity entity){

        return !(entity instanceof EntityDragon);
    }
}
