package de.nirvanacw.commands;

import de.nirvanacw.main.TheChallange;
import de.nirvanacw.utils.ActionBarManager;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PauseTimer implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player player = (Player)commandSender;
        if (TheChallange.isStarted == true){
            if(TheChallange.isPaused == false){
                Bukkit.broadcastMessage(ChatColor.GOLD+ChatColor.BOLD.toString()+"Die Challange Wurde von " +player.getName()+" Pausiert");
                Bukkit.getScheduler().cancelTask(StartTimer.TimerTaskID);
                TheChallange.isPaused = true;
                TheChallange.canMove = false;
            }
            else if (TheChallange.isPaused){
                Bukkit.broadcastMessage(ChatColor.GOLD+ChatColor.BOLD.toString()+"Die Challange Geht weiter");
                StartTimer.startTimer(ActionBarManager.calendar);
                TheChallange.canMove = true;
                TheChallange.isPaused = false;
            }
        }
        if (TheChallange.isStarted == false){
            Bukkit.broadcastMessage(TheChallange.ERROR+"Du musst die Challange erst starten befor sie Pausiert werden kann");
        }


        return true;
    }
}
