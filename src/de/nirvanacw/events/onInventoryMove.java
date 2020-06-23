package src.de.nirvanacw.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import src.de.nirvanacw.main.TheChallange;

public class onInventoryMove implements Listener {

    @EventHandler
    public void onInventoryMove(InventoryClickEvent event){
        if (TheChallange.isPaused == true){
            event.setCancelled(true);
        }
    }
}
