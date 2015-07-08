package com.haku.steelcraft.items;

import com.haku.steelcraft.CreativeTabs.SCTabs;
import com.haku.steelcraft.lib.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemPickaxe;

public class PickSteel extends ItemPickaxe{

    public String name = "pickSteel";

    public PickSteel(ToolMaterial material) {
        super(material);
        setUnlocalizedName(Reference.MODID + "_" + name);
        setCreativeTab(SCTabs.weaponTab);
        GameRegistry.registerItem(this, name);
        setTextureName(Reference.MODID + ":" + name);
    }
}