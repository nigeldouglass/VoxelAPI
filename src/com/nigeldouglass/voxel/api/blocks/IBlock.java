package com.nigeldouglass.voxel.api.blocks;

public interface IBlock {

	String getName();
	
	String getUnlocalizedName();

    boolean solid();
    
    void onBlockPlace();
    
    void onBlockBreak();
}
