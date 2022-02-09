package com.example.invisiblemod.item;

import com.example.invisiblemod.InvisibleMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemInvisibleModPolvo  extends Item {
    public ItemInvisibleModPolvo(){
        super();
        setRegistryName(InvisibleMod.MODID, "polvoinvisible");
        setCreativeTab(CreativeTabs.MISC);
        setUnlocalizedName("polvoinvisible");
    }
}
