package com.hidetzugu.NotTheEnd.block.EnderOres;

import com.hidetzugu.NotTheEnd.block.blockNotTheEnd;

public class blockEnderCoalCluster extends blockNotTheEnd{

    public blockEnderCoalCluster(){
        super();
        this.setBlockName(BLOCK_ID);
        this.setHardness(3.0f);
        this.setResistance(14.0f);
    }

    public static final String BLOCK_ID = "Ender_coal_cluster";
}
