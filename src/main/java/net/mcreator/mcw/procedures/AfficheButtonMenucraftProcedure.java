package net.mcreator.mcw.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.mcw.McwMod;

import java.util.Map;

public class AfficheButtonMenucraftProcedure {

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				McwMod.LOGGER.warn("Failed to load dependency entity for procedure AfficheButtonMenucraft!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity.hasPermissionLevel((int) 4)) {
			return true;
		}
		return false;
	}
}
