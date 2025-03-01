package com.lx862.jcm.mod.block;

import com.lx862.jcm.mod.block.entity.RVPIDSBlockEntity;
import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.BlockEntityExtension;
import org.mtr.mod.block.IBlock;

public class RVPIDSBlock extends JCMPIDSBlock {

    public RVPIDSBlock(BlockSettings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape2(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        VoxelShape vx1 = IBlock.getVoxelShapeByDirection(6, -3, 0, 10, 11, 12, IBlock.getStatePropertySafe(state, FACING));
        VoxelShape vx2 = IBlock.getVoxelShapeByDirection(7.5, 0, 8.5, 8.5, 16, 9.5, IBlock.getStatePropertySafe(state, FACING));
        return VoxelShapes.union(vx1, vx2);
    }

    @Override
    public BlockEntityExtension createBlockEntity(BlockPos blockPos, BlockState blockState) {
        return new RVPIDSBlockEntity(blockPos, blockState);
    }
}