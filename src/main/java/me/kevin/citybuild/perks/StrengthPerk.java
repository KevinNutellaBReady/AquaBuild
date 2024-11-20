package me.kevin.citybuild.perks;

import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.ArrayList;

public class StrengthPerk {

    public static ArrayList<Player> strengthPerkList = new ArrayList<>();

    public static boolean checkStrengthPerk(Player player) {
        return strengthPerkList.contains(player);
    }

    public static void activateStrengthPerk(Player player) {
        if(!strengthPerkList.contains(player)) {
            player.addPotionEffect(new PotionEffect(PotionEffectType.STRENGTH, -1, 0, false, false));
            strengthPerkList.add(player);

        } else {
            player.sendMessage("SpeedPerk bereits aktiviert");
        }


    }

    public static void deactiveStrengthPerk(Player player) {
        if(strengthPerkList.contains(player)) {
            player.removePotionEffect(PotionEffectType.STRENGTH);
            strengthPerkList.remove(player);
        } else {
            player.sendMessage("SpeedPerk bereits deaktiviert");
        }

    }

}
