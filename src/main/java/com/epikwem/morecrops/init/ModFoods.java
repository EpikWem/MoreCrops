package com.epikwem.morecrops.init;

import net.minecraft.item.Food;

public class ModFoods {
    public static final Food
            HARD_BOILED_EGG = (new Food.Builder()).hunger(3).saturation(1.2F).build(),
            BARLEY_BREAD = (new Food.Builder()).hunger(5).saturation(0.6F).build(),
            OAT_BREAD = (new Food.Builder()).hunger(4).saturation(0.8F).build(),
            HOP_BREAD = (new Food.Builder()).hunger(6).saturation(0.4F).build(),
            RYE_BREAD = (new Food.Builder()).hunger(5).saturation(0.6F).build(),
            HEARTY_BREAD = (new Food.Builder()).hunger(7).saturation(1.2F).build(),
            WHOLEMEAL_BREAD = (new Food.Builder()).hunger(9).saturation(1.8F).build();
}
