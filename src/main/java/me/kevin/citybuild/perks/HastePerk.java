package me.kevin.citybuild.perks;

import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.ArrayList;

public class HastePerk {

    public static ArrayList<Player> hastePerkList = new ArrayList<>();

    public static boolean checkHastePerk(Player player) {
        return hastePerkList.contains(player);
    }

    public static void activateHastePerk(Player player) {
        if(!hastePerkList.contains(player)) {
            player.addPotionEffect(new PotionEffect(PotionEffectType.HASTE, -1, 1, false, false));
            hastePerkList.add(player);

        } else {
            player.sendMessage("Haste bereits aktiviert");
        }


    }

    public static void deactiveHastePerk(Player player) {
        if(hastePerkList.contains(player)) {
            player.removePotionEffect(PotionEffectType.HASTE);
            hastePerkList.remove(player);
        } else {
            player.sendMessage("Haste bereits deaktiviert");
        }

    }
}
