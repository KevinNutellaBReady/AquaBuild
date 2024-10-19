package me.kevin.citybuild.customitems.listener;

import org.bukkit.*;
import org.bukkit.entity.Fish;
import org.bukkit.entity.FishHook;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.util.Vector;

public class Enterhaken implements Listener {

    @EventHandler
    public void onPlayerFish(PlayerFishEvent e)
    {
        Player player = e.getPlayer();
        FishHook h = e.getHook();

        if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals("§5§lEnterhaken")) {
            if (((e.getState().equals(PlayerFishEvent.State.IN_GROUND)) || (e.getState().equals(PlayerFishEvent.State.CAUGHT_ENTITY)) || (e.getState().equals(PlayerFishEvent.State.FAILED_ATTEMPT))) && (Bukkit.getWorld(e.getPlayer().getWorld().getName()).getBlockAt(h.getLocation().getBlockX(), h.getLocation().getBlockY() - 1, h.getLocation().getBlockZ()).getType() != Material.AIR) && (Bukkit.getWorld(e.getPlayer().getWorld().getName()).getBlockAt(h.getLocation().getBlockX(), h.getLocation().getBlockY() - 1, h.getLocation().getBlockZ()).getType() != Material.LEGACY_STATIONARY_WATER)){

                Vector v = player.getLocation().getDirection().multiply(3D).setY(1);
                player.setVelocity(v);

                player.playEffect(player.getLocation(), Effect.BLAZE_SHOOT, 1);
                player.playSound(player.getLocation(), Sound.ENTITY_BLAZE_HURT, 1.0F, 1.0F);
            }
        }
    }
}
