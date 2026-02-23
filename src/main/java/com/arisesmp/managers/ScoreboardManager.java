package com.arisesmp.managers;

import com.arisesmp.AriseSMP;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;

public class ScoreboardManager {
    private final AriseSMP plugin;

    public ScoreboardManager(AriseSMP plugin) {
        this.plugin = plugin;
    }

    public void setupScoreboard(Player player) {
        Scoreboard board = Bukkit.getScoreboardManager().getNewScoreboard();
        Objective obj = board.registerNewObjective("AriseBoard", "dummy", "§5§lArise SMP");
        obj.setDisplaySlot(DisplaySlot.SIDEBAR);
        
        obj.getScore("§7----------------").setScore(3);
        obj.getScore("§fSouls: §d0").setScore(2);
        obj.getScore("§fMana: §b100").setScore(1);
        obj.getScore("§7---------------- ").setScore(0);
        
        player.setScoreboard(board);
    }
}