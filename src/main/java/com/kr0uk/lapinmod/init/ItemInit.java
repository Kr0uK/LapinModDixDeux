package com.kr0uk.lapinmod.init;

import com.kr0uk.lapinmod.items.ModItems;
import net.minecraft.creativetab.CreativeTabs;

import static net.minecraftforge.fml.common.registry.GameRegistry.register;

/**
 * Created by user on 30/09/2016.
 */
public class ItemInit {
    public static void init() {
        ModItems testItem = register(new ModItems("testItem").setCreativeTab(CreativeTabs.MATERIALS));
    }
}
