package me.hubikopter.shieldcoreboxpvp.commands;

import me.hubikopter.shieldcoreboxpvp.ShieldCoreBoxPVP;
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
import org.bukkit.inventory.meta.SkullMeta;

import java.util.Arrays;

public class StatsCommand implements CommandExecutor {

    ShieldCoreBoxPVP plugin;

    public StatsCommand(ShieldCoreBoxPVP plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        Inventory inv = Bukkit.createInventory(null, 45, "§b§lTwoje statystyki");
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

        ItemStack stack = new ItemStack(Material.LEGACY_SKULL_ITEM, 1, (byte) 3);
        SkullMeta skullMeta = (SkullMeta) stack.getItemMeta();
        skullMeta.setOwner(player.getName());
        skullMeta.setDisplayName("§7Statystyki gracza: §b" + player.getDisplayName());
        skullMeta.setLore(Arrays.asList("§8× §7Zabójstwa: §b " + plugin.getConfig().getString(player.getUniqueId() + ".Zabojstwa"),"§8× §7Smierci: §b " + plugin.getConfig().getString(player.getUniqueId() + ".Smierci"), "§8× §7Wykopane bloki: §b " + plugin.getConfig().getString(player.getUniqueId() + ".Wykopanebloki"), "§8× §7Postawione bloki: §b " + plugin.getConfig().getString(player.getUniqueId() + ".Postawionebloki"), "§8× §7Monety: §b " + plugin.getConfig().getString(player.getUniqueId() + ".Monety")));
        stack.setItemMeta(skullMeta);

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
// 22
        inv.setItem(22, stack);
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
