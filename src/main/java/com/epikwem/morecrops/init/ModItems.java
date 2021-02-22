package com.epikwem.morecrops.init;

import net.minecraft.item.BlockItem;
import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ModItems {
    public static Item
        HARD_BOILED_EGG = new Item( new Item.Properties().group(ItemGroup.FOOD).food(ModFoods.HARD_BOILED_EGG) ),

        BARLEY_BREAD = new Item( new Item.Properties().group(ItemGroup.FOOD).food(ModFoods.BARLEY_BREAD) ),
        OAT_BREAD = new Item( new Item.Properties().group(ItemGroup.FOOD).food(ModFoods.OAT_BREAD) ),
        HOP_BREAD = new Item( new Item.Properties().group(ItemGroup.FOOD).food(ModFoods.HOP_BREAD) ),
        RYE_BREAD = new Item( new Item.Properties().group(ItemGroup.FOOD).food(ModFoods.RYE_BREAD) ),
        HEARTY_BREAD = new Item( new Item.Properties().group(ItemGroup.FOOD).food(ModFoods.HEARTY_BREAD) ),
        WHOLEMEAL_BREAD = new Item( new Item.Properties().group(ItemGroup.FOOD).food(ModFoods.WHOLEMEAL_BREAD) ),

        BARLEY = new Item( new Item.Properties().group(ItemGroup.MATERIALS) ),
        OAT = new Item( new Item.Properties().group(ItemGroup.MATERIALS) ),
        HOP = new Item( new Item.Properties().group(ItemGroup.MATERIALS) ),
        RYE = new Item( new Item.Properties().group(ItemGroup.MATERIALS) ),

        BARLEY_SEEDS = new BlockNamedItem( ModBlocks.BARLEY_CROP, new Item.Properties().group(ItemGroup.MATERIALS) ),
        OAT_SEEDS = new BlockNamedItem( ModBlocks.OAT_CROP, new Item.Properties().group(ItemGroup.MATERIALS) ),
        HOP_SEEDS = new BlockNamedItem( ModBlocks.HOP_CROP, new Item.Properties().group(ItemGroup.MATERIALS) ),
        RYE_SEEDS = new BlockNamedItem( ModBlocks.RYE_CROP, new Item.Properties().group(ItemGroup.MATERIALS) ),

        BARLEY_BALE = new BlockItem( ModBlocks.BARLEY_BALE, new Item.Properties().group(ItemGroup.MATERIALS) ),
        OAT_BALE = new BlockItem( ModBlocks.OAT_BALE, new Item.Properties().group(ItemGroup.MATERIALS) ),
        HOP_BALE = new BlockItem( ModBlocks.HOP_BALE, new Item.Properties().group(ItemGroup.MATERIALS) ),
        RYE_BALE = new BlockItem( ModBlocks.RYE_BALE, new Item.Properties().group(ItemGroup.MATERIALS) ),

        WHEAT_BREAD_DOUGH = new Item( new Item.Properties().group(ItemGroup.FOOD)),
        BARLEY_BREAD_DOUGH = new Item( new Item.Properties().group(ItemGroup.FOOD)),
        OAT_BREAD_DOUGH = new Item( new Item.Properties().group(ItemGroup.FOOD)),
        HOP_BREAD_DOUGH = new Item( new Item.Properties().group(ItemGroup.FOOD)),
        RYE_BREAD_DOUGH = new Item( new Item.Properties().group(ItemGroup.FOOD)),
        HEARTY_BREAD_DOUGH = new Item( new Item.Properties().group(ItemGroup.FOOD)),
        WHOLEMEAL_BREAD_DOUGH = new Item( new Item.Properties().group(ItemGroup.FOOD));
}
