package me.hubikopter.shieldcoreboxpvp.listeners;

import me.hubikopter.shieldcoreboxpvp.ShieldCoreBoxPVP;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Listeners implements Listener {

    public static ArrayList<String> lista = new ArrayList<String>();
    public static ArrayList<String> lista2 = new ArrayList<String>();


    ShieldCoreBoxPVP plugin;

    public Listeners(ShieldCoreBoxPVP plugin) {
        this.plugin = plugin;
    }

    private List<Material> armorMaterials = Arrays.asList(Material.ELYTRA);

//             ShieldCoreBoxPVP.spawnloc.put(player.getDisplayName(), String.valueOf(player.getLocation().getX() + player.getLocation().getY() + player.getLocation().getZ()));
//            System.out.println(ShieldCoreBoxPVP.spawnloc.get(player.getDisplayName()));

    @EventHandler
    public void onMove(PlayerMoveEvent e) {
        Player p = e.getPlayer();
        Location location = ShieldCoreBoxPVP.loc.get(p.getName());
        if (location == null) {
            return;
        }
        for (Player t : Bukkit.getOnlinePlayers()) {

            if(!t.getLocation().getWorld().equals(p.getLocation().getWorld())){
                continue;
            }

        if(p.getLocation().distance(location) >= 1) {
            if (ShieldCoreBoxPVP.spawn.contains(p.getDisplayName())) {
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Poruszyles się!, anulowano teleportacje."));
                ShieldCoreBoxPVP.spawn.remove(p.getDisplayName());
            }
        }
        }

    }




//§7Wymiana surowców na bloki

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onClick3(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        InventoryView view = e.getView();
        if (view.getTitle().equals("§7Nawigator po serwerze")) {
            e.setCancelled(true);
            if (e.getSlot() == 14) {
                p.closeInventory();
                p.performCommand("rangi");
            }
            if (e.getSlot() == 15) {
                p.closeInventory();
                p.performCommand("kit");

            }
            if (e.getSlot() == 14) {
                p.closeInventory();
                p.performCommand("bloki");

            }
            if (e.getSlot() == 13) {
                p.closeInventory();
                p.performCommand("warp");

            }
            if (e.getSlot() == 12) {
                p.closeInventory();
                p.performCommand("sklep");

            }


        } if (view.getTitle().equals("§9Warpy serwerowe")) {
            e.setCancelled(true);
        }
    if (view.getTitle().equals("§b§lTwoje statystyki")) {
        e.setCancelled(true);
    }
        if (view.getTitle().equals("§9Warpy serwerowe")) {
            e.setCancelled(true);
            if (e.getSlot() == 12) {
                e.setCancelled(true);
                p.closeInventory();
                p.performCommand("bezpieczna");
            }
            if (e.getSlot() == 14) {
                e.setCancelled(true);
                p.closeInventory();
                Location loc = new Location(p.getWorld(), -0, 54, 80, 100, 100);
                p.teleport(loc);
            }
            if (e.getSlot() == 22) {
                e.setCancelled(true);
                p.closeInventory();
                Location loc = new Location(p.getWorld(), -11, 54, 60, 100, 100);
                p.teleport(loc);
            }
        }
        if (view.getTitle().equals("§9Sklep")) {
            e.setCancelled(true);
            if (e.getSlot() == 23) {
                e.setCancelled(true);
                p.closeInventory();
                p.performCommand("sklepzamonety");
            }
            if (e.getSlot() == 21) {
                e.setCancelled(true);
                p.closeInventory();
                p.performCommand("sklepzaczas");
            }
        }
        if (view.getTitle().equals("§9Sklep za monety")) {
            e.setCancelled(true);
            if (e.getSlot() == 21) {
                e.setCancelled(true);
                p.closeInventory();
                p.performCommand("Sklepkolory");

            }
            if (e.getSlot() == 23) {
                e.setCancelled(true);
                p.closeInventory();
                p.performCommand("Sklepprefixy");

            }
        }
        if (view.getTitle().equals("§9Sklep kolory")) {
            e.setCancelled(true);
            if (e.getSlot() == 20) {
                if (plugin.getConfig().getInt(p.getUniqueId() + ".Monety") >= 100) {
                    plugin.getConfig().set(p.getUniqueId() + ".Monety", plugin.getConfig().getInt(p.getUniqueId() + ".Monety") - 100);
                    e.setCancelled(true);
                    p.sendMessage("§aPomyslnie!");
                    plugin.getConfig().set(p.getUniqueId() + ".Kolor", "&d");
                    plugin.saveConfig();

                } else {
                    p.sendMessage("§aNie masz tylu monet");
                }

            }
            if (e.getSlot() == 21) {
                if (plugin.getConfig().getInt(p.getUniqueId() + ".Monety") >= 100) {
                    plugin.getConfig().set(p.getUniqueId() + ".Monety", plugin.getConfig().getInt(p.getUniqueId() + ".Monety") - 100);
                    e.setCancelled(true);
                    p.sendMessage("§aPomyslnie!");
                    plugin.getConfig().set(p.getUniqueId() + ".Kolor", "&b");
                    plugin.saveConfig();
                } else {
                    p.sendMessage("§aNie masz tylu monet");
                }
            }
            if (e.getSlot() == 22) {
                if (plugin.getConfig().getInt(p.getUniqueId() + ".Monety") >= 100) {
                    plugin.getConfig().set(p.getUniqueId() + ".Monety", plugin.getConfig().getInt(p.getUniqueId() + ".Monety") - 100);
                    e.setCancelled(true);
                    p.sendMessage("§aPomyslnie!");
                    plugin.getConfig().set(p.getUniqueId() + ".Kolor", "&e");
                    plugin.saveConfig();

                } else {
                    p.sendMessage("§aNie masz tylu monet");
                }
            }
            if (e.getSlot() == 23) {
                if (plugin.getConfig().getInt(p.getUniqueId() + ".Monety") >= 100) {
                    plugin.getConfig().set(p.getUniqueId() + ".Monety", plugin.getConfig().getInt(p.getUniqueId() + ".Monety") - 100);
                    e.setCancelled(true);
                    p.sendMessage("§aPomyslnie!");
                    plugin.getConfig().set(p.getUniqueId() + ".Kolor", "&c");
                    plugin.saveConfig();

                } else {
                    p.sendMessage("§aNie masz tylu monet");
                }
            }
            if (e.getSlot() == 24) {
                if (plugin.getConfig().getInt(p.getUniqueId() + ".Monety") >= 100) {
                    plugin.getConfig().set(p.getUniqueId() + ".Monety", plugin.getConfig().getInt(p.getUniqueId() + ".Monety") - 100);
                    e.setCancelled(true);
                    p.sendMessage("§aPomyslnie!");
                    plugin.getConfig().set(p.getUniqueId() + ".Kolor", "&6");
                    plugin.saveConfig();

                } else {
                    p.sendMessage("§aNie masz tylu monet");
                }
            }
        }
    }



    @EventHandler(priority = EventPriority.HIGHEST)
    public void onClick4(InventoryClickEvent e) {
        Player player = (Player) e.getWhoClicked();
        InventoryView view = e.getView();
        if (view.getTitle().equals("§7Wymiana surowców na bloki")) {
            e.setCancelled(true);
            if (e.getSlot() == 11) {
                for (int i = 0; i < 200; i++) {
                    if (player.getInventory().containsAtLeast(new ItemStack(Material.COAL), 9)) {
                        player.getInventory().removeItem(new ItemStack[]{new ItemStack(Material.COAL, 9)});
                        player.getInventory().addItem(new ItemStack[]{new ItemStack(Material.COAL_BLOCK, 1)});
                        e.setCancelled(true);


                    }
                }
            }
            if (e.getSlot() == 13) {
                for (int i = 0; i < 200; i++) {
                    if (player.getInventory().containsAtLeast(new ItemStack(Material.IRON_INGOT), 9)) {
                        player.getInventory().removeItem(new ItemStack[]{new ItemStack(Material.IRON_INGOT, 9)});
                        player.getInventory().addItem(new ItemStack[]{new ItemStack(Material.IRON_BLOCK, 1)});
                        e.setCancelled(true);


                    }
                }

            }
            if (e.getSlot() == 15) {
                for (int i = 0; i < 200; i++) {
                    if (player.getInventory().containsAtLeast(new ItemStack(Material.GOLD_INGOT), 9)) {
                        player.getInventory().removeItem(new ItemStack[]{new ItemStack(Material.GOLD_INGOT, 9)});
                        player.getInventory().addItem(new ItemStack[]{new ItemStack(Material.GOLD_BLOCK, 1)});
                        e.setCancelled(true);


                    }
                }
            }
            if (e.getSlot() == 21) {
                for (int i = 0; i < 200; i++) {
                    if (player.getInventory().containsAtLeast(new ItemStack(Material.DIAMOND), 9)) {
                        player.getInventory().removeItem(new ItemStack[]{new ItemStack(Material.DIAMOND, 9)});
                        player.getInventory().addItem(new ItemStack[]{new ItemStack(Material.DIAMOND_BLOCK, 1)});
                        e.setCancelled(true);


                    }
                }

            }
            if (e.getSlot() == 23) {
                for (int i = 0; i < 200; i++) {
                    if (player.getInventory().containsAtLeast(new ItemStack(Material.EMERALD), 9)) {
                        player.getInventory().removeItem(new ItemStack[]{new ItemStack(Material.EMERALD, 9)});
                        player.getInventory().addItem(new ItemStack[]{new ItemStack(Material.EMERALD_BLOCK, 1)});
                        e.setCancelled(true);


                    }
                }

            }
            if (e.getSlot() == 31) {
                for (int i = 0; i < 200; i++) {
                    if (player.getInventory().containsAtLeast(new ItemStack(Material.COAL), 9)) {
                        player.getInventory().removeItem(new ItemStack[]{new ItemStack(Material.COAL, 9)});
                        player.getInventory().addItem(new ItemStack[]{new ItemStack(Material.COAL_BLOCK, 1)});
                        player.getInventory().removeItem(new ItemStack[]{new ItemStack(Material.IRON_INGOT, 9)});
                    }
                        if (player.getInventory().containsAtLeast(new ItemStack(Material.GOLD_INGOT), 9)) {
                            player.getInventory().addItem(new ItemStack[]{new ItemStack(Material.IRON_BLOCK, 1)});
                            player.getInventory().removeItem(new ItemStack[]{new ItemStack(Material.GOLD_INGOT, 9)});
                            player.getInventory().addItem(new ItemStack[]{new ItemStack(Material.GOLD_BLOCK, 1)});
                        }
                            if (player.getInventory().containsAtLeast(new ItemStack(Material.DIAMOND), 9)) {
                                player.getInventory().removeItem(new ItemStack[]{new ItemStack(Material.DIAMOND, 9)});
                                player.getInventory().addItem(new ItemStack[]{new ItemStack(Material.DIAMOND_BLOCK, 1)});
                            }
                                if (player.getInventory().containsAtLeast(new ItemStack(Material.EMERALD), 9)) {
                                    player.getInventory().removeItem(new ItemStack[]{new ItemStack(Material.EMERALD, 9)});
                                    player.getInventory().addItem(new ItemStack[]{new ItemStack(Material.EMERALD_BLOCK, 1)});
                                }
                    if (player.getInventory().containsAtLeast(new ItemStack(Material.IRON_INGOT), 9)) {
                        player.getInventory().removeItem(new ItemStack[]{new ItemStack(Material.IRON_INGOT, 9)});
                        player.getInventory().addItem(new ItemStack[]{new ItemStack(Material.IRON_BLOCK, 1)});
                    }
                                    e.setCancelled(true);


                                }
                            }

                        }


                    }
                }





    


