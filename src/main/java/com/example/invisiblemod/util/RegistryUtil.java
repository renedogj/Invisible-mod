package com.example.invisiblemod.util;

import com.example.invisiblemod.InvisibleMod;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class RegistryUtil {

    public static Item setItemName(final Item item, final String name, CreativeTabs creativeTabs) {
        item.setRegistryName(InvisibleMod.MODID, name).setCreativeTab(creativeTabs);
        item.setUnlocalizedName(name);
        return item;
    }

    public static Block setBlockName(final Block block, final String name) {
        block.setRegistryName(InvisibleMod.MODID, name);
        block.setUnlocalizedName(name);
        return block;
    }
}
