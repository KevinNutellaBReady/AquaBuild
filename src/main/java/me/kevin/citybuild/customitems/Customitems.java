package me.kevin.citybuild.customitems;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Customitems {

    public static ItemStack getBoosterItem() {
        ItemStack itemStack = new ItemStack(Material.BLAZE_ROD);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName("§e§lBooster");
        itemStack.setItemMeta(itemMeta);

        return itemStack;

    }

    public static ItemStack getEnterhakenItem() {
        ItemStack itemStack = new ItemStack(Material.FISHING_ROD);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName("§5§lEnterhaken");

        return itemStack;

    }

    public static ItemStack getCooldownItem() {
        ItemStack itemStack = new ItemStack(Material.BARRIER);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName("§8§lBitte warten...");

        return itemStack;
    }

}
