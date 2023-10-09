package com.wonderanchor.cabalstoolbox.init;

import java.util.function.Function;

import com.google.common.base.Supplier;
import com.wonderanchor.cabalstoolbox.CabalsToolbox;
import com.wonderanchor.cabalstoolbox.item.ModFoods;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import com.wonderanchor.cabalstoolbox.block.PhoneBoothUpperBlock;
import com.wonderanchor.cabalstoolbox.block.SandstoneArchBlock;
import com.wonderanchor.cabalstoolbox.block.SingleSandstoneArchBlock;
import com.wonderanchor.cabalstoolbox.block.BluePhoneBoothLowerBlock;
import com.wonderanchor.cabalstoolbox.block.BluePhoneBoothUpperBlock;
import com.wonderanchor.cabalstoolbox.block.DuroplastBlock;
import com.wonderanchor.cabalstoolbox.block.InflatableBlock;
import com.wonderanchor.cabalstoolbox.block.PhoneBoothLowerBlock;


public class BlockInit {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CabalsToolbox.MOD_ID);
	public static final DeferredRegister<Item> ITEMS = ItemInit.ITEMS;
	
//All custom blocks from this mod
	
	//Yellow Bricks
	public static final RegistryObject<Block> YELLOWBRICKS_BLOCK = register("yellowbricks_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_YELLOW).strength(2).explosionResistance(6).sound(SoundType.STONE)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(CabalsToolbox.CABAL_TAB)));
	
	public static final RegistryObject<Block> YELLOWBRICKSVARIANT_BLOCK = register("yellowbricksvariant_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_YELLOW).strength(2).explosionResistance(6).sound(SoundType.STONE)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(CabalsToolbox.CABAL_TAB)));
	
	public static final RegistryObject<Block> YELLOWBRICKSLIGHTGROUT_BLOCK = register("yellowbrickslightgrout_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_YELLOW).strength(2).explosionResistance(6).sound(SoundType.STONE)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(CabalsToolbox.CABAL_TAB)));	
	
	public static final RegistryObject<Block> YELLOWBRICKSLIGHTGROUTVARIANT_BLOCK = register("yellowbrickslightgroutvariant_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_YELLOW).strength(2).explosionResistance(6).sound(SoundType.STONE)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(CabalsToolbox.CABAL_TAB)));
	
	public static final RegistryObject<Block> YELLOWBRICKSLIGHTGROUTTOP_BLOCK = register("yellowbrickslightgrouttop_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_YELLOW).strength(2).explosionResistance(6).sound(SoundType.STONE)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(CabalsToolbox.CABAL_TAB)));
	
	public static final RegistryObject<Block> YELLOWBRICKSLIGHTGROUTRIGHT_BLOCK = register("yellowbrickslightgroutright_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_YELLOW).strength(2).explosionResistance(6).sound(SoundType.STONE)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(CabalsToolbox.CABAL_TAB)));
	
	public static final RegistryObject<Block> YELLOWBRICK_STAIRS = register("yellowbrick_stairs", () -> new StairBlock(() -> BlockInit.YELLOWBRICKS_BLOCK.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_YELLOW).strength(2).explosionResistance(6).sound(SoundType.STONE)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(CabalsToolbox.CABAL_TAB)));

	//Compacted Blocks
	
	public static final RegistryObject<Block> BEEF_WELLINGTON_BLOCK = register("beef_wellington_block", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_YELLOW).strength(1).explosionResistance(2).instabreak().sound(SoundType.WOOL)), object -> () -> new BlockItem(object.get(), new Item.Properties().food(ModFoods.BEEF_WELLINGTON_BLOCK).tab(CabalsToolbox.CABAL_TAB)));
	
	//Concrete Panels
	
	public static final RegistryObject<Block> CONCRETEPANEL_BLOCK = register("concretepanel_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_GRAY).strength(1.8f,2.6f).sound(SoundType.STONE)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(CabalsToolbox.CABAL_TAB)));
	
	public static final RegistryObject<Block> CONCRETEPANELTOPRIGHT_BLOCK = register("concretepaneltopright_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_GRAY).strength(1.8f,2.6f).sound(SoundType.STONE)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(CabalsToolbox.CABAL_TAB)));
	
	public static final RegistryObject<Block> CONCRETEPANELBOTTOMRIGHT_BLOCK = register("concretepanelbottomright_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_GRAY).strength(1.8f,2.6f).sound(SoundType.STONE)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(CabalsToolbox.CABAL_TAB)));
	
	public static final RegistryObject<Block> CONCRETEPANELBOTTOMLEFT_BLOCK = register("concretepanelbottomleft_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_GRAY).strength(1.8f,2.6f).sound(SoundType.STONE)), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(CabalsToolbox.CABAL_TAB)));
	
	//Coloured Duroplast
	
	public static final RegistryObject<Block> WHITE_DUROPLAST = register("white_duroplast", () -> new DuroplastBlock(), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(CabalsToolbox.CABAL_TAB)));
	public static final RegistryObject<Block> RED_DUROPLAST = register("red_duroplast", () -> new DuroplastBlock(), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(CabalsToolbox.CABAL_TAB)));
	public static final RegistryObject<Block> BLUE_DUROPLAST = register("blue_duroplast", () -> new DuroplastBlock(), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(CabalsToolbox.CABAL_TAB)));
	public static final RegistryObject<Block> CYAN_DUROPLAST = register("cyan_duroplast", () -> new DuroplastBlock(), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(CabalsToolbox.CABAL_TAB)));
	public static final RegistryObject<Block> LIME_DUROPLAST = register("lime_duroplast", () -> new DuroplastBlock(), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(CabalsToolbox.CABAL_TAB)));
	public static final RegistryObject<Block> ORANGE_DUROPLAST = register("orange_duroplast", () -> new DuroplastBlock(), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(CabalsToolbox.CABAL_TAB)));
	public static final RegistryObject<Block> PINK_DUROPLAST = register("pink_duroplast", () -> new DuroplastBlock(), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(CabalsToolbox.CABAL_TAB)));
	public static final RegistryObject<Block> PURPLE_DUROPLAST = register("purple_duroplast", () -> new DuroplastBlock(), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(CabalsToolbox.CABAL_TAB)));
	public static final RegistryObject<Block> YELLOW_DUROPLAST = register("yellow_duroplast", () -> new DuroplastBlock(), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(CabalsToolbox.CABAL_TAB)));
		
	//Inflatables
	
	public static final RegistryObject<Block> WHITE_INFLATABLE = register("white_inflatable", () -> new InflatableBlock(), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(CabalsToolbox.CABAL_TAB)));
	public static final RegistryObject<Block> RED_INFLATABLE = register("red_inflatable", () -> new InflatableBlock(), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(CabalsToolbox.CABAL_TAB)));
	public static final RegistryObject<Block> BLUE_INFLATABLE = register("blue_inflatable", () -> new InflatableBlock(), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(CabalsToolbox.CABAL_TAB)));
	public static final RegistryObject<Block> CYAN_INFLATABLE = register("cyan_inflatable", () -> new InflatableBlock(), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(CabalsToolbox.CABAL_TAB)));
	public static final RegistryObject<Block> LIME_INFLATABLE = register("lime_inflatable", () -> new InflatableBlock(), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(CabalsToolbox.CABAL_TAB)));
	public static final RegistryObject<Block> ORANGE_INFLATABLE = register("orange_inflatable", () -> new InflatableBlock(), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(CabalsToolbox.CABAL_TAB)));
	public static final RegistryObject<Block> PINK_INFLATABLE = register("pink_inflatable", () -> new InflatableBlock(), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(CabalsToolbox.CABAL_TAB)));
	public static final RegistryObject<Block> PURPLE_INFLATABLE = register("purple_inflatable", () -> new InflatableBlock(), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(CabalsToolbox.CABAL_TAB)));
	public static final RegistryObject<Block> YELLOW_INFLATABLE = register("yellow_inflatable", () -> new InflatableBlock(), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(CabalsToolbox.CABAL_TAB)));
	
	//Transparency
	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			DuroplastBlock.registerRenderLayer();
			InflatableBlock.registerRenderLayer();
		}
	}


	//Phone Booth
	public static final RegistryObject<Block> PHONE_BOOTH_UPPER = register("phone_booth_upper", () -> new PhoneBoothUpperBlock(), object -> () -> new BlockItem(object.get(), new Item.Properties()));
	
	public static final RegistryObject<Block> PHONE_BOOTH_LOWER = register("phone_booth_lower", () -> new PhoneBoothLowerBlock(), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(CabalsToolbox.CABAL_TAB)));

	public static final RegistryObject<Block> BLUE_PHONE_BOOTH_UPPER = register("blue_phone_booth_upper", () -> new BluePhoneBoothUpperBlock(), object -> () -> new BlockItem(object.get(), new Item.Properties()));
	
	public static final RegistryObject<Block> BLUE_PHONE_BOOTH_LOWER = register("blue_phone_booth_lower", () -> new BluePhoneBoothLowerBlock(), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(CabalsToolbox.CABAL_TAB)));
	
	//Sandstone
	public static final RegistryObject<Block> SANDSTONE_ARCH = register("sandstone_arch", () -> new SandstoneArchBlock(), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(CabalsToolbox.CABAL_TAB)));
	public static final RegistryObject<Block> SANDSTONE_ARCH_SINGLE = register("sandstone_arch_single", () -> new SingleSandstoneArchBlock(), object -> () -> new BlockItem(object.get(), new Item.Properties().tab(CabalsToolbox.CABAL_TAB)));
	
//End of list
	
	private static <T extends Block> RegistryObject<T> registerBlock(final String name, final Supplier<? extends T> block){
		return BLOCKS.register(name, block);
	}

	private static <T extends Block> RegistryObject<T> register(final String name, final Supplier<? extends T> block, Function<RegistryObject<T>, Supplier<? extends Item>> item){
		RegistryObject<T> obj = registerBlock(name, block);
		ITEMS.register(name,item.apply(obj));
		return obj;
	
	
		
	}
}
