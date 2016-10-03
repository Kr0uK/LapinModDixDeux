package com.kr0uk.lapinmod.items;

import com.kr0uk.lapinmod.LapinMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static net.minecraftforge.fml.common.registry.GameRegistry.register;


public class ModItems extends Item {

    protected String name;

    public ModItems(String name) {
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
    }
    public ModItems(){

    }

    public void registerItemModel() {

    }

    @Override
    public ModItems setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }




}
