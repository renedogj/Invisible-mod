package com.example.invisiblemod.materials;

import com.example.invisiblemod.InvisibleMod;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ExampleModMaterials {

    public static final ToolMaterial TOOL_MATERIAL = EnumHelper.addToolMaterial(InvisibleMod.MODID + ":" + "tool", 2, 1000, 8.0F, 6F, 15);

    public static final ArmorMaterial ARMOR_MATERIAL = EnumHelper.addArmorMaterial(InvisibleMod.MODID + ":" + "armor", InvisibleMod.MODID + ":", 20, new int[]{10, 10, 10, 10}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0);

}
