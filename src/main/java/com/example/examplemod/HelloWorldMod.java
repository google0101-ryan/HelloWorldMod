package com.example.examplemod;

import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = HelloWorldMod.MODID, name = HelloWorldMod.NAME, version = HelloWorldMod.VERSION)
public class HelloWorldMod {

    public static final String MODID = "helloworldmod";
    public static final String NAME = "Hello World Mod";
    public static final String VERSION = "1.0.0";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
    }

    @EventHandler
  public void init(FMLInitializationEvent event)
  {
      logger.info("Mod initlialised :" + NAME);
  }
}