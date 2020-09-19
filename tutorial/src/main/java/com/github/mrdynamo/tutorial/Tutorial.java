package com.github.mrdynamo.tutorial;

import com.github.mrdynamo.tutorial.util.RegistryHandler;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Tutorial.MODID)
public class Tutorial
{
    /*** Private class variables ***/
    private static final Logger LOGGER = LogManager.getLogger();

    /*** Public class variables ***/
    public static final String MODID = "tutorial";
    public static IEventBus modBus;

    // Constructor
    public Tutorial() {

        // Instantiate modBus
        modBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register methods for modloading
        modBus.addListener(this::setup);
        modBus.addListener(this::doClientStuff);

        // Init RegistryHandler
        RegistryHandler.init();

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

    }

    private void setup(final FMLCommonSetupEvent event) {
        // some preinit code
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        // do something that can only be done on the client
    }

    // Custom ItemGroup TAB in creative
    public static final ItemGroup TAB = new ItemGroup("tutorialTab") {
        @Override
        public ItemStack createIcon() { return new ItemStack(RegistryHandler.RUBY.get()); }
    };

}
