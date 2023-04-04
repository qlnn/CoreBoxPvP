package me.hubikopter.shieldcoreboxpvp.listeners;

import me.hubikopter.shieldcoreboxpvp.ShieldCoreBoxPVP;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class UstawieniaGuiListener implements Listener {

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onClick3(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        InventoryView view = e.getView();
        if (view.getTitle().equals("§9§lUstawienia")) { // 2 6
            e.setCancelled(true);
            p.closeInventory();
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
            if (e.getSlot() == 13) {
                if (ShieldCoreBoxPVP.wm.get(p.getDisplayName()).equals("tak")) {
                    ShieldCoreBoxPVP.wm.put(p.getDisplayName(), "nie");
                } else {
                    ShieldCoreBoxPVP.wm.put(p.getDisplayName(), "tak");

                }
            }
            if (e.getSlot() == 11) {
                if (ShieldCoreBoxPVP.wb.get(p.getDisplayName()).equals("tak")) {
                    ShieldCoreBoxPVP.wb.put(p.getDisplayName(), "nie");
                } else {
                    ShieldCoreBoxPVP.wb.put(p.getDisplayName(), "tak");

                }
            }
            if (e.getSlot() == 15) {
                if (ShieldCoreBoxPVP.sm.get(p.getDisplayName()).equals("tak")) {
                    ShieldCoreBoxPVP.sm.put(p.getDisplayName(), "nie");
                } else {
                    ShieldCoreBoxPVP.sm.put(p.getDisplayName(), "tak");

                }
            }
            if (e.getSlot() == 31) {
                    ShieldCoreBoxPVP.sm.put(p.getDisplayName(), "nie");
                ShieldCoreBoxPVP.wb.put(p.getDisplayName(), "nie");
                ShieldCoreBoxPVP.wm.put(p.getDisplayName(), "nie");


            }
        }
            }
}
