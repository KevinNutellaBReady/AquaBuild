package me.kevin.citybuild.utils;

import me.kevin.citybuild.citybuild.Citybuild;

public class Messages {

    /* Start Messages */
    public static String onPluginStart = "[Citybuild] System gestartet! starte Initialisierung";
    public static String onPluginInitialize = "[Citybuild] System erfolgreich initialisiert!";

    /* Stop Messages */
    public static String onPluginStop = "[Citybuild] System gestoppt!";

    /* Essential Messages */
    public static String NoPermission = Citybuild.getPrefix() + "§4§lDazu hast du keine Rechte!";

    /* Command Messages */

        /* Gamemode Command */
        public static String setGamemodeCreative = Citybuild.getPrefix() + "Du hast nun den Gamemode §3CREATIVE§7.";
        public static String setGamemodeSurvival = Citybuild.getPrefix() + "Du hast nun den Gamemode §3SURVIVAL§7.";
        public static String setGamemodeAdventure = Citybuild.getPrefix() + "Du hast nun den Gamemode §3ADVENTURE§7.";
        public static String setGamemodeSpectator = Citybuild.getPrefix() + "Du hast nun den Gamemode §3SPECTATOR§7.";
        public static String setGamemodeSyntaxError = Citybuild.getPrefix() + "Bitte Benutze: /gamemode [1,2,3,0] oder /gm [1,2,3,0]";

        /* Fly Command */
        public static String setFlyModeOn = Citybuild.getPrefix() + "Du hast nun den Flymodus §a§lAktiviert§7.";
        public static String setFlyModeOff = Citybuild.getPrefix() + "Du hast nun den Flymodus §c§lDeaktiviert§7.";

        /* Invsee Command */
        public static String invseeSyntaxError = Citybuild.getPrefix() + "§c§lBitte benutze: /invsee [Spieler]";
        public static String invseePlayerNotOnline = Citybuild.getPrefix() + "§c§lDieser Spieler ist gerade nicht online!";
        public static String invseeOwnInventory = Citybuild.getPrefix() + "§c§lDu kannst dein eigenes Inventar nicht anschauen!";
        public static String invseeTargetHasMorePermission = Citybuild.getPrefix() + "§c§lDer angegebene Spieler hat ein zu hohen Rang!";

        /* Warp Command */
        public static String teleportToWarp = Citybuild.getPrefix() + "Du hast dich erfolgreich zum Warp: §c§l % §r§7teleportiert.";
        public static String warpDoesNotExist = Citybuild.getPrefix() + "§c§lDieser Warp existiert nicht.";

        /* setWarp Command */
        public static String setWarpSyntaxError = Citybuild.getPrefix() + "§c§lBitte benutze: /setwarp [warpname]";
        public static String setWarpSuccessfully = Citybuild.getPrefix() + "Du erfolgreich den Warp: §a§l $ §r§7gesetzt";

        /* delWarp Command */
        public static String delWarpSyntaxError = Citybuild.getPrefix() + "§c§lBitte benutze: /delwarp [warpname]";
        public static String delWarpSuccessfully = Citybuild.getPrefix() + "§7§lDu hast folgenden Warp §c§lgelöscht§r§7: §a§l";

        /* Customitem Command */
        public static String customItemSyntaxError = Citybuild.getPrefix() + "§c§lBitte benutze: /customitem give <CustomItem>";
        public static String customItemGiveEnterhaken = Citybuild.getPrefix() + "Du hast dir einen §5§lEnterhaken §r§7gegeben.";
        public static String customItemGiveBooster = Citybuild.getPrefix() + "Du hast dir einen §e§lBooster §r§7gegeben.";



}
