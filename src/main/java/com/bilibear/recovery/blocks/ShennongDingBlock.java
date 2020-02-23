package com.bilibear.recovery.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;


public class ShennongDingBlock extends Block {
    public ShennongDingBlock(){
        super(Properties.create(Material.IRON)
                .harvestLevel(3)
                .sound(SoundType.ANVIL)
                .lightValue(15)
                .hardnessAndResistance(5f)
        );
        this.setRegistryName("shennongding_block");
    }

    @Override//更改渲染方式
    public BlockRenderLayer getRenderLayer()
    {
      return BlockRenderLayer.CUTOUT_MIPPED;
    }

    protected static final VoxelShape SHAPE = Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D);

    @Override//以上一句代码为坐标确定方块实体大小
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SHAPE;
    }
}
