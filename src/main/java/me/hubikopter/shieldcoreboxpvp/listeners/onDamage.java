package me.hubikopter.shieldcoreboxpvp.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityToggleGlideEvent;

public class onDamage implements Listener {




    @EventHandler
    public void onDamage4(EntityDamageByEntityEvent e) {
        Player p = (Player) e.getDamager();
        Player p2 = (Player) e.getEntity();
        if (!(p2 instanceof Player)) {
            return;
        }
        if (!(p instanceof Player)) {
            return;
        }
        if (p.getLocation().getY() >= 53) {
            e.setCancelled(true);

        }
        if (p2.getLocation().getY() >= 53) {
            e.setCancelled(true);
        }
    }





    }





