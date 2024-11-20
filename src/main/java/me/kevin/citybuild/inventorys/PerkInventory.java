package me.kevin.citybuild.inventorys;

import me.kevin.citybuild.manager.ItemManager;
import me.kevin.citybuild.manager.PerksDatabaseManager;
import me.kevin.citybuild.perks.GUIClick;
import me.kevin.citybuild.perks.SpeedPerk;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class PerkInventory {

    public static Inventory getPerkInventory(Player player) {
        Inventory inventory = player.getServer().createInventory(null, 45, "§a§lPerks");

        /* Perk-Items */
        inventory.setItem(19, new ItemManager("§b§lSpeed§r§7§l-§r§b§lPerk", Material.DIAMOND_BOOTS, (byte) 0, 1, "").build());
        inventory.setItem(21, new ItemManager("§e§lHaste§r§7§l-§r§e§lPerk", Material.GOLDEN_PICKAXE, (byte) 0, 1, "").build());
        inventory.setItem(23, new ItemManager("§b§lDoublejump§r§7§l-§r§b§lPerk", Material.DIAMOND_BOOTS, (byte) 0, 1, "").build());
        inventory.setItem(25, new ItemManager("§c§lStrength§r§7§l-§r§b§lPerk", Material.IRON_SWORD, (byte) 0, 1, "").build());

        inventory.setItem(44, new ItemManager("§a§lNächste Seite", Material.GREEN_DYE, (byte) 0, 1, "").build());

        /* Activate / Buy Item in GUI */
        if(PerksDatabaseManager.ownSpeedPerk(player)) {
            if(SpeedPerk.checkSpeedPerk(player)) {
                inventory.setItem(28, new ItemManager("§a§lAktiv", Material.GREEN_DYE, (byte) 0, 1, "").build());
            } else {
                inventory.setItem(28, new ItemManager("§c§lDeaktiviert", Material.RED_DYE, (byte) 0, 1, "").build());
            }
        } else {
            inventory.setItem(28, new ItemManager("§4§lNicht gekauft!", Material.BARRIER, (byte) 0, 1, "").build());
        }

        if(PerksDatabaseManager.ownHastePerk(player)) {
            if(GUIClick.hastePerkList.contains(player)) {
                inventory.setItem(30, new ItemManager("§a§lAktiv", Material.GREEN_DYE, (byte) 0, 1, "").build());
            } else {
                inventory.setItem(30, new ItemManager("§c§lDeaktiviert", Material.RED_DYE, (byte) 0, 1, "").build());
            }
        } else {
            inventory.setItem(30, new ItemManager("§4§lNicht gekauft!", Material.BARRIER, (byte) 0, 1, "").build());
        }

        if(PerksDatabaseManager.ownDoubleJumpPerk(player)) {
            if(GUIClick.DoubleJumpPerkList.contains(player)) {
                inventory.setItem(32, new ItemManager("§a§lAktiv", Material.GREEN_DYE, (byte) 0, 1, "").build());
            } else {
                inventory.setItem(32, new ItemManager("§c§lDeaktiviert", Material.RED_DYE, (byte) 0, 1, "").build());
            }
        } else {
            inventory.setItem(32, new ItemManager("§4§lNicht gekauft!", Material.BARRIER, (byte) 0, 1, "").build());
        }

        if(PerksDatabaseManager.ownStrength(player)) {
            if(GUIClick.StrenghtPerkList.contains(player)) {
                inventory.setItem(34, new ItemManager("§a§lAktiv", Material.GREEN_DYE, (byte) 0, 1, "").build());
            } else {
                inventory.setItem(34, new ItemManager("§c§lDeaktiviert", Material.RED_DYE, (byte) 0, 1, "").build());
            }
        } else {
            inventory.setItem(34, new ItemManager("§4§lNicht gekauft!", Material.BARRIER, (byte) 0, 1, "").build());
        }



        return inventory;
    }
}
