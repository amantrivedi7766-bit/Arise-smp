package com.arisesmp.listeners;

import com.arisesmp.AriseSMP;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public class EntityDeathListener implements Listener {
    private final AriseSMP plugin;

    public EntityDeathListener(AriseSMP plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onEntityDeath(EntityDeathEvent event) {
        if (event.getEntity().getKiller() != null) {
            Player killer = event.getEntity().getKiller();
            double chance = plugin.getConfigManager().getBaseCaptureChance();
            
            if (Math.random() * 100 <= chance) {
                killer.sendMessage(plugin.getConfigManager().getPrefix() + "§dA soul is lingering... Use /arise to attempt capture!");
            }
        }
    }
}