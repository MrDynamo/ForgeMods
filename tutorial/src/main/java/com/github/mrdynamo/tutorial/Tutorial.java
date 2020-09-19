package com.github.mrdynamo.tutorial;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Tutorial.MODID)
public class Tutorial
{
    /*** Private class variables ***/
    private IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();

    /*** Public class variables ***/
    public static final String MODID = "tutorial";

    // Constructor
    public Tutorial() {
        // Register the setup method for modloading
        modBus.addListener(this::setup);
        // Register the doClientStuff method for modloading
        modBus.addListener(this::doClientStuff);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        // do something that can only be done on the client
    }

}
