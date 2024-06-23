
package net.mcreator.mcw.gui.overlay;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.Minecraft;

import net.mcreator.mcw.procedures.TSDF1AFFProcedure;
import net.mcreator.mcw.procedures.AffTimeTerminalProcedure;
import net.mcreator.mcw.McwModVariables;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

@Mod.EventBusSubscriber
public class TSDF1Overlay {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGameOverlayEvent.Post event) {
		if (event.getType() == RenderGameOverlayEvent.ElementType.HELMET) {
			int w = event.getWindow().getScaledWidth();
			int h = event.getWindow().getScaledHeight();
			int posX = w / 2;
			int posY = h / 2;
			World _world = null;
			double _x = 0;
			double _y = 0;
			double _z = 0;
			PlayerEntity entity = Minecraft.getInstance().player;
			if (entity != null) {
				_world = entity.world;
				_x = entity.getPosX();
				_y = entity.getPosY();
				_z = entity.getPosZ();
			}
			World world = _world;
			double x = _x;
			double y = _y;
			double z = _z;
			if (TSDF1AFFProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
					(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
				if (AffTimeTerminalProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
						(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll)))
					Minecraft.getInstance().fontRenderer.drawString(event.getMatrixStack(),
							"" + (McwModVariables.MapVariables.get(world).TimeTerminal) + "", posX + -216, posY + 67, -205);
				Minecraft.getInstance().fontRenderer.drawString(event.getMatrixStack(),
						"" + (McwModVariables.MapVariables.get(world).DebutPartieTextTerminal) + "", posX + -64, posY + -28, -1);
				Minecraft.getInstance().fontRenderer.drawString(event.getMatrixStack(),
						"" + (McwModVariables.MapVariables.get(world).DebutPartieTerminal) + "", posX + -4, posY + -16, -256);
				Minecraft.getInstance().fontRenderer.drawString(event.getMatrixStack(),
						"" + ((entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new McwModVariables.PlayerVariables())).Pointreport) + "",
						posX + -10, posY + -39, -256);
				Minecraft.getInstance().fontRenderer.drawString(event.getMatrixStack(), "" + ((entity
						.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new McwModVariables.PlayerVariables())).VouD) + "",
						posX + -17, posY + -83, -52);
			}
		}
	}
}
