package me.hubikopter.shieldcoreboxpvp.commands;

import me.hubikopter.shieldcoreboxpvp.ShieldCoreBoxPVP;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PrefixColor implements CommandExecutor {

    ShieldCoreBoxPVP plugin;

    public PrefixColor(ShieldCoreBoxPVP plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;
        Player p2 = Bukkit.getPlayer(args[0]);
        if (p.isOp()) {
            plugin.getConfig().set(p2.getUniqueId() + ".Prefix", args[1]);
            plugin.saveConfig();
            p.sendMessage("Nadales pomyslnie kolor " + args[1] + " dla " + p2);



        }
        return true;
    }
}
