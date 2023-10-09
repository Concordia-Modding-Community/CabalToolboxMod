
package com.wonderanchor.cabalstoolbox.item;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import com.wonderanchor.cabalstoolbox.CabalsToolbox;

public class OilBucketItem extends Item {
	public OilBucketItem() {
		super(new Item.Properties().tab(CabalsToolbox.CABAL_TAB).stacksTo(1));
	}


	@Override
	public boolean hasCraftingRemainingItem() {
		return true;
	}

	@Override
	public ItemStack getContainerItem(ItemStack itemstack) {
		return new ItemStack(Items.BUCKET);
	}
}
