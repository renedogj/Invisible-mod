package com.example.invisiblemod;

import com.example.invisiblemod.init.ModBlocks;
import com.example.invisiblemod.init.ModItems;
import net.minecraft.block.Block;
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
                ModItems.POLVO_INVISIBLE,
                ModItems.INVISIBLE_STICK,

                ModItems.HACHA,
                ModItems.AZADA,
                ModItems.PALA,
                ModItems.PICO,
                ModItems.ESPADA,

                ModItems.CASCO,
                ModItems.PECHERA,
                ModItems.PANTALONES,
                ModItems.BOTAS
        };

        final Item[] itemBlocks = {
                ModItems.BLOQUE_INVISIBLE
        };

        event.getRegistry().registerAll(items);
        event.getRegistry().registerAll(itemBlocks);
    }

    @SubscribeEvent
    public static void registerBlocks(Register<Block> event) {
        final Block[] blocks = {
                ModBlocks.BLOQUE_INVISIBLE
        };

        event.getRegistry().registerAll(blocks);
    }
}
