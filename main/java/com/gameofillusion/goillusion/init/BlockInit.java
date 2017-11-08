package com.gameofillusion.goillusion.init;

import java.util.ArrayList;
import java.util.List;

import com.gameofillusion.goillusion.objects.block.BlockBase;
import com.gameofillusion.goillusion.objects.block.BlockSimple;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block BLOCK_BASE = new BlockBase("block_base", Material.IRON);
	public static final Block BLOCK_SIMPLE = new BlockSimple("block_simple", Material.ROCK);
	public static final Block BLOCK_SIMPLE2 = new BlockSimple("block_simple2", Material.ROCK);
	
}
