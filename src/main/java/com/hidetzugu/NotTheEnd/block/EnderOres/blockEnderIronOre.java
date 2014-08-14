package com.hidetzugu.NotTheEnd.block.EnderOres;

import com.hidetzugu.NotTheEnd.block.blockNotTheEnd;

public class blockEnderIronOre extends blockNotTheEnd {

    public blockEnderIronOre(){

        super();
        this.setBlockName(BLOCK_ID);
        this.setHardness(3.0f);
        this.setResistance(14.0f);
        this.setHarvestLevel("pickaxe",1);
    }

    public static final String BLOCK_ID = "Ender_iron_ore";
}
