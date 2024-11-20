package me.kevin.citybuild.perks.commands;

import me.kevin.citybuild.manager.PerksDatabaseManager;
import me.kevin.citybuild.utils.Messages;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Perk implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        if(command.getName().equalsIgnoreCase("perk")) {
            Player player = (Player)commandSender;
            if(player.hasPermission("citybuild.perk")) {
                if(args.length == 3) {
                    String targetPlayer = args[0];
                    String targetPerk = args[1];
                    String option = args[2];

                    if(targetPerk.equalsIgnoreCase("speed")) {
                        if(option.equalsIgnoreCase("add")) {
                            player.sendMessage(Messages.addPerkCommand.replace("%s", targetPlayer));
                            PerksDatabaseManager.updateSpeedPerk(Bukkit.getPlayer(targetPlayer), true);
                        } else if(option.equalsIgnoreCase("remove")) {
                            player.sendMessage(Messages.removePerkCommand.replace("%s", targetPlayer));
                            PerksDatabaseManager.updateSpeedPerk(Bukkit.getPlayer(targetPlayer), false);
                        } else {
                            player.sendMessage(Messages.PerkCommandSyntaxError);
                        }

                    } else  if(targetPerk.equalsIgnoreCase("haste")) {
                        if(option.equalsIgnoreCase("add")) {
                            player.sendMessage(Messages.addPerkCommand.replace("%s", targetPlayer));
                            PerksDatabaseManager.updateHastePerk(Bukkit.getPlayer(targetPlayer), true);
                        } else if(option.equalsIgnoreCase("remove")) {
                            player.sendMessage(Messages.removePerkCommand.replace("%s", targetPlayer));
                            PerksDatabaseManager.updateHastePerk(Bukkit.getPlayer(targetPlayer), false);
                        } else {
                            player.sendMessage(Messages.PerkCommandSyntaxError);
                        }

                    } else  if(targetPerk.equalsIgnoreCase("doublejump")) {
                        if(option.equalsIgnoreCase("add")) {
                            player.sendMessage(Messages.addPerkCommand.replace("%s", targetPlayer));
                            PerksDatabaseManager.updateDoubleJumpPerk(Bukkit.getPlayer(targetPlayer), true);
                        } else if(option.equalsIgnoreCase("remove")) {
                            player.sendMessage(Messages.removePerkCommand.replace("%s", targetPlayer));
                            PerksDatabaseManager.updateDoubleJumpPerk(Bukkit.getPlayer(targetPlayer), false);
                        } else {
                            player.sendMessage(Messages.PerkCommandSyntaxError);
                        }


                    } else  if(targetPerk.equalsIgnoreCase("strength")) {
                        if(option.equalsIgnoreCase("add")) {
                            player.sendMessage(Messages.addPerkCommand.replace("%s", targetPlayer));
                            PerksDatabaseManager.updateStrengthPerk(Bukkit.getPlayer(targetPlayer), true);
                        } else if(option.equalsIgnoreCase("remove")) {
                            player.sendMessage(Messages.removePerkCommand.replace("%s", targetPlayer));
                            PerksDatabaseManager.updateStrengthPerk(Bukkit.getPlayer(targetPlayer), false);
                        } else {
                            player.sendMessage(Messages.PerkCommandSyntaxError);
                        }

                    }


                } else {
                    player.sendMessage(Messages.PerkCommandSyntaxError);
                }

            }

        }


        return false;
    }
}
