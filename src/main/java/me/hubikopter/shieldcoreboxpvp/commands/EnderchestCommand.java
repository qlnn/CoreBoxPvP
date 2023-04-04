package me.hubikopter.shieldcoreboxpvp.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class EnderchestCommand implements CommandExecutor {
    @Override
    public boolean onCommand( CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;
        if (args.length == 0) {
            if (p.hasPermission("openec"))
            p.openInventory(p.getEnderChest());
        } else if (args.length == 1) {
            if (p.isOp()) {
                Player player1 = Bukkit.getPlayer(args[0]);
                p.openInventory(player1.getEnderChest());
            }
        }

        return true;
    }
}
