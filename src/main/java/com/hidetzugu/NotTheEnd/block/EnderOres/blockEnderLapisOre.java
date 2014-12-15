package com.hidetzugu.NotTheEnd.block.EnderOres;

import com.hidetzugu.NotTheEnd.block.blockNotTheEnd;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;

import java.util.Random;


public class blockEnderLapisOre extends blockNotTheEnd {

    public blockEnderLapisOre(){

        super();
        this.setBlockName(BLOCK_ID);
        this.setHardness(3.0f);
        this.setResistance(14.0f);
        this.setHarvestLevel("pickaxe",1);
        this.textureName="blockEnderLapisOre";
    }

    public static final String BLOCK_ID = "Ender_lapis_ore";

    @Override
    public Item getItemDropped(int metadata, Random random, int fortune){

        return Items.dye;
    }

    @Override
    public int damageDropped(int metadata){
        //this sets the metadata for the dropped item, lapis is a "dye" with metadata 4
        return 4;
    }

    @Override
    public int quantityDropped(int metadata, int fortune, Random random){
        //this keeps the lapis drop similar to vanilla
        int fortunebonus=random.nextInt(fortune+2)-1;
        if(fortunebonus<0)
            fortunebonus=0;

        return (4+random.nextInt(5))*(fortunebonus+1);
    }

    @Override
    public boolean canEntityDestroy(IBlockAccess world, int x, int y, int z, Entity entity){

        return !(entity instanceof EntityDragon);
    }
}
