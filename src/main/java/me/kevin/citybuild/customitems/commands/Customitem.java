package me.kevin.citybuild.customitems.commands;

import me.kevin.citybuild.manager.ItemManager;
import me.kevin.citybuild.utils.Messages;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Customitem implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        if(command.getName().equalsIgnoreCase("customitem")) {
            Player player = (Player)commandSender;

            if(player.hasPermission("citybuild.customitem")) {
                if(args.length == 2) {
                    if(args[0].equalsIgnoreCase("give")) {
                        if(args[1].equalsIgnoreCase("enterhaken")) {
                            player.sendMessage(Messages.customItemGiveEnterhaken);
                            player.getInventory().addItem(new ItemManager("§5§lEnterhaken", Material.FISHING_ROD, (byte) 0, 1, "").build());
                        } else if(args[1].equalsIgnoreCase("booster")) {
                            player.sendMessage(Messages.customItemGiveEnterhaken);
                            player.getInventory().addItem(new ItemManager("§e§lBooster", Material.BLAZE_ROD, (byte) 0, 1, "").build());
                        }
                    } else {
                        player.sendMessage(Messages.customItemSyntaxError);
                    }
                } else {
                    player.sendMessage(Messages.customItemSyntaxError);
                }
            } else {
                player.sendMessage(Messages.NoPermission);
            }
        }



        return false;
    }
}
