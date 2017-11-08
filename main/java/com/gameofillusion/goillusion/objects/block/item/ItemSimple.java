package com.gameofillusion.goillusion.objects.block.item;

import com.gameofillusion.goillusion.Main;
import com.gameofillusion.goillusion.init.ItemInit;
import com.gameofillusion.goillusion.util.interfaces.IHasModel;

import net.minecraft.item.Item;

public class ItemSimple extends Item implements IHasModel
{
	public ItemSimple(String name) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.ILLUSION_TAB);
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
