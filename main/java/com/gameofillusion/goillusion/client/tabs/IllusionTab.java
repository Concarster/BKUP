package com.gameofillusion.goillusion.client.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class IllusionTab extends CreativeTabs{

	public IllusionTab(String label) {
		super("illusion_tab");
		this.setBackgroundImageName("items.png");
	}
	
	public ItemStack getTabIconItem(){
		return new ItemStack(Blocks.ANVIL);
		
	}


}