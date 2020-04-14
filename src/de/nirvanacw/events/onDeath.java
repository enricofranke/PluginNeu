package de.nirvanacw.events;

import de.nirvanacw.commands.StartTimer;
import de.nirvanacw.main.TheChallange;
import de.nirvanacw.utils.ActionBarManager;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.entity.EnderDragon;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Sheep;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

import java.text.SimpleDateFormat;
import java.util.Date;

public class onDeath implements Listener {



  @EventHandler
  public void onDeath(EntityDeathEvent event){
    Entity entity = event.getEntity();

    if(event.getEntity() instanceof EnderDragon){
      Bukkit.getScheduler().cancelTask(StartTimer.TimerTaskID);
      Date date = ActionBarManager.calendar.getTime();
      SimpleDateFormat format1 = new SimpleDateFormat("HH:mm:ss");
      Bukkit.broadcastMessage(ChatColor.GREEN+ChatColor.BOLD.toString()+"Ihr habt die Challange in "+format1.format(date)+" Geschafft!!");
      Bukkit.getOnlinePlayers().forEach(current -> current.setGameMode(GameMode.SPECTATOR));
    }
  }
}
