package me.kevin.citybuild.manager;

import me.kevin.citybuild.citybuild.Citybuild;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.FileConfiguration;

import java.util.Set;

public class WarpManager {

    public static void saveWarpLocation(String warpName, Location warpLocation) {
        FileConfiguration config = Citybuild.getPlugin(Citybuild.class).getConfig();
        config.set("warps." + warpName + ".world", warpLocation.getWorld().getName());
        config.set("warps." + warpName + ".x", warpLocation.getX());
        config.set("warps." + warpName + ".y", warpLocation.getY());
        config.set("warps." + warpName + ".z", warpLocation.getZ());
        config.set("warps." + warpName + ".yaw", warpLocation.getYaw());
        config.set("warps." + warpName + ".pitch", warpLocation.getPitch());
        Citybuild.getPlugin(Citybuild.class).saveConfig();
    }

    public static Location getWarpLocation(String warpName) {
        FileConfiguration config = Citybuild.getPlugin(Citybuild.class).getConfig();
        if (config.contains("warps." + warpName)) {
            String worldName = config.getString("warps." + warpName + ".world");
            double x = config.getDouble("warps." + warpName + ".x");
            double y = config.getDouble("warps." + warpName + ".y");
            double z = config.getDouble("warps." + warpName + ".z");
            float yaw = (float) config.getDouble("warps." + warpName + ".yaw");
            float pitch = (float) config.getDouble("warps." + warpName + ".pitch");
            return new Location(Bukkit.getWorld(worldName), x, y, z, yaw, pitch);
        }
        return null;
    }

    public static boolean deleteWarpLocation(String warpName) {
        FileConfiguration config = Citybuild.getPlugin(Citybuild.class).getConfig();
        if (config.contains("warps." + warpName)) {
            config.set("warps." + warpName, null);
            Citybuild.getPlugin(Citybuild.class).saveConfig();
            return true;
        }
        return false;
    }

    private Set<String> getWarpNames() {
        FileConfiguration config = Citybuild.getPlugin(Citybuild.class).getConfig();
        ConfigurationSection warpSection = config.getConfigurationSection("warps");

        if (warpSection != null) {
            return warpSection.getKeys(false);
        } else {
            return null; // Return null if the "warps" section doesn't exist
        }
    }
}
