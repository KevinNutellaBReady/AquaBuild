package me.kevin.citybuild.essentials.commands;

import me.kevin.citybuild.utils.Messages;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Admin implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        if(command.getName().equalsIgnoreCase("admin")) {
            Player player = (Player) commandSender;
            if(player.hasPermission("citybuild.admin")) {
                 player.sendMessage("Player Admin Control Panel opened");

            } else {
                player.sendMessage(Messages.NoPermission);
            }
        }



        return false;
    }
}
