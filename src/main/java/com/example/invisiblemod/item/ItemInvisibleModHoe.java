package com.example.invisiblemod.item;

import com.example.invisiblemod.InvisibleMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;

public class ItemInvisibleModHoe extends ItemHoe {

    public ItemInvisibleModHoe(Item.ToolMaterial material) {
        super(material);
        setRegistryName(InvisibleMod.MODID, "azada");
        setCreativeTab(CreativeTabs.TOOLS);
        setUnlocalizedName("azada");
    }

}