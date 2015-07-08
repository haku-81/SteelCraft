package com.haku.steelcraft.items;

import com.haku.steelcraft.CreativeTabs.SCTabs;
import com.haku.steelcraft.lib.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemSword;

public class SwordSteel extends ItemSword{

    public String name = "swordSteel";

    public SwordSteel(ToolMaterial material) {
        super(material);
        setUnlocalizedName(Reference.MODID + "_" + name);
        setCreativeTab(SCTabs.weaponTab);
        GameRegistry.registerItem(this, name);
        setTextureName(Reference.MODID + ":" + name);
    }
}
