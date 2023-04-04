package me.hubikopter.shieldcoreboxpvp.commands;

import me.hubikopter.shieldcoreboxpvp.ShieldCoreBoxPVP;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

public class TopCommand implements CommandExecutor {

    ShieldCoreBoxPVP plugin;

    public TopCommand(ShieldCoreBoxPVP plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        Map<String, Integer> kills = new HashMap<String, Integer>();
        Map<String, Integer> deaths = new HashMap<String, Integer>();
        Map<String, Integer> pb = new HashMap<String, Integer>();
        Map<String, Integer> wb = new HashMap<String, Integer>();
        Map<String, Integer> money = new HashMap<String, Integer>();
        Map<String, Integer> lvl = new HashMap<String, Integer>();






        for (OfflinePlayer p : Bukkit.getOfflinePlayers()) {
            UUID uuid = p.getUniqueId();
            kills.put(p.getName(), plugin.getConfig().getInt(uuid + ".Zabojstwa"));
            deaths.put(p.getName(), plugin.getConfig().getInt(uuid + ".Smierci"));
            pb.put(p.getName(), plugin.getConfig().getInt(uuid + ".Postawionebloki"));
            wb.put(p.getName(), plugin.getConfig().getInt(uuid + ".Wykopanebloki"));
            money.put(p.getName(), plugin.getConfig().getInt(uuid + ".Monety"));


        }

        if (args.length == 0) {
            player.sendMessage("&7Poprawne uzycie &b/top zabojstwa/smierci/wykopanebloki/postawionebloki/monety".replaceAll("&", "§"));
        }else if (args.length >= 1) {
            if (args[0].equals("zabojstwa")) {


                AtomicInteger counter = new AtomicInteger();
                kills.entrySet()
                        .stream()
                        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                        .limit(10)
                        .forEach(e -> {
                            String num = counter.incrementAndGet() + ". ";
                            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7 " + num + "&x&1&3&5&b&f&b&l " + e.getKey() + "&7: &9 " + e.getValue()));
                        });
            } else if (args[0].equals("smierci")) {
                AtomicInteger counter = new AtomicInteger();
                deaths.entrySet()
                        .stream()
                        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                        .limit(10)
                        .forEach(e -> {
                            String num = counter.incrementAndGet() + ". ";
                            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7 " + num + "&x&1&3&5&b&f&b&l " + e.getKey() + "&7: &9 " + e.getValue()));
                        });
            }else if (args[0].equals("wykopanebloki")) {
                AtomicInteger counter = new AtomicInteger();
                wb.entrySet()
                        .stream()
                        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                        .limit(10)
                        .forEach(e -> {
                            String num = counter.incrementAndGet() + ". ";
                            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7 " + num + "&x&1&3&5&b&f&b&l " + e.getKey() + "&7: &9 " + e.getValue()));
                        });
            } else if (args[0].equals("postawionebloki")) {
                AtomicInteger counter = new AtomicInteger();
                pb.entrySet()
                        .stream()
                        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                        .limit(10)
                        .forEach(e -> {
                            String num = counter.incrementAndGet() + ". ";
                            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7 " + num + "&x&1&3&5&b&f&b&l " + e.getKey() + "&7: &9 " + e.getValue()));
                        });
            } else if (args[0].equals("lvl")) {
                AtomicInteger counter = new AtomicInteger();
                lvl.entrySet()
                        .stream()
                        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                        .limit(10)
                        .forEach(e -> {
                            String num = counter.incrementAndGet() + ". ";
                            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7 " + num + "&x&1&3&5&b&f&b&l " + e.getKey() + "&7: &9 " + e.getValue()));
                        });
            } else if (args[0].equals("monety")) {
                AtomicInteger counter = new AtomicInteger();
                money.entrySet()
                        .stream()
                        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                        .limit(10)
                        .forEach(e -> {
                            String num = counter.incrementAndGet() + ". ";
                            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7 " + num + "&x&1&3&5&b&f&b&l " + e.getKey() + "&7: &9 " + e.getValue()));
                        });
            }
        }
        return true;

    }
}
