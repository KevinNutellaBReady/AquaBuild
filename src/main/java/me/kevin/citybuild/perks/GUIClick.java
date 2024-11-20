package me.kevin.citybuild.perks;

import me.kevin.citybuild.manager.ItemManager;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import java.util.ArrayList;

public class GUIClick implements Listener {

    public static ArrayList<Player> hastePerkList = new ArrayList<>();
    public static ArrayList<Player> DoubleJumpPerkList = new ArrayList<>();
    public static ArrayList<Player> StrenghtPerkList = new ArrayList<>();

    @EventHandler
    public void onClick(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        if(event.getView().getTitle().equals("§a§lPerks")) {
            event.setCancelled(true);
            /* SpeedPerk */
            if(event.getRawSlot() == 28) {
                if(event.getCurrentItem().getType() == Material.RED_DYE) {
                    if(!SpeedPerk.checkSpeedPerk(player)) {
                        SpeedPerk.activateSpeedPerk(player);
                    }

                    event.getInventory().setItem(28, new ItemManager("§a§lAktiv", Material.GREEN_DYE, (byte) 0, 1, "").build());

                } else if(event.getCurrentItem().getType() == Material.BARRIER) {
                    player.sendMessage("Ned verfügbar");

                } else if(event.getCurrentItem().getType() == Material.GREEN_DYE) {
                    event.getInventory().setItem(28, new ItemManager("§c§lDeaktiviert", Material.RED_DYE, (byte) 0, 1, "").build());
                    if(SpeedPerk.checkSpeedPerk(player)) {
                        SpeedPerk.deactiveSpeedPerk(player);
                    }


                }
                /* HastePerk   */
            } else  if(event.getRawSlot() == 30) {
                if(event.getCurrentItem().getType() == Material.RED_DYE) {
                    if(!HastePerk.checkHastePerk(player)) {
                        HastePerk.activateHastePerk(player);
                    }

                    event.getInventory().setItem(30, new ItemManager("§a§lAktiv", Material.GREEN_DYE, (byte) 0, 1, "").build());

                } else if(event.getCurrentItem().getType() == Material.BARRIER) {
                    player.sendMessage("Ned verfügbar");

                } else if(event.getCurrentItem().getType() == Material.GREEN_DYE) {
                    event.getInventory().setItem(30, new ItemManager("§c§lDeaktiviert", Material.RED_DYE, (byte) 0, 1, "").build());
                    if(HastePerk.checkHastePerk(player)) {
                        HastePerk.deactiveHastePerk(player);
                    }


                }
                /* StrengthPerk */
            } else  if(event.getRawSlot() == 34) {
                if(event.getCurrentItem().getType() == Material.RED_DYE) {
                    if(!StrengthPerk.checkStrengthPerk(player)) {
                        StrengthPerk.activateStrengthPerk(player);
                    }

                    event.getInventory().setItem(34, new ItemManager("§a§lAktiv", Material.GREEN_DYE, (byte) 0, 1, "").build());

                } else if(event.getCurrentItem().getType() == Material.BARRIER) {
                    player.sendMessage("Ned verfügbar");

                } else if(event.getCurrentItem().getType() == Material.GREEN_DYE) {
                    event.getInventory().setItem(34, new ItemManager("§c§lDeaktiviert", Material.RED_DYE, (byte) 0, 1, "").build());
                    if(StrengthPerk.checkStrengthPerk(player)) {
                        StrengthPerk.deactiveStrengthPerk(player);
                    }


                }
            }
        }
    }


}
