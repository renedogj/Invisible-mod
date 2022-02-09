package com.example.invisiblemod.item;

import com.example.invisiblemod.InvisibleMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class ItemInvisibleModPickaxe extends ItemPickaxe {
    public ItemInvisibleModPickaxe(ToolMaterial material) {
        super(material);
        setRegistryName(InvisibleMod.MODID, "pico");
        setCreativeTab(CreativeTabs.TOOLS);
        setUnlocalizedName("pico");
    }
}
