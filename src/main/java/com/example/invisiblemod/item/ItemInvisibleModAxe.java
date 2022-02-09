package com.example.invisiblemod.item;

import com.example.invisiblemod.InvisibleMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = InvisibleMod.MODID)
public class ItemInvisibleModAxe extends ItemAxe {

    public ItemInvisibleModAxe(ToolMaterial material, float damage, float speed) {
        super(material, damage, speed);
        setRegistryName(InvisibleMod.MODID, "hacha");
        setCreativeTab(CreativeTabs.TOOLS);
        setUnlocalizedName("hacha");
    }

}