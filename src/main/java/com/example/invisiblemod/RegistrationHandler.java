package com.example.invisiblemod;

import com.example.invisiblemod.block.BlockInvisibleModBlock;
import com.example.invisiblemod.init.ModBlocks;
import com.example.invisiblemod.item.*;
import com.example.invisiblemod.materials.ExampleModMaterials;
import com.example.invisiblemod.util.RegistryUtil;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = InvisibleMod.MODID)
public class RegistrationHandler {

    @SubscribeEvent
    public static void registerItems(Register<Item> event) {
        final Item[] items = {

                RegistryUtil.setItemName(new Item(), "polvo_invisible", CreativeTabs.COMBAT),
                RegistryUtil.setItemName(new ItemInvisibleModInvisibleStick(), "invisible_stick", CreativeTabs.MISC),

                RegistryUtil.setItemName(new ItemInvisibleModAxe(ExampleModMaterials.TOOL_MATERIAL, 50.0F, -3.1F), "hacha", CreativeTabs.TOOLS),
                RegistryUtil.setItemName(new ItemInvisibleModHoe(ExampleModMaterials.TOOL_MATERIAL), "azada", CreativeTabs.TOOLS),
                RegistryUtil.setItemName(new ItemInvisibleModShovel(ExampleModMaterials.TOOL_MATERIAL), "pala", CreativeTabs.TOOLS),
                RegistryUtil.setItemName(new ItemInvisibleModPickaxe(ExampleModMaterials.TOOL_MATERIAL), "pico", CreativeTabs.TOOLS),
                RegistryUtil.setItemName(new ItemInvisibleModInvisibleSword(ExampleModMaterials.TOOL_MATERIAL), "invisible_sword", CreativeTabs.COMBAT),

                RegistryUtil.setItemName(new ItemInvisibleModArmor(ExampleModMaterials.ARMOR_MATERIAL, EntityEquipmentSlot.HEAD), "casco", CreativeTabs.COMBAT),
                RegistryUtil.setItemName(new ItemInvisibleModArmor(ExampleModMaterials.ARMOR_MATERIAL, EntityEquipmentSlot.CHEST), "pechera", CreativeTabs.COMBAT),
                RegistryUtil.setItemName(new ItemInvisibleModArmor(ExampleModMaterials.ARMOR_MATERIAL, EntityEquipmentSlot.LEGS), "pantalones", CreativeTabs.COMBAT),
                RegistryUtil.setItemName(new ItemInvisibleModArmor(ExampleModMaterials.ARMOR_MATERIAL, EntityEquipmentSlot.FEET), "botas", CreativeTabs.COMBAT)
        };

        final Item[] itemBlocks = {
                new ItemBlock(ModBlocks.BLOCK).setRegistryName(ModBlocks.BLOCK.getRegistryName())
        };

        event.getRegistry().registerAll(items);
        event.getRegistry().registerAll(itemBlocks);
    }

    @SubscribeEvent
    public static void registerBlocks(Register<Block> event) {
        final Block[] blocks = {
                RegistryUtil.setBlockName(new BlockInvisibleModBlock(Material.FIRE), "block").setCreativeTab(CreativeTabs.BUILDING_BLOCKS)
        };

        event.getRegistry().registerAll(blocks);
    }
}
