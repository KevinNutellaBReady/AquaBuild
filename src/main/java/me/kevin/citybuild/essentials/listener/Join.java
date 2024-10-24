package me.kevin.citybuild.essentials.listener;

import me.kevin.citybuild.citybuild.Citybuild;
import me.kevin.citybuild.manager.FirstJoinManager;
import me.kevin.citybuild.manager.PerksDatabaseManager;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Join implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        event.setJoinMessage(null);
        player.sendMessage(Citybuild.getPrefix() + "Willkommen zurück §c§l" + player.getDisplayName());

        /* Perks Database */
        if(!PerksDatabaseManager.isRegistered(player)) {
            PerksDatabaseManager.register(player);
            FirstJoinManager.sendFirstJoinMessage(player);
            FirstJoinManager.setFirstJoinItems(player);
            Bukkit.dispatchCommand(player, "warp spawn");
        }
    }
}
