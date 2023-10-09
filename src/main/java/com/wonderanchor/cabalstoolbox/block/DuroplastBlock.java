package com.wonderanchor.cabalstoolbox.block;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import java.util.List;
import java.util.Collections;

import com.wonderanchor.cabalstoolbox.init.BlockInit;

public class DuroplastBlock extends Block {
	public DuroplastBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f, 10f).noOcclusion()
				.isRedstoneConductor((bs, br, bp) -> false));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		@SuppressWarnings("deprecation")
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		ItemBlockRenderTypes.setRenderLayer(BlockInit.WHITE_DUROPLAST.get(), renderType -> renderType == RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.RED_DUROPLAST.get(), renderType -> renderType == RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.BLUE_DUROPLAST.get(), renderType -> renderType == RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.CYAN_DUROPLAST.get(), renderType -> renderType == RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.LIME_DUROPLAST.get(), renderType -> renderType == RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.ORANGE_DUROPLAST.get(), renderType -> renderType == RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.PINK_DUROPLAST.get(), renderType -> renderType == RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.PURPLE_DUROPLAST.get(), renderType -> renderType == RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.YELLOW_DUROPLAST.get(), renderType -> renderType == RenderType.translucent());
	}

}
