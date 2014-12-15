package com.hidetzugu.NotTheEnd.block.EnderOres;

import com.hidetzugu.NotTheEnd.block.blockNotTheEnd;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;

import java.util.Random;

public class blockEnderCoalCluster extends blockNotTheEnd{

    public blockEnderCoalCluster(){
        super();
        this.setBlockName(BLOCK_ID);
        this.setHardness(3.0f);
        this.setResistance(14.0f);
        this.textureName="blockEnderCoalCluster";
    }

    public static final String BLOCK_ID = "Ender_coal_cluster";

    @Override
    public Item getItemDropped(int metadata, Random random, int fortune){

        return Items.coal;
    }

    @Override
    public int quantityDropped(int meta, int fortune, Random random){

        int result=random.nextInt(fortune+4);
        return result > 0 ? result : 1;
    }

    @Override
    public boolean canEntityDestroy(IBlockAccess world, int x, int y, int z, Entity entity){

        return !(entity instanceof EntityDragon);
    }

}
