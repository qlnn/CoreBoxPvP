package me.hubikopter.shieldcoreboxpvp.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ReportCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 0) {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Poprawne uzycie /zglos wiadomosc"));
            return true;
        }
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < args.length; i++) {
            str.append(args[i] + " ");
        }
        String s = str.toString();
        String coloredString = ChatColor.translateAlternateColorCodes('&', s);
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Pomyslnie wyslales &c&nzgloszenie&7 do administracji! ( " + coloredString + " )"));

        for (Player pls : Bukkit.getOnlinePlayers()) {
            if (pls.hasPermission("helpop.mes")) {
                pls.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Gracz &c&n" + sender.getName() + "&7 napisał zgloszenie: &c&n" + coloredString));
            }
        }


        return true;
    }
}

