package me.kevin.citybuild.essentials.commands;

import me.kevin.citybuild.inventorys.AdminshopInventory;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Adminshop implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equalsIgnoreCase("adminshop")) {
            Player player = (Player) sender;

            player.openInventory(AdminshopInventory.getAdminshopInventory(player));
        }

        return false;
    }
}
