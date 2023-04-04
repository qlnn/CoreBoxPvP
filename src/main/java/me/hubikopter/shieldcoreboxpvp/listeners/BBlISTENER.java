package me.hubikopter.shieldcoreboxpvp.listeners;

import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class BBlISTENER implements Listener {

    @EventHandler
    public void onBreak(BlockBreakEvent e) {
        Player p = e.getPlayer();
        Block b = e.getBlock();
        World w = e.getBlock().getWorld();
        if (b.getType() == Material.DIAMOND_ORE) {
            int min = 1; // Minimum value of range
            int max = 5; // Maximum value of range
            int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
            e.setDropItems(false);
            p.getInventory().addItem(new ItemStack[]{new ItemStack(Material.DIAMOND, random_int)});
        } else if (b.getType() == Material.GOLD_ORE) {
            int min = 1; // Minimum value of range
            int max = 5; // Maximum value of range
            int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
            e.setDropItems(false);
            p.getInventory().addItem(new ItemStack[]{new ItemStack(Material.GOLD_INGOT, random_int)});
        } else if (b.getType() == Material.IRON_ORE) {
            int min = 1; // Minimum value of range
            int max = 5; // Maximum value of range
            int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
            e.setDropItems(false);
            p.getInventory().addItem(new ItemStack[]{new ItemStack(Material.IRON_INGOT, random_int)});
        }else if (b.getType() == Material.EMERALD_ORE) {
            int min = 1; // Minimum value of range
            int max = 5; // Maximum value of range
            int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
            e.setDropItems(false);
            p.getInventory().addItem(new ItemStack[]{new ItemStack(Material.EMERALD, random_int)});
        }else if (b.getType() == Material.QUARTZ_BLOCK) {
            e.setDropItems(false);
            p.getInventory().addItem(new ItemStack[]{new ItemStack(Material.QUARTZ, 1)});
        } else if (b.getType() == Material.ANCIENT_DEBRIS) {
            e.setDropItems(false);
            p.getInventory().addItem(new ItemStack[]{new ItemStack(Material.NETHERITE_INGOT, 1)});
        }
        for (int i = 0; i < 100; i++) {
            if (p.getInventory().containsAtLeast(new ItemStack(Material.DIAMOND), 9)) {
                p.getInventory().removeItem(new ItemStack[]{new ItemStack(Material.DIAMOND, 9)});
                p.getInventory().addItem(new ItemStack[]{new ItemStack(Material.DIAMOND_BLOCK, 1)});
            }
            if (p.getInventory().containsAtLeast(new ItemStack(Material.EMERALD), 9)) {
                p.getInventory().removeItem(new ItemStack[]{new ItemStack(Material.EMERALD, 9)});
                p.getInventory().addItem(new ItemStack[]{new ItemStack(Material.EMERALD_BLOCK, 1)});
            }
            if (p.getInventory().containsAtLeast(new ItemStack(Material.GOLD_INGOT), 9)) {
                p.getInventory().removeItem(new ItemStack[]{new ItemStack(Material.GOLD_INGOT, 9)});
                p.getInventory().addItem(new ItemStack[]{new ItemStack(Material.GOLD_BLOCK, 1)});
            }
            if (p.getInventory().containsAtLeast(new ItemStack(Material.IRON_INGOT), 9)) {
                p.getInventory().removeItem(new ItemStack[]{new ItemStack(Material.IRON_INGOT, 9)});
                p.getInventory().addItem(new ItemStack[]{new ItemStack(Material.IRON_BLOCK, 1)});
            }
            if (p.getInventory().containsAtLeast(new ItemStack(Material.NETHERITE_INGOT), 9)) {
                p.getInventory().removeItem(new ItemStack[]{new ItemStack(Material.NETHERITE_INGOT, 9)});
                p.getInventory().addItem(new ItemStack[]{new ItemStack(Material.NETHERITE_BLOCK, 1)});
            }
        }
    }
}
