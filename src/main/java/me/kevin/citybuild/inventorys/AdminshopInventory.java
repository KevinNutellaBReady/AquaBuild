package me.kevin.citybuild.inventorys;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class AdminshopInventory {
    public static Inventory getAdminshopInventory(Player player) {
        Inventory inventory = player.getServer().createInventory(null, 45, "§c§lAdminshop");



        return inventory;
    }

}
