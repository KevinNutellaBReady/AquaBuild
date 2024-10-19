package me.kevin.citybuild.essentials.commands;

import me.kevin.citybuild.inventorys.WarpInventory;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Warps implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        Player player = (Player) commandSender;
        if(command.getName().equalsIgnoreCase("warps")) {
            player.openInventory(WarpInventory.getWarpInventory(player));
        }


        return false;
    }
}
