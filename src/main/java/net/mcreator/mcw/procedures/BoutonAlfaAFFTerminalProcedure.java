package net.mcreator.mcw.procedures;

import net.minecraft.world.IWorld;

import net.mcreator.mcw.McwModVariables;
import net.mcreator.mcw.McwMod;

import java.util.Map;

public class BoutonAlfaAFFTerminalProcedure {

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				McwMod.LOGGER.warn("Failed to load dependency world for procedure BoutonAlfaAFFTerminal!");
			return false;
		}
		IWorld world = (IWorld) dependencies.get("world");
		if (McwModVariables.MapVariables.get(world).EquipeALFA1 < 6) {
			return true;
		}
		return false;
	}
}
