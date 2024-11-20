package me.kevin.citybuild.perks.commands;

import me.kevin.citybuild.inventorys.PerkInventory;
import me.kevin.citybuild.utils.Messages;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Perks implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player)sender;

        if(command.getName().equalsIgnoreCase("perks")) {
            if(player.hasPermission("citybuild.perks")) {
                player.openInventory(PerkInventory.getPerkInventory(player));
            } else {
                player.sendMessage(Messages.NoPermission);
            }
        }

        return false;
    }
}
