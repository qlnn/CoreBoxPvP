package me.hubikopter.shieldcoreboxpvp.listeners;

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

public class Sklepprefixy implements CommandExecutor {

    ShieldCoreBoxPVP plugin;

    public Sklepprefixy(ShieldCoreBoxPVP plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        Inventory inv = Bukkit.createInventory(null, 45, "§9Sklep prefixy");
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
        torchmeta.setLore(Arrays.asList(" ", "§x§f§b§d§a§6§5Pieniadze §7zdobywasz poprzez §czabijanie graczy §7na arenie §cPVP§7!", "§7Pamiętaj że posiadając range §x§f§b§d§a§6§5Premium", "§7zyskujesz ich §x§f§b§d§a§6§5jeszcze wiecej§7!", "§x§f§b§d§a§6§5Ilosc zdobywanych pieniedzy za zabójstwo", " §7Ranga §5SZAFIR §8[§2+25$§8]", " §7Ranga §9SPONSOR §8[§2+17$§8]", " §7Ranga §6SVIP §8[§2+15$§8]", " §7Ranga §EVIP §8[§2+12$§8]", "§7Gracz §8[§2+10$§8]", " ", "§x§f§b§d§a§6§5Twoje statystyki", " §7Twój aktualny stan konta: §x§f§b§d§a§6§5" + plugin.getConfig().getInt(player.getUniqueId() + ".Monety") + "§2$"));
        torch.setItemMeta(torchmeta);

        ItemStack serce = new ItemStack(Material.PAPER);
        ItemMeta sercemeta = serce.getItemMeta();
        sercemeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c❤"));
        sercemeta.setLore(Arrays.asList("§7PAMIETAJ ZE PREFIX JEST JEDNORAZOWY", "§7KOSZT §2500$"));
        serce.setItemMeta(sercemeta);

        ItemStack serce2 = new ItemStack(Material.PAPER);
        ItemMeta sercemeta2 = serce.getItemMeta();
        sercemeta2.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&b☂"));
        sercemeta2.setLore(Arrays.asList("§7PAMIETAJ ZE PREFIX JEST JEDNORAZOWY", "§7KOSZT §2500$"));
        serce2.setItemMeta(sercemeta2);

        ItemStack serce3 = new ItemStack(Material.PAPER);
        ItemMeta sercemeta3 = serce3.getItemMeta();
        sercemeta3.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6☀"));
        sercemeta3.setLore(Arrays.asList("§7PAMIETAJ ZE PREFIX JEST JEDNORAZOWY", "§7KOSZT §2500$"));
        serce3.setItemMeta(sercemeta3);

        ItemStack serce4 = new ItemStack(Material.PAPER);
        ItemMeta sercemeta4 = serce4.getItemMeta();
        sercemeta4.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&eϟ"));
        sercemeta4.setLore(Arrays.asList("§7PAMIETAJ ZE PREFIX JEST JEDNORAZOWY", "§7KOSZT §2500$"));
        serce4.setItemMeta(sercemeta4);

        ItemStack serce5 = new ItemStack(Material.PAPER);
        ItemMeta sercemeta5 = serce5.getItemMeta();
        sercemeta5.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&f☁"));
        sercemeta5.setLore(Arrays.asList("§7PAMIETAJ ZE PREFIX JEST JEDNORAZOWY", "§7KOSZT §2500$"));
        serce5.setItemMeta(sercemeta5);

        ItemStack serce6 = new ItemStack(Material.PAPER);
        ItemMeta sercemeta6 = serce6.getItemMeta();
        sercemeta6.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&f☁"));
        sercemeta6.setLore(Arrays.asList("§7PAMIETAJ ZE PREFIX JEST JEDNORAZOWY", "§7KOSZT §2500$"));
        serce6.setItemMeta(sercemeta6);

        ItemStack serce7 = new ItemStack(Material.PAPER);
        ItemMeta sercemeta7 = serce7.getItemMeta();
        sercemeta7.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&9♬"));
        sercemeta7.setLore(Arrays.asList("§7PAMIETAJ ZE PREFIX JEST JEDNORAZOWY", "§7KOSZT §2500$"));
        serce7.setItemMeta(sercemeta7);

        ItemStack serce8 = new ItemStack(Material.PAPER);
        ItemMeta sercemeta8 = serce8.getItemMeta();
        sercemeta8.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&0♠"));
        sercemeta8.setLore(Arrays.asList("§7PAMIETAJ ZE PREFIX JEST JEDNORAZOWY", "§7KOSZT §2500$"));
        serce8.setItemMeta(sercemeta8);

        ItemStack serce9 = new ItemStack(Material.PAPER);
        ItemMeta sercemeta9 = serce9.getItemMeta();
        sercemeta9.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&4✝"));
        sercemeta9.setLore(Arrays.asList("§7PAMIETAJ ZE PREFIX JEST JEDNORAZOWY", "§7KOSZT §2500$"));
        serce9.setItemMeta(sercemeta9);

        ItemStack serce11 = new ItemStack(Material.PAPER);
        ItemMeta sercemeta11 = serce11.getItemMeta();
        sercemeta11.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&4☯"));
        sercemeta11.setLore(Arrays.asList("§7PAMIETAJ ZE PREFIX JEST JEDNORAZOWY", "§7KOSZT §2500$"));
        serce11.setItemMeta(sercemeta11);

        ItemStack serce12 = new ItemStack(Material.PAPER);
        ItemMeta sercemeta12 = serce12.getItemMeta();
        sercemeta12.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&e★"));
        sercemeta12.setLore(Arrays.asList("§7PAMIETAJ ZE PREFIX JEST JEDNORAZOWY", "§7KOSZT §2500$"));
        serce12.setItemMeta(sercemeta12);

        ItemStack serce13 = new ItemStack(Material.PAPER);
        ItemMeta sercemeta13 = serce13.getItemMeta();
        sercemeta13.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&d✌"));
        sercemeta13.setLore(Arrays.asList("§7PAMIETAJ ZE PREFIX JEST JEDNORAZOWY", "§7KOSZT §2500$"));
        serce13.setItemMeta(sercemeta13);

        ItemStack serce14 = new ItemStack(Material.PAPER);
        ItemMeta sercemeta14 = serce14.getItemMeta();
        sercemeta14.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&9♀"));
        sercemeta14.setLore(Arrays.asList("§7PAMIETAJ ZE PREFIX JEST JEDNORAZOWY", "§7KOSZT §2500$"));
        serce14.setItemMeta(sercemeta14);

        ItemStack serce15 = new ItemStack(Material.PAPER);
        ItemMeta sercemeta15 = serce15.getItemMeta();
        sercemeta15.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&d☿"));
        sercemeta15.setLore(Arrays.asList("§7PAMIETAJ ZE PREFIX JEST JEDNORAZOWY", "§7KOSZT §2500$"));
        serce15.setItemMeta(sercemeta15);

        ItemStack serce16 = new ItemStack(Material.PAPER);
        ItemMeta sercemeta16 = serce16.getItemMeta();
        sercemeta16.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&f☠"));
        sercemeta16.setLore(Arrays.asList("§7PAMIETAJ ZE PREFIX JEST JEDNORAZOWY", "§7KOSZT §2500$"));
        serce16.setItemMeta(sercemeta16);





        // 21 23


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
        inv.setItem(13, serce7);
        inv.setItem(20, serce);
        inv.setItem(21, serce2);
        inv.setItem(22, serce3);
        inv.setItem(23, serce4);
        inv.setItem(24, serce5);
        inv.setItem(26, szklo);
        inv.setItem(28, serce8);
        inv.setItem(29, serce9);
        inv.setItem(30, serce11);
        inv.setItem(31, serce12);
        inv.setItem(32, serce13);
        inv.setItem(33, serce13);
        inv.setItem(34, serce16);
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
