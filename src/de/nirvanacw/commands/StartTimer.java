package de.nirvanacw.commands;

import de.nirvanacw.main.TheChallange;
import de.nirvanacw.utils.ActionBarManager;
import javafx.concurrent.Task;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitTask;

import java.util.Calendar;


public class StartTimer implements CommandExecutor {



    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(TheChallange.isStarted == false){
            Bukkit.broadcastMessage(TheChallange.prefix + "Deine Challange wurde gestartet");
            Calendar time = ActionBarManager.initTime();
            startTimer(time);
            TheChallange.canMove = true;
            TheChallange.isStarted = true;
            return true;
        }else if(TheChallange.isStarted == true){
            Bukkit.getConsoleSender().sendMessage(TheChallange.ERROR+"Die Challange leuft Bereits");
        }else{
            Bukkit.getConsoleSender().sendMessage(TheChallange.ERROR+"Etwas ist Schiefgeleaufen");
        }
        return true;
    }


    public static int TimerTaskID;

    public static void startTimer(Calendar time){
         int TimerTask = Bukkit.getScheduler().scheduleSyncRepeatingTask(TheChallange.getPlugin(),()-> {
            ActionBarManager.updateTimeBar(time);
        }, 0L, 20L);
         TimerTaskID = TimerTask;
    }



}
