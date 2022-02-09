package com.example.invisiblemod.init;

import com.example.invisiblemod.InvisibleMod;
import com.example.invisiblemod.block.BloqueInvisible;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@ObjectHolder(InvisibleMod.MODID)
public class ModBlocks {
    public static final Block BLOQUE_INVISIBLE = new BloqueInvisible(Material.ROCK);
}
