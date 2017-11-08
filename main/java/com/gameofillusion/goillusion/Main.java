package com.gameofillusion.goillusion;

import com.gameofillusion.goillusion.client.CommonProxy;
import com.gameofillusion.goillusion.client.tabs.IllusionTab;
import com.gameofillusion.goillusion.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

//@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION, dependencies = Reference.DEPENDENCIES, guiFactory = Reference.GUI_FACTORY, clientSideOnly = true)
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION, dependencies = Reference.DEPENDENCIES)

public class Main 
{
	
	public static final CreativeTabs ILLUSION_TAB = new IllusionTab("illusion_tab");
	
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		
		
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		
		
	}
 
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		
		
	}
	
}

