package me.kevin.citybuild.essentials.commands;

import me.kevin.citybuild.manager.WarpManager;
import me.kevin.citybuild.utils.Messages;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class deleteWarp implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        Player player = (Player)commandSender;
        if(command.getName().equalsIgnoreCase("delwarp")) {
                if (args.length != 1) {
                    player.sendMessage(Messages.delWarpSyntaxError);
                    return true;
                }
                if (player.hasPermission("citybuild.delwarp")) {
                    String warpName = args[0];
                    if (WarpManager.deleteWarpLocation(warpName)) {
                        player.sendMessage(Messages.delWarpSuccessfully + warpName);
                    } else {
                        player.sendMessage(Messages.warpDoesNotExist);
                    }
                } else {
                    player.sendMessage(Messages.NoPermission);
                    return true;
                }
        }


        return false;
    }
}
