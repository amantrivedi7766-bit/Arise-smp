package com.arisesmp.utils;

import org.bukkit.Bukkit;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.entity.Player;

public class BossBarUtil {
    public static BossBar createBossBar(String title, BarColor color, BarStyle style) {
        return Bukkit.createBossBar(title, color, style);
    }

    public static void showToPlayer(BossBar bar, Player player) {
        bar.addPlayer(player);
    }

    public static void hideFromPlayer(BossBar bar, Player player) {
        bar.removePlayer(player);
    }
}