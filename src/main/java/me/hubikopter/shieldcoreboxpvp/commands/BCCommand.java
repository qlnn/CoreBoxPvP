package me.hubikopter.shieldcoreboxpvp.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BCCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.hasPermission("box.bc")) {
            if (args.length == 0) {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "Poprawne uzycie /bc wiadomosc"));
                return true;
            }
            StringBuilder str = new StringBuilder();
            for (int i = 0; i < args.length; i++) {
                str.append(args[i] + " ");
            }
            String s = str.toString();
            String coloredString = ChatColor.translateAlternateColorCodes('&', s);
            String prefix = ChatColor.translateAlternateColorCodes('&', "&x&1&3&5&b&f&b&LS&x&1&3&5&b&f&b&Lh&x&1&3&5&b&f&b&Li&x&1&3&5&b&f&b&Le&x&1&3&5&b&f&b&Ll&x&1&3&5&b&f&b&Ld&f&lMC&8.&f&lPL &7");
            Bukkit.broadcastMessage(prefix + coloredString);

            for (Player pls : Bukkit.getOnlinePlayers()) {
                pls.sendTitle(ChatColor.translateAlternateColorCodes('&', "&x&1&3&5&b&f&b&LS&x&1&3&5&b&f&b&Lh&x&1&3&5&b&f&b&Li&x&1&3&5&b&f&b&Le&x&1&3&5&b&f&b&Ll&x&1&3&5&b&f&b&Ld&f&lMC&8.&f&lPL"), "§7" + coloredString, 1, 120, 1); //§
            }


        } else {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[&x&1&3&5&b&f&b&l!&8] &7Nie posiadasz permisji &8(&cbox.bc&8)"));
        }

        return true;
    }
}


