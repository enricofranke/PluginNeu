package de.nirvanacw.events;

import de.nirvanacw.main.TheChallange;
import org.bukkit.craftbukkit.libs.org.apache.commons.io.output.AppendableOutputStream;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class onBlockPlace  implements Listener {

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event){
        if(TheChallange.isPaused == true){
            event.setCancelled(true);
        }
    }
}
