package com.haku.steelcraft;

import com.haku.steelcraft.blocks.ModBlocks;
import com.haku.steelcraft.items.ModItems;
import com.haku.steelcraft.lib.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import static cpw.mods.fml.common.Mod.EventHandler;

@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.VERSION)

public class steelcraft {

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModItems.init();
        ModBlocks.init();

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}