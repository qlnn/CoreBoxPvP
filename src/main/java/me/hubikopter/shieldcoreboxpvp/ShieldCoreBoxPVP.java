package me.hubikopter.shieldcoreboxpvp;

import com.google.common.io.BaseEncoding;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import me.clip.placeholderapi.expansion.NMSVersion;
import me.hubikopter.shieldcoreboxpvp.commands.*;
import me.hubikopter.shieldcoreboxpvp.listeners.*;
import me.hubikopter.shieldcoreboxpvp.runnables.SettingsRunnable;
import org.bukkit.*;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.serialization.ConfigurationSerialization;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

import java.io.*;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.*;

public final class ShieldCoreBoxPVP extends JavaPlugin implements Listener {
    public static FileConfiguration bany;
    private static ShieldCoreBoxPVP instance;
    public ArrayList<Material> itemy;



    public Utils api;

    public GeneratorManager api2;

    public int counter = 120;

    int counter2 = 360;

    int counter3 = 160;

    int config = 15;

    int czasgry = 60;

    int wyspa = 300;

    int strefaafk = 100;
    int random = 60;
    int clearlag = 120;
    public static ShieldCoreBoxPVP plugin;

    ArrayList<Material> bloki;



    Map<String, Integer> afks;


    public ShieldCoreBoxPVP() {
        this.bloki = new ArrayList<>();
        this.itemy = new ArrayList<>();

        this.afks = new HashMap<>();
        plugin = this;
    }


    public static ArrayList<String> spr = new ArrayList<String>();
    public static ArrayList<String> spawn = new ArrayList<String>();
    public static HashMap<String, Location> loc = new HashMap<String, Location>();

    public static HashMap<String, String> wb = new HashMap<String, String>();
    public static HashMap<String, String > wm = new HashMap<String, String>();
    public static HashMap<String, String> sm = new HashMap<String, String>();





    public static ShieldCoreBoxPVP INSTANCE;
    private BufferedReader in;
    private String prefix = "§8[§cBany§8] §r";
    public void onEnable() {
        getConfig().options().copyDefaults(true);
        saveConfig();

        new Papi(this).register();
        this.bloki.add(Material.DIAMOND_ORE);
        this.bloki.add(Material.EMERALD_ORE);
        this.bloki.add(Material.OBSIDIAN);
        this.bloki.add(Material.SPONGE);
        this.bloki.add(Material.LAPIS_ORE);
        this.bloki.add(Material.GOLD_ORE);
        this.bloki.add(Material.SHULKER_BOX);
        this.bloki.add(Material.COBWEB);
        this.bloki.add(Material.HONEYCOMB_BLOCK);
        this.bloki.add(Material.DIAMOND_BLOCK);
        this.bloki.add(Material.OAK_PLANKS);
        this.bloki.add(Material.EMERALD_BLOCK);
        this.bloki.add(Material.GOLD_BLOCK);
        this.bloki.add(Material.IRON_BLOCK);
        this.bloki.add(Material.GOLD_ORE);
        bloki.add(Material.IRON_ORE);
        itemy.add(Material.GOLDEN_APPLE);
        itemy.add(Material.ENCHANTED_GOLDEN_APPLE);
        itemy.add(Material.COOKED_BEEF);
        itemy.add(Material.GOLDEN_CARROT);






        saveDefaultConfig();
        bany=getConfig();
        SettingsRunnable settingsRunnable = new SettingsRunnable(this);

        this.getServer().getScheduler().runTaskTimerAsynchronously(this, settingsRunnable, 100, 20);

        instance = this;
        this.api = new Utils(this);
        getServer().getPluginManager().registerEvents(this, this);
        getServer().getPluginManager().registerEvents(new PlayerJoinEvent(this), this);
        getServer().getPluginManager().registerEvents(new ConsumeListener(this), this);

        getServer().getPluginManager().registerEvents(new Ondead(this), this);
        getServer().getPluginManager().registerEvents(new onDamage(), this);
        getServer().getPluginManager().registerEvents(new UstawieniaGuiListener(), this);

        getServer().getPluginManager().registerEvents(new BlockPlaceEvent(this), this);
        getCommand("top").setExecutor(new TopCommand(this));
        getCommand("stats").setExecutor(new StatsCommand(this));
        getCommand("vanish").setExecutor(new VasnishCommand(this));
        getCommand("kowal").setExecutor(new KowalCommand(this));
        getCommand("ustawienia").setExecutor(new UstawieniaCommand());
        getCommand("daily").setExecutor(new DailyCommand());
        getCommand("pomoc").setExecutor(new PomocCommand());
        getCommand("sklepzabojstwa").setExecutor(new Sklepzabojstwa(this));


        getServer().getPluginManager().registerEvents(new Listeners(this), this);
        getServer().getPluginManager().registerEvents(new ChatListener(this), this);
        getServer().getPluginManager().registerEvents(new PrefixyListener(this), this);
        getServer().getPluginManager().registerEvents(new CzasGryListener(this), this);
        getServer().getPluginManager().registerEvents(new BBlISTENER(), this);
        getServer().getPluginManager().registerEvents(new KitListener(this), this);


        INSTANCE = this;



        ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
        this.api2 = new GeneratorManager();
        getServer().getPluginManager().registerEvents(this, this);
        getCommand("zrzut").setExecutor(new ZrzutCommand());
        getCommand("tphere").setExecutor(new TphCommand());
        getCommand("msg").setExecutor(new MsgCommand());
        getCommand("fly").setExecutor(new FlyCommand());
        getCommand("bc").setExecutor(new BCCommand());
        getCommand("spawn").setExecutor(new SpawnCommand(this));
        getCommand("ec").setExecutor(new EnderchestCommand());
        getCommand("invsee").setExecutor(new InvseeCommand());
        getCommand("bezpieczna").setExecutor(new BezpiecznaCommand());
        getCommand("uuid").setExecutor(new UUIDCommand());
        getCommand("serca").setExecutor(new RemoveHeart());
        getCommand("heal").setExecutor(new HealCommand());
        getCommand("clear").setExecutor(new ClearCommand());
        getCommand("discord").setExecutor((new DiscordCommand()));
        getCommand("money").setExecutor(new MoneyCommand(this));
        getCommand("bloki").setExecutor(new BlokiCommand());
        getCommand("sklep").setExecutor(new SklepCommand(this));
        getCommand("sklepzamonety").setExecutor(new SklepzamonetyCommand(this));
        getCommand("nickcolor").setExecutor(new NickColor(this));
        getCommand("sklepkolory").setExecutor(new Sklepkolory(this));
        getCommand("sklepprefixy").setExecutor(new Sklepprefixy(this));
        getCommand("warp").setExecutor(new WarpCommand());
        getCommand("sklepzaczas").setExecutor(new SklepzaczasCommand(this));
        getCommand("kit").setExecutor(new KitCommand());
        getCommand("lobby").setExecutor(new LobbyCommand());
        getCommand("kick").setExecutor(new KickCommand());
        getCommand("helpop").setExecutor(new ReportCommand());
        getCommand("chat").setExecutor(new ChatCommand());
        getCommand("rynek").setExecutor(new RynekCommand());

        getCommand("sprawdz").setExecutor(new SprawdzCommand(this));



        getServer().getMessenger().registerOutgoingPluginChannel(this, "BungeeCord");









        Date date = new Date();
        SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        String stringDate = DateFor.format(date);

        (new BukkitRunnable() {
            public void run() {


                ShieldCoreBoxPVP.this.counter--;
                ShieldCoreBoxPVP.this.counter2--;
                ShieldCoreBoxPVP.this.counter3--;
                ShieldCoreBoxPVP.this.config--;
                ShieldCoreBoxPVP.this.czasgry--;
                ShieldCoreBoxPVP.this.wyspa--;
                ShieldCoreBoxPVP.this.random--;
                ShieldCoreBoxPVP.this.clearlag--;

                for (Player online10 : Bukkit.getOnlinePlayers()) {
                    if (online10.getWorld().equals("world")) {
                        World world = Bukkit.getWorld("boxpvp");
                        Location loc = new Location(world, 0, 54, 13);
                        online10.teleport(loc);
                    }
                }



                for (Player online : Bukkit.getOnlinePlayers())
                    for (int i = 0; i < 200; i++) {
                        if (online.getInventory().containsAtLeast(new ItemStack(Material.DIAMOND_BLOCK), 20)) {
                            online.getInventory().removeItem(new ItemStack[]{new ItemStack(Material.DIAMOND_BLOCK, 20)});
                            ItemStack moneta = new ItemStack(Material.GOLD_NUGGET);
                            ItemMeta monetameta = moneta.getItemMeta();
                            monetameta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&x&f&b&e&5&1&dM&x&f&6&e&a&2&3o&x&f&1&e&f&2&8n&x&e&c&f&3&2&ee&x&e&7&f&8&3&3t&x&e&2&f&d&3&9a &6✯1"));
                            monetameta.setLore(Arrays.asList(" ", "§8▪ §7Służy do wymiany w sklepie!"));
                            moneta.setItemMeta(monetameta);
                            for (int i2 = 0; i2 < 10; i2++) {
                                online.getInventory().addItem(moneta);
                            }
                        }
                        if (online.getInventory().containsAtLeast(new ItemStack(Material.EMERALD_BLOCK), 20)) {
                            online.getInventory().removeItem(new ItemStack[]{new ItemStack(Material.EMERALD_BLOCK, 20)});
                            ItemStack moneta = new ItemStack(Material.GOLD_NUGGET);
                            ItemMeta monetameta = moneta.getItemMeta();
                            monetameta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&x&f&b&e&5&1&dM&x&f&6&e&a&2&3o&x&f&1&e&f&2&8n&x&e&c&f&3&2&ee&x&e&7&f&8&3&3t&x&e&2&f&d&3&9a &6✯1"));
                            monetameta.setLore(Arrays.asList(" ", "§8▪ §7Służy do wymiany w sklepie!"));
                            moneta.setItemMeta(monetameta);
                            for (int i2 = 0; i2 < 30; i2++) {
                                online.getInventory().addItem(moneta);
                            }
                        }
                        if (online.getInventory().containsAtLeast(new ItemStack(Material.GOLD_BLOCK), 20)) {
                            online.getInventory().removeItem(new ItemStack[]{new ItemStack(Material.GOLD_BLOCK, 20)});
                            ItemStack moneta = new ItemStack(Material.GOLD_NUGGET);
                            ItemMeta monetameta = moneta.getItemMeta();
                            monetameta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&x&f&b&e&5&1&dM&x&f&6&e&a&2&3o&x&f&1&e&f&2&8n&x&e&c&f&3&2&ee&x&e&7&f&8&3&3t&x&e&2&f&d&3&9a &6✯1"));
                            monetameta.setLore(Arrays.asList(" ", "§8▪ §7Służy do wymiany w sklepie!"));
                            moneta.setItemMeta(monetameta);
                            for (int i2 = 0; i2 < 8; i2++) {
                                online.getInventory().addItem(moneta);
                            }
                        }
                        if (online.getInventory().containsAtLeast(new ItemStack(Material.IRON_BLOCK), 20)) {
                            online.getInventory().removeItem(new ItemStack[]{new ItemStack(Material.IRON_BLOCK, 20)});
                            ItemStack moneta = new ItemStack(Material.GOLD_NUGGET);
                            ItemMeta monetameta = moneta.getItemMeta();
                            monetameta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&x&f&b&e&5&1&dM&x&f&6&e&a&2&3o&x&f&1&e&f&2&8n&x&e&c&f&3&2&ee&x&e&7&f&8&3&3t&x&e&2&f&d&3&9a &6✯1"));
                            monetameta.setLore(Arrays.asList(" ", "§8▪ §7Służy do wymiany w sklepie!"));
                            moneta.setItemMeta(monetameta);
                            for (int i2 = 0; i2 < 8; i2++) {
                                online.getInventory().addItem(moneta);
                            }
                        }
                        if (online.getInventory().containsAtLeast(new ItemStack(Material.NETHERITE_BLOCK), 5)) {
                            online.getInventory().removeItem(new ItemStack[]{new ItemStack(Material.NETHERITE_BLOCK, 5)});
                            ItemStack moneta = new ItemStack(Material.GOLD_NUGGET);
                            ItemMeta monetameta = moneta.getItemMeta();
                            monetameta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&x&f&b&e&5&1&dM&x&f&6&e&a&2&3o&x&f&1&e&f&2&8n&x&e&c&f&3&2&ee&x&e&7&f&8&3&3t&x&e&2&f&d&3&9a &6✯1"));
                            monetameta.setLore(Arrays.asList(" ", "§8▪ §7Służy do wymiany w sklepie!"));
                            moneta.setItemMeta(monetameta);
                            for (int i2 = 0; i2 < 20; i2++) {
                                online.getInventory().addItem(moneta);
                            }
                        }
                        if (online.getInventory().containsAtLeast(new ItemStack(Material.QUARTZ_BLOCK), 5)) {
                            online.getInventory().removeItem(new ItemStack[]{new ItemStack(Material.QUARTZ_BLOCK, 5)});
                            ItemStack moneta = new ItemStack(Material.GOLD_NUGGET);
                            ItemMeta monetameta = moneta.getItemMeta();
                            monetameta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&x&f&b&e&5&1&dM&x&f&6&e&a&2&3o&x&f&1&e&f&2&8n&x&e&c&f&3&2&ee&x&e&7&f&8&3&3t&x&e&2&f&d&3&9a &6✯1"));
                            monetameta.setLore(Arrays.asList(" ", "§8▪ §7Służy do wymiany w sklepie!"));
                            moneta.setItemMeta(monetameta);
                            for (int i2 = 0; i2 < 10; i2++) {
                                online.getInventory().addItem(moneta);
                            }
                        }
                    }



                for (Player afk : Bukkit.getOnlinePlayers()) {
                    World world = Bukkit.getWorld("afk2");
                    List<Player> players = world.getPlayers();
                    if (players.contains(afk)) {
                        ShieldCoreBoxPVP.this.afks.put(afk.getDisplayName(), Integer.valueOf((ShieldCoreBoxPVP.this.afks.get(afk.getDisplayName())).intValue() + 1));
                        afk.sendTitle("§7" + ShieldCoreBoxPVP.this.afks.get(afk.getDisplayName()) / 3 + "§7%", "§2§l• • • • •", 1, 120, 1);
                        if ((ShieldCoreBoxPVP.this.afks.get(afk.getDisplayName())).intValue() / 3 == 100) {
                            afk.sendMessage("Nagrode za stanie na strefie AFK do skrzyni x1)");
                            ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
                            String command = "crate key give " + afk.getDisplayName() + " afk 1";
                            Bukkit.dispatchCommand(console, command);
                            afk.sendTitle("§7" + ShieldCoreBoxPVP.this.afks.get(afk.getDisplayName()) / 3 + "§a%", "klucz do ekwipunku!", 1, 120, 1);
                            ShieldCoreBoxPVP.this.afks.put(afk.getDisplayName(), Integer.valueOf(0));
                        }
                        continue;
                    }
                    ShieldCoreBoxPVP.this.afks.put(afk.getDisplayName(), Integer.valueOf(0));
                }
                if (clearlag == 0) {
                    clearlag = 300;
                    Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&9&lSMIECIARKA&7 - Zostaly wyczyszczone wszystkie dropy na ziemi!"));
                    World world = Bukkit.getWorld("boxpvp");
                    List<Entity> entList = world.getEntities();
                    for(Entity current : entList){
                        if (current.getType() == EntityType.DROPPED_ITEM){
                            current.remove();
                        }
                    }
                }
                if (ShieldCoreBoxPVP.this.counter == 0) {
                    World world = ShieldCoreBoxPVP.this.getServer().getWorld("boxpvp");
                    Date now = new Date();
                    SimpleDateFormat format = new SimpleDateFormat("HH:mm");
                    api2.setBlock(world, -19, 21, 115, Material.EMERALD_ORE);
                    api2.setBlock(world, -19, 23, 115, Material.EMERALD_ORE);

                    api2.setBlock(world, 66, 19, 103, Material.DIAMOND_ORE);
                    api2.setBlock(world, 66, 21, 103, Material.DIAMOND_ORE);

                    api2.setBlock(world, -47, 21, 114, Material.IRON_ORE);
                    api2.setBlock(world, -47, 23, 114, Material.IRON_ORE);

                    api2.setBlock(world, -91, 20, 96, Material.DIAMOND_ORE);
                    api2.setBlock(world, -91, 22, 96, Material.DIAMOND_ORE);

                    api2.setBlock(world, -88, 21, 154, Material.EMERALD_ORE);
                    api2.setBlock(world, -88, 23,  154, Material.EMERALD_ORE);

                    api2.setBlock(world, 81, 20, 184, Material.GOLD_ORE);
                    api2.setBlock(world, 81, 22, 184, Material.GOLD_ORE);

                    api2.setBlock(world, 89, 21, 269, Material.DIAMOND_ORE);
                    api2.setBlock(world, 89, 21, 269, Material.DIAMOND_ORE);

                    api2.setBlock(world, 7, 21, 275, Material.IRON_ORE);
                    api2.setBlock(world, 7, 23, 275, Material.IRON_ORE);

                    api2.setBlock(world, -48, 21, 232, Material.DIAMOND_ORE);
                    api2.setBlock(world, -48, 23, 232, Material.DIAMOND_ORE);

                    api2.setBlock(world, -83, 21, 198, Material.GOLD_ORE);
                    api2.setBlock(world, -83, 23, 198, Material.GOLD_ORE);

                    api2.setBlock(world, 0, 30, 331, Material.DIAMOND_ORE);
                    api2.setBlock(world, 0, 32, 331, Material.DIAMOND_ORE);

                    api2.setBlock(world, 6, 30, 360, Material.DIAMOND_ORE);
                    api2.setBlock(world, 6, 32, 360, Material.DIAMOND_ORE);

                    api2.setBlock(world, -31, 30, 366, Material.IRON_ORE);
                    api2.setBlock(world, -31, 32, 366, Material.IRON_ORE);

                    api2.setBlock(world, -31, 30, 346, Material.DIAMOND_ORE);
                    api2.setBlock(world, -31, 32, 346, Material.DIAMOND_ORE);

                    api2.setBlock(world, -16, 30, 326, Material.DIAMOND_ORE);
                    api2.setBlock(world, -16, 32, 326, Material.DIAMOND_ORE);


                    Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&9&lGENERATORY&7 - Generatory zostaly pomyslnie zresetowane!"));

                    ShieldCoreBoxPVP.this.counter = 120;
                }
                if (ShieldCoreBoxPVP.this.counter2 == 0) {
                    World world = Bukkit.getWorld("world");

                    ShieldCoreBoxPVP.this.counter2 = 360;
                }
                if (wyspa == 0) {
                    World world = Bukkit.getWorld("world");

                    wyspa = 300;
                }
                if (ShieldCoreBoxPVP.this.counter3 == 0) {
                    World world = Bukkit.getWorld("world");

                    ShieldCoreBoxPVP.this.counter3 = 170;
                }
                if (ShieldCoreBoxPVP.this.config == 0) {
                    ShieldCoreBoxPVP.this.config = 15;
                    ShieldCoreBoxPVP.this.reloadConfig();
                    ShieldCoreBoxPVP.this.saveDefaultConfig();
                }
                if (ShieldCoreBoxPVP.this.czasgry == 0) {
                    for (OfflinePlayer online2 : Bukkit.getOfflinePlayers()) {
                        getConfig().set(online2.getUniqueId() + ".Minuty", plugin.getConfig().getInt(online2.getUniqueId() + ".Minuty") + 1);
                        ShieldCoreBoxPVP.this.saveDefaultConfig();
                        ShieldCoreBoxPVP.this.saveConfig();
                        ShieldCoreBoxPVP.this.czasgry = 60;
                        if (plugin.getConfig().getInt(online2.getUniqueId() + ".Svip") > 0) {
                            getConfig().set(online2.getUniqueId() + ".Svip", plugin.getConfig().getInt(online2.getUniqueId() + ".Svip") - 1);
                            saveConfig();
                            saveDefaultConfig();
                        }                        if (plugin.getConfig().getInt(online2.getUniqueId() + ".Vip") > 0) {

                            getConfig().set(online2.getUniqueId() + ".Vip", plugin.getConfig().getInt(online2.getUniqueId() + ".Vip") - 1);
                            saveConfig();
                            saveDefaultConfig();
                        }
                        if (plugin.getConfig().getInt(online2.getUniqueId() + ".Gracz") > 0) {

                            getConfig().set(online2.getUniqueId() + ".Gracz", plugin.getConfig().getInt(online2.getUniqueId() + ".Gracz") - 1);
                            saveConfig();
                            saveDefaultConfig();
                        }
                        if (plugin.getConfig().getInt(online2.getUniqueId() + ".Shield") > 0) {

                            getConfig().set(online2.getUniqueId() + ".Shield", plugin.getConfig().getInt(online2.getUniqueId() + ".Shield") - 1);
                            saveConfig();
                            saveDefaultConfig();
                        }
                            saveConfig();
                            saveDefaultConfig();
                        //}


                    }
                }
                if (ShieldCoreBoxPVP.this.random == 0) {
                    random = 700;
                    Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&8[&x&f&b&e&3&6&5&l!&8] &7Zapraszamy na naszego &9DISCORDA&7 są tam ogloszenia o wszystkich zmianach jak i mozesz odebrac tam swoją nagrode!"));
                }
            }

        }).runTaskTimer(this, 0L, 20L);
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void noBreak(BlockBreakEvent e) {
        if (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL))
            if (this.bloki.contains(e.getBlock().getType())) {
                Player p = e.getPlayer();
                UUID kuuid = p.getUniqueId();
                plugin.getConfig().set(kuuid + ".Bb", Integer.valueOf(plugin.getConfig().getInt(kuuid + ".Bb") + 1));
                plugin.saveConfig();
            } else {
                e.setCancelled(true);
            }
    }


    public static void sendPlayer(Player p, String target) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(baos);
        try {
            dos.writeUTF("Connect");
            dos.writeUTF(target);
        } catch (IOException e) {
            e.printStackTrace();
        }

        p.sendPluginMessage(ShieldCoreBoxPVP.getPlugin(ShieldCoreBoxPVP.class), "BungeeCord", baos.toByteArray());
    }



    @EventHandler(priority = EventPriority.HIGHEST)
    public void onJoin(org.bukkit.event.player.PlayerJoinEvent e) {
        this.afks.put(e.getPlayer().getDisplayName(), Integer.valueOf(0));
    }

    public void onDisable() {
        for (Player afk : Bukkit.getOnlinePlayers()) {
            ShieldCoreBoxPVP.sendPlayer(afk, "lobby");
        }
    }

    public void addGen(World world, double x, double y, double z, Material block) {

        ItemStack drop = new ItemStack(block, 1);
        Location location = new Location(world, x + 0.5, y, z  + 0.5);
        world.dropItem(location, drop).setVelocity(new Vector(0, 0, 0));
    }

    public static void createfile(String gracz, String ID) throws IOException {
        FileWriter file1 = new FileWriter(plugin.getDataFolder() + File.separator + "data" + File.separator + gracz + ".txt");
        file1.write(ID);
        file1.flush();
        file1.close();
    }

    public static ShieldCoreBoxPVP getInstance() {
        return INSTANCE;
    }


    public String getPrefix() {
        return prefix;
    }

    public String getUUID(String name) {
        String uuid = "";
        try {
            in = new BufferedReader(new InputStreamReader(new URL("https://api.mojang.com/users/profiles/minecraft/" + name).openStream()));
            uuid = (((JsonObject)new JsonParser().parse(in)).get("id")).toString().replaceAll("\"", "");
            uuid = uuid.replaceAll("(\\w{8})(\\w{4})(\\w{4})(\\w{4})(\\w{12})", "$1-$2-$3-$4-$5");
            in.close();
        } catch (Exception e) {
            System.out.println("Unable to get UUID of: " + name + "!");
            uuid = "er";
        }
        return uuid;
    }

    public static int getRandom(int lower, int upper) {
        Random random = new Random();
        return random.nextInt(upper - lower + 1) + lower;
    }






    public ShieldCoreBoxPVP getMain() {
        return this;
    }

}
