package me.kevin.citybuild.manager;

import me.kevin.citybuild.citybuild.Citybuild;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class FirstJoinManager {
    public static void sendFirstJoinMessage(Player player) {
        player.sendMessage(Citybuild.getPrefix() + "Hallo §e§l" + player.getDisplayName() + "§r§7, willkommen auf unserem Citybuild Server!\n");
        player.sendMessage(Citybuild.getPrefix() + "Um dich ein bisschen besser zurecht zu finden, kannst du den Command §e§l/tutorial §r§7ausprobieren. Dort wird dir ein bisschen etwas erklärt");
        player.sendMessage(Citybuild.getPrefix() + "Wir wünschen dir viel Spaß!");
    }

    public static void setFirstJoinItems(Player player) {
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
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "vrplot item medium --natural 1 " + player.getDisplayName());
    }



}
