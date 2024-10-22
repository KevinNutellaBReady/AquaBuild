package me.kevin.citybuild.customitems.listener;

import me.kevin.citybuild.citybuild.Citybuild;
import me.kevin.citybuild.customitems.Customitems;
import me.kevin.citybuild.manager.ItemManager;
import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.util.Vector;

public class Booster implements Listener {

    @EventHandler
    public void onInteract(PlayerInteractEvent event) {
        Player player = (Player) event.getPlayer();

        if(event.getAction() == Action.RIGHT_CLICK_AIR | event.getAction() == Action.RIGHT_CLICK_BLOCK){
            if(event.getMaterial().equals(Material.BLAZE_ROD) && event.getItem().getItemMeta().getDisplayName().equals("§e§lBooster")) {
                Vector v = player.getLocation().getDirection().multiply(3D).setY(1);
                player.setVelocity(v);

                player.playEffect(player.getLocation(), Effect.BLAZE_SHOOT, 1);
                player.playSound(player.getLocation(), Sound.ENTITY_BLAZE_HURT, 1.0F, 1.0F);

                player.getInventory().setItemInMainHand(new ItemManager("§8§lBitte warten...", Material.BARRIER, (byte) 0, 1, "").build());

                Bukkit.getScheduler().runTaskLater(Citybuild.getInstance(), new Runnable() {

                    @Override
                    public void run() {

                        player.getInventory().removeItem(new ItemManager("§8§lBitte warten...", Material.BARRIER, (byte) 0, 1, "").build());

                        player.getInventory().addItem(Customitems.getBoosterItem());
                        player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1, 1);
                    }
                }, 100);
            }
        }
    }
}
