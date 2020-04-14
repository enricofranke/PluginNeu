package de.nirvanacw.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class Cords implements CommandExecutor {


    public static ArrayList<String> places = new ArrayList<String>();

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        Player player = (Player)commandSender;
        if(commandSender instanceof Player){
            if(args.length == 0){
                for (String place : places){
                    player.sendMessage(place);
                }
            }
            if (args.length == 1){
                String add = (ChatColor.GOLD+ args[0] +ChatColor.WHITE+"|| "+ChatColor.RED+" x: "+ player.getLocation().getX()+ChatColor.WHITE+" || "+ ChatColor.GREEN+" y: " + player.getLocation().getY() +ChatColor.WHITE+" || "+ChatColor.BLUE+" z: " + player.getLocation().getZ());
                Bukkit.broadcastMessage(add);
                places.add(add);
            }
        }
        return true;
    }
}
