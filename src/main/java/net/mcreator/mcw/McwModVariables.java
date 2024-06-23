package net.mcreator.mcw;

import net.minecraftforge.fml.network.PacketDistributor;
import net.minecraftforge.fml.network.NetworkEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.storage.WorldSavedData;
import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.IServerWorld;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Direction;
import net.minecraft.network.PacketBuffer;
import net.minecraft.nbt.INBT;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.Minecraft;

import java.util.function.Supplier;

public class McwModVariables {
	public McwModVariables(McwModElements elements) {
		elements.addNetworkMessage(WorldSavedDataSyncMessage.class, WorldSavedDataSyncMessage::buffer, WorldSavedDataSyncMessage::new,
				WorldSavedDataSyncMessage::handler);
		elements.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new,
				PlayerVariablesSyncMessage::handler);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::init);
	}

	private void init(FMLCommonSetupEvent event) {
		CapabilityManager.INSTANCE.register(PlayerVariables.class, new PlayerVariablesStorage(), PlayerVariables::new);
	}

	public static String Time = "  ";

	@SubscribeEvent
	public void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		if (!event.getPlayer().world.isRemote()) {
			WorldSavedData mapdata = MapVariables.get(event.getPlayer().world);
			WorldSavedData worlddata = WorldVariables.get(event.getPlayer().world);
			if (mapdata != null)
				McwMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayerEntity) event.getPlayer()),
						new WorldSavedDataSyncMessage(0, mapdata));
			if (worlddata != null)
				McwMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayerEntity) event.getPlayer()),
						new WorldSavedDataSyncMessage(1, worlddata));
		}
	}

	@SubscribeEvent
	public void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
		if (!event.getPlayer().world.isRemote()) {
			WorldSavedData worlddata = WorldVariables.get(event.getPlayer().world);
			if (worlddata != null)
				McwMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayerEntity) event.getPlayer()),
						new WorldSavedDataSyncMessage(1, worlddata));
		}
	}

	public static class WorldVariables extends WorldSavedData {
		public static final String DATA_NAME = "mcw_worldvars";
		public double EquipeDELTA1 = 0.0;

		public WorldVariables() {
			super(DATA_NAME);
		}

		public WorldVariables(String s) {
			super(s);
		}

		@Override
		public void read(CompoundNBT nbt) {
			EquipeDELTA1 = nbt.getDouble("EquipeDELTA1");
		}

		@Override
		public CompoundNBT write(CompoundNBT nbt) {
			nbt.putDouble("EquipeDELTA1", EquipeDELTA1);
			return nbt;
		}

		public void syncData(IWorld world) {
			this.markDirty();
			if (world instanceof World && !world.isRemote())
				McwMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(((World) world)::getDimensionKey),
						new WorldSavedDataSyncMessage(1, this));
		}

		static WorldVariables clientSide = new WorldVariables();

		public static WorldVariables get(IWorld world) {
			if (world instanceof ServerWorld) {
				return ((ServerWorld) world).getSavedData().getOrCreate(WorldVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class MapVariables extends WorldSavedData {
		public static final String DATA_NAME = "mcw_mapvars";
		public double NbpartieDispo = 0.0;
		public double EquipeALFA1 = 0.0;
		public String DebutPartieTerminal = " ";
		public String DebutPartieTextTerminal = "  ";
		public double PlayerPresentInGame = 0;
		public double NbJoueurTotalTerminal = 0;
		public double NbJoueurTotalLockdown = 0;
		public double NbJoueurTotalVillage = 0;
		public double NbJoueurTotalHardhat = 0;
		public double NbJoueurTotalResistance = 0;
		public double NbJoueurTotalDome = 0;
		public double NbJoueurTotalFallen = 0;
		public double NbJoueurTotalMission = 0;
		public String TimeTerminal = "  ";
		public String TimeLockdown = "  ";
		public String TimeVillage = "  ";
		public String TimeHardhat = "  ";
		public String TimeResistance = "  ";
		public String TimeDome = "  ";
		public String TimeFallen = "  ";
		public String TimeMission = "  ";
		public String DebutPartieLockdown = " ";
		public String DebutPartieVillage = " ";
		public String DebutPartieHardhat = " ";
		public String DebutPartieResistance = " ";
		public String DebutPartieDome = " ";
		public String DebutPartieFallen = " ";
		public String DebutPartieMission = " ";
		public String DebutPartieTextLockdown = "  ";
		public String DebutPartieTextVillage = "  ";
		public String DebutPartieTextHardhat = "  ";
		public String DebutPartieTextResistance = "  ";
		public String DebutPartieTextDome = "  ";
		public String DebutPartieTextFallen = "  ";
		public String DebutPartieTextMission = "  ";
		public double EquipeDELTA2 = 0;
		public double EquipeDELTA3 = 0;
		public double EquipeDELTA4 = 0;
		public double EquipeDELTA5 = 0;
		public double EquipeDELTA6 = 0;
		public double EquipeDELTA7 = 0;
		public double EquipeDELTA8 = 0;
		public double EquipeALFA2 = 0;
		public double EquipeALFA3 = 0;
		public double EquipeALFA4 = 0;
		public double EquipeALFA5 = 0;
		public double EquipeALFA6 = 0;
		public double EquipeALFA7 = 0;
		public double EquipeALFA8 = 0;
		public boolean TerminalPlaying = false;
		public boolean LockdownPlaying = false;
		public boolean VillagePlaying = false;
		public boolean HardhatPlaying = false;
		public boolean ResistancePlaying = false;
		public boolean DomePlaying = false;
		public boolean FallenPlaying = false;
		public boolean MissionPlaying = false;
		public boolean TerminalAttente = false;
		public boolean LockdownAttente = false;
		public boolean VillageAttente = false;
		public boolean HardhatAttente = false;
		public boolean ResistanceAttente = false;
		public boolean DomeAttente = false;
		public boolean FallenAttente = false;
		public boolean MissionAttente = false;
		public boolean oneKillTerminal = false;
		public boolean oneKillLockdown = false;
		public boolean oneKillVillage = false;
		public boolean oneKillHardhat = false;
		public boolean oneKillResistance = false;
		public boolean oneKillDome = false;
		public boolean oneKillFallen = false;
		public boolean oneKillMission = false;

		public MapVariables() {
			super(DATA_NAME);
		}

		public MapVariables(String s) {
			super(s);
		}

		@Override
		public void read(CompoundNBT nbt) {
			NbpartieDispo = nbt.getDouble("NbpartieDispo");
			EquipeALFA1 = nbt.getDouble("EquipeALFA1");
			DebutPartieTerminal = nbt.getString("DebutPartieTerminal");
			DebutPartieTextTerminal = nbt.getString("DebutPartieTextTerminal");
			PlayerPresentInGame = nbt.getDouble("PlayerPresentInGame");
			NbJoueurTotalTerminal = nbt.getDouble("NbJoueurTotalTerminal");
			NbJoueurTotalLockdown = nbt.getDouble("NbJoueurTotalLockdown");
			NbJoueurTotalVillage = nbt.getDouble("NbJoueurTotalVillage");
			NbJoueurTotalHardhat = nbt.getDouble("NbJoueurTotalHardhat");
			NbJoueurTotalResistance = nbt.getDouble("NbJoueurTotalResistance");
			NbJoueurTotalDome = nbt.getDouble("NbJoueurTotalDome");
			NbJoueurTotalFallen = nbt.getDouble("NbJoueurTotalFallen");
			NbJoueurTotalMission = nbt.getDouble("NbJoueurTotalMission");
			TimeTerminal = nbt.getString("TimeTerminal");
			TimeLockdown = nbt.getString("TimeLockdown");
			TimeVillage = nbt.getString("TimeVillage");
			TimeHardhat = nbt.getString("TimeHardhat");
			TimeResistance = nbt.getString("TimeResistance");
			TimeDome = nbt.getString("TimeDome");
			TimeFallen = nbt.getString("TimeFallen");
			TimeMission = nbt.getString("TimeMission");
			DebutPartieLockdown = nbt.getString("DebutPartieLockdown");
			DebutPartieVillage = nbt.getString("DebutPartieVillage");
			DebutPartieHardhat = nbt.getString("DebutPartieHardhat");
			DebutPartieResistance = nbt.getString("DebutPartieResistance");
			DebutPartieDome = nbt.getString("DebutPartieDome");
			DebutPartieFallen = nbt.getString("DebutPartieFallen");
			DebutPartieMission = nbt.getString("DebutPartieMission");
			DebutPartieTextLockdown = nbt.getString("DebutPartieTextLockdown");
			DebutPartieTextVillage = nbt.getString("DebutPartieTextVillage");
			DebutPartieTextHardhat = nbt.getString("DebutPartieTextHardhat");
			DebutPartieTextResistance = nbt.getString("DebutPartieTextResistance");
			DebutPartieTextDome = nbt.getString("DebutPartieTextDome");
			DebutPartieTextFallen = nbt.getString("DebutPartieTextFallen");
			DebutPartieTextMission = nbt.getString("DebutPartieTextMission");
			EquipeDELTA2 = nbt.getDouble("EquipeDELTA2");
			EquipeDELTA3 = nbt.getDouble("EquipeDELTA3");
			EquipeDELTA4 = nbt.getDouble("EquipeDELTA4");
			EquipeDELTA5 = nbt.getDouble("EquipeDELTA5");
			EquipeDELTA6 = nbt.getDouble("EquipeDELTA6");
			EquipeDELTA7 = nbt.getDouble("EquipeDELTA7");
			EquipeDELTA8 = nbt.getDouble("EquipeDELTA8");
			EquipeALFA2 = nbt.getDouble("EquipeALFA2");
			EquipeALFA3 = nbt.getDouble("EquipeALFA3");
			EquipeALFA4 = nbt.getDouble("EquipeALFA4");
			EquipeALFA5 = nbt.getDouble("EquipeALFA5");
			EquipeALFA6 = nbt.getDouble("EquipeALFA6");
			EquipeALFA7 = nbt.getDouble("EquipeALFA7");
			EquipeALFA8 = nbt.getDouble("EquipeALFA8");
			TerminalPlaying = nbt.getBoolean("TerminalPlaying");
			LockdownPlaying = nbt.getBoolean("LockdownPlaying");
			VillagePlaying = nbt.getBoolean("VillagePlaying");
			HardhatPlaying = nbt.getBoolean("HardhatPlaying");
			ResistancePlaying = nbt.getBoolean("ResistancePlaying");
			DomePlaying = nbt.getBoolean("DomePlaying");
			FallenPlaying = nbt.getBoolean("FallenPlaying");
			MissionPlaying = nbt.getBoolean("MissionPlaying");
			TerminalAttente = nbt.getBoolean("TerminalAttente");
			LockdownAttente = nbt.getBoolean("LockdownAttente");
			VillageAttente = nbt.getBoolean("VillageAttente");
			HardhatAttente = nbt.getBoolean("HardhatAttente");
			ResistanceAttente = nbt.getBoolean("ResistanceAttente");
			DomeAttente = nbt.getBoolean("DomeAttente");
			FallenAttente = nbt.getBoolean("FallenAttente");
			MissionAttente = nbt.getBoolean("MissionAttente");
			oneKillTerminal = nbt.getBoolean("oneKillTerminal");
			oneKillLockdown = nbt.getBoolean("oneKillLockdown");
			oneKillVillage = nbt.getBoolean("oneKillVillage");
			oneKillHardhat = nbt.getBoolean("oneKillHardhat");
			oneKillResistance = nbt.getBoolean("oneKillResistance");
			oneKillDome = nbt.getBoolean("oneKillDome");
			oneKillFallen = nbt.getBoolean("oneKillFallen");
			oneKillMission = nbt.getBoolean("oneKillMission");
		}

		@Override
		public CompoundNBT write(CompoundNBT nbt) {
			nbt.putDouble("NbpartieDispo", NbpartieDispo);
			nbt.putDouble("EquipeALFA1", EquipeALFA1);
			nbt.putString("DebutPartieTerminal", DebutPartieTerminal);
			nbt.putString("DebutPartieTextTerminal", DebutPartieTextTerminal);
			nbt.putDouble("PlayerPresentInGame", PlayerPresentInGame);
			nbt.putDouble("NbJoueurTotalTerminal", NbJoueurTotalTerminal);
			nbt.putDouble("NbJoueurTotalLockdown", NbJoueurTotalLockdown);
			nbt.putDouble("NbJoueurTotalVillage", NbJoueurTotalVillage);
			nbt.putDouble("NbJoueurTotalHardhat", NbJoueurTotalHardhat);
			nbt.putDouble("NbJoueurTotalResistance", NbJoueurTotalResistance);
			nbt.putDouble("NbJoueurTotalDome", NbJoueurTotalDome);
			nbt.putDouble("NbJoueurTotalFallen", NbJoueurTotalFallen);
			nbt.putDouble("NbJoueurTotalMission", NbJoueurTotalMission);
			nbt.putString("TimeTerminal", TimeTerminal);
			nbt.putString("TimeLockdown", TimeLockdown);
			nbt.putString("TimeVillage", TimeVillage);
			nbt.putString("TimeHardhat", TimeHardhat);
			nbt.putString("TimeResistance", TimeResistance);
			nbt.putString("TimeDome", TimeDome);
			nbt.putString("TimeFallen", TimeFallen);
			nbt.putString("TimeMission", TimeMission);
			nbt.putString("DebutPartieLockdown", DebutPartieLockdown);
			nbt.putString("DebutPartieVillage", DebutPartieVillage);
			nbt.putString("DebutPartieHardhat", DebutPartieHardhat);
			nbt.putString("DebutPartieResistance", DebutPartieResistance);
			nbt.putString("DebutPartieDome", DebutPartieDome);
			nbt.putString("DebutPartieFallen", DebutPartieFallen);
			nbt.putString("DebutPartieMission", DebutPartieMission);
			nbt.putString("DebutPartieTextLockdown", DebutPartieTextLockdown);
			nbt.putString("DebutPartieTextVillage", DebutPartieTextVillage);
			nbt.putString("DebutPartieTextHardhat", DebutPartieTextHardhat);
			nbt.putString("DebutPartieTextResistance", DebutPartieTextResistance);
			nbt.putString("DebutPartieTextDome", DebutPartieTextDome);
			nbt.putString("DebutPartieTextFallen", DebutPartieTextFallen);
			nbt.putString("DebutPartieTextMission", DebutPartieTextMission);
			nbt.putDouble("EquipeDELTA2", EquipeDELTA2);
			nbt.putDouble("EquipeDELTA3", EquipeDELTA3);
			nbt.putDouble("EquipeDELTA4", EquipeDELTA4);
			nbt.putDouble("EquipeDELTA5", EquipeDELTA5);
			nbt.putDouble("EquipeDELTA6", EquipeDELTA6);
			nbt.putDouble("EquipeDELTA7", EquipeDELTA7);
			nbt.putDouble("EquipeDELTA8", EquipeDELTA8);
			nbt.putDouble("EquipeALFA2", EquipeALFA2);
			nbt.putDouble("EquipeALFA3", EquipeALFA3);
			nbt.putDouble("EquipeALFA4", EquipeALFA4);
			nbt.putDouble("EquipeALFA5", EquipeALFA5);
			nbt.putDouble("EquipeALFA6", EquipeALFA6);
			nbt.putDouble("EquipeALFA7", EquipeALFA7);
			nbt.putDouble("EquipeALFA8", EquipeALFA8);
			nbt.putBoolean("TerminalPlaying", TerminalPlaying);
			nbt.putBoolean("LockdownPlaying", LockdownPlaying);
			nbt.putBoolean("VillagePlaying", VillagePlaying);
			nbt.putBoolean("HardhatPlaying", HardhatPlaying);
			nbt.putBoolean("ResistancePlaying", ResistancePlaying);
			nbt.putBoolean("DomePlaying", DomePlaying);
			nbt.putBoolean("FallenPlaying", FallenPlaying);
			nbt.putBoolean("MissionPlaying", MissionPlaying);
			nbt.putBoolean("TerminalAttente", TerminalAttente);
			nbt.putBoolean("LockdownAttente", LockdownAttente);
			nbt.putBoolean("VillageAttente", VillageAttente);
			nbt.putBoolean("HardhatAttente", HardhatAttente);
			nbt.putBoolean("ResistanceAttente", ResistanceAttente);
			nbt.putBoolean("DomeAttente", DomeAttente);
			nbt.putBoolean("FallenAttente", FallenAttente);
			nbt.putBoolean("MissionAttente", MissionAttente);
			nbt.putBoolean("oneKillTerminal", oneKillTerminal);
			nbt.putBoolean("oneKillLockdown", oneKillLockdown);
			nbt.putBoolean("oneKillVillage", oneKillVillage);
			nbt.putBoolean("oneKillHardhat", oneKillHardhat);
			nbt.putBoolean("oneKillResistance", oneKillResistance);
			nbt.putBoolean("oneKillDome", oneKillDome);
			nbt.putBoolean("oneKillFallen", oneKillFallen);
			nbt.putBoolean("oneKillMission", oneKillMission);
			return nbt;
		}

		public void syncData(IWorld world) {
			this.markDirty();
			if (world instanceof World && !world.isRemote())
				McwMod.PACKET_HANDLER.send(PacketDistributor.ALL.noArg(), new WorldSavedDataSyncMessage(0, this));
		}

		static MapVariables clientSide = new MapVariables();

		public static MapVariables get(IWorld world) {
			if (world instanceof IServerWorld) {
				return ((IServerWorld) world).getWorld().getServer().getWorld(World.OVERWORLD).getSavedData().getOrCreate(MapVariables::new,
						DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class WorldSavedDataSyncMessage {
		public int type;
		public WorldSavedData data;

		public WorldSavedDataSyncMessage(PacketBuffer buffer) {
			this.type = buffer.readInt();
			this.data = this.type == 0 ? new MapVariables() : new WorldVariables();
			this.data.read(buffer.readCompoundTag());
		}

		public WorldSavedDataSyncMessage(int type, WorldSavedData data) {
			this.type = type;
			this.data = data;
		}

		public static void buffer(WorldSavedDataSyncMessage message, PacketBuffer buffer) {
			buffer.writeInt(message.type);
			buffer.writeCompoundTag(message.data.write(new CompoundNBT()));
		}

		public static void handler(WorldSavedDataSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					if (message.type == 0)
						MapVariables.clientSide = (MapVariables) message.data;
					else
						WorldVariables.clientSide = (WorldVariables) message.data;
				}
			});
			context.setPacketHandled(true);
		}
	}

	@CapabilityInject(PlayerVariables.class)
	public static Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = null;

	@SubscribeEvent
	public void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
		if (event.getObject() instanceof PlayerEntity && !(event.getObject() instanceof FakePlayer))
			event.addCapability(new ResourceLocation("mcw", "player_variables"), new PlayerVariablesProvider());
	}

	private static class PlayerVariablesProvider implements ICapabilitySerializable<INBT> {
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(PLAYER_VARIABLES_CAPABILITY::getDefaultInstance);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public INBT serializeNBT() {
			return PLAYER_VARIABLES_CAPABILITY.getStorage().writeNBT(PLAYER_VARIABLES_CAPABILITY, this.instance.orElseThrow(RuntimeException::new),
					null);
		}

		@Override
		public void deserializeNBT(INBT nbt) {
			PLAYER_VARIABLES_CAPABILITY.getStorage().readNBT(PLAYER_VARIABLES_CAPABILITY, this.instance.orElseThrow(RuntimeException::new), null,
					nbt);
		}
	}

	private static class PlayerVariablesStorage implements Capability.IStorage<PlayerVariables> {
		@Override
		public INBT writeNBT(Capability<PlayerVariables> capability, PlayerVariables instance, Direction side) {
			CompoundNBT nbt = new CompoundNBT();
			nbt.putString("description", instance.description);
			nbt.putBoolean("menuAudio", instance.menuAudio);
			nbt.putBoolean("menuOPEN", instance.menuOPEN);
			nbt.putBoolean("charOVERLAY", instance.charOVERLAY);
			nbt.putString("TentativeCo", instance.TentativeCo);
			nbt.putBoolean("PlayerInGame", instance.PlayerInGame);
			nbt.putString("Pointreport", instance.Pointreport);
			nbt.putString("VouD", instance.VouD);
			nbt.putBoolean("PlayerAlfa1", instance.PlayerAlfa1);
			nbt.putBoolean("PlayerDelta1", instance.PlayerDelta1);
			nbt.putDouble("Point", instance.Point);
			nbt.putDouble("Mort", instance.Mort);
			nbt.putDouble("tue", instance.tue);
			nbt.putBoolean("PlayerAlfa2", instance.PlayerAlfa2);
			nbt.putBoolean("PlayerAlfa3", instance.PlayerAlfa3);
			nbt.putBoolean("PlayerAlfa4", instance.PlayerAlfa4);
			nbt.putBoolean("PlayerAlfa5", instance.PlayerAlfa5);
			nbt.putBoolean("PlayerAlfa6", instance.PlayerAlfa6);
			nbt.putBoolean("PlayerAlfa7", instance.PlayerAlfa7);
			nbt.putBoolean("PlayerAlfa8", instance.PlayerAlfa8);
			nbt.putBoolean("PlayerDelta2", instance.PlayerDelta2);
			nbt.putBoolean("PlayerDelta3", instance.PlayerDelta3);
			nbt.putBoolean("PlayerDelta4", instance.PlayerDelta4);
			nbt.putBoolean("PlayerDelta5", instance.PlayerDelta5);
			nbt.putBoolean("PlayerDelta6", instance.PlayerDelta6);
			nbt.putBoolean("PlayerDelta7", instance.PlayerDelta7);
			nbt.putBoolean("PlayerDelta8", instance.PlayerDelta8);
			nbt.putBoolean("grenade", instance.grenade);
			nbt.putBoolean("BoxDisconnect", instance.BoxDisconnect);
			nbt.putBoolean("LoadScreenTerminal", instance.LoadScreenTerminal);
			return nbt;
		}

		@Override
		public void readNBT(Capability<PlayerVariables> capability, PlayerVariables instance, Direction side, INBT inbt) {
			CompoundNBT nbt = (CompoundNBT) inbt;
			instance.description = nbt.getString("description");
			instance.menuAudio = nbt.getBoolean("menuAudio");
			instance.menuOPEN = nbt.getBoolean("menuOPEN");
			instance.charOVERLAY = nbt.getBoolean("charOVERLAY");
			instance.TentativeCo = nbt.getString("TentativeCo");
			instance.PlayerInGame = nbt.getBoolean("PlayerInGame");
			instance.Pointreport = nbt.getString("Pointreport");
			instance.VouD = nbt.getString("VouD");
			instance.PlayerAlfa1 = nbt.getBoolean("PlayerAlfa1");
			instance.PlayerDelta1 = nbt.getBoolean("PlayerDelta1");
			instance.Point = nbt.getDouble("Point");
			instance.Mort = nbt.getDouble("Mort");
			instance.tue = nbt.getDouble("tue");
			instance.PlayerAlfa2 = nbt.getBoolean("PlayerAlfa2");
			instance.PlayerAlfa3 = nbt.getBoolean("PlayerAlfa3");
			instance.PlayerAlfa4 = nbt.getBoolean("PlayerAlfa4");
			instance.PlayerAlfa5 = nbt.getBoolean("PlayerAlfa5");
			instance.PlayerAlfa6 = nbt.getBoolean("PlayerAlfa6");
			instance.PlayerAlfa7 = nbt.getBoolean("PlayerAlfa7");
			instance.PlayerAlfa8 = nbt.getBoolean("PlayerAlfa8");
			instance.PlayerDelta2 = nbt.getBoolean("PlayerDelta2");
			instance.PlayerDelta3 = nbt.getBoolean("PlayerDelta3");
			instance.PlayerDelta4 = nbt.getBoolean("PlayerDelta4");
			instance.PlayerDelta5 = nbt.getBoolean("PlayerDelta5");
			instance.PlayerDelta6 = nbt.getBoolean("PlayerDelta6");
			instance.PlayerDelta7 = nbt.getBoolean("PlayerDelta7");
			instance.PlayerDelta8 = nbt.getBoolean("PlayerDelta8");
			instance.grenade = nbt.getBoolean("grenade");
			instance.BoxDisconnect = nbt.getBoolean("BoxDisconnect");
			instance.LoadScreenTerminal = nbt.getBoolean("LoadScreenTerminal");
		}
	}

	public static class PlayerVariables {
		public String description = " ";
		public boolean menuAudio = false;
		public boolean menuOPEN = false;
		public boolean charOVERLAY = false;
		public String TentativeCo = "  ";
		public boolean PlayerInGame = false;
		public String Pointreport = "  ";
		public String VouD = "  ";
		public boolean PlayerAlfa1 = false;
		public boolean PlayerDelta1 = false;
		public double Point = 0;
		public double Mort = 0;
		public double tue = 0;
		public boolean PlayerAlfa2 = false;
		public boolean PlayerAlfa3 = false;
		public boolean PlayerAlfa4 = false;
		public boolean PlayerAlfa5 = false;
		public boolean PlayerAlfa6 = false;
		public boolean PlayerAlfa7 = false;
		public boolean PlayerAlfa8 = false;
		public boolean PlayerDelta2 = false;
		public boolean PlayerDelta3 = false;
		public boolean PlayerDelta4 = false;
		public boolean PlayerDelta5 = false;
		public boolean PlayerDelta6 = false;
		public boolean PlayerDelta7 = false;
		public boolean PlayerDelta8 = false;
		public boolean grenade = false;
		public boolean BoxDisconnect = false;
		public boolean LoadScreenTerminal = false;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayerEntity)
				McwMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayerEntity) entity), new PlayerVariablesSyncMessage(this));
		}
	}

	@SubscribeEvent
	public void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
		if (!event.getPlayer().world.isRemote())
			((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
					.syncPlayerVariables(event.getPlayer());
	}

	@SubscribeEvent
	public void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
		if (!event.getPlayer().world.isRemote())
			((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
					.syncPlayerVariables(event.getPlayer());
	}

	@SubscribeEvent
	public void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
		if (!event.getPlayer().world.isRemote())
			((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
					.syncPlayerVariables(event.getPlayer());
	}

	@SubscribeEvent
	public void clonePlayer(PlayerEvent.Clone event) {
		PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new PlayerVariables()));
		PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
		clone.menuOPEN = original.menuOPEN;
		clone.charOVERLAY = original.charOVERLAY;
		clone.TentativeCo = original.TentativeCo;
		clone.PlayerInGame = original.PlayerInGame;
		clone.VouD = original.VouD;
		clone.PlayerAlfa1 = original.PlayerAlfa1;
		clone.PlayerDelta1 = original.PlayerDelta1;
		clone.Point = original.Point;
		clone.Mort = original.Mort;
		clone.tue = original.tue;
		clone.PlayerAlfa2 = original.PlayerAlfa2;
		clone.PlayerAlfa3 = original.PlayerAlfa3;
		clone.PlayerAlfa4 = original.PlayerAlfa4;
		clone.PlayerAlfa5 = original.PlayerAlfa5;
		clone.PlayerAlfa6 = original.PlayerAlfa6;
		clone.PlayerAlfa7 = original.PlayerAlfa7;
		clone.PlayerAlfa8 = original.PlayerAlfa8;
		clone.PlayerDelta2 = original.PlayerDelta2;
		clone.PlayerDelta3 = original.PlayerDelta3;
		clone.PlayerDelta4 = original.PlayerDelta4;
		clone.PlayerDelta5 = original.PlayerDelta5;
		clone.PlayerDelta6 = original.PlayerDelta6;
		clone.PlayerDelta7 = original.PlayerDelta7;
		clone.PlayerDelta8 = original.PlayerDelta8;
		clone.grenade = original.grenade;
		clone.LoadScreenTerminal = original.LoadScreenTerminal;
		if (!event.isWasDeath()) {
			clone.description = original.description;
			clone.menuAudio = original.menuAudio;
			clone.Pointreport = original.Pointreport;
			clone.BoxDisconnect = original.BoxDisconnect;
		}
	}

	public static class PlayerVariablesSyncMessage {
		public PlayerVariables data;

		public PlayerVariablesSyncMessage(PacketBuffer buffer) {
			this.data = new PlayerVariables();
			new PlayerVariablesStorage().readNBT(null, this.data, null, buffer.readCompoundTag());
		}

		public PlayerVariablesSyncMessage(PlayerVariables data) {
			this.data = data;
		}

		public static void buffer(PlayerVariablesSyncMessage message, PacketBuffer buffer) {
			buffer.writeCompoundTag((CompoundNBT) new PlayerVariablesStorage().writeNBT(null, message.data, null));
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.getCapability(PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new PlayerVariables()));
					variables.description = message.data.description;
					variables.menuAudio = message.data.menuAudio;
					variables.menuOPEN = message.data.menuOPEN;
					variables.charOVERLAY = message.data.charOVERLAY;
					variables.TentativeCo = message.data.TentativeCo;
					variables.PlayerInGame = message.data.PlayerInGame;
					variables.Pointreport = message.data.Pointreport;
					variables.VouD = message.data.VouD;
					variables.PlayerAlfa1 = message.data.PlayerAlfa1;
					variables.PlayerDelta1 = message.data.PlayerDelta1;
					variables.Point = message.data.Point;
					variables.Mort = message.data.Mort;
					variables.tue = message.data.tue;
					variables.PlayerAlfa2 = message.data.PlayerAlfa2;
					variables.PlayerAlfa3 = message.data.PlayerAlfa3;
					variables.PlayerAlfa4 = message.data.PlayerAlfa4;
					variables.PlayerAlfa5 = message.data.PlayerAlfa5;
					variables.PlayerAlfa6 = message.data.PlayerAlfa6;
					variables.PlayerAlfa7 = message.data.PlayerAlfa7;
					variables.PlayerAlfa8 = message.data.PlayerAlfa8;
					variables.PlayerDelta2 = message.data.PlayerDelta2;
					variables.PlayerDelta3 = message.data.PlayerDelta3;
					variables.PlayerDelta4 = message.data.PlayerDelta4;
					variables.PlayerDelta5 = message.data.PlayerDelta5;
					variables.PlayerDelta6 = message.data.PlayerDelta6;
					variables.PlayerDelta7 = message.data.PlayerDelta7;
					variables.PlayerDelta8 = message.data.PlayerDelta8;
					variables.grenade = message.data.grenade;
					variables.BoxDisconnect = message.data.BoxDisconnect;
					variables.LoadScreenTerminal = message.data.LoadScreenTerminal;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
