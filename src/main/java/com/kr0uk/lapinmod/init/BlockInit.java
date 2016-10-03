package com.kr0uk.lapinmod.init;

import com.kr0uk.lapinmod.blocks.ModBlocks;
import com.kr0uk.lapinmod.blocks.TestBlock;
import com.kr0uk.lapinmod.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraft.world.biome.BiomeCache;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static net.minecraftforge.fml.common.registry.GameRegistry.register;

/**
 * Created by user on 30/09/2016.
 */
public class BlockInit {
    public static void init() {
        TestBlock testBlock = register(new TestBlock("testBlock").setCreativeTab(CreativeTabs.MATERIALS));
    }
    private static <T extends Block> T register(T block, ItemBlock itemBlock) {
        GameRegistry.register(block);
        GameRegistry.register(itemBlock);

        return block;
    }

    private static <T extends Block> T register(T block) {
        ItemBlock itemBlock = new ItemBlock(block);
        itemBlock.setRegistryName(block.getRegistryName());
        return register(block, itemBlock);
    }
}
