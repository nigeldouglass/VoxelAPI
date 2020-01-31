package com.nigeldouglass.voxel.api;

import com.nigeldouglass.voxel.api.blocks.DummyBlockRegistry;
import com.nigeldouglass.voxel.api.blocks.IBlockRegistry;

public class API {

	/*
	 * Calls internal methods. 
	 * Will only work properly during game
	 * @see IBlockRegistry
	 * @return get blockRegistry
	 */
	public static IBlockRegistry blockRegistry = new DummyBlockRegistry(); 
	
}
