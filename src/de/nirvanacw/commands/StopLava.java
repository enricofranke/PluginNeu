package de.nirvanacw.commands;

import de.nirvanacw.main.TheChallange;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class StopLava implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
        if(!(cs instanceof Player)) {
            return true;
        }

        Player player = (Player)cs;
        if(args.length == 0) {
        }else {
            player.sendMessage(TheChallange.prefix + "§cBenutze /stoplava");
        }


        return false;
    }
}