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

import java.util.Arrays;

public class SklepCommand implements CommandExecutor {

    ShieldCoreBoxPVP plugin;

    public SklepCommand(ShieldCoreBoxPVP plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        Inventory inv = Bukkit.createInventory(null, 45, "§9Sklep");
        ItemStack szklo = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
        ItemMeta meta = szklo.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', " "));
        szklo.setItemMeta(meta);

        ItemStack szklo2 = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);
        ItemMeta pmeta = szklo2.getItemMeta();
        pmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "  "));
        szklo2.setItemMeta(meta);

        ItemStack torch = new ItemStack(Material.REDSTONE_TORCH);
        ItemMeta torchmeta = torch.getItemMeta();
        torchmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7Stan konta"));
        torchmeta.setLore(Arrays.asList(" ", "§x§f§b§d§a§6§5Pieniadze §7zdobywasz poprzez §czabijanie graczy §7na arenie §cPVP§7!", "§7Pamiętaj że posiadając range §x§f§b§d§a§6§5Premium", "§7zyskujesz ich §x§f§b§d§a§6§5jeszcze wiecej§7!", "§x§f§b§d§a§6§5Ilosc zdobywanych pieniedzy za zabójstwo", " §7Ranga §9SHIELD §8[§2+25$§8]", " §7Ranga §9SPONSOR §8[§2+17$§8]", " §7Ranga §6SVIP §8[§2+15$§8]", " §7Ranga §EVIP §8[§2+12$§8]", "§7Gracz §8[§2+10$§8]", " ", "§x§f§b§d§a§6§5Twoje statystyki", " §7Twój aktualny stan konta: §x§f§b§d§a§6§5" + plugin.getConfig().getInt(player.getUniqueId() + ".Monety") + "§2$"));
        torch.setItemMeta(torchmeta);

        ItemStack sklep1 = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta sklep1meta = sklep1.getItemMeta();
        sklep1meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&x&1&3&5&b&f&bSklep za $"));
        sklep1meta.setLore(Arrays.asList("§7Kliknij §x§0§7§7§0§d§0L§x§0§8§8§b§e§7P§x§0§9§a§5§f§dM, aby przjesc do sklepu!"));
        sklep1.setItemMeta(sklep1meta);

        ItemStack sklep2 = new ItemStack(Material.CLOCK);
        ItemMeta sklep2meta = sklep1.getItemMeta();
        sklep2meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&x&1&3&5&b&f&bSklep za czas"));
        sklep2meta.setLore(Arrays.asList("§7Kliknij §x§0§7§7§0§d§0L§x§0§8§8§b§e§7P§x§0§9§a§5§f§dM, aby przjesc do sklepu!", "§7Twoj czas gry to: " + plugin.getConfig().getInt(player.getUniqueId() + ".Minuty") + " minut"));
        sklep2.setItemMeta(sklep2meta);


        inv.setItem(0, szklo);
        inv.setItem(1, szklo);
        inv.setItem(2, szklo);
        inv.setItem(3, szklo);
        inv.setItem(4, torch);
        inv.setItem(5, szklo);
        inv.setItem(6, szklo);
        inv.setItem(7, szklo);
        inv.setItem(8, szklo);
        inv.setItem(9, szklo);
        inv.setItem(17, szklo);
        inv.setItem(18, szklo);
        inv.setItem(21, sklep2);
        inv.setItem(23, sklep1);
        inv.setItem(26, szklo);
        inv.setItem(27, szklo);
        inv.setItem(35, szklo);
        inv.setItem(36, szklo);
        inv.setItem(37, szklo);
        inv.setItem(38, szklo);
        inv.setItem(39, szklo);
        inv.setItem(40, szklo);
        inv.setItem(41, szklo);
        inv.setItem(42, szklo);
        inv.setItem(43, szklo);
        inv.setItem(44, szklo);

        player.openInventory(inv);
        return true;
    }
}
