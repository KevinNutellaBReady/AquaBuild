package me.kevin.citybuild.inventorys.listener;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

public class WarpInventoryClicklistener implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        if(event.getView().getTitle().equals("§3§lWarps")) {
            if(event.getCurrentItem().getType() == Material.SLIME_BALL) {
                Bukkit.dispatchCommand(player, "warp Spawn");
                player.closeInventory();
            } else if(event.getCurrentItem().getType() == Material.MINECART) {
                Bukkit.dispatchCommand(player, "warp Shops");
                player.closeInventory();
            } else if(event.getCurrentItem().getType() == Material.GRASS_BLOCK) {
                Bukkit.dispatchCommand(player, "warp Plotwelt");
                player.closeInventory();
            } else if(event.getCurrentItem().getType() == Material.WRITTEN_BOOK) {
                Bukkit.dispatchCommand(player, "warp Quests");
                player.closeInventory();
            } else if(event.getCurrentItem().getType() == Material.BUNDLE) {
                Bukkit.dispatchCommand(player, "warp Adminshop");
                player.closeInventory();
            }

        }
     }


}
