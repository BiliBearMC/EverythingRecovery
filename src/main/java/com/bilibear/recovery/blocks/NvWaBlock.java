package com.bilibear.recovery.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class NvWaBlock extends Block {
    public NvWaBlock(){
        super(Properties.create(Material.IRON)
                .harvestLevel(3)
                .sound(SoundType.STONE)
                .lightValue(15)
                .hardnessAndResistance(5f)
        );
        this.setRegistryName("nvwa_block");
    }
}