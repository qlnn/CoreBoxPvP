package me.hubikopter.shieldcoreboxpvp.commands;

import me.hubikopter.shieldcoreboxpvp.ShieldCoreBoxPVP;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class KickCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.hasPermission("box.kick")) {
                if (args.length >= 1) {
                    Player player1 = Bukkit.getPlayer(args[0]);
                    if (player1 != null) {
                        ShieldCoreBoxPVP.sendPlayer(player1, "lobby");
                        player.sendMessage("Pomyslnie!");
                        player1.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Zostales wyrzucony z serwera powód: &c" + args[1]));
                    } else {

                        player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Gracz &6" + args[0] + " &7jest &coffline."));
                    }


                } else {
                    player.sendMessage("Poprawne uzycie /kick nick powod");
                }

            } else {
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cNie posiadasz uprawnie&&7box.commands.fly.other"));

            }
        }
        return true;
    }
}
