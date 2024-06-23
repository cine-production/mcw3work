package net.mcreator.mcw.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.IWorld;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.mcw.McwModVariables;
import net.mcreator.mcw.McwMod;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

public class IfDelta1eg1Procedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				McwMod.LOGGER.warn("Failed to load dependency world for procedure IfDelta1eg1!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				McwMod.LOGGER.warn("Failed to load dependency x for procedure IfDelta1eg1!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				McwMod.LOGGER.warn("Failed to load dependency y for procedure IfDelta1eg1!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				McwMod.LOGGER.warn("Failed to load dependency z for procedure IfDelta1eg1!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				McwMod.LOGGER.warn("Failed to load dependency entity for procedure IfDelta1eg1!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (McwModVariables.MapVariables.get(world).TerminalAttente == true) {
			if (McwModVariables.WorldVariables.get(world).EquipeDELTA1 >= 1) {
				McwModVariables.MapVariables.get(world).TerminalAttente = (false);
				McwModVariables.MapVariables.get(world).syncData(world);
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager()
								.handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "stopsound @s");
					}
				}
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).closeScreen();
				McwModVariables.MapVariables.get(world).DebutPartieTextTerminal = "Debut de la partie dans :";
				McwModVariables.MapVariables.get(world).syncData(world);
				McwModVariables.MapVariables.get(world).DebutPartieTerminal = "5";
				McwModVariables.MapVariables.get(world).syncData(world);
				IFPLAYINGTERMINALProcedure.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z),
								new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
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
						McwModVariables.MapVariables.get(world).DebutPartieTerminal = "4";
						McwModVariables.MapVariables.get(world).syncData(world);
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
								McwModVariables.MapVariables.get(world).DebutPartieTerminal = "3";
								McwModVariables.MapVariables.get(world).syncData(world);
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
										McwModVariables.MapVariables.get(world).DebutPartieTerminal = "2";
										McwModVariables.MapVariables.get(world).syncData(world);
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
												McwModVariables.MapVariables.get(world).DebutPartieTerminal = "1";
												McwModVariables.MapVariables.get(world).syncData(world);
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
														McwModVariables.MapVariables.get(world).DebutPartieTerminal = "";
														McwModVariables.MapVariables.get(world).syncData(world);
														{
															Entity _ent = entity;
															if (!_ent.world.isRemote && _ent.world.getServer() != null) {
																_ent.world.getServer().getCommandManager().handleCommand(
																		_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
																		"stopsound @s");
															}
														}
														{
															Entity _ent = entity;
															if (!_ent.world.isRemote && _ent.world.getServer() != null) {
																_ent.world.getServer().getCommandManager().handleCommand(
																		_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
																		"playsound mcw:spawn neutral @s");
															}
														}
														{
															Entity _ent = entity;
															if (!_ent.world.isRemote && _ent.world.getServer() != null) {
																_ent.world.getServer().getCommandManager().handleCommand(
																		_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
																		"playsound mcw:goodtogo neutral @s");
															}
														}
														McwModVariables.MapVariables
																.get(world).DebutPartieTextTerminal = "\u00E7ebut de la partie dans )";
														McwModVariables.MapVariables.get(world).syncData(world);
														McwModVariables.MapVariables.get(world).TerminalPlaying = (true);
														McwModVariables.MapVariables.get(world).syncData(world);
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
																McwModVariables.MapVariables
																		.get(world).DebutPartieTextTerminal = " \u00F9but de la partie dans$";
																McwModVariables.MapVariables.get(world).syncData(world);
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
																		McwModVariables.MapVariables
																				.get(world).DebutPartieTextTerminal = "  \u00A7ut de la partie dan=";
																		McwModVariables.MapVariables.get(world).syncData(world);
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
																				McwModVariables.MapVariables.get(
																						world).DebutPartieTextTerminal = "   !t de la partie da\u00A3";
																				McwModVariables.MapVariables.get(world).syncData(world);
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
																						McwModVariables.MapVariables.get(
																								world).DebutPartieTextTerminal = "   % de la partie d^";
																						McwModVariables.MapVariables.get(world).syncData(world);
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
																								McwModVariables.MapVariables.get(
																										world).DebutPartieTextTerminal = "    +de la partie }";
																								McwModVariables.MapVariables.get(world)
																										.syncData(world);
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
																									public void tick(
																											TickEvent.ServerTickEvent event) {
																										if (event.phase == TickEvent.Phase.END) {
																											this.ticks += 1;
																											if (this.ticks >= this.waitTicks)
																												run();
																										}
																									}

																									private void run() {
																										McwModVariables.MapVariables.get(
																												world).DebutPartieTextTerminal = "     \\e la partie]";
																										McwModVariables.MapVariables.get(world)
																												.syncData(world);
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
																												McwModVariables.MapVariables.get(
																														world).DebutPartieTextTerminal = "      ( la parti#";
																												McwModVariables.MapVariables
																														.get(world).syncData(world);
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
																														McwModVariables.MapVariables
																																.get(world).DebutPartieTextTerminal = "       |la par@";
																														McwModVariables.MapVariables
																																.get(world)
																																.syncData(world);
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
																																McwModVariables.MapVariables
																																		.get(world).DebutPartieTextTerminal = "        $a pa\u00B5";
																																McwModVariables.MapVariables
																																		.get(world)
																																		.syncData(
																																				world);
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
																																		McwModVariables.MapVariables
																																				.get(world).DebutPartieTextTerminal = "         & p\u00A3";
																																		McwModVariables.MapVariables
																																				.get(world)
																																				.syncData(
																																						world);
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
																																				McwModVariables.MapVariables
																																						.get(world).DebutPartieTextTerminal = "          %";
																																				McwModVariables.MapVariables
																																						.get(world)
																																						.syncData(
																																								world);
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
																																						McwModVariables.MapVariables
																																								.get(world).DebutPartieTextTerminal = " ";
																																						McwModVariables.MapVariables
																																								.get(world)
																																								.syncData(
																																										world);
																																						MinecraftForge.EVENT_BUS
																																								.unregister(
																																										this);
																																					}
																																				}.start(world,
																																						(int) 0.5);
																																				MinecraftForge.EVENT_BUS
																																						.unregister(
																																								this);
																																			}
																																		}.start(world,
																																				(int) 0.5);
																																		MinecraftForge.EVENT_BUS
																																				.unregister(
																																						this);
																																	}
																																}.start(world,
																																		(int) 0.5);
																																MinecraftForge.EVENT_BUS
																																		.unregister(
																																				this);
																															}
																														}.start(world, (int) 0.5);
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
														}.start(world, (int) 0.5);
														MinecraftForge.EVENT_BUS.unregister(this);
													}
												}.start(world, (int) 30);
												MinecraftForge.EVENT_BUS.unregister(this);
											}
										}.start(world, (int) 20);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 20);
								MinecraftForge.EVENT_BUS.unregister(this);
							}
						}.start(world, (int) 20);
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, (int) 20);
			}
		}
	}
}
