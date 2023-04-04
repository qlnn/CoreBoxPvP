package me.hubikopter.shieldcoreboxpvp.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
public class InvseeCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label,  String[] args) {
        if (sender.hasPermission("invsee.open.box")) {
            Player targetPlayer = Bukkit.getServer().getPlayer(args[0]); //something like that, I don't know if that is exact
            Player player = (Player) sender;
            Inventory targetInv = targetPlayer.getInventory();
            player.openInventory(targetInv);

        } else {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[&x&1&3&5&b&f&b&l!&8] &7Nie posiadasz permisji &8(&cinvsee.open.box&8)"));

        }
        return true;
    }

}
