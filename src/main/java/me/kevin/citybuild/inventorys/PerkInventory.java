package me.kevin.citybuild.inventorys;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class PerkInventory {

    public static Inventory getPerkInventory(Player player) {
        Inventory inventory = player.getServer().createInventory(null, 45, "§a§lPerks");


        return inventory;
    }
}
