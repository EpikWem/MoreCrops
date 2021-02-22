package com.epikwem.morecrops.init;

import net.minecraft.block.Block;
import net.minecraft.block.HayBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class ModBlocks {
    public static final Block
        BARLEY_BALE = new HayBlock(Block.Properties.create(Material.ORGANIC, MaterialColor.GREEN).hardnessAndResistance(0.5F).sound(SoundType.PLANT)),
        HOP_BALE = new HayBlock(Block.Properties.create(Material.ORGANIC, MaterialColor.GREEN).hardnessAndResistance(0.5F).sound(SoundType.PLANT)),
        OAT_BALE = new HayBlock(Block.Properties.create(Material.ORGANIC, MaterialColor.YELLOW).hardnessAndResistance(0.5F).sound(SoundType.PLANT)),
        RYE_BALE = new HayBlock(Block.Properties.create(Material.ORGANIC, MaterialColor.GREEN).hardnessAndResistance(0.5F).sound(SoundType.PLANT)),

        /*BARLEY_CROP = new CropsBlock( Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0F, 0.0F).sound(SoundType.CROP) ),
        HOP_CROP = new CropsBlock( Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0F, 0.0F).sound(SoundType.CROP) ),
        OAT_CROP = new CropsBlock( Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0F, 0.0F).sound(SoundType.CROP) ),
        RYE_CROP = new CropsBlock( Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0F, 0.0F).sound(SoundType.CROP) );*/

        BARLEY_CROP = new ModCropsBlock( "barley", Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0F, 0.0F).sound(SoundType.CROP) ),
        HOP_CROP = new ModCropsBlock( "hop", Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0F, 0.0F).sound(SoundType.CROP) ),
        OAT_CROP = new ModCropsBlock( "oat", Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0F, 0.0F).sound(SoundType.CROP) ),
        RYE_CROP = new ModCropsBlock( "rye", Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0F, 0.0F).sound(SoundType.CROP) );

        /*BARLEY_CROP = new ModCropsBlock( ModItems.BARLEY_SEEDS ),
        HOP_CROP = new ModCropsBlock(ModItems.HOP_SEEDS ),
        OAT_CROP = new ModCropsBlock( ModItems.OAT_SEEDS ),
        RYE_CROP = new ModCropsBlock(ModItems.RYE_SEEDS );*/


}
