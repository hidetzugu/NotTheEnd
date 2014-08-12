package com.hidetzugu.NotTheEnd.init;

import com.hidetzugu.NotTheEnd.item.itemBlueEnderMold;
import com.hidetzugu.NotTheEnd.item.itemGreenEnderMold;
import com.hidetzugu.NotTheEnd.item.itemNotTheEnd;
import com.hidetzugu.NotTheEnd.item.itemRedEnderMold;
import com.hidetzugu.NotTheEnd.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {

    public static final itemNotTheEnd green_Ender_mold = new itemGreenEnderMold();
    public static final itemNotTheEnd red_Ender_mold = new itemRedEnderMold();
    public static final itemNotTheEnd blue_Ender_mold = new itemBlueEnderMold();

    public static void init(){

        GameRegistry.registerItem(green_Ender_mold, itemGreenEnderMold.ITEM_ID);
        GameRegistry.registerItem(red_Ender_mold, itemRedEnderMold.ITEM_ID);
        GameRegistry.registerItem(blue_Ender_mold, itemBlueEnderMold.ITEM_ID);

    }
}
