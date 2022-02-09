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
        registerModel(ModItems.POLVO_INVISIBLE);
        registerModel(ModItems.INVISIBLE_STICK);

        registerModel(ModItems.HACHA);
        registerModel(ModItems.AZADA);
        registerModel(ModItems.PICO);
        registerModel(ModItems.PALA);
        registerModel(ModItems.ESPADA);

        registerModel(ModItems.CASCO);
        registerModel(ModItems.PECHERA);
        registerModel(ModItems.PANTALONES);
        registerModel(ModItems.BOTAS);

        registerModel(Item.getItemFromBlock(ModBlocks.BLOQUE_INVISIBLE));
    }

    private static void registerModel(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

}
