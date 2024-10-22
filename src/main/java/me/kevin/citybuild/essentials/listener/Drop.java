package me.kevin.citybuild.essentials.listener;

import me.kevin.citybuild.customitems.Customitems;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

public class Drop implements Listener {

    @EventHandler
    public void onDrop(PlayerDropItemEvent event) {
        Player player = event.getPlayer();

        if(event.getItemDrop().getItemStack().equals(Customitems.getCooldownItem())) {
            event.setCancelled(false);
        }

    }
}
