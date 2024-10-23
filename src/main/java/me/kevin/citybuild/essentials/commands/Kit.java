package me.kevin.citybuild.essentials.commands;

import me.kevin.citybuild.utils.Messages;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Kit implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equalsIgnoreCase("kit")) {
            Player player = (Player)sender;
            if(player.hasPermission("citybuild.kit")) {
                if(args.length == 1) {
                    String choosenKit = args[0];
                    if(choosenKit.equalsIgnoreCase("Spieler")) {
                        player.sendMessage("Spieler kit");
                    } else if(choosenKit.equalsIgnoreCase("Iron")) {
                        player.sendMessage("Iron kit");
                    } else if(choosenKit.equalsIgnoreCase("Diamond")) {
                        player.sendMessage("Diamond Kit");
                    } else if(choosenKit.equalsIgnoreCase("Supreme")) {
                        player.sendMessage("Supreme kit");

                    }

                } else {

                }

            } else {
                player.sendMessage(Messages.NoPermission);
            }

        }

        return false;
    }
}
