package me.hubikopter.shieldcoreboxpvp.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player)sender;
            if (player.hasPermission("box.commands.fly")) {
                if (args.length == 0) {
                    if (!player.getAllowFlight()) {
                        player.setAllowFlight(true);
                        player.sendTitle(" ", ChatColor.translateAlternateColorCodes('&',"&7Latanie zostalo &aWLACZONE"));
                    } else {
                        player.setAllowFlight(false);
                        player.sendTitle(" ", ChatColor.translateAlternateColorCodes('&', "&7Latanie zostalo &cWYLACZONE"));
                    }
                } else if (args.length >= 1) {
                    if (player.hasPermission("box.commands.fly.other")) {
                        Player player1 = Bukkit.getPlayer(args[0]);
                        if (player1 != null) {
                            if (!player1.getAllowFlight()) {
                                player1.setAllowFlight(true);
                                player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&7Latanie dla gracza &f " + player1.getName() + " &7zostalo &aWLACZONE"));
                                player1.sendMessage(ChatColor.translateAlternateColorCodes('&',"&7Latanie zostalo &aWLACZONE &7przez &fadministratora"));
                            } else {
                                player1.setAllowFlight(false);
                                player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&7Latanie dla gracza &f " + player1.getName() + " &7zostalo &CWYLACZONE"));
                                player1.sendMessage(ChatColor.translateAlternateColorCodes('&',"&7Latanie zostalo &cWYLACZONE &7przez &fadministratora"));
                            }
                        } else {
                            player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&7Gracz &6" + args[0] + " &7jest &coffline."));
                        }
                    } else {
                        player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&cNie posiadasz uprawnie&&7box.commands.fly.other"));
                    }
                }
            } else {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[&x&1&3&5&b&f&b&l!&8] &7Nie posiadasz permisji &8(&cbox.commands.fly&8)"));
            }
        } else {
            sender.sendMessage("&4To polecenie nie moze byc wykonane z konsoli.");
        }
        return true;
    }
}
