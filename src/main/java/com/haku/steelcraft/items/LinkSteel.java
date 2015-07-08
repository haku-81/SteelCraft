package com.haku.steelcraft.items;

import com.haku.steelcraft.lib.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class LinkSteel extends Item {

    public String name = "linkSteel";
    public LinkSteel(){
        setUnlocalizedName(Reference.MODID + "_" + name);
        GameRegistry.registerItem(this, name);
    }
}
