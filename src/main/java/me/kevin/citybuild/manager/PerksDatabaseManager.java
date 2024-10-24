package me.kevin.citybuild.manager;

import me.kevin.citybuild.mysql.MySQL;
import org.bukkit.entity.Player;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PerksDatabaseManager {

    public static void createTable(){
        try{
            PreparedStatement ps = MySQL.getStatement("CREATE TABLE IF NOT EXISTS Perks (Spielername VARCHAR(100), UUID VARCHAR(100), Speed BOOLEAN, Haste BOOLEAN, DoubleJump BOOLEAN, Strenght BOOLEAN)");
            ps.executeUpdate();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    public static void register(Player p){
        try{
            PreparedStatement ps = MySQL.getStatement("INSERT INTO Perks (Spielername, UUID, Speed, Haste, DoubleJump, Strength) VALUES (?, ?, ?)");
            ps.setString(1, p.getName());
            ps.setString(2, p.getUniqueId().toString());
            ps.setBoolean(3, false);
            ps.setBoolean(4, false);
            ps.setBoolean(5, false);
            ps.setBoolean(6, false);
            ps.executeUpdate();
            ps.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    public static boolean isRegistered(Player p){
        try{
            PreparedStatement ps = MySQL.getStatement("SELECT * FROM Perks WHERE UUID= ?");
            ps.setString(1, p.getUniqueId().toString());
            ResultSet rs = ps.executeQuery();
            boolean user = rs.next();
            rs.close();
            rs.close();
            return user;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }

    public static boolean ownSpeedPerk(Player p){
        try{
            PreparedStatement ps = MySQL.getStatement("SELECT * FROM Perks WHERE UUID= ?");
            ps.setString(1, p.getUniqueId().toString());
            ResultSet rs = ps.executeQuery();
            rs.next();
            boolean speed = rs.getBoolean("Speed");
            rs.close();
            ps.close();
            return speed;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }

    public static boolean ownHastePerk(Player p){
        try{
            PreparedStatement ps = MySQL.getStatement("SELECT * FROM Perks WHERE UUID= ?");
            ps.setString(1, p.getUniqueId().toString());
            ResultSet rs = ps.executeQuery();
            rs.next();
            boolean haste = rs.getBoolean("Haste");
            rs.close();
            ps.close();
            return haste;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }

    public static boolean ownDoubleJumpPerk(Player p){
        try{
            PreparedStatement ps = MySQL.getStatement("SELECT * FROM Perks WHERE UUID= ?");
            ps.setString(1, p.getUniqueId().toString());
            ResultSet rs = ps.executeQuery();
            rs.next();
            boolean doubleJump = rs.getBoolean("DoubleJump");
            rs.close();
            ps.close();
            return doubleJump;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }

    public static boolean ownStrength(Player p){
        try{
            PreparedStatement ps = MySQL.getStatement("SELECT * FROM Perks WHERE UUID= ?");
            ps.setString(1, p.getUniqueId().toString());
            ResultSet rs = ps.executeQuery();
            rs.next();
            boolean doubleJump = rs.getBoolean("Strength");
            rs.close();
            ps.close();
            return doubleJump;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }

}
