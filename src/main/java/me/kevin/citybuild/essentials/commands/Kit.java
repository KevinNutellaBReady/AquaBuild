package me.kevin.citybuild.essentials.commands;

import me.kevin.citybuild.manager.KitManager;
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
                        if(player.hasPermission("citybuild.kit.player")) {
                            KitManager.handleKit(player, "Player");
                        } else {
                            player.sendMessage(Messages.NoPermission);
                        }
                    } else if(choosenKit.equalsIgnoreCase("Iron")) {
                        if(player.hasPermission("citybuild.kit.iron")) {

                        } else {
                            player.sendMessage(Messages.NoPermission);
                        }
                    } else if(choosenKit.equalsIgnoreCase("Diamond")) {
                        if(player.hasPermission("citybuild.kit.diamond")) {

                        } else {
                            player.sendMessage(Messages.NoPermission);
                        }
                    } else if(choosenKit.equalsIgnoreCase("Supreme")) {
                        if(player.hasPermission("citybuild.kit.diamond")) {

                        } else {
                            player.sendMessage(Messages.NoPermission);
                        }

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
