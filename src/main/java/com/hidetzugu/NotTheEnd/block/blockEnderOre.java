package com.hidetzugu.NotTheEnd.block;

public class blockEnderOre extends blockNotTheEnd{
    /*
     * Generic class for all Ender Ores
     */

    public static final String[] BLOCK_IDS = {"Ender_coal_ore","Ender_coal_cluster","Ender_diamond_ore","Ender_diamond_cluster"};

    public blockEnderOre(String ID,String texture){

        this.textureName=texture;
        this.setHardness(3.0f);
        this.setResistance(14.0f);
    }


}
