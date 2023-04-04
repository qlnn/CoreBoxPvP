package me.hubikopter.shieldcoreboxpvp.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.inventory.InventoryType;

public class InventoryOpenHandler implements Listener {

        @EventHandler
        public void onOpenEnchant(InventoryOpenEvent event) {
            Player player = (Player)event.getPlayer();
            if (event.getInventory().getType() == InventoryType.ANVIL) {
                event.setCancelled(true);
                player.closeInventory();
            }
        }
}
