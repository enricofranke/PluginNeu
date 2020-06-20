package de.nirvanacw.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityRegainHealthEvent;

public class onPlayerRegenaration implements Listener {

    @EventHandler
    public void onPlayerRegenaration(EntityRegainHealthEvent event) {
        event.setCancelled(true);
    }
}
