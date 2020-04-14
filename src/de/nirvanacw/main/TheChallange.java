package de.nirvanacw.main;

import de.nirvanacw.commands.*;
import de.nirvanacw.events.*;
import net.minecraft.server.v1_14_R1.PacketPlayInAbilities;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;


public class TheChallange extends JavaPlugin {


    FileConfiguration config = getConfig();
    public static boolean isPaused = false;
    public static boolean canMove = false;
    public static boolean isStarted = false;
    public static boolean neverStartedBefore =false;
    public static String prefix = ChatColor.GOLD+"[System]: ";
    public static String ERROR = ChatColor.RED+"[EROOR]: ";


    public static TheChallange plugin;

    @Override
    public void onEnable() {
        initConfig();
        Bukkit.broadcastMessage("enabled");
        plugin = this;
        oninit();
    }

    public static TheChallange getPlugin() {
        return plugin;
    }


    private void initConfig(){
        config.options().copyDefaults(true);
        saveConfig();
    }


    private void oninit() {
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new onjoin(),this);
        pm.registerEvents(new onquit(), this);;
        pm.registerEvents(new onPlayerMove(), this);
        pm.registerEvents(new onDeath(),this);
        pm.registerEvents(new onBlockBreak(), this);
        pm.registerEvents(new onPlayerDeath(), this);
        pm.registerEvents(new onInventoryMove(), this);
        pm.registerEvents(new onBlockPlace(), this);
        pm.registerEvents(new onEntityDamage(), this);
        getCommand("cord").setExecutor(new Cords());
        getCommand("pause").setExecutor(new PauseTimer());
        getCommand("resume").setExecutor(new ResumeTimer());
        getCommand("startlava").setExecutor(new StartLava());
        getCommand("stoplava").setExecutor(new StopLava());
        getCommand("start").setExecutor(new StartTimer());
    }
}
