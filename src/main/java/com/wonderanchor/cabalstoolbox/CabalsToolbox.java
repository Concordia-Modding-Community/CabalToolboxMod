package com.wonderanchor.cabalstoolbox;

import com.wonderanchor.cabalstoolbox.init.BlockInit;
import com.wonderanchor.cabalstoolbox.init.ItemInit;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("cabalstoolbox")
public class CabalsToolbox {

	public static final String MOD_ID = "cabalstoolbox";

	public static final CreativeModeTab CABAL_TAB = new CreativeModeTab("CabalsToolbox") {		
		@Override
		@OnlyIn(Dist.CLIENT)
		public ItemStack makeIcon() {
			return new ItemStack(ItemInit.EXAMPLE_ITEM.get());
		}
	};

	public CabalsToolbox() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		
		ItemInit.ITEMS.register(bus);
		BlockInit.BLOCKS.register(bus);
		
	MinecraftForge.EVENT_BUS.register(this);
	}
	
}
