package com.mcdermer.cowboy.proxy;

import com.mcdermer.cowboy.Main;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class CommonProxy {

	public void registerItemRenderer(Item par1item, int meta, String ID) {
		ModelLoader.setCustomModelResourceLocation(par1item, meta, new ModelResourceLocation(Main.MODID + ":" + ID, "inventory"));
	}
}
