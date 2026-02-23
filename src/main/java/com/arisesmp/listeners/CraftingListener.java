package com.arisesmp.listeners;

import com.arisesmp.AriseSMP;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;

public class CraftingListener implements Listener {
    private final AriseSMP plugin;

    public CraftingListener(AriseSMP plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onCraft(CraftItemEvent event) {
        // Example: Block crafting of specific soul items if rank is too low
    }
}