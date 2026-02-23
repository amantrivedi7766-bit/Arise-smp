package com.arisesmp.commands;

import com.arisesmp.AriseSMP;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SoulAttackCommand implements CommandExecutor {
    private final AriseSMP plugin;

    public SoulAttackCommand(AriseSMP plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) return true;
        Player player = (Player) sender;
        player.sendMessage(plugin.getConfigManager().getPrefix() + "§4Souls are now attacking your target!");
        // Implement targeted attack logic
        return true;
    }
}