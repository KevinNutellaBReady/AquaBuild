package me.kevin.citybuild.essentials.commands;

import me.kevin.citybuild.utils.Messages;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Enderchest implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equalsIgnoreCase("enderchest")) {
            Player player = (Player)sender;
            if(args.length == 0) {
                player.openInventory(player.getEnderChest());
            } else if(args.length == 1){
                if(player.hasPermission("citybuild.enderchest.other")) {
                    String targetPlayer = args[0];
                    if(Bukkit.getServer().getPlayer(targetPlayer) != null) {
                        player.openInventory(Bukkit.getServer().getPlayer(targetPlayer).getEnderChest());
                    } else {
                        player.sendMessage(Messages.enderchestPlayerNotFound);
                    }
                } else {
                    player.sendMessage(Messages.NoPermission);
                }
            }
        }

        return false;
    }
}
