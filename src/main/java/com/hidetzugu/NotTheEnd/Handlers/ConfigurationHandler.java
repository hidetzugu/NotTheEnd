package com.hidetzugu.NotTheEnd.Handlers;

import com.hidetzugu.NotTheEnd.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler {

    public static Configuration configuration;
    public static boolean configExample = false;

    public static void init(File configFile){
        //create the Configuration object from the config file
        if(configuration == null){
            configuration = new Configuration(configFile);
            loadconfiguration();
        }
    }

    @SubscribeEvent
    public void OnConfigChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event){
        //ConfigChangedEvent.OnConfigChangedEvent fires when the done button is pressed in bspkrs' config GUI

        if(event.modID.equalsIgnoreCase(Reference.MOD_ID)){
            loadconfiguration();
        }

    }

    private static void loadconfiguration(){
        //loads the values from the config file (creating them with the default value if they are not there)
        configExample=configuration.getBoolean(Configuration.CATEGORY_GENERAL, "ConfigExample", true, "just an Example");
        //saves the file if it was changed
        if(configuration.hasChanged()){
            configuration.save();
        }
    }

}

