package com.nigeldouglass.voxel.api.blocks;

import java.util.ArrayList;
import java.util.List;

public class DummyBlockRegistry implements IBlockRegistry {

    private List<BlockBase> registry = new ArrayList<BlockBase>();

    public <T> BlockBase registerBlock(Class<? extends BlockBase> blockClass) {
        return null;
    }

    @Override
    public List<BlockBase> getRegisteredBlocks() {
        return registry;
    }

    @Override
    public BlockBase findTile(String tile) {
        return null;
    }
}