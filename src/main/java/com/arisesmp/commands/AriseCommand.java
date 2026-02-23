package com.arisesmp.commands;

import com.arisesmp.AriseSMP;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AriseCommand implements CommandExecutor {
    private final AriseSMP plugin;

    public AriseCommand(AriseSMP plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can use this command.");
            return true;
        }
        Player player = (Player) sender;
        plugin.getSoulManager().arise(player);
        return true;
    }
}