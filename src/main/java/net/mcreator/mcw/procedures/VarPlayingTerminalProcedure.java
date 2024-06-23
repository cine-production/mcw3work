package net.mcreator.mcw.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.IWorld;

import net.mcreator.mcw.McwModVariables;
import net.mcreator.mcw.McwMod;

import java.util.Map;
import java.util.HashMap;

public class VarPlayingTerminalProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onWorldTick(TickEvent.WorldTickEvent event) {
			if (event.phase == TickEvent.Phase.END) {
				IWorld world = event.world;
				Map<String, Object> dependencies = new HashMap<>();
				dependencies.put("world", world);
				dependencies.put("event", event);
				executeProcedure(dependencies);
			}
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				McwMod.LOGGER.warn("Failed to load dependency world for procedure VarPlayingTerminal!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		if (McwModVariables.WorldVariables.get(world).EquipeDELTA1 == 0 && McwModVariables.MapVariables.get(world).EquipeALFA1 == 0) {
			McwModVariables.MapVariables.get(world).TerminalPlaying = (false);
			McwModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
