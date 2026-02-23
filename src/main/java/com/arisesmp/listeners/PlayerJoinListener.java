package com.arisesmp.listeners;

import com.arisesmp.AriseSMP;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener {
    private final AriseSMP plugin;

    public PlayerJoinListener(AriseSMP plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        plugin.getSoulManager().getPlayerData(player); // Initialize data
        plugin.getAriseScoreboardManager().setupScoreboard(player);
    }
}