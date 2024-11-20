package me.kevin.citybuild.manager;

import me.kevin.citybuild.utils.Messages;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class KitManager {

    public static void handleKit(Player player, String kit) {
        if(kit.equalsIgnoreCase("Player")) {
            player.getInventory().addItem(new ItemStack(Material.STONE_AXE, 1));
            player.getInventory().addItem(new ItemStack(Material.STONE_PICKAXE, 1));
            player.getInventory().addItem(new ItemStack(Material.STONE_SHOVEL, 1));
            player.getInventory().addItem(new ItemStack(Material.STONE_AXE, 1));
            player.getInventory().addItem(new ItemStack(Material.STONE_SWORD, 1));
            player.getInventory().addItem(new ItemStack(Material.CHAINMAIL_BOOTS));
            player.getInventory().addItem(new ItemStack(Material.CHAINMAIL_HELMET));
            player.getInventory().addItem(new ItemStack(Material.CHAINMAIL_LEGGINGS));
            player.getInventory().addItem(new ItemStack(Material.IRON_CHESTPLATE));
            player.getInventory().addItem(new ItemStack(Material.BREAD, 32));
            player.getInventory().addItem(new ItemStack(Material.FISHING_ROD));
            player.getInventory().addItem(new ItemStack(Material.TORCH, 6));
            player.sendMessage(Messages.kitPlayer);
        } else if(kit.equalsIgnoreCase("Iron")) {
            player.getInventory().addItem(new ItemStack(Material.STONE_AXE, 1));
            player.getInventory().addItem(new ItemStack(Material.STONE_PICKAXE, 1));
            player.getInventory().addItem(new ItemStack(Material.STONE_SHOVEL, 1));
            player.getInventory().addItem(new ItemStack(Material.STONE_AXE, 1));
            player.getInventory().addItem(new ItemStack(Material.STONE_SWORD, 1));
            player.getInventory().addItem(new ItemStack(Material.CHAINMAIL_BOOTS));
            player.getInventory().addItem(new ItemStack(Material.CHAINMAIL_HELMET));
            player.getInventory().addItem(new ItemStack(Material.CHAINMAIL_LEGGINGS));
            player.getInventory().addItem(new ItemStack(Material.IRON_CHESTPLATE));
            player.getInventory().addItem(new ItemStack(Material.BREAD, 32));
            player.getInventory().addItem(new ItemStack(Material.FISHING_ROD));
            player.getInventory().addItem(new ItemStack(Material.TORCH, 6));
            player.sendMessage(Messages.kitPlayer);

        }
    }

}
