package com.wonderanchor.cabalstoolbox.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {

	public static final FoodProperties YORKSHIRE_PUDDING = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.3F).alwaysEat().effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED,350,0),.8f).build();	
	
	public static final FoodProperties YORKSHIRE_PUDDING_BATTER = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.1F).effect(() -> new MobEffectInstance(MobEffects.POISON,250,0),.2f).build();
	
	public static final FoodProperties BUTTER = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.1F).effect(() -> new MobEffectInstance(MobEffects.CONFUSION,300,0),.1f).build();
	
	public static final FoodProperties FISH_AND_CHIPS = (new FoodProperties.Builder()).nutrition(10).saturationMod(1.0F).effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST,600,0),.4f).build();
	
	public static final FoodProperties BEEF_WELLINGTON = (new FoodProperties.Builder()).nutrition(12).saturationMod(1.3F).effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST,800,0),.6f).build();
	
	public static final FoodProperties BEEF_WELLINGTON_BLOCK = (new FoodProperties.Builder()).nutrition(50).saturationMod(5F).effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST,1200,1,true,true),1f).build();
}
