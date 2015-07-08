package com.haku.steelcraft.blocks;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

    public static Block blockSteel;

    public static void init(){
        blockSteel = new BlockSteel(Material.rock);
    }
}
