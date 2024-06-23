package net.mcreator.mcw.procedures;

import net.minecraft.world.IWorld;

import net.mcreator.mcw.McwModVariables;
import net.mcreator.mcw.McwMod;

import java.util.Map;

public class ResetTerminalProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				McwMod.LOGGER.warn("Failed to load dependency world for procedure ResetTerminal!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		McwModVariables.MapVariables.get(world).TimeTerminal = "10:00";
		McwModVariables.MapVariables.get(world).syncData(world);
		McwModVariables.MapVariables.get(world).DebutPartieTextTerminal = " ";
		McwModVariables.MapVariables.get(world).syncData(world);
	}
}
