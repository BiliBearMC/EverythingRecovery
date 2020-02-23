package com.bilibear.recovery.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class HundunBlock extends Block {
    public HundunBlock(){
        super(Properties.create(Material.IRON)
                .harvestLevel(3)
                .sound(SoundType.STONE)
                .lightValue(7)
                .hardnessAndResistance(5f)
        );
        this.setRegistryName("hundun_block");
    }
}