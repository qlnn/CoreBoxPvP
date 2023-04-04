package me.hubikopter.shieldcoreboxpvp.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RemoveHeart implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (p.hasPermission("serca")) {
                if (args.length == 0) {
                    p.sendMessage("Poprawne uzycie /serca add/remove player");
                } else if (args.length == 2) {
                    Player player1 = Bukkit.getPlayer(args[1]);
                    if (args[0].equals("add")) {
                        p.sendMessage("Dodales serca dla: " + player1.getDisplayName());
                        add(player1, 2);
                    } else if (args[0].equals("remove")) {
                        p.sendMessage("Usunales serca dla: " + player1.getDisplayName());
                        remove(player1, 2);
                    } else if (args.length == 3) {
                        p.sendMessage("Dodales serca dla: " + player1.getDisplayName());
                        add(player1, 200);

                    }


                }
            } else {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[&x&f&b&e&3&6&5&l!&8] &7Nie posiadasz permisji &8(&cserca&8)"));

            }
        }
        return true;
    }


    public void remove(Player player, double amount){
        AttributeInstance ai = player.getAttribute(Attribute.GENERIC_MAX_HEALTH);
        ai.setBaseValue(player.getMaxHealth() - amount);
    }

    public void add(Player player, double amount){
        AttributeInstance ai = player.getAttribute(Attribute.GENERIC_MAX_HEALTH);
        ai.setBaseValue(player.getMaxHealth() + amount);
    }
}
