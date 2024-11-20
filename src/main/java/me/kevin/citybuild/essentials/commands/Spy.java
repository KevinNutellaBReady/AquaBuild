package me.kevin.citybuild.essentials.commands;

import me.kevin.citybuild.citybuild.Citybuild;
import me.kevin.citybuild.utils.Messages;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Spy implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equalsIgnoreCase("spy")) {
            Player player = (Player) sender;
            if(player.hasPermission("citybuild.spy")) {
                if(args.length == 1) {
                    String targetPlayer = args[0];
                    if(Bukkit.getServer().getPlayer(targetPlayer) != null) {
                        player.setGameMode(GameMode.SPECTATOR);
                        player.teleport(Bukkit.getPlayer(targetPlayer).getLocation());
                        player.sendMessage(Citybuild.getPrefix() + "Du spionierst nun den Spieler: §e§l" + targetPlayer);
                    } else {
                        player.sendMessage(Messages.enderchestPlayerNotFound);
                    }
                } else {
                    player.sendMessage(Messages.spyCommandSyntaxError);
                }

            } else {
                player.sendMessage(Messages.NoPermission);
            }

        }


        return false;
    }
}
