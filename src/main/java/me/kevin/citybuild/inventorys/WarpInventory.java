package me.kevin.citybuild.inventorys;

import me.kevin.citybuild.manager.ItemManager;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;

public class WarpInventory {

    public static Inventory getWarpInventory(Player player) {
        Inventory inventory = player.getServer().createInventory(null, 45, "§3§lWarps");

        inventory.setItem(22, new ItemManager("§8§l» §a§lSpawn", Material.SLIME_BALL, (byte) 0, 1, "").build());
        inventory.setItem(20, new ItemManager("§8§l» §a§lShops", Material.MINECART, (byte) 0, 1, "").build());
        inventory.setItem(24, new ItemManager("§8§l» §a§lQuests", Material.WRITTEN_BOOK, (byte) 0, 1, "").build());
        inventory.setItem(4, new ItemManager("§8§l» §a§lPlotwelt", Material.GRASS_BLOCK, (byte) 0, 1, "").build());
        inventory.setItem(40, new ItemManager("§8§l» §a§lAdminshop", Material.BUNDLE, (byte) 0, 1, "").build());

        return inventory;
    }


}
