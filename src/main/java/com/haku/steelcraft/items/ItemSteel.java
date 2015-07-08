package com.haku.steelcraft.items;

import com.haku.steelcraft.lib.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemSteel extends Item {

    public String name = "itemSteel";

    public ItemSteel(){
        setUnlocalizedName(Reference.MODID + "_" + name);
        setCreativeTab(CreativeTabs.tabAllSearch);
        GameRegistry.registerItem(this, name);
        setTextureName(Reference.MODID + ":" + name);
    }

}
