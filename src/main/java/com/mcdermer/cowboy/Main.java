package com.mcdermer.cowboy;

import com.mcdermer.cowboy.blocks.ModBlocks;
import com.mcdermer.cowboy.crafting.ModCrafting;
import com.mcdermer.cowboy.items.ModItems;
import com.mcdermer.cowboy.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

	@Mod(modid = Main.MODID, name = Main.NAME, version = Main.VERSION)
	public class Main 
	{
	    public static final String MODID = "cowboy";
	    public static final String VERSION = "1.0";
	    public static final String NAME = "Cowboy";
		
	    @EventHandler
	    public void preinit(FMLPreInitializationEvent event) 
	    {
	    	ModBlocks.init();
	    	ModItems.init();
	    }
	    
	    @EventHandler
	    public void init(FMLInitializationEvent event)
	    {
			ModCrafting.init();
	    }
	    
	    @EventHandler
	    public void postinit(FMLPostInitializationEvent event) 
	    {
	    	
	    }
	    
	    @SidedProxy(clientSide = "com.mcdermer.apothecary.proxy.ClientProxy", serverSide = "com.mcdermer.apothecary.proxy.CommonProxy")
	    public static CommonProxy proxy;
	}
