package me.kevin.citybuild.essentials.commands;

import me.kevin.citybuild.utils.Messages;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Gamemode implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String string, String[] args) {
        Player player = (Player)commandSender;

        if(command.getName().equalsIgnoreCase("gamemode")) {
            if(player.hasPermission("citybuild.gamemode")) {
                if(args.length == 1) {

                    if(args[0].equalsIgnoreCase("1")) {
                        player.setGameMode(GameMode.CREATIVE);
                        player.sendMessage(Messages.setGamemodeCreative);

                    } else if(args[0].equalsIgnoreCase("2")) {
                        player.setGameMode(GameMode.ADVENTURE);

                        player.sendMessage(Messages.setGamemodeAdventure);
                    } else if(args[0].equalsIgnoreCase("3")) {
                        player.setGameMode(GameMode.SPECTATOR);

                        player.sendMessage(Messages.setGamemodeSpectator);
                    } else if(args[0].equalsIgnoreCase("0")) {
                        player.setGameMode(GameMode.SURVIVAL);
                        player.sendMessage(Messages.setGamemodeSurvival);
                    }

                } else {
                    player.sendMessage(Messages.setGamemodeSyntaxError);
                }

            } else {
                player.sendMessage(Messages.NoPermission);
            }
        }



        return false;
    }
}
