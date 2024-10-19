package me.kevin.citybuild.essentials.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Spawn implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        if(command.getName().equalsIgnoreCase("spawn")) {
            Player player = (Player)commandSender;

            Bukkit.dispatchCommand(player, "warp Spawn");

        }

        return false;
    }
}
