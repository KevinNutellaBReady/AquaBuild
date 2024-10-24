package me.kevin.citybuild.essentials.commands;

import me.kevin.citybuild.utils.Messages;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Vanish implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equalsIgnoreCase("vanish")) {
            Player player = (Player) sender;
            if(player.hasPermission("citybuild.vanish")) {
                if(player.isInvisible()) {
                    player.setInvisible(false);
                    player.sendMessage(Messages.vanishDisabled);
                } else {
                    player.setInvisible(true);
                    player.sendMessage(Messages.vanishEnabled);
                }
            }
        }

        return false;
    }
}
