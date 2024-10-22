package me.kevin.citybuild.inventorys;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class PerkInventory {

    public static Inventory getPerkInventory(Player player) {
        Inventory inventory = player.getServer().createInventory(null, 45, "§a§lPerks");

        inventory.addItem(new ItemStack(Material.BAKED_POTATO, 1));

        return inventory;
    }
}
