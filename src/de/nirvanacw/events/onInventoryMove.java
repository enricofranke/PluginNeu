package de.nirvanacw.events;

import de.nirvanacw.main.TheChallange;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class onInventoryMove implements Listener {

    @EventHandler
    public void onInventoryMove(InventoryClickEvent event){
        if (TheChallange.isPaused == true){
            event.setCancelled(true);
        }
    }
}
