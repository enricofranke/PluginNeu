package src.de.nirvanacw.commands;


import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import src.de.nirvanacw.main.TheChallange;

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