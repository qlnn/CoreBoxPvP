package me.hubikopter.shieldcoreboxpvp.runnables;

import me.hubikopter.shieldcoreboxpvp.ShieldCoreBoxPVP;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class SettingsRunnable implements Runnable{

    ShieldCoreBoxPVP plugin;

    public SettingsRunnable(ShieldCoreBoxPVP plugin) {
        this.plugin = plugin;
    }

    @Override
    public void run() {
        for (Player online : Bukkit.getOnlinePlayers()) {
                online.spigot().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent(ChatColor.translateAlternateColorCodes('&', "&fZamiana na bloki: " + ShieldCoreBoxPVP.wb.get(online.getDisplayName()) + " &8| &fWymiana na monety: " + ShieldCoreBoxPVP.wm.get(online.getDisplayName()) + " &8| &fSprzedaż monet: " + ShieldCoreBoxPVP.sm.get(online.getDisplayName()) + " &8(&9/ustawienia&8)").replaceAll("nie", "§c✘").replaceAll("tak", "§a✓")));
        }
    }
}
