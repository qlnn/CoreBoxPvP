package me.hubikopter.shieldcoreboxpvp.commands;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BezpiecznaCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            Location loc = new Location(player.getWorld(), -20, 31, 342, 89, 2);
            player.teleport(loc);
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Pomyslnie przeteleportowano!"));
        }
        return true;
    }
}

