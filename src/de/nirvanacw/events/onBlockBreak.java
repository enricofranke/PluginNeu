package src.de.nirvanacw.events;


import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import src.de.nirvanacw.main.TheChallange;

public class onBlockBreak implements Listener {

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event){
        if(TheChallange.isPaused == true){
            event.setCancelled(true);
        }
    }
}
