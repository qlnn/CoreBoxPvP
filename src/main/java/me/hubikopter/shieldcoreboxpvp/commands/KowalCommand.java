package me.hubikopter.shieldcoreboxpvp.commands;

import me.hubikopter.shieldcoreboxpvp.ShieldCoreBoxPVP;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class KowalCommand implements CommandExecutor {

    ShieldCoreBoxPVP plugin;

    public KowalCommand(ShieldCoreBoxPVP plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            ItemStack is = new ItemStack(Material.DIAMOND_CHESTPLATE);
            ItemMeta im = is.getItemMeta();
            if (im.getLore() != null) {
                List<String> lore = new ArrayList<String>();//initialize it as empty list, in case there is no lore
                lore = p.getItemInHand().getItemMeta().getLore();
                im.setLore(lore);
                is.setItemMeta(im);
            }
            p.getInventory().addItem(is);

        }
        return true;
    }
}
