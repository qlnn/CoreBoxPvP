package me.hubikopter.shieldcoreboxpvp.listeners;

import me.hubikopter.shieldcoreboxpvp.ShieldCoreBoxPVP;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class KitListener implements Listener {

    private final Map<UUID, Integer> gracz = new HashMap<>();
    private final Map<UUID, Integer> vip = new HashMap<>();
    private final Map<UUID, Integer> svip = new HashMap<>();
    private final Map<UUID, Integer> shield = new HashMap<>();


    public static final int graczd = 60;
    public static final int vipd = 60;
    public static final int svipd = 60;
    public static final int shieldd = 60;

    ShieldCoreBoxPVP plugin;

    public KitListener(ShieldCoreBoxPVP plugin) {
        this.plugin = plugin;
    }

    public void setGracz(UUID player, int time) {
        if (time < 1) {
            gracz.remove(player);
        } else {
            gracz.put(player, time);
        }
    }

    public void setVip(UUID player, int time) {
        if (time < 1) {
            vip.remove(player);
        } else {
            vip.put(player, time);
        }
    }

    public void setSVIP(UUID player, int time) {
        if (time < 1) {
            svip.remove(player);
        } else {
            shield.put(player, time);
        }
    }

    public void setShield(UUID player, int time) {
        if (time < 1) {
            shield.remove(player);
        } else {
            shield.put(player, time);
        }
    }

    public int getGracz(UUID player) {
        return gracz.getOrDefault(player, 0);
    }

    public int getVip(UUID player) {
        return vip.getOrDefault(player, 0);
    }

    public int getSvip(UUID player) {
        return svip.getOrDefault(player, 0);
    }

    public int getShield(UUID player) {
        return shield.getOrDefault(player, 0);
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onClick3(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        InventoryView view = e.getView();
        Inventory vip = Bukkit.createInventory(null, 45, "§9§lVip");
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

        ItemStack shieldt = new ItemStack(Material.LIME_DYE);
        ItemMeta shieldtm = shieldt.getItemMeta();
        shieldtm.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&a&lOdbierz zestaw"));
        shieldt.setItemMeta(shieldtm);

        ItemStack graczt = new ItemStack(Material.LIME_DYE);
        ItemMeta gracztm = shieldt.getItemMeta();
        gracztm.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&a&lOdbierz zestaw"));
        graczt.setItemMeta(gracztm);


        ItemStack vipt = new ItemStack(Material.LIME_DYE);
        ItemMeta vipm = shieldt.getItemMeta();
        vipm.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&a&lOdbierz zestaw"));
        vipt.setItemMeta(vipm);

        ItemStack svipt = new ItemStack(Material.LIME_DYE);
        ItemMeta svipm = svipt.getItemMeta();
        svipm.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&a&lOdbierz zestaw"));
        svipt.setItemMeta(svipm);

        ItemStack helmgracz = new ItemStack(Material.LEATHER_HELMET);
        ItemMeta helmgraczmeta = helmgracz.getItemMeta();
        helmgraczmeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
        helmgraczmeta.addEnchant(Enchantment.DURABILITY, 1, true);
        helmgraczmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7Helm gracza!"));
        helmgraczmeta.setUnbreakable(true);
        helmgracz.setItemMeta(helmgraczmeta);

        ItemStack klatagracz = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemMeta klatagraczmeta = klatagracz.getItemMeta();
        klatagraczmeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
        klatagraczmeta.addEnchant(Enchantment.DURABILITY, 1, true);
        klatagraczmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7Klata gracza!"));
        klatagraczmeta.setUnbreakable(true);

        klatagracz.setItemMeta(klatagraczmeta);

        ItemStack spodniegracz = new ItemStack(Material.LEATHER_LEGGINGS);
        ItemMeta spodniegraczmeta = spodniegracz.getItemMeta();
        spodniegraczmeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
        spodniegraczmeta.addEnchant(Enchantment.DURABILITY, 1, true);
        spodniegraczmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7Spodnie gracza!"));
        spodniegraczmeta.setUnbreakable(true);

        spodniegracz.setItemMeta(spodniegraczmeta);

        ItemStack butygracz = new ItemStack(Material.LEATHER_BOOTS);
        ItemMeta butygraczmeta = butygracz.getItemMeta();
        butygraczmeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
        butygraczmeta.addEnchant(Enchantment.DURABILITY, 1, true);
        butygraczmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7Buty gracza!"));
        butygraczmeta.setUnbreakable(true);

        butygracz.setItemMeta(butygraczmeta);

        ItemStack kilofgracz = new ItemStack(Material.DIAMOND_PICKAXE);
        ItemMeta kilofgraczmeta = kilofgracz.getItemMeta();
        kilofgraczmeta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 2, true);
        kilofgraczmeta.addEnchant(Enchantment.DURABILITY, 1, true);
        kilofgraczmeta.addEnchant(Enchantment.DIG_SPEED, 2, true);
        kilofgraczmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7Kilof gracza!"));
        kilofgraczmeta.setUnbreakable(true);

        kilofgracz.setItemMeta(kilofgraczmeta);

        ItemStack mieczgracz = new ItemStack(Material.IRON_SWORD);
        ItemMeta mieczgraczmeta = mieczgracz.getItemMeta();
        mieczgraczmeta.addEnchant(Enchantment.DAMAGE_ALL, 2, true);
        mieczgraczmeta.addEnchant(Enchantment.DURABILITY, 1, true);
        mieczgraczmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&7Miecz gracz!"));
        mieczgraczmeta.setUnbreakable(true);
        mieczgracz.setItemMeta(mieczgraczmeta);

        ItemStack steak = new ItemStack(Material.COOKED_BEEF);
        ItemMeta steakmeta = steak.getItemMeta();
        steakmeta.addEnchant(Enchantment.DURABILITY, 1, true);
        steakmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&eMięso!"));
        steakmeta.setUnbreakable(true);

        steak.setItemMeta(steakmeta);

        ItemStack viphelm = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta viphelmmeta = (LeatherArmorMeta) viphelm.getItemMeta();
        viphelmmeta.setColor(Color.GREEN);
        viphelmmeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
        viphelmmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        viphelmmeta.addItemFlags(ItemFlag.HIDE_DYE);
        viphelmmeta.setUnbreakable(true);


        viphelmmeta.setLore(Arrays.asList(ChatColor.translateAlternateColorCodes('&', "&7[&e☂&7] Ochrona 5")));
        viphelmmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&x&0&8&c&1&0&5&lH&x&0&7&b&6&0&6&le&x&0&6&a&c&0&7&lł&x&0&5&a&1&0&9&lm &x&0&4&9&7&0&a&lZ&x&0&4&8&c&0&b&ló&x&0&3&8&2&0&c&lł&x&0&2&7&7&0&e&lw&x&0&1&6&d&0&f&li&x&0&0&6&2&1&0&la"));
        viphelm.setItemMeta(viphelmmeta);

        ItemStack sviphelm = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta sviphelmmeta = (LeatherArmorMeta) sviphelm.getItemMeta();
        sviphelmmeta.setColor(Color.BLUE);
        sviphelmmeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 11, true);
        sviphelmmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        sviphelmmeta.addItemFlags(ItemFlag.HIDE_DYE);
        sviphelmmeta.setUnbreakable(true);

        sviphelmmeta.setLore(Arrays.asList(ChatColor.translateAlternateColorCodes('&', "&7[&e☂&7] Ochrona 11")));
        sviphelmmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&x&0&6&e&1&f&f&lH&x&0&e&d&5&f&6&le&x&1&6&c&8&e&d&ll&x&1&e&b&c&e&4&lm &x&2&6&a&f&d&c&lR&x&2&e&a&3&d&3&ly&x&3&6&9&6&c&a&lb&x&3&e&8&a&c&1&ly"));
        sviphelm.setItemMeta(sviphelmmeta);

        ItemStack shieldheml = new ItemStack(Material.LEATHER_HELMET);
        LeatherArmorMeta shieldhelmmeta = (LeatherArmorMeta) shieldheml.getItemMeta();
        shieldhelmmeta.setColor(Color.RED);
        shieldhelmmeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 17, true);
        shieldhelmmeta.addEnchant(Enchantment.DURABILITY, 20, true);
        shieldhelmmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        shieldhelmmeta.addItemFlags(ItemFlag.HIDE_DYE);
        shieldhelmmeta.setUnbreakable(true);

        shieldhelmmeta.setLore(Arrays.asList("§7[§e☂§7] Ochrona 17", "§7[§f☁§7] Unbreaking 20"));
        shieldhelmmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&x&0&6&e&1&f&f&lH&x&0&e&d&5&f&6&le&x&1&6&c&8&e&d&ll&x&1&e&b&c&e&4&lm &x&2&6&a&f&d&c&lR&x&2&e&a&3&d&3&ly&x&3&6&9&6&c&a&lb&x&3&e&8&a&c&1&ly"));
        shieldheml.setItemMeta(shieldhelmmeta);

        ItemStack shieldklata = new ItemStack(Material.LEATHER_CHESTPLATE);
        LeatherArmorMeta shieldklatameta = (LeatherArmorMeta) shieldklata.getItemMeta();
        shieldklatameta.setColor(Color.RED);
        shieldklatameta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 17, true);
        shieldklatameta.addEnchant(Enchantment.DURABILITY, 20, true);
        shieldklatameta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        shieldklatameta.addItemFlags(ItemFlag.HIDE_DYE);
        shieldklatameta.setUnbreakable(true);

        shieldklatameta.setLore(Arrays.asList("§7[§e☂§7] Ochrona 17", "§7[§f☁§7] Unbreaking 20"));
        shieldklatameta.setDisplayName(ChatColor.translateAlternateColorCodes('&', " &x&f&f&0&0&0&0&lK&x&f&9&0&6&0&6&ll&x&f&4&0&b&0&b&la&x&e&e&1&1&1&1&lt&x&e&8&1&7&1&7&la &x&e&3&1&c&1&c&lW&x&d&d&2&2&2&2&lu&x&d&8&2&7&2&7&ll&x&d&2&2&d&2&d&lk&x&c&c&3&3&3&3&la&x&c&7&3&8&3&8&ln&x&c&1&3&e&3&e&lu"));
        shieldklata.setItemMeta(shieldklatameta);

        ItemStack shieldspodnie = new ItemStack(Material.LEATHER_LEGGINGS);
        LeatherArmorMeta shieldspodniemeta = (LeatherArmorMeta) shieldspodnie.getItemMeta();
        shieldspodniemeta.setColor(Color.RED);
        shieldspodniemeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 17, true);
        shieldspodniemeta.addEnchant(Enchantment.DURABILITY, 20, true);
        shieldspodniemeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        shieldspodniemeta.addItemFlags(ItemFlag.HIDE_DYE);
        shieldspodniemeta.setUnbreakable(true);

        shieldspodniemeta.setLore(Arrays.asList("§7[§e☂§7] Ochrona 17", "§7[§f☁§7] Unbreaking 20"));
        shieldspodniemeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', " &x&f&f&0&0&0&0&lK&x&f&9&0&6&0&6&ll&x&f&4&0&b&0&b&la&x&e&e&1&1&1&1&lt&x&e&8&1&7&1&7&la &x&e&3&1&c&1&c&lW&x&d&d&2&2&2&2&lu&x&d&8&2&7&2&7&ll&x&d&2&2&d&2&d&lk&x&c&c&3&3&3&3&la&x&c&7&3&8&3&8&ln&x&c&1&3&e&3&e&lu"));
        shieldspodnie.setItemMeta(shieldspodniemeta);

        ItemStack shieldbuty = new ItemStack(Material.LEATHER_BOOTS);
        LeatherArmorMeta shieldbutymeta = (LeatherArmorMeta) shieldbuty.getItemMeta();
        shieldbutymeta.setColor(Color.RED);
        shieldbutymeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 17, true);
        shieldbutymeta.addEnchant(Enchantment.DURABILITY, 20, true);
        shieldbutymeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        shieldbutymeta.addItemFlags(ItemFlag.HIDE_DYE);
        shieldbutymeta.setUnbreakable(true);

        shieldbutymeta.setLore(Arrays.asList("§7[§e☂§7] Ochrona 17", "§7[§f☁§7] Unbreaking 20"));
        shieldbutymeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', " &x&f&f&0&0&0&0&lB&x&f&9&0&6&0&6&lu&x&f&3&0&c&0&c&lt&x&e&c&1&3&1&3&ly &x&e&6&1&9&1&9&lW&x&e&0&1&f&1&f&lu&x&d&a&2&5&2&5&ll&x&d&4&2&b&2&b&lk&x&c&d&3&2&3&2&la&x&c&7&3&8&3&8&ln&x&c&1&3&e&3&e&lu"));
        shieldbuty.setItemMeta(shieldbutymeta);

        ItemStack shieldmiecz = new ItemStack(Material.MAGMA_CREAM);
        ItemMeta shieldmieczmeta = shieldmiecz.getItemMeta();
        shieldmieczmeta.addEnchant(Enchantment.DAMAGE_ALL, 17, true);
        shieldmieczmeta.addEnchant(Enchantment.FIRE_ASPECT, 3, true);
        shieldmieczmeta.setLore(Arrays.asList("§7[§c⚔§7] Sila 11", "§7[§6✹§7] Ogien 3"));
        shieldmieczmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        shieldmieczmeta.setUnbreakable(true);

        shieldmieczmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&x&f&f&0&0&0&0&lM&x&f&9&0&6&0&6&li&x&f&4&0&b&0&b&le&x&e&e&1&1&1&1&lc&x&e&8&1&7&1&7&lz &x&e&3&1&c&1&c&lW&x&d&d&2&2&2&2&lu&x&d&8&2&7&2&7&ll&x&d&2&2&d&2&d&lk&x&c&c&3&3&3&3&la&x&c&7&3&8&3&8&ln&x&c&1&3&e&3&e&lu"));
        shieldmiecz.setItemMeta(shieldmieczmeta);

        ItemStack shieldkilof = new ItemStack(Material.DIAMOND_PICKAXE);
        ItemMeta shieldkilofmeta = shieldkilof.getItemMeta();
        shieldkilofmeta.addEnchant(Enchantment.DIG_SPEED, 17, true);
        shieldkilofmeta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 6, true);
        shieldkilofmeta.addEnchant(Enchantment.DURABILITY, 7, true);
        shieldkilofmeta.setLore(Arrays.asList("§7[§c⚔§7] Wydajnosc 11", "§7[§a✞§7] Szczescie 6", "§7[§f☁§7] Unbreaking 7"));
        shieldkilofmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        shieldkilofmeta.setUnbreakable(true);

        shieldkilofmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&x&f&f&0&0&0&0&lK&x&f&9&0&6&0&6&li&x&f&4&0&b&0&b&ll&x&e&e&1&1&1&1&lo&x&e&8&1&7&1&7&lf &x&e&3&1&c&1&c&lW&x&d&d&2&2&2&2&lu&x&d&8&2&7&2&7&ll&x&d&2&2&d&2&d&lk&x&c&c&3&3&3&3&la&x&c&7&3&8&3&8&ln&x&c&1&3&e&3&e&lu"));
        shieldkilof.setItemMeta(shieldkilofmeta);

        ItemStack shieldelytra = new ItemStack(Material.ELYTRA);
        ItemMeta shieldelytrameta = shieldelytra.getItemMeta();
        shieldelytrameta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 17, true);
        shieldelytrameta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&x&f&f&0&0&0&0&lE&x&f&a&0&5&0&5&ll&x&f&5&0&a&0&a&ly&x&f&0&1&0&1&0&lt&x&e&a&1&5&1&5&lr&x&e&5&1&a&1&a&la &x&e&0&1&f&1&f&lW&x&d&b&2&4&2&4&lu&x&d&6&2&9&2&9&ll&x&d&1&2&f&2&f&lk&x&c&b&3&4&3&4&la&x&c&6&3&9&3&9&ln&x&c&1&3&e&3&e&lu"));

        shieldelytra.setItemMeta(shieldelytrameta);


        ItemStack vipklata = new ItemStack(Material.LEATHER_CHESTPLATE);
        LeatherArmorMeta vipklatameta = (LeatherArmorMeta) vipklata.getItemMeta();
        vipklatameta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
        vipklatameta.setColor(Color.GREEN);
        vipklatameta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        vipklatameta.setUnbreakable(true);

        vipklatameta.addItemFlags(ItemFlag.HIDE_DYE);

        ItemStack svipklata = new ItemStack(Material.LEATHER_CHESTPLATE);
        LeatherArmorMeta svipklatameta = (LeatherArmorMeta) svipklata.getItemMeta();
        svipklatameta.setColor(Color.BLUE);
        svipklatameta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 11, true);
        svipklatameta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        svipklatameta.addItemFlags(ItemFlag.HIDE_DYE);
        svipklatameta.setUnbreakable(true);

        svipklatameta.setLore(Arrays.asList(ChatColor.translateAlternateColorCodes('&', "&7[&e☂&7] Ochrona 11")));
        svipklatameta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&x&0&6&e&1&f&f&lK&x&0&d&d&6&f&7&ll&x&1&4&c&b&f&0&la&x&1&b&c&0&e&8&lt&x&2&2&b&6&e&0&la &x&2&9&a&b&d&8&lR&x&3&0&a&0&d&1&ly&x&3&7&9&5&c&9&lb&x&3&e&8&a&c&1&ly"));
        svipklata.setItemMeta(svipklatameta);

        vipklatameta.setLore(Arrays.asList(ChatColor.translateAlternateColorCodes('&', "&7[&e☂&7] Ochrona 5")));
        viphelmmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        vipklatameta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&x&0&8&c&1&0&5&lK&x&0&7&b&8&0&6&ll&x&0&6&a&e&0&7&la&x&0&6&a&5&0&8&lt&x&0&5&9&b&0&9&la &x&0&4&9&2&0&b&lZ&x&0&3&8&8&0&c&ló&x&0&2&7&f&0&d&lł&x&0&2&7&5&0&e&lw&x&0&1&6&c&0&f&li&x&0&0&6&2&1&0&la"));
        vipklata.setItemMeta(vipklatameta);

        ItemStack vipspodnie = new ItemStack(Material.LEATHER_LEGGINGS);
        LeatherArmorMeta vipspodniemeta = (LeatherArmorMeta) vipspodnie.getItemMeta();
        vipspodniemeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
        vipspodniemeta.setColor(Color.GREEN);
        vipspodniemeta.setUnbreakable(true);

        vipspodniemeta.addItemFlags(ItemFlag.HIDE_DYE);

        ItemStack svipbuty = new ItemStack(Material.LEATHER_BOOTS);
        LeatherArmorMeta svipbutyItemMeta = (LeatherArmorMeta) svipbuty.getItemMeta();
        svipbutyItemMeta.setColor(Color.BLUE);
        svipbutyItemMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 11, true);
        svipbutyItemMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        svipbutyItemMeta.addItemFlags(ItemFlag.HIDE_DYE);
        svipbutyItemMeta.setLore(Arrays.asList(ChatColor.translateAlternateColorCodes('&', "&7[&e☂&7] Ochrona 11")));
        svipbutyItemMeta.setUnbreakable(true);

        svipbutyItemMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&x&0&6&e&1&f&f&lB&x&0&e&d&5&f&6&lu&x&1&6&c&8&e&d&lt&x&1&e&b&c&e&4&ly &x&2&6&a&f&d&c&lR&x&2&e&a&3&d&3&ly&x&3&6&9&6&c&a&lb&x&3&e&8&a&c&1&ly"));
        svipbuty.setItemMeta(svipbutyItemMeta);

        vipspodniemeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        vipspodniemeta.setUnbreakable(true);

        vipspodniemeta.setLore(Arrays.asList(ChatColor.translateAlternateColorCodes('&', "&7[&e☂&7] Ochrona 5")));
        vipspodniemeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&x&0&8&c&1&0&5&lS&x&0&7&b&9&0&6&lp&x&0&7&b&1&0&7&lo&x&0&6&a&9&0&8&ld&x&0&5&a&1&0&9&ln&x&0&5&9&9&0&a&li&x&0&4&9&2&0&b&le &x&0&3&8&a&0&b&lZ&x&0&3&8&2&0&c&ló&x&0&2&7&a&0&d&lł&x&0&1&7&2&0&e&lw&x&0&1&6&a&0&f&li&x&0&0&6&2&1&0&la"));
        vipspodnie.setItemMeta(vipspodniemeta);


        ItemStack svipspodnie = new ItemStack(Material.LEATHER_LEGGINGS);
        LeatherArmorMeta svipspodniemeta = (LeatherArmorMeta) svipspodnie.getItemMeta();
        svipspodniemeta.setColor(Color.BLUE);
        svipspodniemeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 11, true);
        svipspodniemeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        svipspodniemeta.addItemFlags(ItemFlag.HIDE_DYE);
        svipspodniemeta.setUnbreakable(true);

        svipspodniemeta.setLore(Arrays.asList(ChatColor.translateAlternateColorCodes('&', "&7[&e☂&7] Ochrona 11")));
        svipspodniemeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&x&0&6&e&1&f&f&lS&x&0&c&d&8&f&9&lp&x&1&1&d&0&f&3&lo&x&1&7&c&7&e&c&ld&x&1&c&b&e&e&6&ln&x&2&2&b&6&e&0&li&x&2&8&a&d&d&a&le &x&2&d&a&4&d&4&lR&x&3&3&9&b&c&d&ly&x&3&8&9&3&c&7&lb&x&3&e&8&a&c&1&ly"));
        svipspodnie.setItemMeta(svipspodniemeta);


        ItemStack vipbuty = new ItemStack(Material.LEATHER_BOOTS);
        LeatherArmorMeta vipbutymeta = (LeatherArmorMeta) vipbuty.getItemMeta();
        vipbutymeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
        vipbutymeta.setLore(Arrays.asList(ChatColor.translateAlternateColorCodes('&', "&7[&e☂&7] Ochrona 5")));
        vipbutymeta.addItemFlags(ItemFlag.HIDE_DYE);
        vipbutymeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        vipbutymeta.setColor(Color.GREEN);
        vipbutymeta.setUnbreakable(true);
        vipbutymeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&x&0&8&c&1&0&5&lB&x&0&7&b&6&0&6&lu&x&0&6&a&c&0&7&lt&x&0&5&a&1&0&9&ly &x&0&4&9&7&0&a&lZ&x&0&4&8&c&0&b&ló&x&0&3&8&2&0&c&lł&x&0&2&7&7&0&e&lw&x&0&1&6&d&0&f&li&x&0&0&6&2&1&0&la"));
        vipbuty.setItemMeta(vipbutymeta);

        ItemStack vipmiecz = new ItemStack(Material.SCUTE);
        ItemMeta vipmieczmeta = vipmiecz.getItemMeta();
        vipmieczmeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
        vipmieczmeta.setLore(Arrays.asList(ChatColor.translateAlternateColorCodes('&', "&7[&c⚔&7] Sila 5")));
        vipmieczmeta.addItemFlags(ItemFlag.HIDE_DYE);
        vipmieczmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        vipmieczmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&x&1&a&b&c&0&0&lM&x&1&b&b&4&0&3&li&x&1&b&a&c&0&6&le&x&1&c&a&3&0&9&lc&x&1&c&9&b&0&c&lz &x&1&d&9&3&0&f&lŻ&x&1&d&8&b&1&1&ló&x&1&e&8&3&1&4&lł&x&1&e&7&a&1&7&lw&x&1&f&7&2&1&a&li&x&1&f&6&a&1&d&la"));
        vipmiecz.setItemMeta(vipmieczmeta);

        ItemStack svipmiecz = new ItemStack(Material.TROPICAL_FISH);
        ItemMeta svipmieczmeta = svipmiecz.getItemMeta();
        svipmieczmeta.addEnchant(Enchantment.DAMAGE_ALL, 11, true);
        svipmieczmeta.addEnchant(Enchantment.FIRE_ASPECT, 2, true);
        svipmieczmeta.setLore(Arrays.asList("§7[§c⚔§7] Sila 11", "§7[§6✹§7] Ogien 2"));
        svipmieczmeta.addItemFlags(ItemFlag.HIDE_DYE);
        svipmieczmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        svipmieczmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&x&0&6&e&1&f&f&lM&x&0&d&d&6&f&7&li&x&1&4&c&b&f&0&le&x&1&b&c&0&e&8&lc&x&2&2&b&6&e&0&lz &x&2&9&a&b&d&8&lR&x&3&0&a&0&d&1&ly&x&3&7&9&5&c&9&lb&x&3&e&8&a&c&1&ly"));
        svipmiecz.setItemMeta(svipmieczmeta);

        ItemStack svipkilof = new ItemStack(Material.DIAMOND_PICKAXE);
        ItemMeta svipkilofmeta = svipkilof.getItemMeta();
        svipkilofmeta.addEnchant(Enchantment.DIG_SPEED, 11, true);
        svipkilofmeta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 3, true);
        svipkilofmeta.setLore(Arrays.asList("§7[§c⚔§7] Wydajnosc 11", "§7[§a✞§7] Szczescie 3"));
        svipkilofmeta.addItemFlags(ItemFlag.HIDE_DYE);
        svipkilofmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        svipkilofmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&x&0&6&e&1&f&f&lM&x&0&d&d&6&f&7&li&x&1&4&c&b&f&0&le&x&1&b&c&0&e&8&lc&x&2&2&b&6&e&0&lz &x&2&9&a&b&d&8&lR&x&3&0&a&0&d&1&ly&x&3&7&9&5&c&9&lb&x&3&e&8&a&c&1&ly"));
        svipkilof.setItemMeta(svipkilofmeta);

        ItemStack vipkilof = new ItemStack(Material.DIAMOND_PICKAXE);
        ItemMeta vipkilofmeta = vipkilof.getItemMeta();
        vipkilofmeta.addEnchant(Enchantment.DIG_SPEED, 3, true);
        vipkilofmeta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 1, true); // &7[&9⛏&7] Wydajnosc 3 &7[&a✞&7] Szczęscie 1
        vipkilofmeta.setLore(Arrays.asList("§7[§9⛏§7] Wydajnosc 3", "§7[§a✞§7] Szczęscie 1"));
        vipkilofmeta.addItemFlags(ItemFlag.HIDE_DYE);
        vipkilofmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        vipkilofmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&x&1&a&b&c&0&0&lK&x&1&b&b&4&0&3&li&x&1&b&a&c&0&6&ll&x&1&c&a&3&0&9&lo&x&1&c&9&b&0&c&lf &x&1&d&9&3&0&f&lŻ&x&1&d&8&b&1&1&ló&x&1&e&8&3&1&4&lł&x&1&e&7&a&1&7&lw&x&1&f&7&2&1&a&li&x&1&f&6&a&1&d&la"));
        vipkilof.setItemMeta(vipkilofmeta);

        if (plugin.getConfig().getInt(p.getUniqueId() + ".Shield") > 0) {
            shieldtm.setLore(Arrays.asList("§8× §7Nie mozesz odebrac zestawu", "§7Bedziesz mogl odebrac go za: " + plugin.getConfig().getInt(p.getUniqueId() + ".Shield") + " minut!"));
            shieldt.setItemMeta(shieldtm);
        } else {
            shieldtm.setLore(Arrays.asList("§8× §7Kliknij aby odebrac zestaw"));
            shieldt.setItemMeta(shieldtm);
        }

        if (plugin.getConfig().getInt(p.getUniqueId() + ".Gracz") > 0) {
            gracztm.setLore(Arrays.asList("§8× §7Nie mozesz odebrac zestawu", "§7Bedziesz mogl odebrac go za: " + plugin.getConfig().getInt(p.getUniqueId() + ".Gracz") + " minut!"));
            graczt.setItemMeta(gracztm);
        } else {
            gracztm.setLore(Arrays.asList("§8× §7Kliknij aby odebrac zestaw"));
            graczt.setItemMeta(gracztm);
        }

        if (plugin.getConfig().getInt(p.getUniqueId() + ".Vip") > 0) {
            vipm.setLore(Arrays.asList("§8× §7Nie mozesz odebrac zestawu", "§7Bedziesz mogl odebrac go za: " + plugin.getConfig().getInt(p.getUniqueId() + ".Vip") + " minut!"));
            vipt.setItemMeta(vipm);
        } else {
            vipm.setLore(Arrays.asList("§8× §7Kliknij aby odebrac zestaw"));
            vipt.setItemMeta(vipm);
        }

        if (plugin.getConfig().getInt(p.getUniqueId() + ".Svip") > 0) {
            svipm.setLore(Arrays.asList("§8× §7Nie mozesz odebrac zestawu", "§7Bedziesz mogl odebrac go za: " + plugin.getConfig().getInt(p.getUniqueId() + ".Svip") + " minut!"));
            svipt.setItemMeta(svipm);
        } else {
            gracztm.setLore(Arrays.asList("§8× §7Kliknij aby odebrac zestaw"));
            graczt.setItemMeta(gracztm);
        }

        vip.setItem(0, szklo);
        vip.setItem(1, szklo2);
        vip.setItem(2, szklo3);
        vip.setItem(3, szklo3);
        vip.setItem(5, szklo3);
        vip.setItem(6, szklo3);
        vip.setItem(7, szklo2);
        vip.setItem(8, szklo);
        vip.setItem(9, szklo2);
        vip.setItem(10, viphelm);
        vip.setItem(11, vipklata);
        vip.setItem(12, vipspodnie);
        vip.setItem(13, vipbuty);
        vip.setItem(14, vipmiecz);
        vip.setItem(15, vipkilof);
        vip.setItem(17, szklo2);
        vip.setItem(18, szklo3);
        vip.setItem(26, szklo3);
        vip.setItem(34, vipt);

        vip.setItem(27, szklo2);
        vip.setItem(35, szklo2);
        vip.setItem(36, szklo);
        vip.setItem(37, szklo2);
        vip.setItem(38, szklo3);
        vip.setItem(39, szklo3);
        vip.setItem(41, szklo3);
        vip.setItem(42, szklo3);
        vip.setItem(43, szklo2);
        vip.setItem(44, szklo);

        Inventory gracz = Bukkit.createInventory(null, 45, "§9§lGracz");

        gracz.setItem(0, szklo);
        gracz.setItem(1, szklo2);
        gracz.setItem(2, szklo3);
        gracz.setItem(3, szklo3);
        gracz.setItem(5, szklo3);
        gracz.setItem(6, szklo3);
        gracz.setItem(7, szklo2);
        gracz.setItem(8, szklo);
        gracz.setItem(9, szklo2);
        gracz.setItem(10, helmgracz);
        gracz.setItem(11, klatagracz);
        gracz.setItem(12, spodniegracz);
        gracz.setItem(13, butygracz);
        gracz.setItem(14, mieczgracz);
        gracz.setItem(15, kilofgracz);
        gracz.setItem(16, steak);

        gracz.setItem(17, szklo2);
        gracz.setItem(18, szklo3);
        gracz.setItem(26, szklo3);
        gracz.setItem(27, szklo2);
        gracz.setItem(35, szklo2);
        gracz.setItem(34, graczt);

        gracz.setItem(36, szklo);
        gracz.setItem(37, szklo2);
        gracz.setItem(38, szklo3);
        gracz.setItem(39, szklo3);
        gracz.setItem(41, szklo3);
        gracz.setItem(42, szklo3);
        gracz.setItem(43, szklo2);
        gracz.setItem(44, szklo);

        Inventory svip = Bukkit.createInventory(null, 45, "§9§lSVip");

        svip.setItem(0, szklo);
        svip.setItem(1, szklo2);
        svip.setItem(2, szklo3);
        svip.setItem(3, szklo3);
        svip.setItem(5, szklo3);
        svip.setItem(6, szklo3);
        svip.setItem(7, szklo2);
        svip.setItem(8, szklo);
        svip.setItem(9, szklo2);
        svip.setItem(10, sviphelm);
        svip.setItem(11, svipklata);
        svip.setItem(12, svipspodnie);
        svip.setItem(13, svipbuty);
        svip.setItem(14, svipmiecz);
        svip.setItem(15, svipkilof);
        svip.setItem(17, szklo2);
        svip.setItem(18, szklo3);
        svip.setItem(26, szklo3);
        svip.setItem(27, szklo2);
        svip.setItem(34, svipt);

        svip.setItem(35, szklo2);
        svip.setItem(36, szklo);
        svip.setItem(37, szklo2);
        svip.setItem(38, szklo3);
        svip.setItem(39, szklo3);
        svip.setItem(41, szklo3);
        svip.setItem(42, szklo3);
        svip.setItem(43, szklo2);
        svip.setItem(44, szklo);

        Inventory shield = Bukkit.createInventory(null, 45, "§9§lShield");

        shield.setItem(0, szklo);
        shield.setItem(1, szklo2);
        shield.setItem(2, szklo3);
        shield.setItem(3, szklo3);
        shield.setItem(5, szklo3);
        shield.setItem(6, szklo3);
        shield.setItem(7, szklo2);
        shield.setItem(8, szklo);
        shield.setItem(9, szklo2);
        shield.setItem(10, shieldheml);
        shield.setItem(11, shieldklata);
        shield.setItem(12, shieldspodnie);
        shield.setItem(13, shieldbuty);
        shield.setItem(14, shieldmiecz);
        shield.setItem(15, shieldkilof);
        shield.setItem(16, shieldelytra);
        shield.setItem(17, szklo2);
        shield.setItem(18, szklo3);
        shield.setItem(26, szklo3);
        shield.setItem(27, szklo2);
        shield.setItem(34, shieldt);
        shield.setItem(35, szklo2);
        shield.setItem(36, szklo);
        shield.setItem(37, szklo2);
        shield.setItem(38, szklo3);
        shield.setItem(39, szklo3);
        shield.setItem(41, szklo3);
        shield.setItem(42, szklo3);
        shield.setItem(43, szklo2);
        shield.setItem(44, szklo);

        if (view.getTitle().equals("§9§lDostepne zestawy")) {
            e.setCancelled(true);
            if (e.getSlot() == 21) {
                p.closeInventory();
                p.openInventory(vip);
            }
            if (e.getSlot() == 19) {
                p.closeInventory();
                p.openInventory(gracz);
            }

            if (e.getSlot() == 23) {
                p.closeInventory();
                p.openInventory(svip);
            }
            if (e.getSlot() == 25) {
                p.closeInventory();
                p.openInventory(shield);
            }
        }
        if (view.getTitle().equals("§9§lShield")) {
            e.setCancelled(true);
            if (e.getSlot() == 34) {
                if (p.hasPermission("kit.shield")) {
                    if (plugin.getConfig().getInt(p.getUniqueId() + ".Shield") == 0) {
                        p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[&9&l!&8]&7 Pomyslnie odebrales zestaw!"));
                        p.getInventory().addItem(shieldheml);
                        p.getInventory().addItem(shieldklata);
                        p.getInventory().addItem(shieldspodnie);
                        p.getInventory().addItem(shieldbuty);
                        p.getInventory().addItem(shieldmiecz);
                        p.getInventory().addItem(shieldkilof);
                        p.getInventory().addItem(shieldelytra);

                        plugin.getConfig().set(p.getUniqueId() + ".Shield", 1440);
                        plugin.saveDefaultConfig();
                        plugin.saveConfig();
                    } else {
                        p.sendMessage(ChatColor.GRAY + "Nie mozesz odebrac jeszcze tego zestawu");
                    }
                }
            }

        }
        if (view.getTitle().equals("§9§lGracz")) {
            e.setCancelled(true);
            if (e.getSlot() == 34) {
                if (plugin.getConfig().getInt(p.getUniqueId() + ".Gracz") == 0) {
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[&9&l!&8]&7 Pomyslnie odebrales zestaw!"));
                    p.getInventory().addItem(helmgracz);
                    p.getInventory().addItem(klatagracz);
                    p.getInventory().addItem(spodniegracz);
                    p.getInventory().addItem(butygracz);
                    p.getInventory().addItem(mieczgracz);
                    p.getInventory().addItem(kilofgracz);
                    plugin.getConfig().set(p.getUniqueId() + ".Gracz", 10);
                    plugin.saveDefaultConfig();
                    plugin.saveConfig();
                    for (int i = 0; i < 64; i++) {
                        p.getInventory().addItem(steak);
                    }
                } else {
                    p.sendMessage(ChatColor.GRAY + "Nie mozesz odebrac jeszcze tego zestawu");
                }
            }
        }
            if (view.getTitle().equals("§9§lVip")) {
                e.setCancelled(true);
                if (e.getSlot() == 34) {
                    if (p.hasPermission("kit.vip")) {

                        if (plugin.getConfig().getInt(p.getUniqueId() + ".Vip") == 0) {
                            p.getInventory().addItem(viphelm);
                            p.getInventory().addItem(vipklata);
                            p.getInventory().addItem(vipspodnie);
                            p.getInventory().addItem(vipbuty);
                            p.getInventory().addItem(vipmiecz);
                            p.getInventory().addItem(vipkilof);
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[&9&l!&8]&7 Pomyslnie odebrales zestaw!"));
                            plugin.getConfig().set(p.getUniqueId() + ".Vip", 720);
                            plugin.saveDefaultConfig();
                            plugin.saveConfig();
                        } else {
                            p.sendMessage(ChatColor.GRAY + "Nie mozesz odebrac jeszcze tego zestawu");
                        }
                    }
                }
            }
            if (view.getTitle().equals("§9§lSVip")) {
                e.setCancelled(true);
                if (e.getSlot() == 34) {
                    if (p.hasPermission("kit.svip")) {
                        if (plugin.getConfig().getInt(p.getUniqueId() + ".Svip") == 0) {
                            p.getInventory().addItem(sviphelm);
                            p.getInventory().addItem(svipklata);
                            p.getInventory().addItem(svipspodnie);
                            p.getInventory().addItem(svipbuty);
                            p.getInventory().addItem(svipmiecz);
                            p.getInventory().addItem(svipkilof);
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[&9&l!&8]&7 Pomyslnie odebrales zestaw!"));
                            plugin.getConfig().set(p.getUniqueId() + ".Svip", 720);
                            plugin.saveDefaultConfig();
                            plugin.saveConfig();
                        } else {
                            p.sendMessage(ChatColor.GRAY + "Nie mozesz odebrac jeszcze tego zestawu");
                        }
                    }
                }

            }
        }
    }








