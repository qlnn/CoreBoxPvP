package me.hubikopter.shieldcoreboxpvp;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class Papi extends PlaceholderExpansion {

    ShieldCoreBoxPVP plugin;

    public Papi(ShieldCoreBoxPVP plugin) {
        this.plugin = plugin;
    }

    @Override
    public @NotNull String getIdentifier() {
        return "shieldmc";
    }

    @Override
    public @NotNull String getAuthor() {
        return "kopt3r";
    }

    @Override
    public @NotNull String getVersion() {
        return "1.0";
    }

    @Override
    public @NotNull String onPlaceholderRequest(Player p, String params) {
        if (p == null) {
            return "";
        }
        if (params.equals("monety")) {
            return String.valueOf(plugin.getConfig().getInt(p.getUniqueId() + ".Monety"));
        } else if (params.equals("prefix")) {
            return String.valueOf(plugin.getConfig().getString(p.getUniqueId() + ".Prefix"));
        } else if (params.equals("kolor")) {
            return String.valueOf(plugin.getConfig().getString(p.getUniqueId() + ".Kolor"));
        } else if (params.equals("minuty")) {
            return String.valueOf(plugin.getConfig().getInt(p.getUniqueId() + ".Minuty") / 60);

        }
        return null;
    }
}
