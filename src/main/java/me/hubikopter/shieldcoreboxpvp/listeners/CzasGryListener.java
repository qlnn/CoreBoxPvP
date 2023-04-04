package me.hubikopter.shieldcoreboxpvp.listeners;

import me.hubikopter.shieldcoreboxpvp.ShieldCoreBoxPVP;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class CzasGryListener implements Listener {

    ShieldCoreBoxPVP plugin;

    public CzasGryListener(ShieldCoreBoxPVP plugin) {
        this.plugin = plugin;
    }


    @EventHandler(priority = EventPriority.HIGHEST)
    public void onClick3(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        InventoryView view = e.getView();
        if (view.getTitle().equals("§9Sklep za czas gry")) {
            e.setCancelled(true);
            if (e.getSlot() == 22) {
                if (plugin.getConfig().getInt(p.getUniqueId() + ".Minuty") >= 10800) {
                    plugin.getConfig().set(p.getUniqueId() + ".Minuty", plugin.getConfig().getInt(p.getUniqueId() + ".Minuty") - 10800);
                    e.setCancelled(true);
                    p.sendMessage("§aPomyslnie!");
                    plugin.getConfig().set(p.getUniqueId() + ".Prefix", "&8[&6No-Life&8]");
                    plugin.saveConfig();

                } else {
                    p.sendMessage("§aNie masz tylu minut");
                }
            }
            if (e.getSlot() == 23) {
                if (plugin.getConfig().getInt(p.getUniqueId() + ".Minuty") >= 1440) {
                    plugin.getConfig().set(p.getUniqueId() + ".Minuty", plugin.getConfig().getInt(p.getUniqueId() + ".Minuty") - 1440);
                    e.setCancelled(true);
                    p.sendMessage("§aPomyslnie!");
                    p.getInventory().addItem(new ItemStack(Material.SHULKER_SHELL));
                    plugin.saveConfig();

                } else {
                    p.sendMessage("§aNie masz tylu minut");
                }
            }
            if (e.getSlot() == 21) {
                ItemStack prefix2 = new ItemStack(Material.PAPER);
                ItemMeta prefixmeta2 = prefix2.getItemMeta();
                prefixmeta2.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7Voucher na range &eVIP &8[&73 &eDni&8]"));
                prefix2.setItemMeta(prefixmeta2);
                if (plugin.getConfig().getInt(p.getUniqueId() + ".Minuty") >= 1440) {
                    plugin.getConfig().set(p.getUniqueId() + ".Minuty", plugin.getConfig().getInt(p.getUniqueId() + ".Minuty") - 1440);
                    e.setCancelled(true);
                    p.sendMessage("§aPomyslnie!");
                    p.getInventory().addItem(prefix2);
                    plugin.saveConfig();
                } else {
                    p.sendMessage("§aNie masz tylu minut");
                }
            }
            if (e.getSlot() == 20) {
                if (plugin.getConfig().getInt(p.getUniqueId() + ".Minuty") >= 700) {
                    plugin.getConfig().set(p.getUniqueId() + ".Minuty", plugin.getConfig().getInt(p.getUniqueId() + ".Minuty") - 700);
                    e.setCancelled(true);
                    p.sendMessage("§aPomyslnie!");
                    ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
                    String command = "crate key give " + p.getDisplayName() + " ametystowy 1";
                    Bukkit.dispatchCommand(console, command);
                    plugin.saveConfig();
                } else {
                    p.sendMessage("§aNie masz tylu minut");
                }
            }
            if (e.getSlot() == 24) {
                ItemStack premium = new ItemStack(Material.SKULL_BANNER_PATTERN);
                ItemMeta premiumm = premium.getItemMeta();
                premiumm.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7Bilet do kopalni &ePremium&7!"));
                premiumm.setLore(Arrays.asList("§7Koszt: §61500 §7minut", " ", "§6Informacje dodatkowe:", "§7Czas trwania §e30 minut!", "§7Kliknij §6LPM§7 aby kupic!"));
                premium.setItemMeta(premiumm);
                if (plugin.getConfig().getInt(p.getUniqueId() + ".Minuty") >= 1500) {
                    plugin.getConfig().set(p.getUniqueId() + ".Minuty", plugin.getConfig().getInt(p.getUniqueId() + ".Minuty") - 1500);
                    e.setCancelled(true);
                    p.sendMessage("§aPomyslnie!");
                    p.getInventory().addItem(premium);
                    plugin.saveConfig();
                } else {
                    p.sendMessage("§aNie masz tylu minut");
                }

            }
        }
    }
}

