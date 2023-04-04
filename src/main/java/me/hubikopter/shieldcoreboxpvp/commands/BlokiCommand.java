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

public class BlokiCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        Inventory inv = Bukkit.createInventory(null, 36, "§7Wymiana surowców na bloki");
        ItemStack szklo = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
        ItemMeta meta = szklo.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', " "));
        szklo.setItemMeta(meta);

        ItemStack szklo2 = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);
        ItemMeta pmeta = szklo2.getItemMeta();
        pmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "  "));
        szklo2.setItemMeta(meta);

        ItemStack wegiel = new ItemStack(Material.COAL_BLOCK);
        ItemMeta wegielmeta = wegiel.getItemMeta();
        wegielmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&8Bloki wegla"));
        wegielmeta.setLore(Arrays.asList(" ", "§8▪ §7Kliknij §dLPM§7, aby wymienic wegiel na bloki!"));
        wegiel.setItemMeta(wegielmeta);

        ItemStack zelazo = new ItemStack(Material.IRON_BLOCK);
        ItemMeta zelazometa = zelazo.getItemMeta();
        zelazometa.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7Bloki zelaza"));
        zelazometa.setLore(Arrays.asList(" ", "§8▪ §7Kliknij §dLPM§7, aby wymienic zelazo na bloki!"));
        zelazo.setItemMeta(zelazometa);

        ItemStack zloto = new ItemStack(Material.GOLD_BLOCK);
        ItemMeta zlotometa = zloto.getItemMeta();
        zlotometa.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&eBloki zlota"));
        zelazometa.setLore(Arrays.asList(" ", "§8▪ §7Kliknij §dLPM§7, aby wymienic zloto na bloki!"));
        zloto.setItemMeta(zlotometa);

        ItemStack diament = new ItemStack(Material.DIAMOND_BLOCK);
        ItemMeta diamentmeta = diament.getItemMeta();
        diamentmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bBloki diamentu"));
        diamentmeta.setLore(Arrays.asList(" ", "§8▪ §7Kliknij §dLPM§7, aby wymienic diamenty na bloki!"));
        diament.setItemMeta(diamentmeta);

        ItemStack emerald = new ItemStack(Material.EMERALD_BLOCK);
        ItemMeta emeraldmeta = emerald.getItemMeta();
        emeraldmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&aBloki emeraldow"));
        emeraldmeta.setLore(Arrays.asList(" ", "§8▪ §7Kliknij §dLPM§7, aby wymienic emeraldy na bloki!"));
        emerald.setItemMeta(emeraldmeta);

        ItemStack wszystko = new ItemStack(Material.NETHER_STAR);
        ItemMeta wszystkometa = wszystko.getItemMeta();
        wszystkometa.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&dWymien wszystko"));
        wszystkometa.setLore(Arrays.asList(" ", "§8▪ §7Kliknij §dLPM§7, aby wymienic caly ekwipunek na bloki!"));
        wszystko.setItemMeta(wszystkometa);



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
        inv.setItem(11, wegiel);
        inv.setItem(10, szklo2);
        inv.setItem(13, zelazo);
        inv.setItem(12, szklo2);
        inv.setItem(14, szklo2);
        inv.setItem(15, zloto);
        inv.setItem(16, szklo2);
        inv.setItem(17, szklo2);
        inv.setItem(18, szklo2);
        inv.setItem(21, diament);
        inv.setItem(19, szklo2);
        inv.setItem(23, emerald);
        inv.setItem(20, szklo2);
        inv.setItem(22, szklo2);
        inv.setItem(24, szklo2);
        inv.setItem(25, szklo2);
        inv.setItem(26, szklo2);

        inv.setItem(27, szklo);
        inv.setItem(28, szklo);
        inv.setItem(31, wszystko);
        inv.setItem(30, szklo);
        inv.setItem(29, szklo);
        inv.setItem(32, szklo);
        inv.setItem(33, szklo);
        inv.setItem(34, szklo);
        inv.setItem(35, szklo);
        player.openInventory(inv);
        return true;
    }
}
