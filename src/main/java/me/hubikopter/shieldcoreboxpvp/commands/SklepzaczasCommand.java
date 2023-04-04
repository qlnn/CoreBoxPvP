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

public class SklepzaczasCommand implements CommandExecutor {

    ShieldCoreBoxPVP plugin;

    public SklepzaczasCommand(ShieldCoreBoxPVP plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        Inventory inv = Bukkit.createInventory(null, 45, "§9Sklep za czas gry");
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
        torchmeta.setLore(Arrays.asList(" ", "§x§1§3§5§b§f§bCzas gry §7zdobywasz spędzajac czas na serwerze twoj obecny czas gry to:" +  plugin.getConfig().getInt(player.getUniqueId() + ".Monety") + " minut"));
        torch.setItemMeta(torchmeta);

        ItemStack prefix = new ItemStack(Material.PAPER);
        ItemMeta prefixmeta = prefix.getItemMeta();
        prefixmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7Tytuł: &8[&6No-Life&8]"));
        prefixmeta.setLore(Arrays.asList("§7Koszt: §x§1§3§5§b§f§b10800 §7minut (7d)", " ", "§x§1§3§5§b§f§bInformacje dodatkowe:", "§7Po zakupie wybrany tytuł będzie przypisany do twojego konta §x§1§3§5§b§f§bna zawsze§7!", " ", " §8[§cUwaga!§8] §7Tytuł §8[§x§1§3§5§b§f§bNo-Life§8] &§jest dostępny tylko", "§x§1§3§5§b§f§bna tej edycji!§7 i nie bedzie on juz §cnigdy mozliwy do zdybycia!", "§7Kliknij §x§1§3§5§b§f§bLPM§7 aby zakupic!"));
        prefix.setItemMeta(prefixmeta);


        ItemStack shulker = new ItemStack(Material.SHULKER_SHELL);
        ItemMeta shulkermeta = shulker.getItemMeta();
        shulkermeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&x&9&6&0&c&d&8S&x&9&6&0&c&d&8h&x&9&6&0&c&d&8u&x&9&6&0&c&d&8l&x&9&6&0&c&d&8k&x&9&6&0&c&d&8e&x&9&6&0&c&d&8r&x&9&6&0&c&d&8b&x&9&6&0&c&d&8o&x&9&6&0&c&d&8x"));
        shulkermeta.setLore(Arrays.asList("§7Koszt: §x§1§3§5§b§f§b1440 §7minut (1d)", " ", "§x§1§3§5§b§f§bInformacje dodatkowe:", "§7Wymien §x§9§6§0§c§d§8Skorupe Shulkera §7na dowolnego shulkera u villagera!", "§7Kliknij §x§1§3§5§b§f§bLPM§7 aby kupic!"));
        shulker.setItemMeta(shulkermeta);

        ItemStack vip = new ItemStack(Material.PAPER);
        ItemMeta vipmeta = vip.getItemMeta();
        vipmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7Ranga &8[&6VIP&8]"));
        vipmeta.setLore(Arrays.asList("§7Koszt: §x§1§3§5§b§f§b5760 §7minut (4d)", " ", "§x§1§3§5§b§f§bInformacje dodatkowe:", "§7Czas trwania rangi: §x§1§3§5§b§f§b4 dni", "§7Kliknij §x§1§3§5§b§f§bLPM§7 aby kupic!"));
        vip.setItemMeta(vipmeta);

        ItemStack amethystowa = new ItemStack(Material.TRIPWIRE_HOOK);
        ItemMeta amethystowameta = amethystowa.getItemMeta();
        amethystowameta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7Klucz do skrzyni §x§1§3§5§b§f§bxxx&7!"));
        amethystowameta.setLore(Arrays.asList("§7Koszt: §x§1§3§5§b§f§b700 §7minut", " ", "§x§1§3§5§b§f§bInformacje dodatkowe:", " ", "§7Kliknij §x§1§3§5§b§f§bLPM§7 aby kupic!"));
        amethystowa.setItemMeta(amethystowameta);

        ItemStack premium = new ItemStack(Material.SKULL_BANNER_PATTERN);
        ItemMeta premiumm = premium.getItemMeta();
        premiumm.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7Bilet do kopalni &ePremium&7!"));
        premiumm.setLore(Arrays.asList("§7Koszt: §x§1§3§5§b§f§b1500 §7minut", " ", "§x§1§3§5§b§f§bInformacje dodatkowe:", "§7Czas trwania §e30 minut!", "§7Kliknij §x§1§3§5§b§f§bLPM§7 aby kupic!"));
        premium.setItemMeta(prefixmeta);




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
        inv.setItem(20, amethystowa);
        inv.setItem(21, vip);
        inv.setItem(22, prefix);
        inv.setItem(23, shulker);
        inv.setItem(24, premium);
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
