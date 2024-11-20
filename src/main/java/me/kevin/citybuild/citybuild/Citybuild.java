package me.kevin.citybuild.citybuild;

import me.kevin.citybuild.customitems.commands.Customitem;
import me.kevin.citybuild.customitems.listener.Booster;
import me.kevin.citybuild.customitems.listener.Enterhaken;
import me.kevin.citybuild.essentials.commands.*;
import me.kevin.citybuild.essentials.listener.Drop;
import me.kevin.citybuild.essentials.listener.Join;
import me.kevin.citybuild.essentials.listener.Quit;
import me.kevin.citybuild.inventorys.listener.WarpInventoryClicklistener;
import me.kevin.citybuild.manager.PerksDatabaseManager;
import me.kevin.citybuild.mysql.MySQL;
import me.kevin.citybuild.perks.GUIClick;
import me.kevin.citybuild.perks.commands.Perk;
import me.kevin.citybuild.perks.commands.Perks;
import me.kevin.citybuild.utils.Messages;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Citybuild extends JavaPlugin {
    private static Citybuild instance;

    public static String prefix = "§9§lAquabuild §8» §r§7";

    @Override
    public void onEnable() {
        System.out.println(Messages.onPluginStart);

        initialize();
        System.out.println(Messages.onPluginInitialize);
    }

    @Override
    public void onDisable() {
        System.out.println(Messages.onPluginStop);

    }

    public void initialize() {
        instance = this;
        initializeDatabase();
        registerCommands();
        registerListeners();
        this.saveDefaultConfig();
    }

    public void initializeDatabase() {
        MySQL.connect();
        PerksDatabaseManager.createTable();

    }

    public void registerCommands() {
        getCommand("gamemode").setExecutor(new Gamemode());
        getCommand("fly").setExecutor(new Fly());
        getCommand("invsee").setExecutor(new Invsee());
        getCommand("setwarp").setExecutor(new setWarp());
        getCommand("delwarp").setExecutor(new deleteWarp());
        getCommand("warp").setExecutor(new Warp());
        getCommand("warps").setExecutor(new Warps());
        getCommand("customitem").setExecutor(new Customitem());
        getCommand("spawn").setExecutor(new Spawn());
        getCommand("perks").setExecutor(new Perks());
        getCommand("enderchest").setExecutor(new Enderchest());
        getCommand("kit").setExecutor(new Kit());
        getCommand("spy").setExecutor(new Spy());
        getCommand("vanish").setExecutor(new Vanish());
        getCommand("adminshop").setExecutor(new Adminshop());
        getCommand("perk").setExecutor(new Perk());
    }

    public void registerListeners() {
        Bukkit.getPluginManager().registerEvents(new Join(), this);
        Bukkit.getPluginManager().registerEvents(new Quit(), this);
        Bukkit.getPluginManager().registerEvents(new WarpInventoryClicklistener(), this);
        Bukkit.getPluginManager().registerEvents(new Enterhaken(), this);
        Bukkit.getPluginManager().registerEvents(new Booster(), this);
        Bukkit.getPluginManager().registerEvents(new Drop(), this);
        Bukkit.getPluginManager().registerEvents(new WarpInventoryClicklistener(), this);
        Bukkit.getPluginManager().registerEvents(new GUIClick(), this);
    }

    public static String getPrefix() {
        return prefix;
    }

    public static Citybuild getInstance() {
        return instance;
    }
}
