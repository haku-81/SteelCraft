package com.haku.steelcraft.items;

import com.haku.steelcraft.CreativeTabs.SCTabs;
import com.haku.steelcraft.lib.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class HotSteel extends Item {

    public String name = "hotSteel";

    public HotSteel(){
        setUnlocalizedName(Reference.MODID + "_" + name);
        setCreativeTab(SCTabs.SC_TAB);
        GameRegistry.registerItem(this, name);
        setTextureName(Reference.MODID + ":" + name);
    }
}
