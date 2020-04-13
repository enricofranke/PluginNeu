package de.nirvanacw.main;

import de.nirvanacw.events.onPlayerMove;
import de.nirvanacw.events.onjoin;
import de.nirvanacw.events.onquit;
import org.bukkit.Bukkit;
import de.nirvanacw.commands.StartTimer;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;


public class TheChallange extends JavaPlugin {



    FileConfiguration config = getConfig();

    public static boolean canMove = false;
    public static String prefix = ChatColor.GOLD+"[System] :";
    public static String ERROR = ChatColor.RED+"[EROOR] :";


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
        getCommand("start").setExecutor(new StartTimer());
    }
}
