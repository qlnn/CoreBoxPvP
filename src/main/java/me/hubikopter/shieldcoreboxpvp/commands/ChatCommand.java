package me.hubikopter.shieldcoreboxpvp.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class ChatCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        
        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (p.hasPermission("kutas")) {
                if (args.length == 2) {
                    if (args[0].equals("clear")) {
                        for (int i = 0; i < 100; i++) {
                            Bukkit.broadcastMessage(" ");
                        }
                        Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&9&lCHAT&7, zostal wyczyszczony przez administratora &9&l" + ((Player) sender).getDisplayName()));
                    }
                }
            }
        }
        return true;
    }
}
