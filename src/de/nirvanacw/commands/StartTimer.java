package de.nirvanacw.commands;

import de.nirvanacw.main.TheChallange;
import de.nirvanacw.utils.ActionBarManager;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Calendar;


public class StartTimer implements CommandExecutor {



    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Bukkit.broadcastMessage(TheChallange.prefix + "Deine Challange wurde gestartet");
        startTimer();
        TheChallange.canMove = true;
        return true;
    }


    public static void startTimer(){
        Calendar time = ActionBarManager.initTime();
        Bukkit.getScheduler().scheduleSyncRepeatingTask(TheChallange.getPlugin(),()-> {
            ActionBarManager.updateTimeBar(time);
        }, 0L, 20L);
    }



}
