package me.hubikopter.shieldcoreboxpvp.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TphCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player)sender;
            if (player.hasPermission("box.commands.tph")) {
                if (args.length < 1) {
          sender.sendMessage("&7Poprawne uzycie: &f/tphere [nick]");
                    return true;
                }
                if (args.length == 1) {
                    Player player1 = Bukkit.getPlayer(args[0]);
                    if (player1 != null) {
                        player1.teleport(player.getLocation());
            player.sendMessage("&7Przeteleportowano &f" + player1.getName() + " &7do siebie");
                    } else {
                        sender.sendMessage("&7Gracz jest offline");
                    }
                }
            } else {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[&x&1&3&5&b&f&b&l!&8] &7Nie posiadasz permisji &8(&cbox.commands.tph&8)"));
            }
        } else {
            sender.sendMessage("&cNie mozesz tego wykonac z poziomu konsoli!");
        }
        return true;
    }
    }

