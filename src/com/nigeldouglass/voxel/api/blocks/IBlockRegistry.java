package com.nigeldouglass.voxel.api.blocks;

import java.util.Collection;

public interface IBlockRegistry {

	<T> BlockBase registerBlock(Class<? extends BlockBase> block);

    <T> Collection<BlockBase> getRegisteredBlocks();

    <T> BlockBase findTile(String block);

}
