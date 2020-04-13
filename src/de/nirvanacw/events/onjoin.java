package de.nirvanacw.events;

import de.nirvanacw.utils.sbmanager;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class onjoin implements Listener {

     @EventHandler
    public void onjoin(PlayerJoinEvent event) {
         Player player = event.getPlayer();
         event.setJoinMessage("§7[§a+§7] "+player.getName());
         sbmanager.setScoreboard(player);
            for (Player all : Bukkit.getOnlinePlayers()) {
                sbmanager.updatescoreboard(all);
            }
     }
}
