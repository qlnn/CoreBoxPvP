package me.hubikopter.shieldcoreboxpvp.listeners;

import me.hubikopter.shieldcoreboxpvp.ShieldCoreBoxPVP;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class BlockPlaceEvent implements Listener {

    ShieldCoreBoxPVP plugin;

    public BlockPlaceEvent(ShieldCoreBoxPVP plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlace(org.bukkit.event.block.BlockPlaceEvent e) {
        Block block = e.getBlockPlaced();
        Player p = e.getPlayer();
        plugin.getConfig().set(p.getUniqueId() + ".Postawionebloki", plugin.getConfig().getInt(p.getUniqueId() + ".Postawionebloki") + 1);
        plugin.saveConfig();
        if (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)) {
            if (p.getLocation().getY() >= 53) {
                e.setCancelled(true);

            }


            Bukkit.getScheduler().runTaskLater(plugin, () -> block.setType(Material.AIR), 2400L);
        }
    }

    @EventHandler
    public void onPlace(org.bukkit.event.block.BlockBreakEvent e) {
        Block block = e.getBlock();
        Player p = e.getPlayer();
        plugin.getConfig().set(p.getUniqueId() + ".Wykopanebloki", plugin.getConfig().getInt(p.getUniqueId() + ".Wykopanebloki") + 1);
        plugin.saveConfig();
        if (e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)) {
            if (p.getLocation().getY() >= 53) {
                e.setCancelled(true);

            }


        }
    }
}
