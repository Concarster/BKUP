package com.gameofillusion.goillusion.init;

import java.util.ArrayList;
import java.util.List;

import com.gameofillusion.goillusion.objects.block.item.ItemSimple;
import com.gameofillusion.goillusion.objects.item.ItemBase;

import net.minecraft.item.Item;

public class ItemInit {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	
	public static final Item ITEM_SIMPLE = new ItemSimple("item_simple");
	public static final Item ITEM_BASE = new ItemBase("item_base");

}
