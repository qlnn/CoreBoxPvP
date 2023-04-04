package me.hubikopter.shieldcoreboxpvp.listeners;

import me.hubikopter.shieldcoreboxpvp.ShieldCoreBoxPVP;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;

public class ConsumeListener implements Listener {

    ShieldCoreBoxPVP plugin;

    public ConsumeListener(ShieldCoreBoxPVP plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onEat(PlayerItemConsumeEvent e) {
        Player p = e.getPlayer();
        if (e.getItem().equals(Material.TROPICAL_FISH)) {
            e.setCancelled(true);
        }
        if (e.getItem().equals(Material.COOKED_COD)) {
            e.setCancelled(true);
        }
    }
}
