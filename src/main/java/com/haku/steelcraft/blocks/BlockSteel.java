package com.haku.steelcraft.blocks;

import com.haku.steelcraft.CreativeTabs.SCTabs;
import com.haku.steelcraft.lib.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockSteel extends Block {

    public String name = "blockSteel";

    public BlockSteel(Material material) {
        super(material);
        setBlockName(Reference.MODID + "_" + name);
        setCreativeTab(SCTabs.SC_TAB);
        GameRegistry.registerBlock(this, name);
        setBlockTextureName(Reference.MODID + ":" + name);
        setResistance(8000);
        setHardness(10);
        setHarvestLevel("pickaxe", 3);
    }
}
