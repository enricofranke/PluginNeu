package de.nirvanacw.utils;


import de.nirvanacw.main.TheChallange;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import net.minecraft.server.v1_14_R1.IChatBaseComponent;
import net.minecraft.server.v1_14_R1.PacketPlayOutChat;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.craftbukkit.v1_14_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ActionBarManager {


    @SuppressWarnings("deprecation")
    public static void sendActionbar(final Player player, final String message) {
        player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(message));
    }


    public static Calendar initTime(){
        Calendar now = Calendar.getInstance();
        now.set(Calendar.SECOND ,0);
        now.set(Calendar.DAY_OF_MONTH, 0);
        now.set(Calendar.YEAR,0);
        now.set(Calendar.MINUTE,0);
        now.set(Calendar.MILLISECOND, 0);
        now.set(Calendar.HOUR, 0);
        now.set(Calendar.HOUR_OF_DAY, 0);
        now.set(Calendar.WEEK_OF_MONTH,0);
        return now;
    }


    public static Calendar calendar;

    public static void updateTimeBar(Calendar time){

        Date date = time.getTime();
        calendar = time;
        SimpleDateFormat format1 = new SimpleDateFormat("HH:mm:ss");
        time.add(Calendar.SECOND, 1);
        String message = ChatColor.GREEN+ChatColor.BOLD.toString()+"Timer:"+ChatColor.WHITE+ChatColor.BOLD.toString()+format1.format(date);
        Bukkit.getOnlinePlayers().forEach(current -> sendActionbar(current, message));
    }
}
