package net.mcreator.mcw.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.mcw.McwModVariables;
import net.mcreator.mcw.McwMod;

import java.util.Map;

public class DisconnectedAFFProcedure {

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				McwMod.LOGGER.warn("Failed to load dependency entity for procedure DisconnectedAFF!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new McwModVariables.PlayerVariables())).BoxDisconnect == true) {
			return true;
		}
		return false;
	}
}
