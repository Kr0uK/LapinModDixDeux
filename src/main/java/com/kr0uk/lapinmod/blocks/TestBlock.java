package com.kr0uk.lapinmod.blocks;

import com.sun.org.apache.xpath.internal.operations.Mod;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by user on 29/09/2016.
 */
public class TestBlock extends ModBlocks {

    public TestBlock(String name) {
        super(Material.ROCK, name);
        setHardness(3f);
        setResistance(5f);
    }

    @Override
    public TestBlock setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }

}
