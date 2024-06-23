
package net.mcreator.mcw.gui;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.mcw.procedures.BoutonDeltaAFFTerminalProcedure;
import net.mcreator.mcw.procedures.BoutonAlfaAFFTerminalProcedure;
import net.mcreator.mcw.McwModVariables;
import net.mcreator.mcw.McwMod;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class MenuChoixTerminalGuiWindow extends ContainerScreen<MenuChoixTerminalGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = MenuChoixTerminalGui.guistate;

	public MenuChoixTerminalGuiWindow(MenuChoixTerminalGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 176;
		this.ySize = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("mcw:textures/screens/menu_choix_terminal.png");

	@Override
	public void render(MatrixStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderHoveredTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(MatrixStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.color4f(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		Minecraft.getInstance().getTextureManager().bindTexture(texture);
		int k = (this.width - this.xSize) / 2;
		int l = (this.height - this.ySize) / 2;
		this.blit(ms, k, l, 0, 0, this.xSize, this.ySize, this.xSize, this.ySize);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("mcw:textures/screens/menu1.png"));
		this.blit(ms, this.guiLeft + -124, this.guiTop + -36, 0, 0, 425, 238, 425, 238);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeScreen();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void tick() {
		super.tick();
	}

	@Override
	protected void drawGuiContainerForegroundLayer(MatrixStack ms, int mouseX, int mouseY) {
		this.font.drawString(ms, "Nb joueur equipe DELTA :", -122, 8, -1);
		this.font.drawString(ms, "Nb joueur equipe ALFA :", -121, 55, -1);
		this.font.drawString(ms, "" + ((entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new McwModVariables.PlayerVariables())).TentativeCo) + "", -114, -27, -1);
		this.font.drawString(ms, "" + (McwModVariables.WorldVariables.get(world).EquipeDELTA1) + " / 6", 5, 8, -205);
		this.font.drawString(ms, "" + (McwModVariables.MapVariables.get(world).EquipeALFA1) + " / 6", 1, 55, -256);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardListener.enableRepeatEvents(false);
	}

	@Override
	public void init(Minecraft minecraft, int width, int height) {
		super.init(minecraft, width, height);
		minecraft.keyboardListener.enableRepeatEvents(true);
		this.addButton(new Button(this.guiLeft + -122, this.guiTop + 22, 93, 20, new StringTextComponent("Jouer dans Delta"), e -> {
			if (BoutonDeltaAFFTerminalProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world)).collect(HashMap::new,
					(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
				McwMod.PACKET_HANDLER.sendToServer(new MenuChoixTerminalGui.ButtonPressedMessage(0, x, y, z));
				MenuChoixTerminalGui.handleButtonAction(entity, 0, x, y, z);
			}
		}) {
			@Override
			public void render(MatrixStack ms, int gx, int gy, float ticks) {
				if (BoutonDeltaAFFTerminalProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world)).collect(HashMap::new,
						(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll)))
					super.render(ms, gx, gy, ticks);
			}
		});
		this.addButton(new Button(this.guiLeft + -122, this.guiTop + 70, 93, 20, new StringTextComponent("Jouer dans Alfa"), e -> {
			if (BoutonAlfaAFFTerminalProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world)).collect(HashMap::new,
					(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
				McwMod.PACKET_HANDLER.sendToServer(new MenuChoixTerminalGui.ButtonPressedMessage(1, x, y, z));
				MenuChoixTerminalGui.handleButtonAction(entity, 1, x, y, z);
			}
		}) {
			@Override
			public void render(MatrixStack ms, int gx, int gy, float ticks) {
				if (BoutonAlfaAFFTerminalProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("world", world)).collect(HashMap::new,
						(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll)))
					super.render(ms, gx, gy, ticks);
			}
		});
		this.addButton(new Button(this.guiLeft + -123, this.guiTop + 182, 56, 20, new StringTextComponent("Retour"), e -> {
			if (true) {
				McwMod.PACKET_HANDLER.sendToServer(new MenuChoixTerminalGui.ButtonPressedMessage(2, x, y, z));
				MenuChoixTerminalGui.handleButtonAction(entity, 2, x, y, z);
			}
		}));
	}
}
