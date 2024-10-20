package me.kevin.citybuild.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.bukkit.Bukkit;

public class MySQL {
    public static String host = "localhost";
    public static String port = "3306";
    public static String database = "lobbyplugin";
    public static String username = "myadmin";
    public static String password = "Lenha.120507";


    public static Connection con;

    public static boolean isConnected(){
        return con != null;
    }

    public static void connect(){
        if(!isConnected()){
            try {
                con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/" + database + "?autoReconnect=true", username, password);
                Bukkit.getConsoleSender().sendMessage("§aEs konnte erfolgreich mit der Datenbank verbunden werden");
            } catch (SQLException e) {
                Bukkit.getConsoleSender().sendMessage("§cEs konnte nicht mit der Datenbank verbunden werden");
            }
        }
    }

    public static void disconnect(){
        try {
            con.close();
            Bukkit.getConsoleSender().sendMessage("§aDie Verbindung zur Datenbank konnte erfolgreich geschlossen werden");
        } catch (SQLException e) {
            Bukkit.getConsoleSender().sendMessage("§cDie Verbindung zur Datenbank konnte nicht geschlossen werden");
        }
    }

    public static PreparedStatement getStatement(String sql){
        if(isConnected()){
            PreparedStatement ps;
            try {
                ps = con.prepareStatement(sql);
                return ps;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static ResultSet getResult(String sql){
        if(isConnected()){
            PreparedStatement ps;
            ResultSet rs;
            try {
                ps = getStatement(sql);
                rs = ps.executeQuery();
                return rs;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}
