package me.hubikopter.shieldcoreboxpvp.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PomocCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8-----&8 [ &9&LPOMOC &8] &8----- \n &8» &x&0&e&6&9&d&5klan &8- &7Komendy klanow \n &8» &x&0&e&6&9&d&5top &8- &7Topowi gracze z danych kategorii \n &8» &x&0&e&6&9&d&5schowek &8- &7Otwiera serwerowy schowek \n &8» &x&0&e&6&9&d&5sellall &8- &7Sprzedaje wszystkie przedmioty w EQ po takiej cenie jak w /sklep \n &8» &x&0&e&6&9&d&5kowadlo &8- &7Naprawia przedmiot w ręce \n &8» &x&0&e&6&9&d&5kosz &8- &7Otwiera przenośny kosz \n &8» &x&0&e&6&9&d&5list &8- &7Lista graczy \n &8» &x&0&e&6&9&d&5rtp &8- &7Tepa cie w losowa lokalizacje \n &8» &x&0&e&6&9&d&5sklep &8- &7Serwerowy sklep \n &8» &x&0&e&6&9&d&5rynek &8- &7Przedmioty od innych graczy \n &8◆ &6&lRANGI&8: \n &8» &6/vip &8- &7Informacje o randze &8[&6VIP&8] \n &8» &x&0&e&6&9&d&5svip &8- &7Informacje o randze &8[&x&0&e&6&9&d&5aSVIP&8] \n &8» &x&0&e&6&9&d&5sponsor &8- &7Informacje o randze &8[&9Sponsor&8] \n &8» &x&0&e&6&9&d&5shield &8- &7Informacje o randze &8[&9SHIELD&8] \n  \n &8» &7Strona www: &fwww.Shieldmc.pl \n &8»&7Discord: &fdiscord.gg/shieldmc \n &8» &7Facebook: &ffb.com/shieldmc \n &8-----&8 [ &9&LPOMOC &8] &8-----"));
        }
        return true;
    }
}

