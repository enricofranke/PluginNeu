package src.de.nirvanacw.events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import src.de.nirvanacw.commands.StartTimer;
import src.de.nirvanacw.main.TheChallange;

public class onPlayerDeath implements Listener {



  @EventHandler
  public static void onPlayerDeath(PlayerDeathEvent event){
    Player player = event.getEntity();
    Bukkit.getOnlinePlayers().forEach(current -> current.setGameMode(GameMode.SPECTATOR));
    Bukkit.broadcastMessage(ChatColor.RED+ChatColor.BOLD.toString()+"Ihr habt Versagt wegen " +player.getName());
    Bukkit.getScheduler().cancelTask(StartTimer.TimerTaskID);
    TheChallange.isStarted = false;
  }
}
