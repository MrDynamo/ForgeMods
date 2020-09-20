package com.github.mrdynamo.tutorial.items;

import com.github.mrdynamo.tutorial.Tutorial;
import net.minecraft.item.Item;

public class ItemBase extends Item {

    public ItemBase() {
        super(new Item.Properties().group(Tutorial.TAB));
    }

}
