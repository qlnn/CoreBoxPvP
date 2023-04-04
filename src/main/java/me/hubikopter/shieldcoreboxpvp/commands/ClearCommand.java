package me.hubikopter.shieldcoreboxpvp.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ClearCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (p.hasPermission("clear.eq")) {
                p.getInventory().clear();
            } else {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[§x§1§3§5§b§f§b&l!&8] &7Nie posiadasz permisji &8(&cclear.eq&8)"));

            }
        }

        return true;
    }
}
