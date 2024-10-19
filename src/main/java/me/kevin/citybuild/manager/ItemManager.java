package me.kevin.citybuild.manager;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;


public class ItemManager {
    org.bukkit.inventory.ItemStack itemstack;
    ItemMeta itemmeta;
    SkullMeta skullmeta;

    public ItemManager(String displayname, Material material, byte subid, int amount, String Lore) {
        itemstack = new org.bukkit.inventory.ItemStack(material, amount, subid);
        itemmeta = itemstack.getItemMeta();
        itemmeta.setDisplayName(displayname);
    }

    public ItemManager(String displayname, Material material, byte subid, int amount, org.bukkit.enchantments.Enchantment entchantment) {
        itemstack = new ItemStack(material, amount, subid);
        itemmeta = itemstack.getItemMeta();
        itemmeta.setDisplayName(displayname);
        itemmeta.addEnchant(entchantment, 10, true);
    }


    public ItemStack build() {
        itemstack.setItemMeta(itemmeta);

        return itemstack;
    }
    public ItemStack buildSkull() {
        itemstack.setItemMeta(skullmeta);

        return itemstack;
    }
}