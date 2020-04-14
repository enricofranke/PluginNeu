package de.nirvanacw.events;

import de.nirvanacw.main.TheChallange;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class onEntityDamage implements Listener {

    @EventHandler
    public void onEntityDamage(EntityDamageEvent event){
        if(TheChallange.isPaused == true){
            event.setCancelled(true);
        }
    }
}
