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

public class Sklepkolory implements CommandExecutor {

    ShieldCoreBoxPVP plugin;

    public Sklepkolory(ShieldCoreBoxPVP plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        Inventory inv = Bukkit.createInventory(null, 45, "§9Sklep kolory");
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
        torchmeta.setLore(Arrays.asList(" ", "§dPieniadze §7zdobywasz poprzez §czabijanie graczy §7na arenie §cPVP§7!", "§7Pamiętaj że posiadając range §dPremium", "§7zyskujesz ich §djeszcze wiecej§7!", "§dIlosc zdobywanych pieniedzy za zabójstwo", " §7Ranga §5SZAFIR §8[§2+25$§8]", " §7Ranga §9SPONSOR §8[§2+17$§8]", " §7Ranga §6SVIP §8[§2+15$§8]", " §7Ranga §EVIP §8[§2+12$§8]", "§7Gracz §8[§2+10$§8]", " ", "§dTwoje statystyki", " §7Twój aktualny stan konta: §d" + plugin.getConfig().getInt(player.getUniqueId() + ".Monety") + "§2$"));
        torch.setItemMeta(torchmeta);

        ItemStack niebieski = new ItemStack(Material.LIGHT_BLUE_DYE);
        ItemMeta niebieskimeta = niebieski.getItemMeta();
        niebieskimeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&bJasny niebieski &7KOSZT: 100&2$"));
        niebieskimeta.setLore(Arrays.asList("§7Kliknij aby zakupic §cPAMIETAJ ZE KOLOR JEST JEDNORAZOWY"));
        niebieski.setItemMeta(niebieskimeta);

        ItemStack czerwony = new ItemStack(Material.RED_DYE);
        ItemMeta czerwonymeta = czerwony.getItemMeta();
        czerwonymeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cJasny czerwony &7KOSZT: 100&2$"));
        czerwonymeta.setLore(Arrays.asList("§7Kliknij aby zakupic §cPAMIETAJ ZE KOLOR JEST JEDNORAZOWY"));
        czerwony.setItemMeta(czerwonymeta);

        ItemStack zolty = new ItemStack(Material.YELLOW_DYE);
        ItemMeta zoltymeta = zolty.getItemMeta();
        zoltymeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&eJasny zolty &7KOSZT: 100&2$"));
        zoltymeta.setLore(Arrays.asList("§7Kliknij aby zakupic §cPAMIETAJ ZE KOLOR JEST JEDNORAZOWY"));
        zolty.setItemMeta(zoltymeta);

        ItemStack rozowy = new ItemStack(Material.PINK_DYE);
        ItemMeta rozowymeta = zolty.getItemMeta();
        rozowymeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&dJasny rozowy &7KOSZT: 100&2$"));
        rozowymeta.setLore(Arrays.asList("§7Kliknij aby zakupic §cPAMIETAJ ZE KOLOR JEST JEDNORAZOWY"));
        rozowy.setItemMeta(rozowymeta);

        ItemStack pomaranczowy = new ItemStack(Material.ORANGE_DYE);
        ItemMeta pomaranczowymeta = pomaranczowy.getItemMeta();
        pomaranczowymeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&6Pomaranczowy &7KOSZT: 100&2$"));
        pomaranczowymeta.setLore(Arrays.asList("§7Kliknij aby zakupic §cPAMIETAJ ZE KOLOR JEST JEDNORAZOWY"));
        pomaranczowy.setItemMeta(pomaranczowymeta);



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
        inv.setItem(20, rozowy);
        inv.setItem(21, niebieski);
        inv.setItem(22, zolty);
        inv.setItem(23, czerwony);
        inv.setItem(24, pomaranczowy);
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
