package me.hubikopter.shieldcoreboxpvp.listeners;

import me.hubikopter.shieldcoreboxpvp.ShieldCoreBoxPVP;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;

public class PlayerJoinEvent implements Listener {

    ShieldCoreBoxPVP plugin;

    public PlayerJoinEvent(ShieldCoreBoxPVP plugin) {
        this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onJoin(org.bukkit.event.player.PlayerJoinEvent e) {

        Player p = e.getPlayer();
            e.setJoinMessage(null);
            p.setHealth(p.getMaxHealth());
        World world = Bukkit.getWorld("boxpvp");
        Location loc = new Location(world, 0, 54, 13);            p.teleport(loc);
        ShieldCoreBoxPVP.wb.put(p.getDisplayName(), "nie");
        ShieldCoreBoxPVP.wm.put(p.getDisplayName(), "nie");
        ShieldCoreBoxPVP.sm.put(p.getDisplayName(), "nie");


    }



    @EventHandler(priority = EventPriority.HIGHEST)
    public void onQuit(org.bukkit.event.player.PlayerQuitEvent e) {
        Player p = e.getPlayer();
        e.setQuitMessage(null);
        World world = Bukkit.getWorld("boxpvp");
        Location loc = new Location(world, 0, 54, 13);
        p.teleport(loc);

    }

    @EventHandler
    public void onPlayerJoinEvent(org.bukkit.event.player.PlayerJoinEvent event) {
        Player p = event.getPlayer();
        if(!event.getPlayer().hasPlayedBefore()) {
            plugin.getConfig().set(p.getUniqueId() + ".Kolor", "&7");
            plugin.getConfig().set(p.getUniqueId() + ".Prefix", "");
            plugin.getConfig().set(p.getUniqueId() + ".Monety", 5);
            plugin.getConfig().set(p.getUniqueId() + ".Wykopanebloki", 0);
            plugin.getConfig().set(p.getUniqueId() + ".Postawionebloki", 0);
            plugin.getConfig().set(p.getUniqueId() + ".Smierci", 0);
            plugin.getConfig().set(p.getUniqueId() + ".Zabojstwa", 0);
            plugin.saveConfig();
            p.kickPlayer(ChatColor.translateAlternateColorCodes('&', "&7Zostales dodany do bazy danych&9!"));
            p.sendTitle("&9&lSHIELD&F&LMC", "&7Zostales dodany do bazy danych!", 100, 100, 100);
        }
    }


}
