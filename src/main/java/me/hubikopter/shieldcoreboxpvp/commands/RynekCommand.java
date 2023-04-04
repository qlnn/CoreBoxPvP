package me.hubikopter.shieldcoreboxpvp.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class RynekCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        Player p = (Player) sender;
        if (args.length == 0) {
            p.performCommand("ah");
            return true;

        } else if (args.length == 1) {
            if (args[0].equals("sprzedaj")) {
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Poprawne uzycie &9/rynek sprzedaj cena ilosc"));
                return true;

            } else if (args[0].equals("zobacz")) {
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Poprawne uzycie &9/rynek zobacz nick"));
                return true;

            }
        } else if (args.length > 1) {
            if (args[0].equals("sprzedaj")) {
                p.performCommand("ah sell " + args[1] + args[2]);
                return true;

            } else if (args[0].equals("zobacz")) {
                p.performCommand("ah view " + args[1]);
                return true;


            }

        }
        return true;
    }
}
