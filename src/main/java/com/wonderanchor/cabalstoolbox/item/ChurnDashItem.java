
package com.wonderanchor.cabalstoolbox.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;

import com.wonderanchor.cabalstoolbox.CabalsToolbox;

import net.minecraft.world.item.Item;

public class ChurnDashItem extends Item {
	public ChurnDashItem() {
		super(new Item.Properties().durability(16).rarity(Rarity.COMMON).tab(CabalsToolbox.CABAL_TAB));
	}

	@Override
	public boolean hasCraftingRemainingItem() {
		return true;
	}

	@Override
	public ItemStack getContainerItem(ItemStack itemstack) {
		ItemStack retval = new ItemStack(this);
		retval.setDamageValue(itemstack.getDamageValue() + 1);
		if (retval.getDamageValue() >= retval.getMaxDamage()) {
			return ItemStack.EMPTY;
		}
		return retval;
	}

	@Override
	public boolean isRepairable(ItemStack itemstack) {
		return false;
	}
}
