package src.de.nirvanacw.events;


import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import src.de.nirvanacw.main.TheChallange;

public class onBlockPlace  implements Listener {

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event){
        if(TheChallange.isPaused == true){
            event.setCancelled(true);
        }
    }
}
