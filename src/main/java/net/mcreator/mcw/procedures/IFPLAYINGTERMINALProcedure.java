package net.mcreator.mcw.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.IWorld;
import net.minecraft.entity.Entity;

import net.mcreator.mcw.McwModVariables;
import net.mcreator.mcw.McwMod;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

public class IFPLAYINGTERMINALProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				McwMod.LOGGER.warn("Failed to load dependency world for procedure IFPLAYINGTERMINAL!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				McwMod.LOGGER.warn("Failed to load dependency x for procedure IFPLAYINGTERMINAL!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				McwMod.LOGGER.warn("Failed to load dependency y for procedure IFPLAYINGTERMINAL!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				McwMod.LOGGER.warn("Failed to load dependency z for procedure IFPLAYINGTERMINAL!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				McwMod.LOGGER.warn("Failed to load dependency entity for procedure IFPLAYINGTERMINAL!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		double SECONDE = 0;
		double MINUTES = 0;
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
				McwModVariables.MapVariables.get(world).TimeTerminal = "09:59";
				McwModVariables.MapVariables.get(world).syncData(world);
				if (McwModVariables.WorldVariables.get(world).EquipeDELTA1 >= 1 && McwModVariables.MapVariables.get(world).EquipeALFA1 >= 1) {
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
							McwModVariables.MapVariables.get(world).TimeTerminal = "09:58";
							McwModVariables.MapVariables.get(world).syncData(world);
							if (McwModVariables.WorldVariables.get(world).EquipeDELTA1 >= 1
									&& McwModVariables.MapVariables.get(world).EquipeALFA1 >= 1) {
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
										McwModVariables.MapVariables.get(world).TimeTerminal = "09:57";
										McwModVariables.MapVariables.get(world).syncData(world);
										if (McwModVariables.WorldVariables.get(world).EquipeDELTA1 >= 1
												&& McwModVariables.MapVariables.get(world).EquipeALFA1 >= 1) {
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
													McwModVariables.MapVariables.get(world).TimeTerminal = "09:56";
													McwModVariables.MapVariables.get(world).syncData(world);
													if (McwModVariables.WorldVariables.get(world).EquipeDELTA1 >= 1
															&& McwModVariables.MapVariables.get(world).EquipeALFA1 >= 1) {
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
																McwModVariables.MapVariables.get(world).TimeTerminal = "09:55";
																McwModVariables.MapVariables.get(world).syncData(world);
																if (McwModVariables.WorldVariables.get(world).EquipeDELTA1 >= 1
																		&& McwModVariables.MapVariables.get(world).EquipeALFA1 >= 1) {
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
																			McwModVariables.MapVariables.get(world).TimeTerminal = "09:54";
																			McwModVariables.MapVariables.get(world).syncData(world);
																			if (McwModVariables.WorldVariables.get(world).EquipeDELTA1 >= 1
																					&& McwModVariables.MapVariables.get(world).EquipeALFA1 >= 1) {
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
																								.get(world).TimeTerminal = "09:53";
																						McwModVariables.MapVariables.get(world).syncData(world);
																						if (McwModVariables.WorldVariables
																								.get(world).EquipeDELTA1 >= 1
																								&& McwModVariables.MapVariables
																										.get(world).EquipeALFA1 >= 1) {
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
																											.get(world).TimeTerminal = "09:52";
																									McwModVariables.MapVariables.get(world)
																											.syncData(world);
																									if (McwModVariables.WorldVariables
																											.get(world).EquipeDELTA1 >= 1
																											&& McwModVariables.MapVariables
																													.get(world).EquipeALFA1 >= 1) {
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
																														world).TimeTerminal = "09:51";
																												McwModVariables.MapVariables
																														.get(world).syncData(world);
																												if (McwModVariables.WorldVariables
																														.get(world).EquipeDELTA1 >= 1
																														&& McwModVariables.MapVariables
																																.get(world).EquipeALFA1 >= 1) {
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
																															McwModVariables.MapVariables
																																	.get(world).TimeTerminal = "09:50";
																															McwModVariables.MapVariables
																																	.get(world)
																																	.syncData(world);
																															if (McwModVariables.WorldVariables
																																	.get(world).EquipeDELTA1 >= 1
																																	&& McwModVariables.MapVariables
																																			.get(world).EquipeALFA1 >= 1) {
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
																																				.get(world).TimeTerminal = "09:49";
																																		McwModVariables.MapVariables
																																				.get(world)
																																				.syncData(
																																						world);
																																		if (McwModVariables.WorldVariables
																																				.get(world).EquipeDELTA1 >= 1
																																				&& McwModVariables.MapVariables
																																						.get(world).EquipeALFA1 >= 1) {
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
																																							.get(world).TimeTerminal = "09:48";
																																					McwModVariables.MapVariables
																																							.get(world)
																																							.syncData(
																																									world);
																																					if (McwModVariables.WorldVariables
																																							.get(world).EquipeDELTA1 >= 1
																																							&& McwModVariables.MapVariables
																																									.get(world).EquipeALFA1 >= 1) {
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
																																										.get(world).TimeTerminal = "09:47";
																																								McwModVariables.MapVariables
																																										.get(world)
																																										.syncData(
																																												world);
																																								if (McwModVariables.WorldVariables
																																										.get(world).EquipeDELTA1 >= 1
																																										&& McwModVariables.MapVariables
																																												.get(world).EquipeALFA1 >= 1) {
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
																																													.get(world).TimeTerminal = "09:46";
																																											McwModVariables.MapVariables
																																													.get(world)
																																													.syncData(
																																															world);
																																											if (McwModVariables.WorldVariables
																																													.get(world).EquipeDELTA1 >= 1
																																													&& McwModVariables.MapVariables
																																															.get(world).EquipeALFA1 >= 1) {
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
																																																.get(world).TimeTerminal = "09:45";
																																														McwModVariables.MapVariables
																																																.get(world)
																																																.syncData(
																																																		world);
																																														if (McwModVariables.WorldVariables
																																																.get(world).EquipeDELTA1 >= 1
																																																&& McwModVariables.MapVariables
																																																		.get(world).EquipeALFA1 >= 1) {
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
																																																			.get(world).TimeTerminal = "09:44";
																																																	McwModVariables.MapVariables
																																																			.get(world)
																																																			.syncData(
																																																					world);
																																																	if (McwModVariables.WorldVariables
																																																			.get(world).EquipeDELTA1 >= 1
																																																			&& McwModVariables.MapVariables
																																																					.get(world).EquipeALFA1 >= 1) {
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
																																																						.get(world).TimeTerminal = "09:43";
																																																				McwModVariables.MapVariables
																																																						.get(world)
																																																						.syncData(
																																																								world);
																																																				if (McwModVariables.WorldVariables
																																																						.get(world).EquipeDELTA1 >= 1
																																																						&& McwModVariables.MapVariables
																																																								.get(world).EquipeALFA1 >= 1) {
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
																																																									.get(world).TimeTerminal = "09:42";
																																																							McwModVariables.MapVariables
																																																									.get(world)
																																																									.syncData(
																																																											world);
																																																							if (McwModVariables.WorldVariables
																																																									.get(world).EquipeDELTA1 >= 1
																																																									&& McwModVariables.MapVariables
																																																											.get(world).EquipeALFA1 >= 1) {
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
																																																												.get(world).TimeTerminal = "09:41";
																																																										McwModVariables.MapVariables
																																																												.get(world)
																																																												.syncData(
																																																														world);
																																																										if (McwModVariables.WorldVariables
																																																												.get(world).EquipeDELTA1 >= 1
																																																												&& McwModVariables.MapVariables
																																																														.get(world).EquipeALFA1 >= 1) {
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
																																																															.get(world).TimeTerminal = "09:40";
																																																													McwModVariables.MapVariables
																																																															.get(world)
																																																															.syncData(
																																																																	world);
																																																													if (McwModVariables.WorldVariables
																																																															.get(world).EquipeDELTA1 >= 1
																																																															&& McwModVariables.MapVariables
																																																																	.get(world).EquipeALFA1 >= 1) {
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
																																																																		.get(world).TimeTerminal = "09:39";
																																																																McwModVariables.MapVariables
																																																																		.get(world)
																																																																		.syncData(
																																																																				world);
																																																																if (McwModVariables.WorldVariables
																																																																		.get(world).EquipeDELTA1 >= 1
																																																																		&& McwModVariables.MapVariables
																																																																				.get(world).EquipeALFA1 >= 1) {
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
																																																																					.get(world).TimeTerminal = "09:38";
																																																																			McwModVariables.MapVariables
																																																																					.get(world)
																																																																					.syncData(
																																																																							world);
																																																																			if (McwModVariables.WorldVariables
																																																																					.get(world).EquipeDELTA1 >= 1
																																																																					&& McwModVariables.MapVariables
																																																																							.get(world).EquipeALFA1 >= 1) {
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
																																																																								.get(world).TimeTerminal = "09:37";
																																																																						McwModVariables.MapVariables
																																																																								.get(world)
																																																																								.syncData(
																																																																										world);
																																																																						if (McwModVariables.WorldVariables
																																																																								.get(world).EquipeDELTA1 >= 1
																																																																								&& McwModVariables.MapVariables
																																																																										.get(world).EquipeALFA1 >= 1) {
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
																																																																											.get(world).TimeTerminal = "09:36";
																																																																									McwModVariables.MapVariables
																																																																											.get(world)
																																																																											.syncData(
																																																																													world);
																																																																									if (McwModVariables.WorldVariables
																																																																											.get(world).EquipeDELTA1 >= 1
																																																																											&& McwModVariables.MapVariables
																																																																													.get(world).EquipeALFA1 >= 1) {
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
																																																																														.get(world).TimeTerminal = "09:35";
																																																																												McwModVariables.MapVariables
																																																																														.get(world)
																																																																														.syncData(
																																																																																world);
																																																																												if (McwModVariables.WorldVariables
																																																																														.get(world).EquipeDELTA1 >= 1
																																																																														&& McwModVariables.MapVariables
																																																																																.get(world).EquipeALFA1 >= 1) {
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
																																																																																	.get(world).TimeTerminal = "09:34";
																																																																															McwModVariables.MapVariables
																																																																																	.get(world)
																																																																																	.syncData(
																																																																																			world);
																																																																															if (McwModVariables.WorldVariables
																																																																																	.get(world).EquipeDELTA1 >= 1
																																																																																	&& McwModVariables.MapVariables
																																																																																			.get(world).EquipeALFA1 >= 1) {
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
																																																																																				.get(world).TimeTerminal = "09:33";
																																																																																		McwModVariables.MapVariables
																																																																																				.get(world)
																																																																																				.syncData(
																																																																																						world);
																																																																																		if (McwModVariables.WorldVariables
																																																																																				.get(world).EquipeDELTA1 >= 1
																																																																																				&& McwModVariables.MapVariables
																																																																																						.get(world).EquipeALFA1 >= 1) {
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
																																																																																							.get(world).TimeTerminal = "09:32";
																																																																																					McwModVariables.MapVariables
																																																																																							.get(world)
																																																																																							.syncData(
																																																																																									world);
																																																																																					if (McwModVariables.WorldVariables
																																																																																							.get(world).EquipeDELTA1 >= 1
																																																																																							&& McwModVariables.MapVariables
																																																																																									.get(world).EquipeALFA1 >= 1) {
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
																																																																																										.get(world).TimeTerminal = "09:31";
																																																																																								McwModVariables.MapVariables
																																																																																										.get(world)
																																																																																										.syncData(
																																																																																												world);
																																																																																								if (McwModVariables.WorldVariables
																																																																																										.get(world).EquipeDELTA1 >= 1
																																																																																										&& McwModVariables.MapVariables
																																																																																												.get(world).EquipeALFA1 >= 1) {
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
																																																																																													.get(world).TimeTerminal = "09:30";
																																																																																											McwModVariables.MapVariables
																																																																																													.get(world)
																																																																																													.syncData(
																																																																																															world);
																																																																																											MinecraftForge.EVENT_BUS
																																																																																													.unregister(
																																																																																															this);
																																																																																										}
																																																																																									}.start(world,
																																																																																											(int) 20);
																																																																																								} else {
																																																																																									HoteFinPartieProcedure
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
																																																																																								}
																																																																																								MinecraftForge.EVENT_BUS
																																																																																										.unregister(
																																																																																												this);
																																																																																							}
																																																																																						}.start(world,
																																																																																								(int) 20);
																																																																																					} else {
																																																																																						HoteFinPartieProcedure
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
																																																																																					}
																																																																																					MinecraftForge.EVENT_BUS
																																																																																							.unregister(
																																																																																									this);
																																																																																				}
																																																																																			}.start(world,
																																																																																					(int) 20);
																																																																																		} else {
																																																																																			HoteFinPartieProcedure
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
																																																																																		}
																																																																																		MinecraftForge.EVENT_BUS
																																																																																				.unregister(
																																																																																						this);
																																																																																	}
																																																																																}.start(world,
																																																																																		(int) 20);
																																																																															} else {
																																																																																HoteFinPartieProcedure
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
																																																																															}
																																																																															MinecraftForge.EVENT_BUS
																																																																																	.unregister(
																																																																																			this);
																																																																														}
																																																																													}.start(world,
																																																																															(int) 20);
																																																																												} else {
																																																																													HoteFinPartieProcedure
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
																																																																												}
																																																																												MinecraftForge.EVENT_BUS
																																																																														.unregister(
																																																																																this);
																																																																											}
																																																																										}.start(world,
																																																																												(int) 20);
																																																																									} else {
																																																																										HoteFinPartieProcedure
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
																																																																									}
																																																																									MinecraftForge.EVENT_BUS
																																																																											.unregister(
																																																																													this);
																																																																								}
																																																																							}.start(world,
																																																																									(int) 20);
																																																																						} else {
																																																																							HoteFinPartieProcedure
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
																																																																						}
																																																																						MinecraftForge.EVENT_BUS
																																																																								.unregister(
																																																																										this);
																																																																					}
																																																																				}.start(world,
																																																																						(int) 20);
																																																																			} else {
																																																																				HoteFinPartieProcedure
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
																																																																			}
																																																																			MinecraftForge.EVENT_BUS
																																																																					.unregister(
																																																																							this);
																																																																		}
																																																																	}.start(world,
																																																																			(int) 20);
																																																																} else {
																																																																	HoteFinPartieProcedure
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
																																																																}
																																																																MinecraftForge.EVENT_BUS
																																																																		.unregister(
																																																																				this);
																																																															}
																																																														}.start(world,
																																																																(int) 20);
																																																													} else {
																																																														HoteFinPartieProcedure
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
																																																													}
																																																													MinecraftForge.EVENT_BUS
																																																															.unregister(
																																																																	this);
																																																												}
																																																											}.start(world,
																																																													(int) 20);
																																																										} else {
																																																											HoteFinPartieProcedure
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
																																																										}
																																																										MinecraftForge.EVENT_BUS
																																																												.unregister(
																																																														this);
																																																									}
																																																								}.start(world,
																																																										(int) 20);
																																																							} else {
																																																								HoteFinPartieProcedure
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
																																																							}
																																																							MinecraftForge.EVENT_BUS
																																																									.unregister(
																																																											this);
																																																						}
																																																					}.start(world,
																																																							(int) 20);
																																																				} else {
																																																					HoteFinPartieProcedure
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
																																																				}
																																																				MinecraftForge.EVENT_BUS
																																																						.unregister(
																																																								this);
																																																			}
																																																		}.start(world,
																																																				(int) 20);
																																																	} else {
																																																		HoteFinPartieProcedure
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
																																																	}
																																																	MinecraftForge.EVENT_BUS
																																																			.unregister(
																																																					this);
																																																}
																																															}.start(world,
																																																	(int) 20);
																																														} else {
																																															HoteFinPartieProcedure
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
																																														}
																																														MinecraftForge.EVENT_BUS
																																																.unregister(
																																																		this);
																																													}
																																												}.start(world,
																																														(int) 20);
																																											} else {
																																												HoteFinPartieProcedure
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
																																											}
																																											MinecraftForge.EVENT_BUS
																																													.unregister(
																																															this);
																																										}
																																									}.start(world,
																																											(int) 20);
																																								} else {
																																									HoteFinPartieProcedure
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
																																								}
																																								MinecraftForge.EVENT_BUS
																																										.unregister(
																																												this);
																																							}
																																						}.start(world,
																																								(int) 20);
																																					} else {
																																						HoteFinPartieProcedure
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
																																					}
																																					MinecraftForge.EVENT_BUS
																																							.unregister(
																																									this);
																																				}
																																			}.start(world,
																																					(int) 20);
																																		} else {
																																			HoteFinPartieProcedure
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
																																		}
																																		MinecraftForge.EVENT_BUS
																																				.unregister(
																																						this);
																																	}
																																}.start(world,
																																		(int) 20);
																															} else {
																																HoteFinPartieProcedure
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
																															}
																															MinecraftForge.EVENT_BUS
																																	.unregister(this);
																														}
																													}.start(world, (int) 20);
																												} else {
																													HoteFinPartieProcedure
																															.executeProcedure(Stream
																																	.of(new AbstractMap.SimpleEntry<>(
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
																												}
																												MinecraftForge.EVENT_BUS
																														.unregister(this);
																											}
																										}.start(world, (int) 20);
																									} else {
																										HoteFinPartieProcedure.executeProcedure(Stream
																												.of(new AbstractMap.SimpleEntry<>(
																														"world", world),
																														new AbstractMap.SimpleEntry<>(
																																"x", x),
																														new AbstractMap.SimpleEntry<>(
																																"y", y),
																														new AbstractMap.SimpleEntry<>(
																																"z", z),
																														new AbstractMap.SimpleEntry<>(
																																"entity", entity))
																												.collect(HashMap::new,
																														(_m, _e) -> _m.put(
																																_e.getKey(),
																																_e.getValue()),
																														Map::putAll));
																									}
																									MinecraftForge.EVENT_BUS.unregister(this);
																								}
																							}.start(world, (int) 20);
																						} else {
																							HoteFinPartieProcedure.executeProcedure(Stream
																									.of(new AbstractMap.SimpleEntry<>("world", world),
																											new AbstractMap.SimpleEntry<>("x", x),
																											new AbstractMap.SimpleEntry<>("y", y),
																											new AbstractMap.SimpleEntry<>("z", z),
																											new AbstractMap.SimpleEntry<>("entity",
																													entity))
																									.collect(
																											HashMap::new, (_m, _e) -> _m
																													.put(_e.getKey(), _e.getValue()),
																											Map::putAll));
																						}
																						MinecraftForge.EVENT_BUS.unregister(this);
																					}
																				}.start(world, (int) 20);
																			} else {
																				HoteFinPartieProcedure.executeProcedure(Stream
																						.of(new AbstractMap.SimpleEntry<>("world", world),
																								new AbstractMap.SimpleEntry<>("x", x),
																								new AbstractMap.SimpleEntry<>("y", y),
																								new AbstractMap.SimpleEntry<>("z", z),
																								new AbstractMap.SimpleEntry<>("entity", entity))
																						.collect(HashMap::new,
																								(_m, _e) -> _m.put(_e.getKey(), _e.getValue()),
																								Map::putAll));
																			}
																			MinecraftForge.EVENT_BUS.unregister(this);
																		}
																	}.start(world, (int) 20);
																} else {
																	HoteFinPartieProcedure.executeProcedure(Stream
																			.of(new AbstractMap.SimpleEntry<>("world", world),
																					new AbstractMap.SimpleEntry<>("x", x),
																					new AbstractMap.SimpleEntry<>("y", y),
																					new AbstractMap.SimpleEntry<>("z", z),
																					new AbstractMap.SimpleEntry<>("entity", entity))
																			.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()),
																					Map::putAll));
																}
																MinecraftForge.EVENT_BUS.unregister(this);
															}
														}.start(world, (int) 20);
													} else {
														HoteFinPartieProcedure.executeProcedure(Stream.of(
																new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
																new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z),
																new AbstractMap.SimpleEntry<>("entity", entity))
																.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
													}
													MinecraftForge.EVENT_BUS.unregister(this);
												}
											}.start(world, (int) 20);
										} else {
											HoteFinPartieProcedure.executeProcedure(Stream
													.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
															new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z),
															new AbstractMap.SimpleEntry<>("entity", entity))
													.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
										}
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 20);
							} else {
								HoteFinPartieProcedure.executeProcedure(Stream
										.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
												new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z),
												new AbstractMap.SimpleEntry<>("entity", entity))
										.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
							}
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, (int) 20);
				} else {
					HoteFinPartieProcedure.executeProcedure(Stream
							.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
									new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z),
									new AbstractMap.SimpleEntry<>("entity", entity))
							.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
				}
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, (int) 100);
	}
}
