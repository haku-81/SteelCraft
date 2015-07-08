package com.haku.steelcraft.items;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {

    public static Item itemSteel;
    public static Item hotSteel;
    public static Item linkSteel;
    public static Item axeSteel;
    public static Item swordSteel;
    public static Item pickSteel;
    public static Item hoeSteel;
    public static Item shovelSteel;

    public static final Item.ToolMaterial steelToolMaterial = EnumHelper.addToolMaterial("steelToolMaterial", 3, 3000, 12.0f, 6.0f, 8);
    public static final Item.ToolMaterial steelSwordMaterial = EnumHelper.addToolMaterial("steelSwordMaterial", 3, 3000, 12.0f, 18.0f, 9);

    public static void init(){

        itemSteel = new ItemSteel();
        hotSteel = new HotSteel();
        linkSteel = new LinkSteel();
        axeSteel = new AxeSteel(steelToolMaterial);
        swordSteel = new SwordSteel(steelSwordMaterial);
        pickSteel = new PickSteel(steelToolMaterial);
        hoeSteel = new HoeSteel(steelToolMaterial);
        shovelSteel = new ShovelSteel(steelToolMaterial);
    }
}