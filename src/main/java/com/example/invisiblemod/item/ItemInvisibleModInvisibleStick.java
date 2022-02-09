package com.example.invisiblemod.item;

import com.example.invisiblemod.InvisibleMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemInvisibleModInvisibleStick extends Item {
    public ItemInvisibleModInvisibleStick(){
        setRegistryName(InvisibleMod.MODID, "paloInvisible");
        setCreativeTab(CreativeTabs.TOOLS);
        setUnlocalizedName("paloInvisible");
    }
    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        playerIn.setInvisible(!playerIn.isInvisible());
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}
