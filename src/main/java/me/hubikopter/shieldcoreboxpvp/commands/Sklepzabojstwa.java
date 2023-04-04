package me.hubikopter.shieldcoreboxpvp.commands;

import me.hubikopter.shieldcoreboxpvp.*;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class Sklepzabojstwa implements CommandExecutor {

    ShieldCoreBoxPVP plugin;

    Builder builder;

    public Sklepzabojstwa(ShieldCoreBoxPVP plugin) {
        this.plugin = plugin;
        this.builder = builder;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        Player player = (Player) sender;
        Inventory inv = Bukkit.createInventory(null, 45, "§9Sklep za §czabojstwa");
        ItemBuilder item = ItemBuilder.from(Material.LEGACY_SKULL_ITEM).withSkullOwner(player.getDisplayName()).addLore(ChatHelper.coloredText("&7Posiadasz &c" + plugin.getConfig().getInt(player.getUniqueId() + ".Zabojstwa") + "&9 zabójstw!")).withItemName(ChatColor.translateAlternateColorCodes('&', "&7Twoje zabójstwa!")).withAmount(plugin.getConfig().getInt(player.getUniqueId() + ".Zabojstwa"));
        inv.setItem(15, item.build());
        player.openInventory(inv);

        return true;
    }
}
