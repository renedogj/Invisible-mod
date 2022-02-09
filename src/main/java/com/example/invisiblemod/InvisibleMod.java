package com.example.invisiblemod;

import com.example.invisiblemod.world.gen.worldGen;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = InvisibleMod.MODID, name = InvisibleMod.NAME, version = InvisibleMod.VERSION, acceptedMinecraftVersions = InvisibleMod.MC_VERSION)
public class InvisibleMod {
    public static final String MODID = "invisiblemod";
    public static final String NAME = "Invisible Mod";
    public static final String VERSION = "1.0";
    public static final String MC_VERSION = "[1.12.2]";

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        GameRegistry.registerWorldGenerator(new worldGen(), 0);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
