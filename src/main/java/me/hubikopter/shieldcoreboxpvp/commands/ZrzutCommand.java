package me.hubikopter.shieldcoreboxpvp.commands;

import me.hubikopter.shieldcoreboxpvp.ShieldCoreBoxPVP;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class ZrzutCommand implements CommandExecutor {


    int counter = 1;

    ShieldCoreBoxPVP plugin;


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (args.length == 0) {
                if (player.hasPermission("zrzut.cos")) {

                    //Safe Location that has been generated



                    //Teleport player
                    double x = player.getLocation().getX();
                    double y = 130;
                    double z = player.getLocation().getZ();

                    for (Player online2 : Bukkit.getOnlinePlayers()) {
                        online2.sendMessage(ChatColor.translateAlternateColorCodes('&', "\n \n \n §5Na mapie spada zrzut!! §d(x" + x + " y" + y + "§d),§5 Kto pierwszy ten lepszy! "));
                        online2.sendTitle("§dZrzuty!", "§5Na mapie spada zrzut!! §d(x" + x + " y" + y + "§d)", 5, 150, 5);

                    }
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            counter += 1;
                            for (Player online : Bukkit.getOnlinePlayers()) {
                                online.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(ChatColor.translateAlternateColorCodes('&', "&5Obecnie na mapie spada zrzut: " + "§d(x" + x + " z" + z + "§d)")));


                                //95 | 35
                                World world = player.getWorld();
                                world.getBlockAt(new Location(world, x, y - counter, z)).setType(Material.BARREL);
                                world.getBlockAt(new Location(world, x, y - counter + 1, z)).setType(Material.AIR);
                                if (counter >= 62) {
                                    Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&dZrzut wylądował na mapie kordy: &5x" + x + "&d, &5z" + z));
                                    counter = 1;
                                    cancel();
                                }


                            }

                        }


                    }.runTaskTimer(plugin, 10, 20);

                }
            }
        }
        return true;
    }
}
