package com.hidetzugu.NotTheEnd.creativetab;

import com.hidetzugu.NotTheEnd.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class CreativeTabNotTheEnd {

    public static final CreativeTabs NotTheEnd_Tab =new CreativeTabs(Reference.MOD_ID.toLowerCase()){
        @Override
        public Item getTabIconItem() {
            return Item.getItemFromBlock(Blocks.dragon_egg);
        }
    };

}
