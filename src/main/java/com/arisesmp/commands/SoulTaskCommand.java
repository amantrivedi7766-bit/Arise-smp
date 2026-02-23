package com.arisesmp.commands;

import com.arisesmp.AriseSMP;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SoulTaskCommand implements CommandExecutor {
    private final AriseSMP plugin;

    public SoulTaskCommand(AriseSMP plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) return true;
        Player player = (Player) sender;
        if (args.length == 0) {
            player.sendMessage(plugin.getConfigManager().getPrefix() + "§cUsage: /soultask <taskname>");
            return true;
        }
        plugin.getTaskManager().assignTask(player, args[0]);
        return true;
    }
}