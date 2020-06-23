package src.de.nirvanacw.utils;

import net.minecraft.server.v1_8_R3.IChatBaseComponent;
import net.minecraft.server.v1_8_R3.PacketPlayOutChat;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ActionBarManager {


    @SuppressWarnings("deprecation")
    public static void sendActionbar(final Player player, final String message) {
       final IChatBaseComponent iChatBaseComponent = IChatBaseComponent.ChatSerializer.a("{\"text\": \"" + ChatColor.translateAlternateColorCodes('&', message) + "\"}");
       final PacketPlayOutChat packetPlayOutChat = new PacketPlayOutChat(iChatBaseComponent, (byte)2);
        ((CraftPlayer) player).getHandle().playerConnection.sendPacket(packetPlayOutChat);
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
