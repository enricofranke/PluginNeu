package src.de.nirvanacw.events;


import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import src.de.nirvanacw.main.TheChallange;

public class onEntityDamage implements Listener {

    @EventHandler
    public void onEntityDamage(EntityDamageEvent event){
        if(TheChallange.isPaused == true){
            event.setCancelled(true);
        }
    }
}
