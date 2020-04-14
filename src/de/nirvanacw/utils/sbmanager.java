package de.nirvanacw.utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.*;

public class sbmanager {


    static ScoreboardManager sm;
    static Scoreboard sb;
    static Objective o;

    @SuppressWarnings("deprecation")
    public static void setScoreboard(Player player) {

        sm = Bukkit.getScoreboardManager();
        sb = sm.getNewScoreboard();

        o = sb.registerNewObjective("abc", "123");
        o.setDisplaySlot(DisplaySlot.SIDEBAR);
        o.setDisplayName("§l§2NirvanaCW§7.§ade");
        o.getScore("§4").setScore(12);

        o.getScore("§aChallange:").setScore(11);
        o.getScore("§7➥ §cHardcore").setScore(10);

        o.getScore("§9").setScore(9);
        o.getScore("§aVersion:").setScore(8);
        o.getScore("§7➥ §f1.14.4").setScore(7);
        o.getScore("§6").setScore(6);

        o.getScore("§aHost:").setScore(5);
        o.getScore("§7➥ §fNirvanaCW.de" + " ").setScore(4);

        o.getScore("§c").setScore(3);
        o.getScore("§5Twitch Prime ist kostenlos !").setScore(2);
        o.getScore("§b").setScore(1);

        player.setScoreboard(sb);
    }
}
