package com.example.invisiblemod.item;

import com.example.invisiblemod.InvisibleMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ItemInvisibleModInvisibleSword extends ItemSword {
    public ItemInvisibleModInvisibleSword(ToolMaterial material) {
        super(material);
        setRegistryName(InvisibleMod.MODID, "espada");
        setCreativeTab(CreativeTabs.COMBAT);
        setUnlocalizedName("espada");
    }
}
