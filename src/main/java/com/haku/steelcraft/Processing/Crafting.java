package com.haku.steelcraft.Processing;

import com.haku.steelcraft.items.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Crafting {
    public static void init(){

        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemSteel), ModItems.hotSteel, Items.water_bucket);
    }
}