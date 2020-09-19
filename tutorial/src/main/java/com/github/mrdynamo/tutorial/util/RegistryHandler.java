package com.github.mrdynamo.tutorial.util;

import com.github.mrdynamo.tutorial.Tutorial;
import com.github.mrdynamo.tutorial.items.ItemBase;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    // Get Mod Bus
    //private final IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();

    /*** Registers ***/
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Tutorial.MODID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        //ITEMS.register(Tutorial.modBus);
    }

    /*** Items ***/
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);

}
