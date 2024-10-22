package me.kevin.citybuild.essentials.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Tutorial implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equalsIgnoreCase("tutorial")) {
            Player player = (Player)sender;
            player.sendMessage("Tutorial");
        }

        return false;
    }
}
