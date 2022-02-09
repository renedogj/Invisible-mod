package com.example.invisiblemod.item;

import com.example.invisiblemod.InvisibleMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class ItemInvisibleModShovel extends ItemSpade {
    public ItemInvisibleModShovel(ToolMaterial material) {
        super(material);
        setRegistryName(InvisibleMod.MODID, "pala");
        setCreativeTab(CreativeTabs.TOOLS);
        setUnlocalizedName("pala");
    }
}
