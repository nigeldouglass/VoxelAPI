package com.nigeldouglass.voxel.api.blocks;

public abstract class BlockBase implements IBlock {

	protected String unlocalizedName = "";
	protected String addonID = "Voxel";

	public BlockBase() {
		
	}
	
    public BlockBase(String unlocalName) {
        this.unlocalizedName = unlocalName;
    }
	
    public BlockBase(String addonID, String unlocalName) {
    	this.addonID = addonID;
        this.unlocalizedName = unlocalName;
    }
    
    public void setRegistryName(String addonID, String unlocalName) {
    	this.addonID = addonID;
        this.unlocalizedName = unlocalName;
    }

    public String getName() {
        return unlocalizedName;
    }

    public String getUnlocalizedName() {
        return String.format("%s.block.%s", String.format(addonID).toLowerCase(),String.format(unlocalizedName).toLowerCase());
    }

    public boolean solid() {
        return false;
    }

    public void onBlockPlace() {
    	
    }
    
    public void onBlockBreak() {
    	
    }
    
}
