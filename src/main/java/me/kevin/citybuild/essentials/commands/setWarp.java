package me.kevin.citybuild.essentials.commands;

import me.kevin.citybuild.manager.WarpManager;
import me.kevin.citybuild.utils.Messages;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class setWarp implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        Player player = (Player)commandSender;
        if(command.getName().equalsIgnoreCase("setwarp")) {
            if(player.hasPermission("citybuild.setwarp")) {
                if (args.length != 1) {
                    player.sendMessage(Messages.setWarpSyntaxError);
                    return true;
                }
                String warpName = args[0];
                Location warpLocation = player.getLocation();
                String setWarpMSG = Messages.setWarpSuccessfully;
                WarpManager.saveWarpLocation(warpName, warpLocation);
                player.sendMessage(setWarpMSG.replace("$", warpName));


            } else {
                player.sendMessage(Messages.NoPermission);
            }
        }

        return false;
    }
}
