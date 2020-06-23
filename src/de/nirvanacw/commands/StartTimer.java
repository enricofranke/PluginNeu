package src.de.nirvanacw.commands;


import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import src.de.nirvanacw.main.TheChallange;
import src.de.nirvanacw.utils.ActionBarManager;

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
            TheChallange.neverStartedBefore = true;
        }else if(TheChallange.isStarted){
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
