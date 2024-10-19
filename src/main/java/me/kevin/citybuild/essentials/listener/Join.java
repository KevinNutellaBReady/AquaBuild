package me.kevin.citybuild.essentials.listener;

import me.kevin.citybuild.citybuild.Citybuild;
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

    }
}
