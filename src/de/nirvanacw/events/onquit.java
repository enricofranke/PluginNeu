package src.de.nirvanacw.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class onquit implements Listener {

    @EventHandler
    public void onquit(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        event.setQuitMessage("§7[§c-§7] " + event.getPlayer().getName());
    }
}
