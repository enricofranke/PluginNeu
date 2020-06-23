package src.de.nirvanacw.commands;


import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import src.de.nirvanacw.main.TheChallange;
import src.de.nirvanacw.utils.ActionBarManager;

public class ResumeTimer implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player player = (Player) commandSender;
         if(TheChallange.isPaused && TheChallange.isStarted == true){
            Bukkit.broadcastMessage(ChatColor.GOLD+ChatColor.BOLD.toString()+"Die Challange Geht weiter");
            StartTimer.startTimer(ActionBarManager.calendar);
            TheChallange.canMove = true;
            TheChallange.isPaused = false;
        }
         else if (!TheChallange.isPaused && TheChallange.isStarted == true){
             player.sendMessage(TheChallange.ERROR+"Die Challange leuft doch schon");
         }
         else if(!TheChallange.isPaused && TheChallange.isStarted == false && TheChallange.neverStartedBefore == true){
             StartTimer.startTimer(ActionBarManager.calendar);
             TheChallange.canMove = true;
             TheChallange.isPaused = false;
             TheChallange.isStarted = true;
             Bukkit.getOnlinePlayers().forEach(current -> current.setGameMode(GameMode.SURVIVAL));
             Bukkit.broadcastMessage(ChatColor.GOLD+ChatColor.BOLD.toString()+"Es geht Doch weiter");
         }
          else if(!TheChallange.isPaused && TheChallange.isStarted == false && TheChallange.neverStartedBefore == false){
             player.sendMessage(TheChallange.ERROR+"Du kannst es Nicht Fortsetzen da es noch nicht mal leuft");
         }
        return true;
    }
}
