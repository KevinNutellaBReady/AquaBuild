package me.kevin.citybuild.essentials.commands;

import me.kevin.citybuild.manager.WarpManager;
import me.kevin.citybuild.utils.Messages;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class Warp implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        Player player = (Player)commandSender;

        if(command.getName().equalsIgnoreCase("warp")) {
            if(args.length != 1) {
                player.sendMessage(Messages.warpDoesNotExist);
            }

            String teleportToWarp = Messages.teleportToWarp;
            String warpName = args[0];
            Location warpLocation = WarpManager.getWarpLocation(warpName);
            if (warpLocation != null) {
                // Bypass anti-cheat checks by using teleport() directly
                player.teleport(warpLocation);
                player.sendMessage(teleportToWarp.replace("%", warpName));
            } else {
                player.sendMessage(Messages.warpDoesNotExist);
            }

        }


        return true;
    }
}
