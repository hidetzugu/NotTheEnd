package com.hidetzugu.NotTheEnd.block.EnderOres;

import com.hidetzugu.NotTheEnd.block.blockNotTheEnd;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.world.IBlockAccess;

public class blockEnderGoldOre extends blockNotTheEnd{

    public static final String BLOCK_ID = "Ender_gold_ore";

    public blockEnderGoldOre(){

        super();
        this.setBlockName(BLOCK_ID);
        this.setHardness(3.0f);
        this.setResistance(14.0f);
        this.setHarvestLevel("pickaxe",2);
        this.textureName="blockEnderGoldOre";
    }

    @Override
    public boolean canEntityDestroy(IBlockAccess world, int x, int y, int z, Entity entity){

        return !(entity instanceof EntityDragon);
    }

}
