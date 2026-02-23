package com.arisesmp.commands;

import com.arisesmp.AriseSMP;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AriseWorkCommand implements CommandExecutor {
    private final AriseSMP plugin;

    public AriseWorkCommand(AriseSMP plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) return true;
        Player player = (Player) sender;
        player.sendMessage(plugin.getConfigManager().getPrefix() + "§eAssigning your souls to work...");
        // Implement worker assignment logic
        return true;
    }
}