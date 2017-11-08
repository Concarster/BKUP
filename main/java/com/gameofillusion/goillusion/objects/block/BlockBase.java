package com.gameofillusion.goillusion.objects.block;

import com.gameofillusion.goillusion.Main;
import com.gameofillusion.goillusion.init.BlockInit;
import com.gameofillusion.goillusion.init.ItemInit;
import com.gameofillusion.goillusion.util.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel
{
	public BlockBase(String name, Material material) 
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(2F);
		setHarvestLevel("pickaxe", 2);
		setSoundType(SoundType.STONE);
		setCreativeTab(Main.ILLUSION_TAB);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
