package com.wonderanchor.cabalstoolbox.procedures;

import net.minecraft.world.entity.Entity;

public class InflatableEntityWalksOnTheBlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.fallDistance = 0;
	}
}
