package src.de.nirvanacw.utils;

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

        String sb_prefix = "  §7• ";
        String sb_titelprefix = "§7» ";

        sm = Bukkit.getScoreboardManager();
        sb = sm.getNewScoreboard();

        o = sb.registerNewObjective("abc", "123");
        o.setDisplaySlot(DisplaySlot.SIDEBAR);
        o.setDisplayName("§l§2NirvanaCW§7.§ade");
        o.getScore("§4").setScore(14);

        o.getScore(sb_titelprefix+"§aNamen:").setScore(13);
        o.getScore(sb_prefix+"§f"+player.getName()).setScore(12);

        o.getScore("§9    ").setScore(11);
        o.getScore(sb_titelprefix+"§aChallange:").setScore(10);
        o.getScore(sb_prefix+"§cHardcore").setScore(9);

        o.getScore("§9").setScore(8);
        o.getScore(sb_titelprefix+"§aVersion:").setScore(7);
        o.getScore(sb_prefix+"§f1.8.X").setScore(6);
        o.getScore("§6").setScore(5);

        o.getScore(sb_titelprefix+"§aHost:").setScore(4);
        o.getScore(sb_prefix+"§fNirvanaCW.de" + " ").setScore(3);

        o.getScore("§c").setScore(2);
        o.getScore("§5Twitch Prime ist kostenlos !").setScore(1);

        player.setScoreboard(sb);
    }
}
