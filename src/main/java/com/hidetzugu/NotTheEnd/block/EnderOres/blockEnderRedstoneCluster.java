package com.hidetzugu.NotTheEnd.block.EnderOres;

import com.hidetzugu.NotTheEnd.block.blockNotTheEnd;

public class blockEnderRedstoneCluster extends blockNotTheEnd{

    public blockEnderRedstoneCluster(){

        super();
        this.setBlockName(BLOCK_ID);
        this.setHardness(3.0f);
        this.setResistance(14.0f);
        this.setHarvestLevel("pickaxe",2);
    }

    public static final String BLOCK_ID = "Ender_redstone_cluster";
}
