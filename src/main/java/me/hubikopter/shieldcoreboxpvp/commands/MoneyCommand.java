package me.hubikopter.shieldcoreboxpvp.commands;

import me.hubikopter.shieldcoreboxpvp.ShieldCoreBoxPVP;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MoneyCommand implements CommandExecutor {

    ShieldCoreBoxPVP plugin;

    public MoneyCommand(ShieldCoreBoxPVP plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;

        if (p.hasPermission("monety.settings")) {
            p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[&2$&8] &7" + plugin.getConfig().getInt(p.getUniqueId() + ".Monety")));

        } else {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[&x&1&3&5&b&f&b&l!&8] &7Nie posiadasz permisji &8(&cmoney.settings&8)"));

        }
        return true;
    }
}
