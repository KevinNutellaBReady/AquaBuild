package me.kevin.citybuild.essentials.commands;

import me.kevin.citybuild.utils.Messages;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class Fly implements CommandExecutor {

    private static ArrayList<Player> flyList = new ArrayList<>();

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        Player player = (Player) commandSender;
        if(command.getName().equalsIgnoreCase("fly")) {
            if(player.hasPermission("citybuild.fly")) {
                    if(!flyList.contains(player)) {
                        flyList.add(player);
                        player.setAllowFlight(true);
                        player.sendMessage(Messages.setFlyModeOn);
                    } else {
                        flyList.remove(player);
                        player.setAllowFlight(false);
                        player.sendMessage(Messages.setFlyModeOff);
                    }

            }
        }

        return false;
    }
}
