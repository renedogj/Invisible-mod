package com.example.invisiblemod.item;

import com.example.invisiblemod.InvisibleMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemInvisibleModArmor extends ItemArmor {
    public ItemInvisibleModArmor(ArmorMaterial materialIn, EntityEquipmentSlot equipmentSlotIn, String name) {
        super(materialIn, 0, equipmentSlotIn);
        setRegistryName(InvisibleMod.MODID, name);
        setCreativeTab(CreativeTabs.COMBAT);
        setUnlocalizedName(name);
    }
}
