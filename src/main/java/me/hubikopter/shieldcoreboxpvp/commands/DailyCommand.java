package me.hubikopter.shieldcoreboxpvp.commands;

import dev.dbassett.skullcreator.SkullCreator;
import me.hubikopter.shieldcoreboxpvp.GuiHelper;
import me.hubikopter.shieldcoreboxpvp.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;
import org.jetbrains.annotations.NotNull;

public class DailyCommand implements CommandExecutor {



    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player) {
            Inventory inv = Bukkit.createInventory(null, 9 * 5, "§9§LDzienne nagrody");
            GuiHelper.border(inv, new ItemStack(Material.BLUE_STAINED_GLASS_PANE));
            Player p = (Player) sender;
            p.openInventory(inv);


        }
        return true;
    }



}
