package me.hubikopter.shieldcoreboxpvp.commands;

import me.hubikopter.shieldcoreboxpvp.ShieldCoreBoxPVP;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class UstawieniaCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            Inventory inv = Bukkit.createInventory(null, 9 * 4, "§9§lUstawienia");

            ItemStack monety = new ItemStack(Material.GOLD_NUGGET);
            ItemMeta monetymeta = monety.getItemMeta();
            monetymeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6Automatyczna wymiana monet na pieniądze"));
            monetymeta.setLore(Arrays.asList("§8» §7Status: " + ShieldCoreBoxPVP.wm.get(p.getDisplayName()), "§8» §aKliknij LEWYM, aby przełączyć!".replaceAll("tak", "§a✓").replaceAll("nie", "§c✘")));
            monetymeta.setUnbreakable(true);
            monety.setItemMeta(monetymeta);

            ItemStack bloki = new ItemStack(Material.EMERALD_ORE);
            ItemMeta blokimeta = bloki.getItemMeta();
            blokimeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6Automatyczna wymiana rud na bloki"));
            blokimeta.setLore(Arrays.asList("§8» §7Status: " + ShieldCoreBoxPVP.wb.get(p.getDisplayName()), "§8» §aKliknij LEWYM, aby przełączyć!".replaceAll("tak", "§a✓").replaceAll("nie", "§c✘")));
            blokimeta.setUnbreakable(true);
            bloki.setItemMeta(blokimeta);

            ItemStack sprzedaz = new ItemStack(Material.GOLD_BLOCK);
            ItemMeta sprzedazmeta = sprzedaz.getItemMeta();
            sprzedazmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6Automatyczna wymiana rud na bloki"));
            sprzedazmeta.setLore(Arrays.asList("§8» §7Status: " + ShieldCoreBoxPVP.sm.get(p.getDisplayName()), "§8» §aKliknij LEWYM, aby przełączyć!".replaceAll("tak", "§a✓").replaceAll("nie", "§c✘")));
            sprzedazmeta.setUnbreakable(true);
            sprzedaz.setItemMeta(sprzedazmeta);

            ItemStack reset = new ItemStack(Material.COMPARATOR);
            ItemMeta resetmeta = sprzedaz.getItemMeta();
            resetmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6Zrestartuj wszystko!"));
            resetmeta.setUnbreakable(true);
            reset.setItemMeta(resetmeta);
            inv.setItem(11, bloki);
            inv.setItem(13, monety);
            inv.setItem(15, sprzedaz);
            inv.setItem(31, reset);
            p.openInventory(inv);
        }
        return true;
    }
}
