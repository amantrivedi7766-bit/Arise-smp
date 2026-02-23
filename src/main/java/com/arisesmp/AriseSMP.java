package com.arisesmp;

import com.arisesmp.commands.*;
import com.arisesmp.listeners.*;
import com.arisesmp.managers.*;
import org.bukkit.plugin.java.JavaPlugin;

public class AriseSMP extends JavaPlugin {

    private ConfigManager configManager;
    private SoulManager soulManager;
    private TaskManager taskManager;
    private ScoreboardManager scoreboardManager;

    @Override
    public void onEnable() {
        // Initialize Managers
        this.configManager = new ConfigManager(this);
        this.soulManager = new SoulManager(this);
        this.taskManager = new TaskManager(this);
        this.scoreboardManager = new ScoreboardManager(this);

        // Register Listeners
        getServer().getPluginManager().registerEvents(new PlayerJoinListener(this), this);
        getServer().getPluginManager().registerEvents(new EntityDeathListener(this), this);
        getServer().getPluginManager().registerEvents(new CraftingListener(this), this);

        // Register Commands
        getCommand("arise").setExecutor(new AriseCommand(this));
        getCommand("arisework").setExecutor(new AriseWorkCommand(this));
        getCommand("soulrelease").setExecutor(new SoulReleaseCommand(this));
        getCommand("soulattack").setExecutor(new SoulAttackCommand(this));
        getCommand("soulcome").setExecutor(new SoulComeCommand(this));
        getCommand("soultask").setExecutor(new SoulTaskCommand(this));

        getLogger().info("AriseSMP has been successfully enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("AriseSMP is shutting down...");
        // Cleanup logic here
    }

    public SoulManager getSoulManager() { return soulManager; }
    public TaskManager getTaskManager() { return taskManager; }
    public ScoreboardManager getAriseScoreboardManager() { return scoreboardManager; }
    public ConfigManager getConfigManager() { return configManager; }
}