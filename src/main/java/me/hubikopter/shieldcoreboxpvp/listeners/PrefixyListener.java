package me.hubikopter.shieldcoreboxpvp.listeners;

import me.hubikopter.shieldcoreboxpvp.ShieldCoreBoxPVP;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.InventoryView;

public class PrefixyListener implements Listener {

    ShieldCoreBoxPVP plugin;

    public PrefixyListener(ShieldCoreBoxPVP plugin) {
        this.plugin = plugin;
    }


    @EventHandler(priority = EventPriority.HIGHEST)
    public void onClick3(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        InventoryView view = e.getView();
        if (view.getTitle().equals("§9Sklep prefixy")) { // 2 6
            e.setCancelled(true);
            if (e.getSlot() == 13) {
                if (plugin.getConfig().getInt(p.getUniqueId() + ".Monety") >= 500) {
                    plugin.getConfig().set(p.getUniqueId() + ".Monety", plugin.getConfig().getInt(p.getUniqueId() + ".Monety") - 500);
                    e.setCancelled(true);
                    p.sendMessage("§aPomyslnie!");
                    plugin.getConfig().set(p.getUniqueId() + ".Prefix", "&9♬");
                    plugin.saveConfig();

                } else {
                    p.sendMessage("§aNie masz tylu monet");
                }
            }
            if (e.getSlot() == 20) {
                if (plugin.getConfig().getInt(p.getUniqueId() + ".Monety") >= 500) {
                    plugin.getConfig().set(p.getUniqueId() + ".Monety", plugin.getConfig().getInt(p.getUniqueId() + ".Monety") - 500);
                    e.setCancelled(true);
                    p.sendMessage("§aPomyslnie!");
                    plugin.getConfig().set(p.getUniqueId() + ".Prefix", "&c❤");
                    plugin.saveConfig();

                } else {
                    p.sendMessage("§aNie masz tylu monet");
                }
            }
            if (e.getSlot() == 21) {
                if (plugin.getConfig().getInt(p.getUniqueId() + ".Monety") >= 500) {
                    plugin.getConfig().set(p.getUniqueId() + ".Monety", plugin.getConfig().getInt(p.getUniqueId() + ".Monety") - 500);
                    e.setCancelled(true);
                    p.sendMessage("§aPomyslnie!");
                    plugin.getConfig().set(p.getUniqueId() + ".Prefix", "&b☂");
                    plugin.saveConfig();

                } else {
                    p.sendMessage("§aNie masz tylu monet");
                }
            }
            if (e.getSlot() == 22) {
                if (plugin.getConfig().getInt(p.getUniqueId() + ".Monety") >= 500) {
                    plugin.getConfig().set(p.getUniqueId() + ".Monety", plugin.getConfig().getInt(p.getUniqueId() + ".Monety") - 500);
                    e.setCancelled(true);
                    p.sendMessage("§aPomyslnie!");
                    plugin.getConfig().set(p.getUniqueId() + ".Prefix", "&6☀");
                    plugin.saveConfig();

                } else {
                    p.sendMessage("§aNie masz tylu monet");
                } //&eϟ
            }
            if (e.getSlot() == 23) {
                if (plugin.getConfig().getInt(p.getUniqueId() + ".Monety") >= 500) {
                    plugin.getConfig().set(p.getUniqueId() + ".Monety", plugin.getConfig().getInt(p.getUniqueId() + ".Monety") - 500);
                    e.setCancelled(true);
                    p.sendMessage("§aPomyslnie!");
                    plugin.getConfig().set(p.getUniqueId() + ".Prefix", "&eϟ");
                    plugin.saveConfig();

                } else {
                    p.sendMessage("§aNie masz tylu monet");
                } //&eϟ
            }
            if (e.getSlot() == 24) {
                if (plugin.getConfig().getInt(p.getUniqueId() + ".Monety") >= 500) {
                    plugin.getConfig().set(p.getUniqueId() + ".Monety", plugin.getConfig().getInt(p.getUniqueId() + ".Monety") - 500);
                    e.setCancelled(true);
                    p.sendMessage("§aPomyslnie!");
                    plugin.getConfig().set(p.getUniqueId() + ".Prefix", "&f☁");
                    plugin.saveConfig();

                } else {
                    p.sendMessage("§aNie masz tylu monet");
                } //&eϟ
            }
            if (e.getSlot() == 28) {
                if (plugin.getConfig().getInt(p.getUniqueId() + ".Monety") >= 500) {
                    plugin.getConfig().set(p.getUniqueId() + ".Monety", plugin.getConfig().getInt(p.getUniqueId() + ".Monety") - 500);
                    e.setCancelled(true);
                    p.sendMessage("§aPomyslnie!");
                    plugin.getConfig().set(p.getUniqueId() + ".Prefix", "&0♠");
                    plugin.saveConfig();

                } else {
                    p.sendMessage("§aNie masz tylu monet");
                } //&4✝"
            }
            if (e.getSlot() == 29) {
                if (plugin.getConfig().getInt(p.getUniqueId() + ".Monety") >= 500) {
                    plugin.getConfig().set(p.getUniqueId() + ".Monety", plugin.getConfig().getInt(p.getUniqueId() + ".Monety") - 500);
                    e.setCancelled(true);
                    p.sendMessage("§aPomyslnie!");
                    plugin.getConfig().set(p.getUniqueId() + ".Prefix", "&4✝");
                    plugin.saveConfig();

                } else {
                    p.sendMessage("§aNie masz tylu monet");
                } //&4✝"
            }
            if (e.getSlot() == 30) {
                if (plugin.getConfig().getInt(p.getUniqueId() + ".Monety") >= 500) {
                    plugin.getConfig().set(p.getUniqueId() + ".Monety", plugin.getConfig().getInt(p.getUniqueId() + ".Monety") - 500);
                    e.setCancelled(true);
                    p.sendMessage("§aPomyslnie!");
                    plugin.getConfig().set(p.getUniqueId() + ".Prefix", "&4☯");
                    plugin.saveConfig();

                } else {
                    p.sendMessage("§aNie masz tylu monet");
                } //&e★
            }
            if (e.getSlot() == 31) {
                if (plugin.getConfig().getInt(p.getUniqueId() + ".Monety") >= 500) {
                    plugin.getConfig().set(p.getUniqueId() + ".Monety", plugin.getConfig().getInt(p.getUniqueId() + ".Monety") - 500);
                    e.setCancelled(true);
                    p.sendMessage("§aPomyslnie!");
                    plugin.getConfig().set(p.getUniqueId() + ".Prefix", "&e★");
                    plugin.saveConfig();

                } else {
                    p.sendMessage("§aNie masz tylu monet");
                } //&e★
            }
            if (e.getSlot() == 32) {
                if (plugin.getConfig().getInt(p.getUniqueId() + ".Monety") >= 500) {
                    plugin.getConfig().set(p.getUniqueId() + ".Monety", plugin.getConfig().getInt(p.getUniqueId() + ".Monety") - 500);
                    e.setCancelled(true);
                    p.sendMessage("§aPomyslnie!");
                    plugin.getConfig().set(p.getUniqueId() + ".Prefix", "&d✌");
                    plugin.saveConfig();

                } else {
                    p.sendMessage("§aNie masz tylu monet");
                } //&e★
            }
            if (e.getSlot() == 33) {
                if (plugin.getConfig().getInt(p.getUniqueId() + ".Monety") >= 500) {
                    plugin.getConfig().set(p.getUniqueId() + ".Monety", plugin.getConfig().getInt(p.getUniqueId() + ".Monety") - 500);
                    e.setCancelled(true);
                    p.sendMessage("§aPomyslnie!");
                    plugin.getConfig().set(p.getUniqueId() + ".Prefix", "&d✌");
                    plugin.saveConfig();

                } else {
                    p.sendMessage("§aNie masz tylu monet");
                } //&e★
            }
            if (e.getSlot() == 34) {
                if (plugin.getConfig().getInt(p.getUniqueId() + ".Monety") >= 500) {
                    plugin.getConfig().set(p.getUniqueId() + ".Monety", plugin.getConfig().getInt(p.getUniqueId() + ".Monety") - 500);
                    e.setCancelled(true);
                    p.sendMessage("§aPomyslnie!");
                    plugin.getConfig().set(p.getUniqueId() + ".Prefix", "&f☠");
                    plugin.saveConfig();

                } else {
                    p.sendMessage("§aNie masz tylu monet");
                } //&e★
            }
        }
    }
}
