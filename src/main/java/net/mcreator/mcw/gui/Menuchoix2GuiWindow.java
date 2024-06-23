
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

import net.mcreator.mcw.McwModVariables;
import net.mcreator.mcw.McwMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class Menuchoix2GuiWindow extends ContainerScreen<Menuchoix2Gui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = Menuchoix2Gui.guistate;

	public Menuchoix2GuiWindow(Menuchoix2Gui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 176;
		this.ySize = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("mcw:textures/screens/menuchoix_2.png");

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
		this.font.drawString(ms, "Choisi une map pour jouer", -111, -33, -1);
		this.font.drawString(ms, "" + (McwModVariables.MapVariables.get(world).NbJoueurTotalTerminal) + " / 12", -35, -2, -256);
		this.font.drawString(ms, "" + (McwModVariables.MapVariables.get(world).NbJoueurTotalLockdown) + " / 12", -35, 21, -256);
		this.font.drawString(ms, "" + (McwModVariables.MapVariables.get(world).NbJoueurTotalVillage) + " / 12", -34, 44, -256);
		this.font.drawString(ms, "" + (McwModVariables.MapVariables.get(world).NbJoueurTotalHardhat) + " / 12", -34, 67, -256);
		this.font.drawString(ms, "" + (McwModVariables.MapVariables.get(world).NbJoueurTotalResistance) + " / 12", -34, 90, -256);
		this.font.drawString(ms, "" + (McwModVariables.MapVariables.get(world).NbJoueurTotalDome) + " / 12", -33, 113, -205);
		this.font.drawString(ms, "" + (McwModVariables.MapVariables.get(world).NbJoueurTotalFallen) + " / 12", -33, 136, -256);
		this.font.drawString(ms, "" + (McwModVariables.MapVariables.get(world).NbJoueurTotalMission) + " / 12", -32, 159, -256);
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
		this.addButton(new Button(this.guiLeft + -120, this.guiTop + -7, 67, 20, new StringTextComponent("Terminal"), e -> {
			if (true) {
				McwMod.PACKET_HANDLER.sendToServer(new Menuchoix2Gui.ButtonPressedMessage(0, x, y, z));
				Menuchoix2Gui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + -120, this.guiTop + 16, 67, 20, new StringTextComponent("Lockdown"), e -> {
			if (true) {
				McwMod.PACKET_HANDLER.sendToServer(new Menuchoix2Gui.ButtonPressedMessage(1, x, y, z));
				Menuchoix2Gui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + -120, this.guiTop + 39, 61, 20, new StringTextComponent("Village"), e -> {
			if (true) {
				McwMod.PACKET_HANDLER.sendToServer(new Menuchoix2Gui.ButtonPressedMessage(2, x, y, z));
				Menuchoix2Gui.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + -120, this.guiTop + 62, 61, 20, new StringTextComponent("Hardhat"), e -> {
			if (true) {
				McwMod.PACKET_HANDLER.sendToServer(new Menuchoix2Gui.ButtonPressedMessage(3, x, y, z));
				Menuchoix2Gui.handleButtonAction(entity, 3, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + -120, this.guiTop + 85, 77, 20, new StringTextComponent("Resistance"), e -> {
			if (true) {
				McwMod.PACKET_HANDLER.sendToServer(new Menuchoix2Gui.ButtonPressedMessage(4, x, y, z));
				Menuchoix2Gui.handleButtonAction(entity, 4, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + -120, this.guiTop + 108, 46, 20, new StringTextComponent("Dome"), e -> {
			if (true) {
				McwMod.PACKET_HANDLER.sendToServer(new Menuchoix2Gui.ButtonPressedMessage(5, x, y, z));
				Menuchoix2Gui.handleButtonAction(entity, 5, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + -120, this.guiTop + 131, 56, 20, new StringTextComponent("Fallen"), e -> {
			if (true) {
				McwMod.PACKET_HANDLER.sendToServer(new Menuchoix2Gui.ButtonPressedMessage(6, x, y, z));
				Menuchoix2Gui.handleButtonAction(entity, 6, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + -120, this.guiTop + 154, 61, 20, new StringTextComponent("Mission"), e -> {
			if (true) {
				McwMod.PACKET_HANDLER.sendToServer(new Menuchoix2Gui.ButtonPressedMessage(7, x, y, z));
				Menuchoix2Gui.handleButtonAction(entity, 7, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + -124, this.guiTop + 182, 56, 20, new StringTextComponent("Retour"), e -> {
			if (true) {
				McwMod.PACKET_HANDLER.sendToServer(new Menuchoix2Gui.ButtonPressedMessage(8, x, y, z));
				Menuchoix2Gui.handleButtonAction(entity, 8, x, y, z);
			}
		}));
	}
}
