package me.hubikopter.shieldcoreboxpvp.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class WarpCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        Inventory inv = Bukkit.createInventory(null, 36, "§9Warpy serwerowe");
        ItemStack szklo = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
        ItemMeta meta = szklo.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', " "));
        szklo.setItemMeta(meta);

        ItemStack szklo2 = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);
        ItemMeta pmeta = szklo2.getItemMeta();
        pmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "  "));
        szklo2.setItemMeta(meta);

        ItemStack bez = new ItemStack(Material.DIAMOND_PICKAXE);
        ItemMeta bezmeta = bez.getItemMeta();
        bezmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&x&2&3&f&b&0&0B&x&3&9&f&b&1&0e&x&5&0&f&c&2&1z&x&6&6&f&c&3&1p&x&7&d&f&c&4&1i&x&9&3&f&c&5&1e&x&a&9&f&d&6&2c&x&c&0&f&d&7&2z&x&c&3&f&9&7&an&x&b&2&f&2&7&aa &x&a&2&e&b&7&as&x&9&2&e&4&7&at&x&8&1&d&d&7&9r&x&7&1&d&5&7&9e&x&6&0&c&e&7&9f&x&5&0&c&7&7&9a\n"));
        bezmeta.setLore(Arrays.asList("§7Kliknij §x§f§b§d§a§6§5LPM §7aby sie przeteleportowac!"));
        bez.setItemMeta(bezmeta);

        ItemStack pvp = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta pvpmeta = bez.getItemMeta();
        pvpmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "§x§f§b§0§0§0§0S§x§f§c§0§b§0§bt§x§f§c§1§6§1§6r§x§f§d§2§1§2§1e§x§f§d§2§c§2§cf§x§f§0§3§b§3§0a §x§e§2§4§9§3§5P§x§d§5§5§8§3§9V§x§c§7§6§6§3§dP"));
        pvpmeta.setLore(Arrays.asList("§7Kliknij §x§f§b§d§a§6§5LPM §7aby sie przeteleportowac!"));
        pvp.setItemMeta(pvpmeta);

        ItemStack afk = new ItemStack(Material.CLOCK);
        ItemMeta afkmeta = bez.getItemMeta();
        afkmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "§x§f§b§d§a§6§5 §x§3§b§a§b§e§2A§x§4§3§9§b§d§5F§x§4§a§8§b§c§7K"));
        afkmeta.setLore(Arrays.asList("§7Kliknij §x§f§b§d§a§6§5LPM §7aby sie przeteleportowac!"));
        afk.setItemMeta(afkmeta);


        inv.setItem(0, szklo);
        inv.setItem(1, szklo);
        inv.setItem(2, szklo);
        inv.setItem(3, szklo);
        inv.setItem(4, szklo);
        inv.setItem(5, szklo);
        inv.setItem(6, szklo);
        inv.setItem(7, szklo);
        inv.setItem(8, szklo);
        inv.setItem(9, szklo2);
        inv.setItem(10, szklo2);
        inv.setItem(11, szklo2);
        inv.setItem(12, bez);
        inv.setItem(13, szklo2);
        inv.setItem(14, pvp);
        inv.setItem(15, szklo2);
        inv.setItem(16, szklo2);
        inv.setItem(17, szklo2);
        inv.setItem(18, szklo2);
        inv.setItem(19, szklo2);
        inv.setItem(20, szklo2);
        inv.setItem(21, szklo2);
        inv.setItem(22, afk);
        inv.setItem(23, szklo2);
        inv.setItem(24, szklo2);
        inv.setItem(25, szklo2);
        inv.setItem(26, szklo2);
        inv.setItem(27, szklo);
        inv.setItem(28, szklo);
        inv.setItem(29, szklo);
        inv.setItem(30, szklo);
        inv.setItem(31, szklo);
        inv.setItem(32, szklo);
        inv.setItem(33, szklo);
        inv.setItem(34, szklo);
        inv.setItem(35, szklo);
        player.openInventory(inv);
        return true;
    }
}
