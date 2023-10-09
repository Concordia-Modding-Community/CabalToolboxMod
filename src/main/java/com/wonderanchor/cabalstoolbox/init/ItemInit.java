package com.wonderanchor.cabalstoolbox.init;

import com.google.common.base.Supplier;
import com.wonderanchor.cabalstoolbox.CabalsToolbox;
import com.wonderanchor.cabalstoolbox.item.ChurnDashItem;
import com.wonderanchor.cabalstoolbox.item.ModFoods;
import com.wonderanchor.cabalstoolbox.item.OilBucketItem;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CabalsToolbox.MOD_ID);
	
//All custom items from this mod
	
	//Logo
	public static final RegistryObject<Item> EXAMPLE_ITEM = register("example_item", () -> new Item(new Item.Properties()));
	
	//Tools
	public static final RegistryObject<Item> CHURN_DASH = register("churn_dash", () -> new ChurnDashItem());
	
	public static final RegistryObject<Item> OIL_BUCKET = register("oil_bucket", () -> new OilBucketItem());
	
	//Food
	public static final RegistryObject<Item> YORKSHIRE_PUDDING = register("yorkshire_pudding", () -> new Item(new Item.Properties().food(ModFoods.YORKSHIRE_PUDDING).tab(CabalsToolbox.CABAL_TAB)));
	
	public static final RegistryObject<Item> YORKSHIRE_PUDDING_BATTER = register("yorkshire_pudding_batter", () -> new Item(new Item.Properties().food(ModFoods.YORKSHIRE_PUDDING_BATTER).tab(CabalsToolbox.CABAL_TAB)));
	
	public static final RegistryObject<Item> BUTTER = register("butter", () -> new Item(new Item.Properties().food(ModFoods.BUTTER).tab(CabalsToolbox.CABAL_TAB)));
	
	public static final RegistryObject<Item> FISH_AND_CHIPS = register("fish_and_chips", () -> new Item(new Item.Properties().food(ModFoods.FISH_AND_CHIPS).stacksTo(16).tab(CabalsToolbox.CABAL_TAB)));
	
	public static final RegistryObject<Item> BEEF_WELLINGTON = register("beef_wellington", () -> new Item(new Item.Properties().food(ModFoods.BEEF_WELLINGTON).stacksTo(16).tab(CabalsToolbox.CABAL_TAB)));
	
	//Phone Booth
	public static final RegistryObject<Item> PHONE_BOOTH_UPPER = block(BlockInit.PHONE_BOOTH_UPPER, null);
	public static final RegistryObject<Item> PHONE_BOOTH_LOWER = block(BlockInit.PHONE_BOOTH_LOWER, null);
	
	
//End of list
	
	private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item){
		return ITEMS.register(name, item);
	}

//Remove this if broken
private static RegistryObject<Item> block(RegistryObject<Block> phoneBoothUpper, Object object) {
	return null;
}
}
