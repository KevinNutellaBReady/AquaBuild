package me.kevin.citybuild.inventorys;

import me.kevin.citybuild.manager.ItemManager;
import me.kevin.citybuild.manager.PerksDatabaseManager;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class PerkInventory {

    public static Inventory getPerkInventory(Player player) {
        Inventory inventory = player.getServer().createInventory(null, 45, "§a§lPerks");

        /* Perk-Items */
        inventory.setItem(18, new ItemManager("§b§lSpeed§r§7§l-§r§b§lPerk", Material.DIAMOND_BOOTS, (byte) 0, 1, "").build());
        inventory.setItem(20, new ItemManager("§e§lHaste§r§7§l-§r§e§lPerk", Material.GOLDEN_PICKAXE, (byte) 0, 1, "").build());
        inventory.setItem(22, new ItemManager("§b§lDoublejump§r§7§l-§r§b§lPerk", Material.DIAMOND_BOOTS, (byte) 0, 1, "").build());
        inventory.setItem(24, new ItemManager("§c§lStrength§r§7§l-§r§b§lPerk", Material.IRON_SWORD, (byte) 0, 1, "").build());

        inventory.setItem(44, new ItemManager("§a§lNächste Seite", Material.IRON_SWORD, (byte) 0, 1, "").build());

        /* Activate / Buy Item in GUI */

        if(PerksDatabaseManager.ownSpeedPerk(player)) {
            inventory.setItem(26, new ItemManager("§c§lDeaktiviert", Material.RED_DYE, (byte) 0, 1, "").build());

        } else {
            inventory.setItem(26, new ItemManager("§4§lNicht gekauft!", Material.BARRIER, (byte) 0, 1, "").build());
        }

        if(PerksDatabaseManager.ownHastePerk(player)) {
            inventory.setItem(28, new ItemManager("§c§lDeaktiviert", Material.RED_DYE, (byte) 0, 1, "").build());

        } else {
            inventory.setItem(28, new ItemManager("§4§lNicht gekauft!", Material.BARRIER, (byte) 0, 1, "").build());
        }

        if(PerksDatabaseManager.ownDoubleJumpPerk(player)) {
            inventory.setItem(28, new ItemManager("§c§lDeaktiviert", Material.RED_DYE, (byte) 0, 1, "").build());

        } else {
            inventory.setItem(28, new ItemManager("§4§lNicht gekauft!", Material.BARRIER, (byte) 0, 1, "").build());
        }

        if(PerksDatabaseManager.ownStrength(player)) {
            inventory.setItem(30, new ItemManager("§c§lDeaktiviert", Material.RED_DYE, (byte) 0, 1, "").build());

        } else {
            inventory.setItem(30, new ItemManager("§4§lNicht gekauft!", Material.BARRIER, (byte) 0, 1, "").build());
        }



        return inventory;
    }
}
