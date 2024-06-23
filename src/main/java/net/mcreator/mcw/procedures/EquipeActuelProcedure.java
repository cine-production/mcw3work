package net.mcreator.mcw.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.mcw.McwModVariables;
import net.mcreator.mcw.McwMod;

import java.util.Map;

public class EquipeActuelProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				McwMod.LOGGER.warn("Failed to load dependency world for procedure EquipeActuel!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				McwMod.LOGGER.warn("Failed to load dependency entity for procedure EquipeActuel!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new McwModVariables.PlayerVariables())).PlayerAlfa1 == true) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Vous faite partie de l'\u00E9quipe ALFA de la map TERMINAL"),
						(false));
			}
		} else if ((entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new McwModVariables.PlayerVariables())).PlayerDelta1 == true) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Vous faite partie de l'\u00E9quipe DELTA de la map TERMINAL"),
						(false));
			}
		} else if ((entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new McwModVariables.PlayerVariables())).PlayerAlfa2 == true) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Vous faite partie de l'\u00E9quipe ALFA de la map LOCKDOWN"),
						(false));
			}
		} else if ((entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new McwModVariables.PlayerVariables())).PlayerDelta2 == true) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Vous faite partie de l'\u00E9quipe DELTA de la map LOCKDOWN"),
						(false));
			}
		} else if ((entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new McwModVariables.PlayerVariables())).PlayerAlfa3 == true) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Vous faite partie de l'\u00E9quipe ALFA de la map VILLAGE"),
						(false));
			}
		} else if ((entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new McwModVariables.PlayerVariables())).PlayerDelta3 == true) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Vous faite partie de l'\u00E9quipe DELTA de la map VILLAGE"),
						(false));
			}
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
		} else {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Vous ne faite partie d'aucune \u00E9quipe"), (false));
			}
		}
	}
}
