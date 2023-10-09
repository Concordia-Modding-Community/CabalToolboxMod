
package com.wonderanchor.cabalstoolbox.block;

import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import java.util.List;
import java.util.Collections;

import com.wonderanchor.cabalstoolbox.procedures.InflatableEntityWalksOnTheBlockProcedure;
import com.wonderanchor.cabalstoolbox.init.BlockInit;

public class InflatableBlock extends Block {
	public InflatableBlock() {
		super(BlockBehaviour.Properties.of(Material.WOOL)
				.sound(new ForgeSoundType(1.0f, 1.0f, () -> new SoundEvent(new ResourceLocation("block.lava.pop")),
						() -> new SoundEvent(new ResourceLocation("block.wool.step")), () -> new SoundEvent(new ResourceLocation("block.wool.place")),
						() -> new SoundEvent(new ResourceLocation("block.powder_snow.hit")),
						() -> new SoundEvent(new ResourceLocation("block.slime_block.fall"))))
				.strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
	}

	@SuppressWarnings("deprecation")
	@Override
	public boolean skipRendering(BlockState state, BlockState adjacentBlockState, Direction side) {
		return adjacentBlockState.getBlock() == this ? true : super.skipRendering(state, adjacentBlockState, side);
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 8;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		@SuppressWarnings("deprecation")
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@Override
	public void stepOn(Level world, BlockPos pos, BlockState blockstate, Entity entity) {
		super.stepOn(world, pos, blockstate, entity);
		InflatableEntityWalksOnTheBlockProcedure.execute(entity);
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		ItemBlockRenderTypes.setRenderLayer(BlockInit.WHITE_INFLATABLE.get(), renderType -> renderType == RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.RED_INFLATABLE.get(), renderType -> renderType == RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.BLUE_INFLATABLE.get(), renderType -> renderType == RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.CYAN_INFLATABLE.get(), renderType -> renderType == RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.LIME_INFLATABLE.get(), renderType -> renderType == RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.ORANGE_INFLATABLE.get(), renderType -> renderType == RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.PINK_INFLATABLE.get(), renderType -> renderType == RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.PURPLE_INFLATABLE.get(), renderType -> renderType == RenderType.translucent());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.YELLOW_INFLATABLE.get(), renderType -> renderType == RenderType.translucent());
	}

}
