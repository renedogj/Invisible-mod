package com.example.invisiblemod.init;

import com.example.invisiblemod.InvisibleMod;
import com.example.invisiblemod.item.*;
import com.example.invisiblemod.materials.MaterialInvisible;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@ObjectHolder(InvisibleMod.MODID)
public class ModItems {

    public static final Item POLVO_INVISIBLE = new ItemInvisibleModPolvo();
    public static final Item INVISIBLE_STICK = new ItemInvisibleModInvisibleStick();

    public static final Item HACHA = new ItemInvisibleModAxe(MaterialInvisible.TOOL_MATERIAL, 50.0F, -3.1F);
    public static final Item AZADA = new ItemInvisibleModHoe(MaterialInvisible.TOOL_MATERIAL);
    public static final Item PALA = new ItemInvisibleModShovel(MaterialInvisible.TOOL_MATERIAL);
    public static final Item PICO = new ItemInvisibleModPickaxe(MaterialInvisible.TOOL_MATERIAL);
    public static final Item ESPADA = new ItemInvisibleModInvisibleSword(MaterialInvisible.TOOL_MATERIAL);

    public static final Item CASCO = new ItemInvisibleModArmor(MaterialInvisible.ARMOR_MATERIAL, EntityEquipmentSlot.HEAD, "casco");
    public static final Item PECHERA = new ItemInvisibleModArmor(MaterialInvisible.ARMOR_MATERIAL, EntityEquipmentSlot.CHEST, "pechera");
    public static final Item PANTALONES = new ItemInvisibleModArmor(MaterialInvisible.ARMOR_MATERIAL, EntityEquipmentSlot.LEGS, "pantalones");
    public static final Item BOTAS = new ItemInvisibleModArmor(MaterialInvisible.ARMOR_MATERIAL, EntityEquipmentSlot.FEET, "botas");

    public static final Item BLOQUE_INVISIBLE = new ItemBloqueInvisible();

}
