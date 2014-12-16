package com.hidetzugu.NotTheEnd.block;

import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.world.IBlockAccess;

public class blockObsidianBrick extends blockNotTheEnd{

    public blockObsidianBrick(){
        super();
        this.setBlockName(BLOCK_ID);
        this.setHardness(3.0F);
        this.setResistance(2000.0F);
        this.setHarvestLevel("pickaxe",3);
        this.textureName="Obsidian_Brick";
    }

    public static final String BLOCK_ID = "Obsidian_Brick";

    @Override
    public boolean canEntityDestroy(IBlockAccess world, int x, int y, int z, Entity entity){

        return !(entity instanceof EntityDragon);
    }
}
