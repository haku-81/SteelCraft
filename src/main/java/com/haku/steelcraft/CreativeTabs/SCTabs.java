package com.haku.steelcraft.CreativeTabs;

import com.haku.steelcraft.items.ModItems;
import com.haku.steelcraft.lib.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SCTabs {

    public static final CreativeTabs SC_TAB = new CreativeTabs(Reference.MODID) {
        @Override
        public Item getTabIconItem() {
            return ModItems.itemSteel;
        }

        @Override
        public String getTranslatedTabLabel() {
            return "Steel Craft Materials";
        }
    };

    public static final CreativeTabs weaponTab = new CreativeTabs(Reference.MODID) {
        @Override
        public Item getTabIconItem() {
            return ModItems.axeSteel;
        }

        @Override
        public String getTranslatedTabLabel() {
            return "Steel Tools";
        }
    };
}
