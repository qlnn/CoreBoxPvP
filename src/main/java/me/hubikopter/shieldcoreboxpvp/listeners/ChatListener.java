package me.hubikopter.shieldcoreboxpvp.listeners;

import me.clip.placeholderapi.PlaceholderAPI;
import me.hubikopter.shieldcoreboxpvp.ShieldCoreBoxPVP;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.bukkit.ChatColor.COLOR_CHAR;

public class ChatListener implements Listener {

    ShieldCoreBoxPVP plugin;

    public ChatListener(ShieldCoreBoxPVP plugin) {
        this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onChat(AsyncPlayerChatEvent e) {
        Player p = e.getPlayer();
        String replaced = PlaceholderAPI.setPlaceholders(p, "%funnyguilds_g-tag%");
        if (!(e.getMessage().equalsIgnoreCase("%"))) {
            if (p.hasPermission("gracz.prefix")) {
                if (plugin.getConfig().getString(p.getUniqueId() + ".Kolor") != null) {
                    e.setFormat(ChatColor.translateAlternateColorCodes('&', "&8[&7" + replaced + "&8] &8[&x&f&b&a&9&a&9G&x&f&c&b&e&b&er&x&f&c&d&3&d&3a&x&f&d&e&8&e&8c&x&f&d&f&d&f&dz&8] " + plugin.getConfig().getString(p.getUniqueId() + ".Prefix") + " " + plugin.getConfig().getString(p.getUniqueId() + ".Kolor") + p.getDisplayName() + " &8» &7" + e.getMessage()).replaceAll("%", " "));

                }
            }
            if (p.hasPermission("gracz.vip")) {
                if (plugin.getConfig().getString(p.getUniqueId() + ".Kolor") != null) {
                    e.setFormat(ChatColor.translateAlternateColorCodes('&', "&8[&7"+ replaced + "&8] &8[&x&f&b&e&2&0&0V&x&f&c&e&0&1&di&x&f&d&d&e&3&9p&8] " + plugin.getConfig().getString(p.getUniqueId() + ".Prefix") + " " + plugin.getConfig().getString(p.getUniqueId() + ".Kolor") + p.getDisplayName() + " &8» &7" + e.getMessage()).replaceAll("%", " "));
                }
            }
            if (p.hasPermission("gracz.svip")) {
                if (plugin.getConfig().getString(p.getUniqueId() + ".Kolor") != null) {
                    e.setFormat(ChatColor.translateAlternateColorCodes('&', "&8[&7" + replaced + "&8] &8[&x&f&b&e&2&0&0s&x&f&c&e&1&1&3V&x&f&c&d&f&2&6i&x&f&d&d&e&3&9p&8] " + plugin.getConfig().getString(p.getUniqueId() + ".Prefix") + " " + plugin.getConfig().getString(p.getUniqueId() + ".Kolor") + p.getDisplayName() + " &8» &7" + e.getMessage()).replaceAll("%", " "));

                }
            }
            if (p.hasPermission("gracz.sponsor")) {
                if (plugin.getConfig().getString(p.getUniqueId() + ".Kolor") != null) {
                    e.setFormat(ChatColor.translateAlternateColorCodes('&', "&8[&7"+ replaced +"&8] &8[&x&0&0&f&b&d&dS&x&0&f&f&b&d&8p&x&1&d&f&c&d&4o&x&2&c&f&c&c&fn&x&3&a&f&c&c&as&x&4&9&f&d&c&6o&x&5&7&f&d&c&1r&8] " + plugin.getConfig().getString(p.getUniqueId() + ".Prefix") + " " + plugin.getConfig().getString(p.getUniqueId() + ".Kolor") + p.getDisplayName() + " &8» &7" + e.getMessage()).replaceAll("%", " "));

                }
            }
            if (p.hasPermission("gracz.shield")) {
                if (plugin.getConfig().getString(p.getUniqueId() + ".Kolor") != null) {
                    e.setFormat(ChatColor.translateAlternateColorCodes('&', "&8[&7" + replaced + "&8] &8[&x&d&8&0&0&f&bS&x&d&f&1&3&f&bz&x&e&6&2&6&f&ca&x&e&c&3&9&f&cf&x&f&3&4&c&f&di&x&f&a&5&f&f&dr&8] " + plugin.getConfig().getString(p.getUniqueId() + ".Prefix") + " " + plugin.getConfig().getString(p.getUniqueId() + ".Kolor") + p.getDisplayName() + " &8» &7" + e.getMessage()).replaceAll("%", " "));

                }
            }
            if (p.hasPermission("gracz.media")) {
                if (plugin.getConfig().getString(p.getUniqueId() + ".Kolor") != null) {
                    e.setFormat(ChatColor.translateAlternateColorCodes('&', "&8[&7" + replaced + "&8] &8[&x&0&0&b&f&f&bM&x&2&b&c&c&f&ce&x&5&7&d&9&f&cd&x&8&2&e&6&f&di&x&a&d&f&3&f&da&8] " + plugin.getConfig().getString(p.getUniqueId() + ".Prefix") + " " + plugin.getConfig().getString(p.getUniqueId() + ".Kolor") + p.getDisplayName() + " &8» &7" + e.getMessage()).replaceAll("%", " "));

                }
            }
            if (p.hasPermission("gracz.helper")) {
                if (plugin.getConfig().getString(p.getUniqueId() + ".Kolor") != null) {
                    e.setFormat(ChatColor.translateAlternateColorCodes('&', "&8[&x&0&0&7&3&f&bP&x&0&8&7&9&f&bo&x&0&f&7&f&f&cm&x&1&7&8&5&f&co&x&1&f&8&c&f&cc&x&2&7&9&2&f&cn&x&2&e&9&8&f&di&x&3&6&9&e&f&dk&8] " + plugin.getConfig().getString(p.getUniqueId() + ".Prefix") + " " + plugin.getConfig().getString(p.getUniqueId() + ".Kolor") + p.getDisplayName() + " &8» &7" + e.getMessage()).replaceAll("%", " "));

                }
            }
            if (p.hasPermission("gracz.mod")) {
                if (plugin.getConfig().getString(p.getUniqueId() + ".Kolor") != null) {
                    e.setFormat(ChatColor.translateAlternateColorCodes('&', " &8[&x&0&8&f&b&0&4M&x&1&8&f&b&1&eo&x&2&7&f&c&3&8d&x&3&7&f&c&5&1e&x&4&7&f&c&6&br&x&5&6&f&c&8&5a&x&6&6&f&d&9&ft&x&7&5&f&d&b&8o&x&8&5&f&d&d&2r&8] " + plugin.getConfig().getString(p.getUniqueId() + ".Prefix") + " " + plugin.getConfig().getString(p.getUniqueId() + ".Kolor") + p.getDisplayName() + " &8» &7" + e.getMessage()).replaceAll("%", " "));

                }
            }
            if (p.hasPermission("gracz.admin")) {
                if (plugin.getConfig().getString(p.getUniqueId() + ".Kolor") != null) {
                    e.setFormat(ChatColor.translateAlternateColorCodes('&', "&8[&x&f&b&1&d&1&dA&x&f&b&2&3&2&3d&x&f&b&2&8&2&8m&x&f&c&2&e&2&ei&x&f&c&3&4&3&4n&x&f&c&3&9&3&9i&x&f&c&3&f&3&fs&x&f&c&4&5&4&5t&x&f&c&4&a&4&ar&x&f&d&5&0&5&0a&x&f&d&5&6&5&6t&x&f&d&5&b&5&bo&x&f&d&6&1&6&1r&8] " + plugin.getConfig().getString(p.getUniqueId() + ".Prefix") + " " + plugin.getConfig().getString(p.getUniqueId() + ".Kolor") + p.getDisplayName() + " &8» &7" + e.getMessage()).replaceAll("%", " "));

                }
            }
            if (p.hasPermission("gracz.wlasciciel")) {
                if (plugin.getConfig().getString(p.getUniqueId() + ".Kolor") != null) {
                    e.setFormat(ChatColor.translateAlternateColorCodes('&', "&8[&x&f&b&0&0&0&0W&x&f&b&0&b&0&bl&x&f&b&1&7&1&7a&x&f&c&2&2&2&2s&x&f&c&2&d&2&dc&x&f&c&3&9&3&9i&x&f&c&4&4&4&4c&x&f&d&4&f&4&fi&x&f&d&5&b&5&be&x&f&d&6&6&6&6l&8] " + plugin.getConfig().getString(p.getUniqueId() + ".Prefix") + " " + plugin.getConfig().getString(p.getUniqueId() + ".Kolor") + p.getDisplayName() + " &8» &7" + e.getMessage()).replaceAll("%", " "));

                }
            }
        } else {
            e.setCancelled(true);
            e.getPlayer().sendMessage("§7Wiadomosc nie moze zawierac (§c%§7)");
        }
    }

    public String translateHexColorCodes(String startTag, String endTag, String message)
    {
        final Pattern hexPattern = Pattern.compile(startTag + "([A-Fa-f0-9]{6})" + endTag);
        Matcher matcher = hexPattern.matcher(message);
        StringBuffer buffer = new StringBuffer(message.length() + 4 * 8);
        while (matcher.find())
        {
            String group = matcher.group(1);
            matcher.appendReplacement(buffer, COLOR_CHAR + "x"
                    + COLOR_CHAR + group.charAt(0) + COLOR_CHAR + group.charAt(1)
                    + COLOR_CHAR + group.charAt(2) + COLOR_CHAR + group.charAt(3)
                    + COLOR_CHAR + group.charAt(4) + COLOR_CHAR + group.charAt(5)
            );
        }
        return matcher.appendTail(buffer).toString();
    }

    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event) {
        // event.getRecipients().clear();

        if (event.getMessage().contains(event.getPlayer().getDisplayName())) {
            event.setCancelled(true);
            TextComponent msg = new TextComponent(event.getMessage());
            msg.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/w " + event.getPlayer().getName()));
            msg.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT,
                    new ComponentBuilder("Click to send a Message!").create()));

            event.setMessage(msg.getText());
        }

    }

}
