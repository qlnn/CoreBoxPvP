package me.hubikopter.shieldcoreboxpvp.listeners;

import me.hubikopter.shieldcoreboxpvp.ShieldCoreBoxPVP;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

public class Ondead implements Listener {

    ShieldCoreBoxPVP plugin;

    public Ondead(ShieldCoreBoxPVP plugin) {
        this.plugin = plugin;
    }

    ArrayList<Material> bloki = new ArrayList<Material>();



    @EventHandler
    public void onRespawn(PlayerRespawnEvent e) {

        Player p = e.getPlayer();
        World world = Bukkit.getWorld("boxpvp");
        Location loc = new Location(world, 0, 54, 13);
        e.setRespawnLocation(loc);
        p.teleport(loc);
    }



    private Random random = new Random();

    @EventHandler(priority = EventPriority.HIGH)
    public void onDead(PlayerDeathEvent e) {
        Player p = e.getEntity().getKiller();
        Player p2 = e.getEntity();
        UUID kuuid = p.getUniqueId();
        int numItems = p2.getInventory().getSize();
        ItemStack[] items = p2.getInventory().getContents();

        for (int i = 0; i < numItems / 3; i++) {
            int index = random.nextInt(numItems);
            if (items[index] != null) {
                items[index].setAmount(0);
            }
        }
        UUID suuid = p2.getUniqueId();
        plugin.getConfig().set(kuuid + ".Kills", plugin.getConfig().getInt(kuuid + ".Zabojstwa") + 1);
        plugin.getConfig().set(kuuid + ".Monety", plugin.getConfig().getInt(kuuid + ".Monety") + 5);
        plugin.getConfig().set(suuid + ".Smierci", plugin.getConfig().getInt(suuid + ".Smierci") + 1);

        plugin.saveConfig();
        World world = Bukkit.getWorld("boxpvp");
        Location loc = new Location(world, 0, 54, 13);
        p2.teleport(loc);

    }


}



