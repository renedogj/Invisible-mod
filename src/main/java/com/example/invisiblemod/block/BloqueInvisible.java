package com.example.invisiblemod.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BloqueInvisible extends Block {
    public BloqueInvisible(Material materialIn) {
        super(materialIn);
        setRegistryName("bloqueinvisible");
        setUnlocalizedName("bloqueinvisible");
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setSoundType(SoundType.STONE);
        setHardness(2f);
        //setBlockUnbreakable();
        setLightLevel(1);
        setLightOpacity(0);
    }
}
