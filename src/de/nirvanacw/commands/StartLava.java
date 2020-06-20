package de.nirvanacw.commands;

import de.nirvanacw.main.TheChallange;
import de.nirvanacw.utils.ActionBarManager;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class StartLava implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
        if(!(cs instanceof Player)) {
        return true;
        }
        Player player = (Player)cs;
        if(args.length == 0) {
            startTimer();
        }else {
            player.sendMessage(TheChallange.prefix + "§cBenutze /startlava");
        }


        return false;
    }

    public static void startTimer(){
        Bukkit.getScheduler().scheduleSyncRepeatingTask(TheChallange.getPlugin(),()-> {
            for (Player all : Bukkit.getOnlinePlayers()) {
                Block block = all.getLocation().subtract(0, 1, 0).getBlock();
                block.setType(Material.LAVA);
            }
        }, 0L, 10L);


    }
}
