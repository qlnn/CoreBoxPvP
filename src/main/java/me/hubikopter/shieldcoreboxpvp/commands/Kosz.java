package me.hubikopter.shieldcoreboxpvp.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class Kosz implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender,Command command,String label, String[] args) {
        Player player = (Player)sender;
        Inventory inventory = Bukkit.createInventory(null, 27, (ChatColor.translateAlternateColorCodes('&', "&7Kosz")));
        player.openInventory(inventory);
        return true;
    }
}
