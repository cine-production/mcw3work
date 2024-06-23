package net.mcreator.mcw.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.IWorld;
import net.minecraft.entity.Entity;

import net.mcreator.mcw.McwModVariables;
import net.mcreator.mcw.McwMod;

import java.util.Map;
import java.util.HashMap;

public class TentativedecoProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
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
				McwMod.LOGGER.warn("Failed to load dependency world for procedure Tentativedeco!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				McwMod.LOGGER.warn("Failed to load dependency entity for procedure Tentativedeco!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
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
					String _setval = "Recherche avec ping 25ms";
					entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.TentativeCo = _setval;
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
							String _setval = "Aucune partie trouv\u00E9e";
							entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.TentativeCo = _setval;
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
									String _setval = "Recherche avec ping 50ms";
									entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.TentativeCo = _setval;
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
											String _setval = "Aucune partie trouv\u00E9e";
											entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
												capability.TentativeCo = _setval;
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
													String _setval = "Recherche avec ping 75ms";
													entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
														capability.TentativeCo = _setval;
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
															String _setval = "Aucune partie trouv\u00E9e";
															entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																	.ifPresent(capability -> {
																		capability.TentativeCo = _setval;
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
																	String _setval = "Recherche avec ping 100ms";
																	entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																			.ifPresent(capability -> {
																				capability.TentativeCo = _setval;
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
																			String _setval = "Aucune partie trouv\u00E9e";
																			entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																					.ifPresent(capability -> {
																						capability.TentativeCo = _setval;
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
																					String _setval = "Recherche avec ping 125ms";
																					entity.getCapability(McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																							null).ifPresent(capability -> {
																								capability.TentativeCo = _setval;
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
																							String _setval = "Aucune partie trouv\u00E9e";
																							entity.getCapability(
																									McwModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																									.ifPresent(capability -> {
																										capability.TentativeCo = _setval;
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
																									String _setval = "Recherche avec ping 150ms";
																									entity.getCapability(
																											McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																											null).ifPresent(capability -> {
																												capability.TentativeCo = _setval;
																												capability
																														.syncPlayerVariables(entity);
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
																											String _setval = "Aucune partie trouv\u00E9e";
																											entity.getCapability(
																													McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																													null).ifPresent(capability -> {
																														capability.TentativeCo = _setval;
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
																													String _setval = "Recherche avec ping 175ms";
																													entity.getCapability(
																															McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																															null)
																															.ifPresent(capability -> {
																																capability.TentativeCo = _setval;
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
																															String _setval = "Aucune partie trouv\u00E9e";
																															entity.getCapability(
																																	McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																																	null).ifPresent(
																																			capability -> {
																																				capability.TentativeCo = _setval;
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
																																{
																																	String _setval = "Recherche avec ping 200ms";
																																	entity.getCapability(
																																			McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																																			null)
																																			.ifPresent(
																																					capability -> {
																																						capability.TentativeCo = _setval;
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
																																		{
																																			String _setval = "Aucune partie trouv\u00E9e";
																																			entity.getCapability(
																																					McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																																					null)
																																					.ifPresent(
																																							capability -> {
																																								capability.TentativeCo = _setval;
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
																																				{
																																					String _setval = "Recherche avec ping 225ms";
																																					entity.getCapability(
																																							McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																																							null)
																																							.ifPresent(
																																									capability -> {
																																										capability.TentativeCo = _setval;
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
																																						{
																																							String _setval = "Aucune partie trouv\u00E9e";
																																							entity.getCapability(
																																									McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																																									null)
																																									.ifPresent(
																																											capability -> {
																																												capability.TentativeCo = _setval;
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
																																								{
																																									String _setval = "Recherche avec ping 250ms";
																																									entity.getCapability(
																																											McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																																											null)
																																											.ifPresent(
																																													capability -> {
																																														capability.TentativeCo = _setval;
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
																																										{
																																											String _setval = "Aucune partie trouv\u00E9e";
																																											entity.getCapability(
																																													McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																																													null)
																																													.ifPresent(
																																															capability -> {
																																																capability.TentativeCo = _setval;
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
																																												{
																																													String _setval = "Recherche avec ping 275ms";
																																													entity.getCapability(
																																															McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																																															null)
																																															.ifPresent(
																																																	capability -> {
																																																		capability.TentativeCo = _setval;
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
																																														{
																																															String _setval = "Aucune partie trouv\u00E9e";
																																															entity.getCapability(
																																																	McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																	null)
																																																	.ifPresent(
																																																			capability -> {
																																																				capability.TentativeCo = _setval;
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
																																																{
																																																	String _setval = "Recherche avec ping 300ms";
																																																	entity.getCapability(
																																																			McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																			null)
																																																			.ifPresent(
																																																					capability -> {
																																																						capability.TentativeCo = _setval;
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
																																																		{
																																																			String _setval = "Aucune partie trouv\u00E9e";
																																																			entity.getCapability(
																																																					McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																					null)
																																																					.ifPresent(
																																																							capability -> {
																																																								capability.TentativeCo = _setval;
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
																																																				{
																																																					String _setval = "Recherche avec ping 325ms";
																																																					entity.getCapability(
																																																							McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																							null)
																																																							.ifPresent(
																																																									capability -> {
																																																										capability.TentativeCo = _setval;
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
																																																						{
																																																							String _setval = "Aucune partie trouv\u00E9e";
																																																							entity.getCapability(
																																																									McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																									null)
																																																									.ifPresent(
																																																											capability -> {
																																																												capability.TentativeCo = _setval;
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
																																																								{
																																																									String _setval = "Recherche avec ping 350ms";
																																																									entity.getCapability(
																																																											McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																											null)
																																																											.ifPresent(
																																																													capability -> {
																																																														capability.TentativeCo = _setval;
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
																																																										{
																																																											String _setval = "Aucune partie trouv\u00E9e";
																																																											entity.getCapability(
																																																													McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																													null)
																																																													.ifPresent(
																																																															capability -> {
																																																																capability.TentativeCo = _setval;
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
																																																												{
																																																													String _setval = "Recherche avec ping 375ms";
																																																													entity.getCapability(
																																																															McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																															null)
																																																															.ifPresent(
																																																																	capability -> {
																																																																		capability.TentativeCo = _setval;
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
																																																														{
																																																															String _setval = "Aucune partie trouv\u00E9e";
																																																															entity.getCapability(
																																																																	McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																	null)
																																																																	.ifPresent(
																																																																			capability -> {
																																																																				capability.TentativeCo = _setval;
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
																																																																{
																																																																	String _setval = "Recherche avec ping 400ms";
																																																																	entity.getCapability(
																																																																			McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																			null)
																																																																			.ifPresent(
																																																																					capability -> {
																																																																						capability.TentativeCo = _setval;
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
																																																																		{
																																																																			String _setval = "Aucune partie trouv\u00E9e";
																																																																			entity.getCapability(
																																																																					McwModVariables.PLAYER_VARIABLES_CAPABILITY,
																																																																					null)
																																																																					.ifPresent(
																																																																							capability -> {
																																																																								capability.TentativeCo = _setval;
																																																																								capability
																																																																										.syncPlayerVariables(
																																																																												entity);
																																																																							});
																																																																		}
																																																																		MinecraftForge.EVENT_BUS
																																																																				.unregister(
																																																																						this);
																																																																	}
																																																																}.start(world,
																																																																		(int) 40);
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
																																																												}.start(world,
																																																														(int) 40);
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
																																																								}.start(world,
																																																										(int) 40);
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
																																																				}.start(world,
																																																						(int) 40);
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
																																																}.start(world,
																																																		(int) 40);
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
																																												}.start(world,
																																														(int) 40);
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
																																								}.start(world,
																																										(int) 40);
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
																																				}.start(world,
																																						(int) 40);
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
																																}.start(world,
																																		(int) 40);
																																MinecraftForge.EVENT_BUS
																																		.unregister(
																																				this);
																															}
																														}.start(world, (int) 30);
																														MinecraftForge.EVENT_BUS
																																.unregister(this);
																													}
																												}.start(world, (int) 40);
																												MinecraftForge.EVENT_BUS
																														.unregister(this);
																											}
																										}.start(world, (int) 30);
																										MinecraftForge.EVENT_BUS.unregister(this);
																									}
																								}.start(world, (int) 40);
																								MinecraftForge.EVENT_BUS.unregister(this);
																							}
																						}.start(world, (int) 30);
																						MinecraftForge.EVENT_BUS.unregister(this);
																					}
																				}.start(world, (int) 40);
																				MinecraftForge.EVENT_BUS.unregister(this);
																			}
																		}.start(world, (int) 30);
																		MinecraftForge.EVENT_BUS.unregister(this);
																	}
																}.start(world, (int) 40);
																MinecraftForge.EVENT_BUS.unregister(this);
															}
														}.start(world, (int) 30);
														MinecraftForge.EVENT_BUS.unregister(this);
													}
												}.start(world, (int) 40);
												MinecraftForge.EVENT_BUS.unregister(this);
											}
										}.start(world, (int) 30);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 40);
								MinecraftForge.EVENT_BUS.unregister(this);
							}
						}.start(world, (int) 30);
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, (int) 40);
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, (int) 30);
	}
}
