package com.example.invisiblemod.client;

import com.example.invisiblemod.InvisibleMod;
import com.example.invisiblemod.init.ModBlocks;
import com.example.invisiblemod.init.ModItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(value = Side.CLIENT, modid = InvisibleMod.MODID)
public class ModelRegistrationHandler {

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        registerModel(ModItems.POLVO_INVISIBLE, 0);
        registerModel(ModItems.INVISIBLE_STICK,0);

        registerModel(ModItems.HACHA, 0);
        registerModel(ModItems.AZADA, 0);
        registerModel(ModItems.PICO,0);
        registerModel(ModItems.PALA,0);
        registerModel(ModItems.INVISIBLE_SWORD,0);

        registerModel(ModItems.CASCO, 0);
        registerModel(ModItems.PECHERA, 0);
        registerModel(ModItems.PANTALONES, 0);
        registerModel(ModItems.BOTAS, 0);

        registerModel(Item.getItemFromBlock(ModBlocks.BLOCK), 0);
    }

    private static void registerModel(Item item, int meta) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), "inventory"));

    }

}
