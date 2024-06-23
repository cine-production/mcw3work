package net.mcreator.mcw.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.IWorld;
import net.minecraft.entity.Entity;

import net.mcreator.mcw.McwModVariables;
import net.mcreator.mcw.McwMod;

import java.util.Map;
import java.util.HashMap;

public class PlayerPresentInGameMoinProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onPlayerLoggedOut(PlayerEvent.PlayerLoggedOutEvent event) {
			Entity entity = event.getPlayer();
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("x", entity.getPosX());
			dependencies.put("y", entity.getPosY());
			dependencies.put("z", entity.getPosZ());
			dependencies.put("world", entity.world);
			dependencies.put("entity", entity);
			dependencies.put("event", event);
			executeProcedure(dependencies);
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				McwMod.LOGGER.warn("Failed to load dependency world for procedure PlayerPresentInGameMoin!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				McwMod.LOGGER.warn("Failed to load dependency entity for procedure PlayerPresentInGameMoin!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new McwModVariables.PlayerVariables())).PlayerAlfa1 == true) {
			{
				boolean _setval = (false);
				entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerAlfa1 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			McwModVariables.MapVariables.get(world).EquipeALFA1 = (McwModVariables.MapVariables.get(world).EquipeALFA1 - 1);
			McwModVariables.MapVariables.get(world).syncData(world);
			McwModVariables.MapVariables.get(world).NbJoueurTotalTerminal = (McwModVariables.MapVariables.get(world).NbJoueurTotalTerminal - 1);
			McwModVariables.MapVariables.get(world).syncData(world);
		} else if ((entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new McwModVariables.PlayerVariables())).PlayerDelta1 == true) {
			{
				boolean _setval = (false);
				entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerDelta1 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			McwModVariables.WorldVariables.get(world).EquipeDELTA1 = (McwModVariables.WorldVariables.get(world).EquipeDELTA1 - 1);
			McwModVariables.WorldVariables.get(world).syncData(world);
			McwModVariables.MapVariables.get(world).NbJoueurTotalTerminal = (McwModVariables.MapVariables.get(world).NbJoueurTotalTerminal - 1);
			McwModVariables.MapVariables.get(world).syncData(world);
		} else if ((entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new McwModVariables.PlayerVariables())).PlayerAlfa2 == true) {
			{
				boolean _setval = (false);
				entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerAlfa2 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			McwModVariables.MapVariables.get(world).EquipeALFA2 = (McwModVariables.MapVariables.get(world).EquipeALFA2 - 1);
			McwModVariables.MapVariables.get(world).syncData(world);
			McwModVariables.MapVariables.get(world).NbJoueurTotalLockdown = (McwModVariables.MapVariables.get(world).NbJoueurTotalLockdown - 1);
			McwModVariables.MapVariables.get(world).syncData(world);
		} else if ((entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new McwModVariables.PlayerVariables())).PlayerDelta2 == true) {
			{
				boolean _setval = (false);
				entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerDelta2 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			McwModVariables.MapVariables.get(world).EquipeDELTA2 = (McwModVariables.MapVariables.get(world).EquipeDELTA2 - 1);
			McwModVariables.MapVariables.get(world).syncData(world);
			McwModVariables.MapVariables.get(world).NbJoueurTotalLockdown = (McwModVariables.MapVariables.get(world).NbJoueurTotalLockdown - 1);
			McwModVariables.MapVariables.get(world).syncData(world);
		} else if ((entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new McwModVariables.PlayerVariables())).PlayerAlfa3 == true) {
			{
				boolean _setval = (false);
				entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerAlfa3 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			McwModVariables.MapVariables.get(world).EquipeALFA3 = (McwModVariables.MapVariables.get(world).EquipeALFA3 - 1);
			McwModVariables.MapVariables.get(world).syncData(world);
			McwModVariables.MapVariables.get(world).NbJoueurTotalVillage = (McwModVariables.MapVariables.get(world).NbJoueurTotalVillage - 1);
			McwModVariables.MapVariables.get(world).syncData(world);
		} else if ((entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new McwModVariables.PlayerVariables())).PlayerDelta3 == true) {
			{
				boolean _setval = (false);
				entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerDelta3 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			McwModVariables.MapVariables.get(world).EquipeDELTA3 = (McwModVariables.MapVariables.get(world).EquipeDELTA3 - 1);
			McwModVariables.MapVariables.get(world).syncData(world);
			McwModVariables.MapVariables.get(world).NbJoueurTotalVillage = (McwModVariables.MapVariables.get(world).NbJoueurTotalVillage - 1);
			McwModVariables.MapVariables.get(world).syncData(world);
		} else if ((entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new McwModVariables.PlayerVariables())).PlayerAlfa4 == true) {
			{
				boolean _setval = (false);
				entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerAlfa4 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			McwModVariables.MapVariables.get(world).EquipeALFA4 = (McwModVariables.MapVariables.get(world).EquipeALFA4 - 1);
			McwModVariables.MapVariables.get(world).syncData(world);
			McwModVariables.MapVariables.get(world).NbJoueurTotalHardhat = (McwModVariables.MapVariables.get(world).NbJoueurTotalHardhat - 1);
			McwModVariables.MapVariables.get(world).syncData(world);
		} else if ((entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new McwModVariables.PlayerVariables())).PlayerDelta4 == true) {
			{
				boolean _setval = (false);
				entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerDelta4 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			McwModVariables.MapVariables.get(world).EquipeDELTA4 = (McwModVariables.MapVariables.get(world).EquipeDELTA4 - 1);
			McwModVariables.MapVariables.get(world).syncData(world);
			McwModVariables.MapVariables.get(world).NbJoueurTotalHardhat = (McwModVariables.MapVariables.get(world).NbJoueurTotalHardhat - 1);
			McwModVariables.MapVariables.get(world).syncData(world);
		} else if ((entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new McwModVariables.PlayerVariables())).PlayerAlfa5 == true) {
			{
				boolean _setval = (false);
				entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerAlfa5 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			McwModVariables.MapVariables.get(world).EquipeALFA5 = (McwModVariables.MapVariables.get(world).EquipeALFA5 - 1);
			McwModVariables.MapVariables.get(world).syncData(world);
			McwModVariables.MapVariables.get(world).NbJoueurTotalResistance = (McwModVariables.MapVariables.get(world).NbJoueurTotalResistance - 1);
			McwModVariables.MapVariables.get(world).syncData(world);
		} else if ((entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new McwModVariables.PlayerVariables())).PlayerDelta5 == true) {
			{
				boolean _setval = (false);
				entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerDelta5 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			McwModVariables.MapVariables.get(world).EquipeDELTA5 = (McwModVariables.MapVariables.get(world).EquipeDELTA5 - 1);
			McwModVariables.MapVariables.get(world).syncData(world);
			McwModVariables.MapVariables.get(world).NbJoueurTotalResistance = (McwModVariables.MapVariables.get(world).NbJoueurTotalResistance - 1);
			McwModVariables.MapVariables.get(world).syncData(world);
		} else if ((entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new McwModVariables.PlayerVariables())).PlayerAlfa6 == true) {
			{
				boolean _setval = (false);
				entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerAlfa6 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			McwModVariables.MapVariables.get(world).EquipeALFA6 = (McwModVariables.MapVariables.get(world).EquipeALFA6 - 1);
			McwModVariables.MapVariables.get(world).syncData(world);
			McwModVariables.MapVariables.get(world).NbJoueurTotalDome = (McwModVariables.MapVariables.get(world).NbJoueurTotalDome - 1);
			McwModVariables.MapVariables.get(world).syncData(world);
		} else if ((entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new McwModVariables.PlayerVariables())).PlayerDelta6 == true) {
			{
				boolean _setval = (false);
				entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerDelta6 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			McwModVariables.MapVariables.get(world).EquipeDELTA6 = (McwModVariables.MapVariables.get(world).EquipeDELTA6 - 1);
			McwModVariables.MapVariables.get(world).syncData(world);
			McwModVariables.MapVariables.get(world).NbJoueurTotalDome = (McwModVariables.MapVariables.get(world).NbJoueurTotalDome - 1);
			McwModVariables.MapVariables.get(world).syncData(world);
		} else if ((entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new McwModVariables.PlayerVariables())).PlayerAlfa7 == true) {
			{
				boolean _setval = (false);
				entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerAlfa7 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			McwModVariables.MapVariables.get(world).EquipeALFA7 = (McwModVariables.MapVariables.get(world).EquipeALFA7 - 1);
			McwModVariables.MapVariables.get(world).syncData(world);
			McwModVariables.MapVariables.get(world).NbJoueurTotalFallen = (McwModVariables.MapVariables.get(world).NbJoueurTotalFallen - 1);
			McwModVariables.MapVariables.get(world).syncData(world);
		} else if ((entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new McwModVariables.PlayerVariables())).PlayerDelta7 == true) {
			{
				boolean _setval = (false);
				entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerDelta7 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			McwModVariables.MapVariables.get(world).EquipeDELTA7 = (McwModVariables.MapVariables.get(world).EquipeDELTA7 - 1);
			McwModVariables.MapVariables.get(world).syncData(world);
			McwModVariables.MapVariables.get(world).NbJoueurTotalFallen = (McwModVariables.MapVariables.get(world).NbJoueurTotalFallen - 1);
			McwModVariables.MapVariables.get(world).syncData(world);
		} else if ((entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new McwModVariables.PlayerVariables())).PlayerAlfa8 == true) {
			{
				boolean _setval = (false);
				entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerAlfa8 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			McwModVariables.MapVariables.get(world).EquipeALFA8 = (McwModVariables.MapVariables.get(world).EquipeALFA8 - 1);
			McwModVariables.MapVariables.get(world).syncData(world);
			McwModVariables.MapVariables.get(world).NbJoueurTotalMission = (McwModVariables.MapVariables.get(world).NbJoueurTotalMission - 1);
			McwModVariables.MapVariables.get(world).syncData(world);
		} else if ((entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new McwModVariables.PlayerVariables())).PlayerDelta8 == true) {
			{
				boolean _setval = (false);
				entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.PlayerDelta8 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			McwModVariables.MapVariables.get(world).EquipeDELTA8 = (McwModVariables.MapVariables.get(world).EquipeDELTA8 - 1);
			McwModVariables.MapVariables.get(world).syncData(world);
			McwModVariables.MapVariables.get(world).NbJoueurTotalMission = (McwModVariables.MapVariables.get(world).NbJoueurTotalMission - 1);
			McwModVariables.MapVariables.get(world).syncData(world);
		}
		McwModVariables.MapVariables.get(world).PlayerPresentInGame = (McwModVariables.MapVariables.get(world).PlayerPresentInGame - 1);
		McwModVariables.MapVariables.get(world).syncData(world);
	}
}
