package me.hubikopter.shieldcoreboxpvp.commands;

import me.hubikopter.shieldcoreboxpvp.ShieldCoreBoxPVP;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.HashMap;

public class SpawnCommand implements CommandExecutor {

    ShieldCoreBoxPVP plugin;

    public SpawnCommand(ShieldCoreBoxPVP plugin) {
        this.plugin = plugin;
    }

    HashMap<String, String> spawn;


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[§x§1§3§5§b§f§b&l!&8] &7Trwa teleportowanie na spawna! &7(5 sekund)"));
            ShieldCoreBoxPVP.spawn.add(player.getDisplayName());
            ShieldCoreBoxPVP.loc.put(player.getName(), player.getLocation());
            (new BukkitRunnable() {
                public void run() {
                    if (ShieldCoreBoxPVP.spawn.contains(player.getDisplayName())) {
                        World world = Bukkit.getWorld("boxpvp");
                        Location loc = new Location(world, 0, 54, 13);
                        player.teleport(loc);
                        player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Pomyslnie przeteleportowano na spawna!"));
                        ShieldCoreBoxPVP.spawn.remove(player.getDisplayName());
                    } else {
                        cancel();
                    }

                }
            }).runTaskLater(plugin, 100L);
        }
        return true;
    }
}
