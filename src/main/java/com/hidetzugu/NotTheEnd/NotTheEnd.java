package com.hidetzugu.NotTheEnd;

import com.hidetzugu.NotTheEnd.proxy.Iproxy;
import com.hidetzugu.NotTheEnd.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID,name = Reference.MOD_NAME,version = Reference.MOD_VERSION)
public class NotTheEnd {

    @Mod.Instance(Reference.MOD_ID)
    public static NotTheEnd instance;

    @SidedProxy(clientSide = "com.hidetzugu.NotTheEnd.proxy.ClientProxy", serverSide = "com.hidetzugu.NotTheEnd.proxy.ServerProxy")
    public static Iproxy proxy;

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event){

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){

    }

    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event){

    }

}
