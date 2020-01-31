package com.nigeldouglass.example;

import com.nigeldouglass.voxel.api.API;
import com.nigeldouglass.voxel.api.Addon;

@Addon(addonid = "nigel.example", name = "Example Addon")
public class ExampleAddon {

	public void preInit() {
		API.blockRegistry.registerBlock(TestBlock.class);
	}
	
}
