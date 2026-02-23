package com.arisesmp.managers;

import com.arisesmp.AriseSMP;
import org.bukkit.configuration.file.FileConfiguration;

public class ConfigManager {
    private final AriseSMP plugin;
    private FileConfiguration config;

    public ConfigManager(AriseSMP plugin) {
        this.plugin = plugin;
        plugin.saveDefaultConfig();
        this.config = plugin.getConfig();
    }

    public void reloadConfig() {
        plugin.reloadConfig();
        this.config = plugin.getConfig();
    }

    public double getBaseCaptureChance() {
        return config.getDouble("soul-settings.base-capture-chance", 10.0);
    }

    public String getPrefix() {
        return config.getString("messages.prefix", "§8[§5Arise§8] §7").replace('&', '§');
    }
}