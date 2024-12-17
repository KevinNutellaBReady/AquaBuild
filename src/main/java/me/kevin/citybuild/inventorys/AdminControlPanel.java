package me.kevin.citybuild.inventorys;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class AdminControlPanel {

    public static Inventory getAdminControlPanelInventory(Player player) {
        Inventory inventory = player.getServer().createInventory(null, 45, "§4§lAdmin Control-Panel");

        


        return inventory;
    }

}
