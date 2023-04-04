package me.hubikopter.shieldcoreboxpvp.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
public class MsgCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player)sender;
            if (args.length > 0) {
                Player player1 = Bukkit.getPlayer(args[0]);
                if (player1 != null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    for (byte b = 1; b < args.length; b++)
                        stringBuilder.append(args[b]).append(" ");
                    String str = stringBuilder.toString();
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&8(&x&1&3&5&b&f&b&lJa &7--> &x&1&3&5&b&f&b&l" + player1.getName() + "&8) &7" + str));
                    player1.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8(&x&1&3&5&b&f&b&l" + player.getName() + " &7--> &x&1&3&5&b&f&b&lJA&8) &7" + str));
                    return true;
                }
        sender.sendMessage("&7Gracz &a" + args[0].toUpperCase() + " &7jest &cOFFLINE&7!");
            } else {
        sender.sendMessage("&7Poprawne uzycie: &a/msg [nick] [wiadomosc]");
            }
        } else {
            sender.sendMessage("Nie mozesz tego wykonac z poziomu konsoli!");
        }
        return true;
    }
    }

