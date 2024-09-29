package com.klattet.vanillo.common.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;


public class CustomBlock extends Block {
    public static final DirectionProperty HORIZONTAL_FACING = BlockStateProperties.HORIZONTAL_FACING;

    public CustomBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState());
    }

}
