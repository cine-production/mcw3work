package net.mcreator.mcw.procedures;

import net.minecraft.world.IWorld;

import net.mcreator.mcw.McwModVariables;
import net.mcreator.mcw.McwMod;

import java.util.Map;

public class NbAdminEqDelta1PlusProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				McwMod.LOGGER.warn("Failed to load dependency world for procedure NbAdminEqDelta1Plus!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		McwModVariables.WorldVariables.get(world).EquipeDELTA1 = (McwModVariables.WorldVariables.get(world).EquipeDELTA1 + 1);
		McwModVariables.WorldVariables.get(world).syncData(world);
		McwModVariables.MapVariables.get(world).NbJoueurTotalTerminal = (McwModVariables.MapVariables.get(world).NbJoueurTotalTerminal + 1);
		McwModVariables.MapVariables.get(world).syncData(world);
	}
}
