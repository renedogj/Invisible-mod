package com.example.invisiblemod.materials;

import com.example.invisiblemod.InvisibleMod;
import com.sun.javafx.sg.prism.NGPhongMaterial;
import javafx.scene.paint.Material;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class MaterialInvisible {

    public static final ToolMaterial TOOL_MATERIAL = EnumHelper.addToolMaterial(InvisibleMod.MODID + ":" + "tool", 2, 1500, 9.0F, 8F, 15);

    public static final ArmorMaterial ARMOR_MATERIAL = EnumHelper.addArmorMaterial(InvisibleMod.MODID + ":" + "armor", InvisibleMod.MODID + ":", 20, new int[]{15, 15, 15, 15}, 15, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0);
}
