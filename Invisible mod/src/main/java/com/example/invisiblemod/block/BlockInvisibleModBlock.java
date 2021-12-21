package com.example.invisiblemod.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockInvisibleModBlock extends Block {
    public BlockInvisibleModBlock(Material materialIn) {
        super(materialIn);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setSoundType(SoundType.STONE);
        setBlockUnbreakable();
        setLightLevel(1);
        setLightOpacity(0);
    }
}
