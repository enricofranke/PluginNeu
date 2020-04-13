package de.nirvanacw.events;

import de.nirvanacw.main.TheChallange;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import java.awt.peer.LightweightPeer;

public class onPlayerMove implements Listener {


    @EventHandler
    public static void onPlayerMove(PlayerMoveEvent event){
        Player player = event.getPlayer();
        if(TheChallange.canMove == false){
            event.setCancelled(true);
        }
        if(TheChallange.canMove == true){
            event.setCancelled(false);
        }

    }

}
