package com.github.mrdynamo.tutorial.util;

import com.github.mrdynamo.tutorial.Tutorial;
import com.github.mrdynamo.tutorial.blocks.BlockItemBase;
import com.github.mrdynamo.tutorial.blocks.RubyBlock;
import com.github.mrdynamo.tutorial.blocks.RubyOre;
import com.github.mrdynamo.tutorial.items.ItemBase;
import com.github.mrdynamo.tutorial.tools.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.item.*;
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

    /*** Tools ***/
    // Damage: 1 + baseDamage(5) + addedDamage(3)
    // Speed: 4 - attSpd (Cooldown)

    public static final RegistryObject<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword", () -> new SwordItem(ModItemTier.RUBY, 3, -0.5F, new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<PickaxeItem> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () -> new PickaxeItem(ModItemTier.RUBY, 3, -0.5F, new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<ShovelItem> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () -> new ShovelItem(ModItemTier.RUBY, 3, -1.4F, new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<AxeItem> RUBY_AXE = ITEMS.register("ruby_axe", () -> new AxeItem(ModItemTier.RUBY, 3, -1.6F, new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<HoeItem> RUBY_HOE = ITEMS.register("ruby_hoe", () -> new HoeItem(ModItemTier.RUBY, -0.5F, new Item.Properties().group(Tutorial.TAB)));

    /*** Blocks ***/
    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", RubyBlock::new);
    public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", RubyOre::new);

    /*** Block Items ***/
    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block", () -> new BlockItemBase(RUBY_BLOCK.get()));
    public static final RegistryObject<Item> RUBY_ORE_ITEM = ITEMS.register("ruby_ore", () -> new BlockItemBase(RUBY_ORE.get()));

}
