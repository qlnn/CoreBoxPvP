package me.hubikopter.shieldcoreboxpvp.commands;

import me.hubikopter.shieldcoreboxpvp.ShieldCoreBoxPVP;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class NickColor implements CommandExecutor {

    ShieldCoreBoxPVP plugin;

    public NickColor(ShieldCoreBoxPVP plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;
        Player p2 = Bukkit.getPlayer(args[0]);
        if (p.isOp()) {
                plugin.getConfig().set(p2.getUniqueId() + ".Kolor", args[1]);
            plugin.saveConfig();
            p.sendMessage("Nadales pomyslnie kolor " + args[1] + " dla " + p2);



        } else {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[&x&1&3&5&b&f&b&l!&8] &7Nie posiadasz permisji &8(&cop&8)"));

        }
        return true;
    }
}
