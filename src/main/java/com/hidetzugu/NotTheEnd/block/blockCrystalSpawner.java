package com.hidetzugu.NotTheEnd.block;

import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class blockCrystalSpawner extends blockNotTheEnd{

    public blockCrystalSpawner(){
        super();
        this.setBlockName(BLOCK_ID);
        this.setBlockUnbreakable();
        this.setResistance(6000000.0F); //same as bedrock
        this.setTickRandomly(true);
        this.textureName="blockCrystalSpawner";
    }

    public static final String BLOCK_ID = "Crystal_Spawner";
    //used for to compare in onEntityCollidedWithBlock
    public boolean hasCrystal;

    @Override
    public boolean canEntityDestroy(IBlockAccess world, int x, int y, int z, Entity entity){

        return !(entity instanceof EntityDragon);
    }

    @Override
    public void onBlockAdded(World world, int x, int y,int z){

        //need to find a way to check if a crystal is already there
        if(true){
            this.SpawnCrystal(world,x,y,z);
        }
    }

    @Override
    public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity){

    }


    private void SpawnCrystal(World world, int x, int y, int z){

        EntityEnderCrystal entityCrystal = new EntityEnderCrystal(world);
        entityCrystal.setLocationAndAngles((double)x+0.5f,(double)y,(double)z+0.5f,0f,0f);
        world.spawnEntityInWorld(entityCrystal);
    }
}
