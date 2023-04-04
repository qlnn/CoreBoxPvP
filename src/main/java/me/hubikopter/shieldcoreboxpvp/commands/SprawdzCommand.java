package me.hubikopter.shieldcoreboxpvp.commands;

import me.hubikopter.shieldcoreboxpvp.ShieldCoreBoxPVP;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class SprawdzCommand implements CommandExecutor {

    ShieldCoreBoxPVP plugin;

    public SprawdzCommand(ShieldCoreBoxPVP plugin) {
        this.plugin = plugin;
    }


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (p.hasPermission("cometmc.sprawdzanie")) {
                World world = Bukkit.getWorld("world");

                if (args.length == 2) {
                    Player player1 = Bukkit.getPlayer(args[1]);

                    if (args[0].equals("sprawdz")) {
                        sendMessage(p, "&7Rozpocząłeś sprawdzanie gracza &c" + player1.getDisplayName());
                        Location loc = new Location(p.getWorld(), 100, 100, 100);
                        Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&9ShieldMC.PL >> &7Gracz &x&0&0&c&e&f&b " + player1.getDisplayName() + "&7jest sprawdzany przez &x&0&0&c&e&f&b" + p.getDisplayName() + "&7! \n &7- &x&0&0&c&e&f&bbrakwsp&7 - &7ban &x&0&0&c&e&f&b7&7 dni \n &7- &x&0&0&c&e&f&bcheater&7 - &7ban &x&0&0&c&e&f&b7&7 dni \n &7- &x&0&0&c&e&f&bprzyznanie&7 - &7ban &x&0&0&c&e&f&b3&7 dni \n &7- &x&0&0&c&e&f&blogout&7 - &7ban &x&0&0&c&e&f&b7&7 dni"));
                        player1.teleport(loc);
                        ShieldCoreBoxPVP.spr.add(player1.getDisplayName());
                        p.teleport(player1);

                    } else if (args[0].equals("brakwsp")) {
                        ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
                        String cmd = "tempban " + player1.getDisplayName() + " 7d Brak współpracy";
                        Bukkit.dispatchCommand(console, cmd);
                        p.sendMessage(ChatColor.GRAY + "Pomyslnie!");

                    } else if (args[0].equals("cheater")) {
                        ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
                        String cmd = "tempban " + player1.getDisplayName() + " 7d Cheaty";
                        Bukkit.dispatchCommand(console, cmd);
                        p.sendMessage(ChatColor.GRAY + "Pomyslnie!");
                    } else if (args[0].equals("przyznanie")) {
                        ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
                        String cmd = "tempban " + player1.getDisplayName() + " 3d Przyznanie się do cheatow";
                        Bukkit.dispatchCommand(console, cmd);
                        p.sendMessage(ChatColor.GRAY + "Pomyslnie!");
                    } else if (args[0].equals("czysty")) {
                        p.sendMessage(ChatColor.GRAY + "Pomyslnie!");
                        ShieldCoreBoxPVP.spr.remove(player1.getDisplayName());
                        World world4 = Bukkit.getWorld("boxpvp");
                        Location loc = new Location(world4, 0, 54, 13);
                        player1.teleport(loc);

                    }
                } else {
                    sendMessage(p, "&7Poprawne uzycie &b/sprawdz sprawdz/brakwsp/cheater/przyznanie nick");
                }
            }
        }
        return true;
    }





    public void sendMessage(Player player, String string) {
        player.sendMessage(ChatColor.translateAlternateColorCodes('&', string));
    }
}
