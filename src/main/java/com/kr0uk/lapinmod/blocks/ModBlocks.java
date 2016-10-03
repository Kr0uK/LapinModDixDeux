package com.kr0uk.lapinmod.blocks;

import com.kr0uk.lapinmod.LapinMod;
import com.kr0uk.lapinmod.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBlock;

import static net.minecraftforge.fml.common.registry.GameRegistry.register;


public class ModBlocks extends Block {

    protected String name;

    public ModBlocks(Material material, String name) {
        super(material);

        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
    }


    @Override
    public ModBlocks setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }



}
