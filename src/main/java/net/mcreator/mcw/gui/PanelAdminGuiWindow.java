
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
public class PanelAdminGuiWindow extends ContainerScreen<PanelAdminGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = PanelAdminGui.guistate;

	public PanelAdminGuiWindow(PanelAdminGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 0;
		this.ySize = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("mcw:textures/screens/panel_admin.png");

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
		this.font.drawString(ms, "Nb joueur en ligne :", -206, -115, -1);
		this.font.drawString(ms, "" + (McwModVariables.MapVariables.get(world).PlayerPresentInGame) + "", -206, -102, -256);
		this.font.drawString(ms, "Attention a utiliser seulement si necessaire", -114, 71, -65536);
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
		this.addButton(new Button(this.guiLeft + -64, this.guiTop + 100, 129, 20, new StringTextComponent("Ouvrir menu pricipal"), e -> {
			if (true) {
				McwMod.PACKET_HANDLER.sendToServer(new PanelAdminGui.ButtonPressedMessage(0, x, y, z));
				PanelAdminGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(
				new Button(this.guiLeft + -100, this.guiTop + 80, 202, 20, new StringTextComponent("Arrêter le son de tous les joueurs"), e -> {
					if (true) {
						McwMod.PACKET_HANDLER.sendToServer(new PanelAdminGui.ButtonPressedMessage(1, x, y, z));
						PanelAdminGui.handleButtonAction(entity, 1, x, y, z);
					}
				}));
		this.addButton(
				new Button(this.guiLeft + -100, this.guiTop + 51, 202, 20, new StringTextComponent("Arrêter toutes les partie en cours"), e -> {
					if (true) {
						McwMod.PACKET_HANDLER.sendToServer(new PanelAdminGui.ButtonPressedMessage(2, x, y, z));
						PanelAdminGui.handleButtonAction(entity, 2, x, y, z);
					}
				}));
		this.addButton(new Button(this.guiLeft + -92, this.guiTop + -117, 186, 20, new StringTextComponent("Pannel de contrôle map Terminal"), e -> {
			if (true) {
				McwMod.PACKET_HANDLER.sendToServer(new PanelAdminGui.ButtonPressedMessage(3, x, y, z));
				PanelAdminGui.handleButtonAction(entity, 3, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + -92, this.guiTop + -96, 186, 20, new StringTextComponent("Pannel de contrôle map Lockdown"), e -> {
			if (true) {
				McwMod.PACKET_HANDLER.sendToServer(new PanelAdminGui.ButtonPressedMessage(4, x, y, z));
				PanelAdminGui.handleButtonAction(entity, 4, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + -92, this.guiTop + -75, 186, 20, new StringTextComponent("Pannel de contrôle map Village"), e -> {
			if (true) {
				McwMod.PACKET_HANDLER.sendToServer(new PanelAdminGui.ButtonPressedMessage(5, x, y, z));
				PanelAdminGui.handleButtonAction(entity, 5, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + -92, this.guiTop + -54, 186, 20, new StringTextComponent("Pannel de contrôle map Hardhat"), e -> {
			if (true) {
				McwMod.PACKET_HANDLER.sendToServer(new PanelAdminGui.ButtonPressedMessage(6, x, y, z));
				PanelAdminGui.handleButtonAction(entity, 6, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + -92, this.guiTop + -33, 186, 20, new StringTextComponent("Pannel de contrôle map Resistance"), e -> {
			if (true) {
				McwMod.PACKET_HANDLER.sendToServer(new PanelAdminGui.ButtonPressedMessage(7, x, y, z));
				PanelAdminGui.handleButtonAction(entity, 7, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + -92, this.guiTop + -12, 186, 20, new StringTextComponent("Pannel de contrôle map Dome"), e -> {
			if (true) {
				McwMod.PACKET_HANDLER.sendToServer(new PanelAdminGui.ButtonPressedMessage(8, x, y, z));
				PanelAdminGui.handleButtonAction(entity, 8, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + -92, this.guiTop + 9, 186, 20, new StringTextComponent("Pannel de contrôle map Fallen"), e -> {
			if (true) {
				McwMod.PACKET_HANDLER.sendToServer(new PanelAdminGui.ButtonPressedMessage(9, x, y, z));
				PanelAdminGui.handleButtonAction(entity, 9, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + -92, this.guiTop + 30, 186, 20, new StringTextComponent("Pannel de contrôle map Mission"), e -> {
			if (true) {
				McwMod.PACKET_HANDLER.sendToServer(new PanelAdminGui.ButtonPressedMessage(10, x, y, z));
				PanelAdminGui.handleButtonAction(entity, 10, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + -206, this.guiTop + -91, 30, 20, new StringTextComponent("+"), e -> {
			if (true) {
				McwMod.PACKET_HANDLER.sendToServer(new PanelAdminGui.ButtonPressedMessage(11, x, y, z));
				PanelAdminGui.handleButtonAction(entity, 11, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + -173, this.guiTop + -91, 30, 20, new StringTextComponent("-"), e -> {
			if (true) {
				McwMod.PACKET_HANDLER.sendToServer(new PanelAdminGui.ButtonPressedMessage(12, x, y, z));
				PanelAdminGui.handleButtonAction(entity, 12, x, y, z);
			}
		}));
	}
}
