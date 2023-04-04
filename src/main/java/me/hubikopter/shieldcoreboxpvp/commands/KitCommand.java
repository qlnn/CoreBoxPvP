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
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class KitCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        Player player = (Player) sender;
        Inventory inv = Bukkit.createInventory(null, 45, "§9§lDostepne zestawy");
        ItemStack szklo = new ItemStack(Material.LIGHT_BLUE_STAINED_GLASS_PANE);
        ItemMeta meta = szklo.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', " "));
        szklo.setItemMeta(meta);

        ItemStack szklo2 = new ItemStack(Material.BLUE_STAINED_GLASS_PANE);
        ItemMeta pmeta = szklo2.getItemMeta();
        pmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "  "));
        szklo2.setItemMeta(meta);

        ItemStack szklo3 = new ItemStack(Material.WHITE_STAINED_GLASS_PANE);
        ItemMeta tmeta = szklo3.getItemMeta();
        tmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "  "));
        szklo3.setItemMeta(meta);

        ItemStack gracz = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemMeta mgracz = gracz.getItemMeta();
        mgracz.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&9&LGracz"));
        mgracz.setLore(Arrays.asList("§8× §7Zestaw dostępny dla: §aWszystkich", " ", "§eKliknij aby wyswietlic zawartosc zestawu."));
        gracz.setItemMeta(mgracz);

        ItemStack vip = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
        ItemMeta mvip = vip.getItemMeta();
        mvip.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&9&LVIP"));
        mvip.setLore(Arrays.asList("§8× §7Zestaw dostępny dla rangi: §8[§eVIP§8]", " ", "§eKliknij aby wyswietlic zawartosc zestawu."));
        vip.setItemMeta(mvip);

        ItemStack svip = new ItemStack(Material.IRON_CHESTPLATE);
        ItemMeta msvip = vip.getItemMeta();
        msvip.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&9&LSVIP"));
        msvip.setLore(Arrays.asList("§8× §7Zestaw dostępny dla rangi: §8[§6SVIP§8]", " ", "§eKliknij aby wyswietlic zawartosc zestawu."));
        svip.setItemMeta(msvip);

        ItemStack shield = new ItemStack(Material.DIAMOND_CHESTPLATE);
        ItemMeta mshield = vip.getItemMeta();
        mshield.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&9&lSHIELD"));
        mshield.setLore(Arrays.asList("§8× §7Zestaw dostępny dla rangi: §8[§9SHIELD§8]", " ", "§eKliknij aby wyswietlic zawartosc zestawu."));
        shield.setItemMeta(mshield);
        inv.setItem(0, szklo);
        inv.setItem(1, szklo2);
        inv.setItem(2, szklo3);
        inv.setItem(3, szklo3);
        inv.setItem(5, szklo3);
        inv.setItem(6, szklo3);
        inv.setItem(7, szklo2);
        inv.setItem(8, szklo);
        inv.setItem(9, szklo2);
        inv.setItem(17, szklo2);
        inv.setItem(18, szklo3);
        inv.setItem(19, gracz);
        inv.setItem(21, vip);
        inv.setItem(23, svip);
        inv.setItem(25, shield);
        inv.setItem(26, szklo3);
        inv.setItem(27, szklo2);
        inv.setItem(35, szklo2);
        inv.setItem(36, szklo);
        inv.setItem(37, szklo2);
        inv.setItem(38, szklo3);
        inv.setItem(39, szklo3);
        inv.setItem(41, szklo3);
        inv.setItem(42, szklo3);
        inv.setItem(43, szklo2);
        inv.setItem(44, szklo);
        player.openInventory(inv);

        return true;
    }
}
