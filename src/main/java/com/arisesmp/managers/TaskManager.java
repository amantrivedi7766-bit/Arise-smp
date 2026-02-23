package com.arisesmp.managers;

import com.arisesmp.AriseSMP;
import com.arisesmp.models.Task;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.ArrayList;

public class TaskManager {
    private final AriseSMP plugin;
    private final Map<UUID, List<Task>> playerTasks;

    public TaskManager(AriseSMP plugin) {
        this.plugin = plugin;
        this.playerTasks = new HashMap<>();
    }

    public void assignTask(Player player, String taskName) {
        List<Task> tasks = playerTasks.computeIfAbsent(player.getUniqueId(), k -> new ArrayList<>());
        tasks.add(new Task(taskName));
        player.sendMessage(plugin.getConfigManager().getPrefix() + "§aNew task assigned: " + taskName);
    }

    public List<Task> getTasks(Player player) {
        return playerTasks.getOrDefault(player.getUniqueId(), new ArrayList<>());
    }
}