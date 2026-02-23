package com.arisesmp.managers;

import com.arisesmp.AriseSMP;
import com.arisesmp.models.PlayerData;
import com.arisesmp.models.Soul;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class SoulManager {
    private final AriseSMP plugin;
    private final Map<UUID, PlayerData> playerDataMap;

    public SoulManager(AriseSMP plugin) {
        this.plugin = plugin;
        this.playerDataMap = new HashMap<>();
    }

    public PlayerData getPlayerData(Player player) {
        return playerDataMap.computeIfAbsent(player.getUniqueId(), PlayerData::new);
    }

    public void arise(Player player) {
        player.sendMessage(plugin.getConfigManager().getPrefix() + "§aArise! You have attempted to awaken a soul.");
        // Additional spawn logic here
    }

    public void recallSouls(Player player) {
        player.sendMessage(plugin.getConfigManager().getPrefix() + "§eAll souls returning...");
        // Despawn/teleport logic here
    }
}