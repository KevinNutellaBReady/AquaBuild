package me.kevin.citybuild.perks;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.ArrayList;

public class SpeedPerk implements Listener {

    public static ArrayList<Player> speedPerkList = new ArrayList<>();

    public static boolean checkSpeedPerk(Player player) {
        return speedPerkList.contains(player);
    }

    public static void activateSpeedPerk(Player player) {
        if(!speedPerkList.contains(player)) {
            player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, -1, 1, false, false));
            speedPerkList.add(player);

        } else {
            player.sendMessage("SpeedPerk bereits aktiviert");
        }


    }

    public static void deactiveSpeedPerk(Player player) {
        if(speedPerkList.contains(player)) {
            player.removePotionEffect(PotionEffectType.SPEED);
            speedPerkList.remove(player);
        } else {
            player.sendMessage("SpeedPerk bereits deaktiviert");
        }

    }


}
