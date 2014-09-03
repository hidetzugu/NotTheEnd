package com.hidetzugu.NotTheEnd;

import com.hidetzugu.NotTheEnd.Handlers.ConfigurationHandler;
import com.hidetzugu.NotTheEnd.WorldGen.WorldGenRegistry;
import com.hidetzugu.NotTheEnd.init.ModBlocks;
import com.hidetzugu.NotTheEnd.init.ModItems;
import com.hidetzugu.NotTheEnd.init.ModRecipes;
import com.hidetzugu.NotTheEnd.init.OreRegistration;
import com.hidetzugu.NotTheEnd.proxy.Iproxy;
import com.hidetzugu.NotTheEnd.reference.Reference;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = Reference.MOD_ID,name = Reference.MOD_NAME,version = Reference.MOD_VERSION,guiFactory = Reference.GUI_FACTORY_CLASS)
public class NotTheEnd {

    @Mod.Instance(Reference.MOD_ID)
    public static NotTheEnd instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static Iproxy proxy;

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event){

        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        ModItems.init();
        ModBlocks.init();

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){

        OreRegistration.RegisterOres();
        ModRecipes.RegisterSmelting();
        WorldGenRegistry.RegisterWorldGen();



    }

    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event){

    }
}
