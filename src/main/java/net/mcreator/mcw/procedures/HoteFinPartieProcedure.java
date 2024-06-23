package net.mcreator.mcw.procedures;

import net.minecraftforge.fml.network.NetworkHooks;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.network.PacketBuffer;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.mcw.gui.NoirGui;
import net.mcreator.mcw.McwModVariables;
import net.mcreator.mcw.McwMod;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

import io.netty.buffer.Unpooled;

public class HoteFinPartieProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				McwMod.LOGGER.warn("Failed to load dependency world for procedure HoteFinPartie!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				McwMod.LOGGER.warn("Failed to load dependency x for procedure HoteFinPartie!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				McwMod.LOGGER.warn("Failed to load dependency y for procedure HoteFinPartie!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				McwMod.LOGGER.warn("Failed to load dependency z for procedure HoteFinPartie!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				McwMod.LOGGER.warn("Failed to load dependency entity for procedure HoteFinPartie!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new McwModVariables.PlayerVariables())).PlayerAlfa1
				|| (entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new McwModVariables.PlayerVariables())).PlayerAlfa2
				|| (entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new McwModVariables.PlayerVariables())).PlayerAlfa3
				|| (entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new McwModVariables.PlayerVariables())).PlayerAlfa4
				|| (entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new McwModVariables.PlayerVariables())).PlayerAlfa5
				|| (entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new McwModVariables.PlayerVariables())).PlayerAlfa6
				|| (entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new McwModVariables.PlayerVariables())).PlayerAlfa7
				|| (entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new McwModVariables.PlayerVariables())).PlayerAlfa8
				|| (entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new McwModVariables.PlayerVariables())).PlayerDelta2
				|| (entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new McwModVariables.PlayerVariables())).PlayerDelta3
				|| (entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new McwModVariables.PlayerVariables())).PlayerDelta4
				|| (entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new McwModVariables.PlayerVariables())).PlayerDelta5
				|| (entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new McwModVariables.PlayerVariables())).PlayerDelta6
				|| (entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new McwModVariables.PlayerVariables())).PlayerDelta7
				|| (entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new McwModVariables.PlayerVariables())).PlayerDelta8
				|| (entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new McwModVariables.PlayerVariables())).PlayerDelta1) == true) {
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote && _ent.world.getServer() != null) {
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							"stopsound @s");
				}
			}
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote && _ent.world.getServer() != null) {
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							"playsound mcw:defeat neutral @s");
				}
			}
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).closeScreen();
			{
				String _setval = "        $";
				entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.VouD = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private IWorld world;

				public void start(IWorld world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					{
						String _setval = "    \u00A7f\u00A4";
						entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.VouD = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					new Object() {
						private int ticks = 0;
						private float waitTicks;
						private IWorld world;

						public void start(IWorld world, int waitTicks) {
							this.waitTicks = waitTicks;
							MinecraftForge.EVENT_BUS.register(this);
							this.world = world;
						}

						@SubscribeEvent
						public void tick(TickEvent.ServerTickEvent event) {
							if (event.phase == TickEvent.Phase.END) {
								this.ticks += 1;
								if (this.ticks >= this.waitTicks)
									run();
							}
						}

						private void run() {
							{
								String _setval = "    \u00A3s fin +";
								entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.VouD = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							new Object() {
								private int ticks = 0;
								private float waitTicks;
								private IWorld world;

								public void start(IWorld world, int waitTicks) {
									this.waitTicks = waitTicks;
									MinecraftForge.EVENT_BUS.register(this);
									this.world = world;
								}

								@SubscribeEvent
								public void tick(TickEvent.ServerTickEvent event) {
									if (event.phase == TickEvent.Phase.END) {
										this.ticks += 1;
										if (this.ticks >= this.waitTicks)
											run();
									}
								}

								private void run() {
									{
										String _setval = "  &mis fin \u00E0 l[";
										entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.VouD = _setval;
											capability.syncPlayerVariables(entity);
										});
									}
									new Object() {
										private int ticks = 0;
										private float waitTicks;
										private IWorld world;

										public void start(IWorld world, int waitTicks) {
											this.waitTicks = waitTicks;
											MinecraftForge.EVENT_BUS.register(this);
											this.world = world;
										}

										@SubscribeEvent
										public void tick(TickEvent.ServerTickEvent event) {
											if (event.phase == TickEvent.Phase.END) {
												this.ticks += 1;
												if (this.ticks >= this.waitTicks)
													run();
											}
										}

										private void run() {
											{
												String _setval = "#a mis fin \u00E0 la p@";
												entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.VouD = _setval;
													capability.syncPlayerVariables(entity);
												});
											}
											new Object() {
												private int ticks = 0;
												private float waitTicks;
												private IWorld world;

												public void start(IWorld world, int waitTicks) {
													this.waitTicks = waitTicks;
													MinecraftForge.EVENT_BUS.register(this);
													this.world = world;
												}

												@SubscribeEvent
												public void tick(TickEvent.ServerTickEvent event) {
													if (event.phase == TickEvent.Phase.END) {
														this.ticks += 1;
														if (this.ticks >= this.waitTicks)
															run();
													}
												}

												private void run() {
													{
														String _setval = "%e a mis fin \u00E0 la part}";
														entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																.ifPresent(capability -> {
																	capability.VouD = _setval;
																	capability.syncPlayerVariables(entity);
																});
													}
													new Object() {
														private int ticks = 0;
														private float waitTicks;
														private IWorld world;

														public void start(IWorld world, int waitTicks) {
															this.waitTicks = waitTicks;
															MinecraftForge.EVENT_BUS.register(this);
															this.world = world;
														}

														@SubscribeEvent
														public void tick(TickEvent.ServerTickEvent event) {
															if (event.phase == TickEvent.Phase.END) {
																this.ticks += 1;
																if (this.ticks >= this.waitTicks)
																	run();
															}
														}

														private void run() {
															{
																String _setval = "H\u00F4te a mis fin \u00E0 la partie";
																entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																		.ifPresent(capability -> {
																			capability.VouD = _setval;
																			capability.syncPlayerVariables(entity);
																		});
															}
															new Object() {
																private int ticks = 0;
																private float waitTicks;
																private IWorld world;

																public void start(IWorld world, int waitTicks) {
																	this.waitTicks = waitTicks;
																	MinecraftForge.EVENT_BUS.register(this);
																	this.world = world;
																}

																@SubscribeEvent
																public void tick(TickEvent.ServerTickEvent event) {
																	if (event.phase == TickEvent.Phase.END) {
																		this.ticks += 1;
																		if (this.ticks >= this.waitTicks)
																			run();
																	}
																}

																private void run() {
																	{
																		String _setval = "H\u00F4te a mis fin \u00E0 la partie";
																		entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																				.ifPresent(capability -> {
																					capability.VouD = _setval;
																					capability.syncPlayerVariables(entity);
																				});
																	}
																	new Object() {
																		private int ticks = 0;
																		private float waitTicks;
																		private IWorld world;

																		public void start(IWorld world, int waitTicks) {
																			this.waitTicks = waitTicks;
																			MinecraftForge.EVENT_BUS.register(this);
																			this.world = world;
																		}

																		@SubscribeEvent
																		public void tick(TickEvent.ServerTickEvent event) {
																			if (event.phase == TickEvent.Phase.END) {
																				this.ticks += 1;
																				if (this.ticks >= this.waitTicks)
																					run();
																			}
																		}

																		private void run() {
																			{
																				String _setval = "%e a mis fin \u00E0 la part}";
																				entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																						null).ifPresent(capability -> {
																							capability.VouD = _setval;
																							capability.syncPlayerVariables(entity);
																						});
																			}
																			new Object() {
																				private int ticks = 0;
																				private float waitTicks;
																				private IWorld world;

																				public void start(IWorld world, int waitTicks) {
																					this.waitTicks = waitTicks;
																					MinecraftForge.EVENT_BUS.register(this);
																					this.world = world;
																				}

																				@SubscribeEvent
																				public void tick(TickEvent.ServerTickEvent event) {
																					if (event.phase == TickEvent.Phase.END) {
																						this.ticks += 1;
																						if (this.ticks >= this.waitTicks)
																							run();
																					}
																				}

																				private void run() {
																					{
																						String _setval = "#a mis fin \u00E0 la p@";
																						entity.getCapability(
																								McwModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																								.ifPresent(capability -> {
																									capability.VouD = _setval;
																									capability.syncPlayerVariables(entity);
																								});
																					}
																					new Object() {
																						private int ticks = 0;
																						private float waitTicks;
																						private IWorld world;

																						public void start(IWorld world, int waitTicks) {
																							this.waitTicks = waitTicks;
																							MinecraftForge.EVENT_BUS.register(this);
																							this.world = world;
																						}

																						@SubscribeEvent
																						public void tick(TickEvent.ServerTickEvent event) {
																							if (event.phase == TickEvent.Phase.END) {
																								this.ticks += 1;
																								if (this.ticks >= this.waitTicks)
																									run();
																							}
																						}

																						private void run() {
																							{
																								String _setval = "  &mis fin \u00E0 l[";
																								entity.getCapability(
																										McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																										null).ifPresent(capability -> {
																											capability.VouD = _setval;
																											capability.syncPlayerVariables(entity);
																										});
																							}
																							new Object() {
																								private int ticks = 0;
																								private float waitTicks;
																								private IWorld world;

																								public void start(IWorld world, int waitTicks) {
																									this.waitTicks = waitTicks;
																									MinecraftForge.EVENT_BUS.register(this);
																									this.world = world;
																								}

																								@SubscribeEvent
																								public void tick(TickEvent.ServerTickEvent event) {
																									if (event.phase == TickEvent.Phase.END) {
																										this.ticks += 1;
																										if (this.ticks >= this.waitTicks)
																											run();
																									}
																								}

																								private void run() {
																									{
																										String _setval = "    \u00A3s fin +";
																										entity.getCapability(
																												McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																												null).ifPresent(capability -> {
																													capability.VouD = _setval;
																													capability.syncPlayerVariables(
																															entity);
																												});
																									}
																									new Object() {
																										private int ticks = 0;
																										private float waitTicks;
																										private IWorld world;

																										public void start(IWorld world,
																												int waitTicks) {
																											this.waitTicks = waitTicks;
																											MinecraftForge.EVENT_BUS.register(this);
																											this.world = world;
																										}

																										@SubscribeEvent
																										public void tick(
																												TickEvent.ServerTickEvent event) {
																											if (event.phase == TickEvent.Phase.END) {
																												this.ticks += 1;
																												if (this.ticks >= this.waitTicks)
																													run();
																											}
																										}

																										private void run() {
																											{
																												String _setval = "    \u20ACf\u00A4";
																												entity.getCapability(
																														McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																														null)
																														.ifPresent(capability -> {
																															capability.VouD = _setval;
																															capability
																																	.syncPlayerVariables(
																																			entity);
																														});
																											}
																											new Object() {
																												private int ticks = 0;
																												private float waitTicks;
																												private IWorld world;

																												public void start(IWorld world,
																														int waitTicks) {
																													this.waitTicks = waitTicks;
																													MinecraftForge.EVENT_BUS
																															.register(this);
																													this.world = world;
																												}

																												@SubscribeEvent
																												public void tick(
																														TickEvent.ServerTickEvent event) {
																													if (event.phase == TickEvent.Phase.END) {
																														this.ticks += 1;
																														if (this.ticks >= this.waitTicks)
																															run();
																													}
																												}

																												private void run() {
																													{
																														String _setval = "        $";
																														entity.getCapability(
																																McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																																null).ifPresent(
																																		capability -> {
																																			capability.VouD = _setval;
																																			capability
																																					.syncPlayerVariables(
																																							entity);
																																		});
																													}
																													new Object() {
																														private int ticks = 0;
																														private float waitTicks;
																														private IWorld world;

																														public void start(
																																IWorld world,
																																int waitTicks) {
																															this.waitTicks = waitTicks;
																															MinecraftForge.EVENT_BUS
																																	.register(this);
																															this.world = world;
																														}

																														@SubscribeEvent
																														public void tick(
																																TickEvent.ServerTickEvent event) {
																															if (event.phase == TickEvent.Phase.END) {
																																this.ticks += 1;
																																if (this.ticks >= this.waitTicks)
																																	run();
																															}
																														}

																														private void run() {
																															{
																																String _setval = " ";
																																entity.getCapability(
																																		McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																																		null)
																																		.ifPresent(
																																				capability -> {
																																					capability.VouD = _setval;
																																					capability
																																							.syncPlayerVariables(
																																									entity);
																																				});
																															}
																															new Object() {
																																private int ticks = 0;
																																private float waitTicks;
																																private IWorld world;

																																public void start(
																																		IWorld world,
																																		int waitTicks) {
																																	this.waitTicks = waitTicks;
																																	MinecraftForge.EVENT_BUS
																																			.register(
																																					this);
																																	this.world = world;
																																}

																																@SubscribeEvent
																																public void tick(
																																		TickEvent.ServerTickEvent event) {
																																	if (event.phase == TickEvent.Phase.END) {
																																		this.ticks += 1;
																																		if (this.ticks >= this.waitTicks)
																																			run();
																																	}
																																}

																																private void run() {
																																	if ((entity
																																			.getCapability(
																																					McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																																					null)
																																			.orElse(new McwModVariables.PlayerVariables())).PlayerAlfa1 == true) {
																																		{
																																			boolean _setval = (false);
																																			entity.getCapability(
																																					McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																																					null)
																																					.ifPresent(
																																							capability -> {
																																								capability.PlayerAlfa1 = _setval;
																																								capability
																																										.syncPlayerVariables(
																																												entity);
																																							});
																																		}
																																		McwModVariables.MapVariables
																																				.get(world).EquipeALFA1 = (McwModVariables.MapVariables
																																						.get(world).EquipeALFA1
																																						- 1);
																																		McwModVariables.MapVariables
																																				.get(world)
																																				.syncData(
																																						world);
																																		McwModVariables.MapVariables
																																				.get(world).NbJoueurTotalTerminal = (McwModVariables.MapVariables
																																						.get(world).NbJoueurTotalTerminal
																																						- 1);
																																		McwModVariables.MapVariables
																																				.get(world)
																																				.syncData(
																																						world);
																																		{
																																			Entity _ent = entity;
																																			if (!_ent.world.isRemote
																																					&& _ent.world
																																							.getServer() != null) {
																																				_ent.world
																																						.getServer()
																																						.getCommandManager()
																																						.handleCommand(
																																								_ent.getCommandSource()
																																										.withFeedbackDisabled()
																																										.withPermissionLevel(
																																												4),
																																								"tag @s remove Terminal");
																																			}
																																		}
																																	} else if ((entity
																																			.getCapability(
																																					McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																																					null)
																																			.orElse(new McwModVariables.PlayerVariables())).PlayerDelta1 == true) {
																																		{
																																			boolean _setval = (false);
																																			entity.getCapability(
																																					McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																																					null)
																																					.ifPresent(
																																							capability -> {
																																								capability.PlayerDelta1 = _setval;
																																								capability
																																										.syncPlayerVariables(
																																												entity);
																																							});
																																		}
																																		McwModVariables.WorldVariables
																																				.get(world).EquipeDELTA1 = (McwModVariables.WorldVariables
																																						.get(world).EquipeDELTA1
																																						- 1);
																																		McwModVariables.WorldVariables
																																				.get(world)
																																				.syncData(
																																						world);
																																		McwModVariables.MapVariables
																																				.get(world).NbJoueurTotalTerminal = (McwModVariables.MapVariables
																																						.get(world).NbJoueurTotalTerminal
																																						- 1);
																																		McwModVariables.MapVariables
																																				.get(world)
																																				.syncData(
																																						world);
																																		{
																																			Entity _ent = entity;
																																			if (!_ent.world.isRemote
																																					&& _ent.world
																																							.getServer() != null) {
																																				_ent.world
																																						.getServer()
																																						.getCommandManager()
																																						.handleCommand(
																																								_ent.getCommandSource()
																																										.withFeedbackDisabled()
																																										.withPermissionLevel(
																																												4),
																																								"tag @s remove Terminal");
																																			}
																																		}
																																	} else if ((entity
																																			.getCapability(
																																					McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																																					null)
																																			.orElse(new McwModVariables.PlayerVariables())).PlayerAlfa2 == true) {
																																		{
																																			boolean _setval = (false);
																																			entity.getCapability(
																																					McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																																					null)
																																					.ifPresent(
																																							capability -> {
																																								capability.PlayerAlfa2 = _setval;
																																								capability
																																										.syncPlayerVariables(
																																												entity);
																																							});
																																		}
																																		McwModVariables.MapVariables
																																				.get(world).EquipeALFA2 = (McwModVariables.MapVariables
																																						.get(world).EquipeALFA2
																																						- 1);
																																		McwModVariables.MapVariables
																																				.get(world)
																																				.syncData(
																																						world);
																																		McwModVariables.MapVariables
																																				.get(world).NbJoueurTotalLockdown = (McwModVariables.MapVariables
																																						.get(world).NbJoueurTotalLockdown
																																						- 1);
																																		McwModVariables.MapVariables
																																				.get(world)
																																				.syncData(
																																						world);
																																		{
																																			Entity _ent = entity;
																																			if (!_ent.world.isRemote
																																					&& _ent.world
																																							.getServer() != null) {
																																				_ent.world
																																						.getServer()
																																						.getCommandManager()
																																						.handleCommand(
																																								_ent.getCommandSource()
																																										.withFeedbackDisabled()
																																										.withPermissionLevel(
																																												4),
																																								"tag @s remove Lockdown");
																																			}
																																		}
																																	} else if ((entity
																																			.getCapability(
																																					McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																																					null)
																																			.orElse(new McwModVariables.PlayerVariables())).PlayerDelta2 == true) {
																																		{
																																			boolean _setval = (false);
																																			entity.getCapability(
																																					McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																																					null)
																																					.ifPresent(
																																							capability -> {
																																								capability.PlayerDelta2 = _setval;
																																								capability
																																										.syncPlayerVariables(
																																												entity);
																																							});
																																		}
																																		McwModVariables.MapVariables
																																				.get(world).EquipeDELTA2 = (McwModVariables.MapVariables
																																						.get(world).EquipeDELTA2
																																						- 1);
																																		McwModVariables.MapVariables
																																				.get(world)
																																				.syncData(
																																						world);
																																		McwModVariables.MapVariables
																																				.get(world).NbJoueurTotalLockdown = (McwModVariables.MapVariables
																																						.get(world).NbJoueurTotalLockdown
																																						- 1);
																																		McwModVariables.MapVariables
																																				.get(world)
																																				.syncData(
																																						world);
																																		{
																																			Entity _ent = entity;
																																			if (!_ent.world.isRemote
																																					&& _ent.world
																																							.getServer() != null) {
																																				_ent.world
																																						.getServer()
																																						.getCommandManager()
																																						.handleCommand(
																																								_ent.getCommandSource()
																																										.withFeedbackDisabled()
																																										.withPermissionLevel(
																																												4),
																																								"tag @s remove Lockdown");
																																			}
																																		}
																																	} else if ((entity
																																			.getCapability(
																																					McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																																					null)
																																			.orElse(new McwModVariables.PlayerVariables())).PlayerAlfa3 == true) {
																																		{
																																			boolean _setval = (false);
																																			entity.getCapability(
																																					McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																																					null)
																																					.ifPresent(
																																							capability -> {
																																								capability.PlayerAlfa3 = _setval;
																																								capability
																																										.syncPlayerVariables(
																																												entity);
																																							});
																																		}
																																		McwModVariables.MapVariables
																																				.get(world).EquipeALFA3 = (McwModVariables.MapVariables
																																						.get(world).EquipeALFA3
																																						- 1);
																																		McwModVariables.MapVariables
																																				.get(world)
																																				.syncData(
																																						world);
																																		McwModVariables.MapVariables
																																				.get(world).NbJoueurTotalVillage = (McwModVariables.MapVariables
																																						.get(world).NbJoueurTotalVillage
																																						- 1);
																																		McwModVariables.MapVariables
																																				.get(world)
																																				.syncData(
																																						world);
																																		{
																																			Entity _ent = entity;
																																			if (!_ent.world.isRemote
																																					&& _ent.world
																																							.getServer() != null) {
																																				_ent.world
																																						.getServer()
																																						.getCommandManager()
																																						.handleCommand(
																																								_ent.getCommandSource()
																																										.withFeedbackDisabled()
																																										.withPermissionLevel(
																																												4),
																																								"tag @s remove Village");
																																			}
																																		}
																																	} else if ((entity
																																			.getCapability(
																																					McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																																					null)
																																			.orElse(new McwModVariables.PlayerVariables())).PlayerDelta3 == true) {
																																		{
																																			boolean _setval = (false);
																																			entity.getCapability(
																																					McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																																					null)
																																					.ifPresent(
																																							capability -> {
																																								capability.PlayerDelta3 = _setval;
																																								capability
																																										.syncPlayerVariables(
																																												entity);
																																							});
																																		}
																																		McwModVariables.MapVariables
																																				.get(world).EquipeDELTA3 = (McwModVariables.MapVariables
																																						.get(world).EquipeDELTA3
																																						- 1);
																																		McwModVariables.MapVariables
																																				.get(world)
																																				.syncData(
																																						world);
																																		McwModVariables.MapVariables
																																				.get(world).NbJoueurTotalVillage = (McwModVariables.MapVariables
																																						.get(world).NbJoueurTotalVillage
																																						- 1);
																																		McwModVariables.MapVariables
																																				.get(world)
																																				.syncData(
																																						world);
																																		{
																																			Entity _ent = entity;
																																			if (!_ent.world.isRemote
																																					&& _ent.world
																																							.getServer() != null) {
																																				_ent.world
																																						.getServer()
																																						.getCommandManager()
																																						.handleCommand(
																																								_ent.getCommandSource()
																																										.withFeedbackDisabled()
																																										.withPermissionLevel(
																																												4),
																																								"tag @s remove Village");
																																			}
																																		}
																																	} else if ((entity
																																			.getCapability(
																																					McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																																					null)
																																			.orElse(new McwModVariables.PlayerVariables())).PlayerAlfa4 == true) {
																																		{
																																			boolean _setval = (false);
																																			entity.getCapability(
																																					McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																																					null)
																																					.ifPresent(
																																							capability -> {
																																								capability.PlayerAlfa4 = _setval;
																																								capability
																																										.syncPlayerVariables(
																																												entity);
																																							});
																																		}
																																		McwModVariables.MapVariables
																																				.get(world).EquipeALFA4 = (McwModVariables.MapVariables
																																						.get(world).EquipeALFA4
																																						- 1);
																																		McwModVariables.MapVariables
																																				.get(world)
																																				.syncData(
																																						world);
																																		McwModVariables.MapVariables
																																				.get(world).NbJoueurTotalHardhat = (McwModVariables.MapVariables
																																						.get(world).NbJoueurTotalHardhat
																																						- 1);
																																		McwModVariables.MapVariables
																																				.get(world)
																																				.syncData(
																																						world);
																																		{
																																			Entity _ent = entity;
																																			if (!_ent.world.isRemote
																																					&& _ent.world
																																							.getServer() != null) {
																																				_ent.world
																																						.getServer()
																																						.getCommandManager()
																																						.handleCommand(
																																								_ent.getCommandSource()
																																										.withFeedbackDisabled()
																																										.withPermissionLevel(
																																												4),
																																								"tag @s remove Hardhat");
																																			}
																																		}
																																	} else if ((entity
																																			.getCapability(
																																					McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																																					null)
																																			.orElse(new McwModVariables.PlayerVariables())).PlayerDelta4 == true) {
																																		{
																																			boolean _setval = (false);
																																			entity.getCapability(
																																					McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																																					null)
																																					.ifPresent(
																																							capability -> {
																																								capability.PlayerDelta4 = _setval;
																																								capability
																																										.syncPlayerVariables(
																																												entity);
																																							});
																																		}
																																		McwModVariables.MapVariables
																																				.get(world).EquipeDELTA4 = (McwModVariables.MapVariables
																																						.get(world).EquipeDELTA4
																																						- 1);
																																		McwModVariables.MapVariables
																																				.get(world)
																																				.syncData(
																																						world);
																																		McwModVariables.MapVariables
																																				.get(world).NbJoueurTotalHardhat = (McwModVariables.MapVariables
																																						.get(world).NbJoueurTotalHardhat
																																						- 1);
																																		McwModVariables.MapVariables
																																				.get(world)
																																				.syncData(
																																						world);
																																		{
																																			Entity _ent = entity;
																																			if (!_ent.world.isRemote
																																					&& _ent.world
																																							.getServer() != null) {
																																				_ent.world
																																						.getServer()
																																						.getCommandManager()
																																						.handleCommand(
																																								_ent.getCommandSource()
																																										.withFeedbackDisabled()
																																										.withPermissionLevel(
																																												4),
																																								"tag @s remove Hardhat");
																																			}
																																		}
																																	} else if ((entity
																																			.getCapability(
																																					McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																																					null)
																																			.orElse(new McwModVariables.PlayerVariables())).PlayerAlfa5 == true) {
																																		{
																																			boolean _setval = (false);
																																			entity.getCapability(
																																					McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																																					null)
																																					.ifPresent(
																																							capability -> {
																																								capability.PlayerAlfa5 = _setval;
																																								capability
																																										.syncPlayerVariables(
																																												entity);
																																							});
																																		}
																																		McwModVariables.MapVariables
																																				.get(world).EquipeALFA5 = (McwModVariables.MapVariables
																																						.get(world).EquipeALFA5
																																						- 1);
																																		McwModVariables.MapVariables
																																				.get(world)
																																				.syncData(
																																						world);
																																		McwModVariables.MapVariables
																																				.get(world).NbJoueurTotalResistance = (McwModVariables.MapVariables
																																						.get(world).NbJoueurTotalResistance
																																						- 1);
																																		McwModVariables.MapVariables
																																				.get(world)
																																				.syncData(
																																						world);
																																	} else if ((entity
																																			.getCapability(
																																					McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																																					null)
																																			.orElse(new McwModVariables.PlayerVariables())).PlayerDelta5 == true) {
																																		{
																																			boolean _setval = (false);
																																			entity.getCapability(
																																					McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																																					null)
																																					.ifPresent(
																																							capability -> {
																																								capability.PlayerDelta5 = _setval;
																																								capability
																																										.syncPlayerVariables(
																																												entity);
																																							});
																																		}
																																		McwModVariables.MapVariables
																																				.get(world).EquipeDELTA5 = (McwModVariables.MapVariables
																																						.get(world).EquipeDELTA5
																																						- 1);
																																		McwModVariables.MapVariables
																																				.get(world)
																																				.syncData(
																																						world);
																																		McwModVariables.MapVariables
																																				.get(world).NbJoueurTotalResistance = (McwModVariables.MapVariables
																																						.get(world).NbJoueurTotalResistance
																																						- 1);
																																		McwModVariables.MapVariables
																																				.get(world)
																																				.syncData(
																																						world);
																																	} else if ((entity
																																			.getCapability(
																																					McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																																					null)
																																			.orElse(new McwModVariables.PlayerVariables())).PlayerAlfa6 == true) {
																																		{
																																			boolean _setval = (false);
																																			entity.getCapability(
																																					McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																																					null)
																																					.ifPresent(
																																							capability -> {
																																								capability.PlayerAlfa6 = _setval;
																																								capability
																																										.syncPlayerVariables(
																																												entity);
																																							});
																																		}
																																		McwModVariables.MapVariables
																																				.get(world).EquipeALFA6 = (McwModVariables.MapVariables
																																						.get(world).EquipeALFA6
																																						- 1);
																																		McwModVariables.MapVariables
																																				.get(world)
																																				.syncData(
																																						world);
																																		McwModVariables.MapVariables
																																				.get(world).NbJoueurTotalDome = (McwModVariables.MapVariables
																																						.get(world).NbJoueurTotalDome
																																						- 1);
																																		McwModVariables.MapVariables
																																				.get(world)
																																				.syncData(
																																						world);
																																	} else if ((entity
																																			.getCapability(
																																					McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																																					null)
																																			.orElse(new McwModVariables.PlayerVariables())).PlayerDelta6 == true) {
																																		{
																																			boolean _setval = (false);
																																			entity.getCapability(
																																					McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																																					null)
																																					.ifPresent(
																																							capability -> {
																																								capability.PlayerDelta6 = _setval;
																																								capability
																																										.syncPlayerVariables(
																																												entity);
																																							});
																																		}
																																		McwModVariables.MapVariables
																																				.get(world).EquipeDELTA6 = (McwModVariables.MapVariables
																																						.get(world).EquipeDELTA6
																																						- 1);
																																		McwModVariables.MapVariables
																																				.get(world)
																																				.syncData(
																																						world);
																																		McwModVariables.MapVariables
																																				.get(world).NbJoueurTotalDome = (McwModVariables.MapVariables
																																						.get(world).NbJoueurTotalDome
																																						- 1);
																																		McwModVariables.MapVariables
																																				.get(world)
																																				.syncData(
																																						world);
																																	} else if ((entity
																																			.getCapability(
																																					McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																																					null)
																																			.orElse(new McwModVariables.PlayerVariables())).PlayerAlfa7 == true) {
																																		{
																																			boolean _setval = (false);
																																			entity.getCapability(
																																					McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																																					null)
																																					.ifPresent(
																																							capability -> {
																																								capability.PlayerAlfa7 = _setval;
																																								capability
																																										.syncPlayerVariables(
																																												entity);
																																							});
																																		}
																																		McwModVariables.MapVariables
																																				.get(world).EquipeALFA7 = (McwModVariables.MapVariables
																																						.get(world).EquipeALFA7
																																						- 1);
																																		McwModVariables.MapVariables
																																				.get(world)
																																				.syncData(
																																						world);
																																		McwModVariables.MapVariables
																																				.get(world).NbJoueurTotalFallen = (McwModVariables.MapVariables
																																						.get(world).NbJoueurTotalFallen
																																						- 1);
																																		McwModVariables.MapVariables
																																				.get(world)
																																				.syncData(
																																						world);
																																	} else if ((entity
																																			.getCapability(
																																					McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																																					null)
																																			.orElse(new McwModVariables.PlayerVariables())).PlayerDelta7 == true) {
																																		{
																																			boolean _setval = (false);
																																			entity.getCapability(
																																					McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																																					null)
																																					.ifPresent(
																																							capability -> {
																																								capability.PlayerDelta7 = _setval;
																																								capability
																																										.syncPlayerVariables(
																																												entity);
																																							});
																																		}
																																		McwModVariables.MapVariables
																																				.get(world).EquipeDELTA7 = (McwModVariables.MapVariables
																																						.get(world).EquipeDELTA7
																																						- 1);
																																		McwModVariables.MapVariables
																																				.get(world)
																																				.syncData(
																																						world);
																																		McwModVariables.MapVariables
																																				.get(world).NbJoueurTotalFallen = (McwModVariables.MapVariables
																																						.get(world).NbJoueurTotalFallen
																																						- 1);
																																		McwModVariables.MapVariables
																																				.get(world)
																																				.syncData(
																																						world);
																																	} else if ((entity
																																			.getCapability(
																																					McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																																					null)
																																			.orElse(new McwModVariables.PlayerVariables())).PlayerAlfa8 == true) {
																																		{
																																			boolean _setval = (false);
																																			entity.getCapability(
																																					McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																																					null)
																																					.ifPresent(
																																							capability -> {
																																								capability.PlayerAlfa8 = _setval;
																																								capability
																																										.syncPlayerVariables(
																																												entity);
																																							});
																																		}
																																		McwModVariables.MapVariables
																																				.get(world).EquipeALFA8 = (McwModVariables.MapVariables
																																						.get(world).EquipeALFA8
																																						- 1);
																																		McwModVariables.MapVariables
																																				.get(world)
																																				.syncData(
																																						world);
																																		McwModVariables.MapVariables
																																				.get(world).NbJoueurTotalMission = (McwModVariables.MapVariables
																																						.get(world).NbJoueurTotalMission
																																						- 1);
																																		McwModVariables.MapVariables
																																				.get(world)
																																				.syncData(
																																						world);
																																	} else if ((entity
																																			.getCapability(
																																					McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																																					null)
																																			.orElse(new McwModVariables.PlayerVariables())).PlayerDelta8 == true) {
																																		{
																																			boolean _setval = (false);
																																			entity.getCapability(
																																					McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																																					null)
																																					.ifPresent(
																																							capability -> {
																																								capability.PlayerDelta8 = _setval;
																																								capability
																																										.syncPlayerVariables(
																																												entity);
																																							});
																																		}
																																		McwModVariables.MapVariables
																																				.get(world).EquipeDELTA8 = (McwModVariables.MapVariables
																																						.get(world).EquipeDELTA8
																																						- 1);
																																		McwModVariables.MapVariables
																																				.get(world)
																																				.syncData(
																																						world);
																																		McwModVariables.MapVariables
																																				.get(world).NbJoueurTotalMission = (McwModVariables.MapVariables
																																						.get(world).NbJoueurTotalMission
																																						- 1);
																																		McwModVariables.MapVariables
																																				.get(world)
																																				.syncData(
																																						world);
																																	}
																																	{
																																		double _setval = 0;
																																		entity.getCapability(
																																				McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																																				null)
																																				.ifPresent(
																																						capability -> {
																																							capability.Mort = _setval;
																																							capability
																																									.syncPlayerVariables(
																																											entity);
																																						});
																																	}
																																	{
																																		double _setval = 0;
																																		entity.getCapability(
																																				McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																																				null)
																																				.ifPresent(
																																						capability -> {
																																							capability.tue = _setval;
																																							capability
																																									.syncPlayerVariables(
																																											entity);
																																						});
																																	}
																																	if (entity instanceof PlayerEntity)
																																		((PlayerEntity) entity)
																																				.closeScreen();
																																	{
																																		Entity _ent = entity;
																																		if (!_ent.world.isRemote
																																				&& _ent.world
																																						.getServer() != null) {
																																			_ent.world
																																					.getServer()
																																					.getCommandManager()
																																					.handleCommand(
																																							_ent.getCommandSource()
																																									.withFeedbackDisabled()
																																									.withPermissionLevel(
																																											4),
																																							"stopsound @s");
																																		}
																																	}
																																	{
																																		Entity _ent = entity;
																																		if (_ent instanceof ServerPlayerEntity) {
																																			BlockPos _bpos = new BlockPos(
																																					x,
																																					y,
																																					z);
																																			NetworkHooks
																																					.openGui(
																																							(ServerPlayerEntity) _ent,
																																							new INamedContainerProvider() {
																																								@Override
																																								public ITextComponent getDisplayName() {
																																									return new StringTextComponent(
																																											"Noir");
																																								}

																																								@Override
																																								public Container createMenu(
																																										int id,
																																										PlayerInventory inventory,
																																										PlayerEntity player) {
																																									return new NoirGui.GuiContainerMod(
																																											id,
																																											inventory,
																																											new PacketBuffer(
																																													Unpooled.buffer())
																																													.writeBlockPos(
																																															_bpos));
																																								}
																																							},
																																							_bpos);
																																		}
																																	}
																																	new Object() {
																																		private int ticks = 0;
																																		private float waitTicks;
																																		private IWorld world;

																																		public void start(
																																				IWorld world,
																																				int waitTicks) {
																																			this.waitTicks = waitTicks;
																																			MinecraftForge.EVENT_BUS
																																					.register(
																																							this);
																																			this.world = world;
																																		}

																																		@SubscribeEvent
																																		public void tick(
																																				TickEvent.ServerTickEvent event) {
																																			if (event.phase == TickEvent.Phase.END) {
																																				this.ticks += 1;
																																				if (this.ticks >= this.waitTicks)
																																					run();
																																			}
																																		}

																																		private void run() {
																																			{
																																				Entity _ent = entity;
																																				if (!_ent.world.isRemote
																																						&& _ent.world
																																								.getServer() != null) {
																																					_ent.world
																																							.getServer()
																																							.getCommandManager()
																																							.handleCommand(
																																									_ent.getCommandSource()
																																											.withFeedbackDisabled()
																																											.withPermissionLevel(
																																													4),
																																									"stopsound @s");
																																				}
																																			}
																																			MenuOpenProcedure
																																					.executeProcedure(
																																							Stream.of(
																																									new AbstractMap.SimpleEntry<>(
																																											"world",
																																											world),
																																									new AbstractMap.SimpleEntry<>(
																																											"x",
																																											x),
																																									new AbstractMap.SimpleEntry<>(
																																											"y",
																																											y),
																																									new AbstractMap.SimpleEntry<>(
																																											"z",
																																											z),
																																									new AbstractMap.SimpleEntry<>(
																																											"entity",
																																											entity))
																																									.collect(
																																											HashMap::new,
																																											(_m, _e) -> _m
																																													.put(_e.getKey(),
																																															_e.getValue()),
																																											Map::putAll));
																																			{
																																				Entity _ent = entity;
																																				if (!_ent.world.isRemote
																																						&& _ent.world
																																								.getServer() != null) {
																																					_ent.world
																																							.getServer()
																																							.getCommandManager()
																																							.handleCommand(
																																									_ent.getCommandSource()
																																											.withFeedbackDisabled()
																																											.withPermissionLevel(
																																													4),
																																									"playsound mcw:texte neutral @s");
																																				}
																																			}
																																			MinecraftForge.EVENT_BUS
																																					.unregister(
																																							this);
																																		}
																																	}.start(world,
																																			(int) 30);
																																	MinecraftForge.EVENT_BUS
																																			.unregister(
																																					this);
																																}
																															}.start(world, (int) 40);
																															MinecraftForge.EVENT_BUS
																																	.unregister(this);
																														}
																													}.start(world, (int) 0.5);
																													MinecraftForge.EVENT_BUS
																															.unregister(this);
																												}
																											}.start(world, (int) 0.5);
																											MinecraftForge.EVENT_BUS.unregister(this);
																										}
																									}.start(world, (int) 0.5);
																									MinecraftForge.EVENT_BUS.unregister(this);
																								}
																							}.start(world, (int) 0.5);
																							MinecraftForge.EVENT_BUS.unregister(this);
																						}
																					}.start(world, (int) 0.5);
																					MinecraftForge.EVENT_BUS.unregister(this);
																				}
																			}.start(world, (int) 0.5);
																			MinecraftForge.EVENT_BUS.unregister(this);
																		}
																	}.start(world, (int) 0.5);
																	MinecraftForge.EVENT_BUS.unregister(this);
																}
															}.start(world, (int) 200);
															MinecraftForge.EVENT_BUS.unregister(this);
														}
													}.start(world, (int) 0.5);
													MinecraftForge.EVENT_BUS.unregister(this);
												}
											}.start(world, (int) 0.5);
											MinecraftForge.EVENT_BUS.unregister(this);
										}
									}.start(world, (int) 0.5);
									MinecraftForge.EVENT_BUS.unregister(this);
								}
							}.start(world, (int) 0.5);
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, (int) 0.5);
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, (int) 0.5);
		}
	}
}
