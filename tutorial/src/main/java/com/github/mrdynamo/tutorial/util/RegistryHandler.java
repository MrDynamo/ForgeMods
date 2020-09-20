package com.github.mrdynamo.tutorial.util;

import com.github.mrdynamo.tutorial.Tutorial;
import com.github.mrdynamo.tutorial.blocks.BlockItemBase;
import com.github.mrdynamo.tutorial.blocks.RubyBlock;
import com.github.mrdynamo.tutorial.blocks.RubyOre;
import com.github.mrdynamo.tutorial.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    /*** Registers ***/
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Tutorial.MODID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Tutorial.MODID);

    // Init mod assets-
    public static void init() {
        ITEMS.register(Tutorial.modBus);
        BLOCKS.register(Tutorial.modBus);
    }

    /*** Items ***/
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);

    /*** Blocks ***/
    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", RubyBlock::new);
    public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", RubyOre::new);

    /*** Block Items ***/
    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block", () -> new BlockItemBase(RUBY_BLOCK.get()));
    public static final RegistryObject<Item> RUBY_ORE_ITEM = ITEMS.register("ruby_block", () -> new BlockItemBase(RUBY_ORE.get()));

}
