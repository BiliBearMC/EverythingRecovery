package com.bilibear.recovery.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;

public class PanGuBlock extends Block {
    public PanGuBlock(){
        super(Properties.create(Material.IRON)
                .harvestLevel(3)
                .sound(SoundType.STONE)
                .lightValue(15)
                .hardnessAndResistance(5f)
        );
        this.setRegistryName("pangu_block");
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(BlockStateProperties.FACING,BlockStateProperties.POWERED);
    }
}
