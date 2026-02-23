package com.arisesmp.models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class PlayerData {
    private final UUID playerUuid;
    private final List<Soul> ownedSouls;
    private int mana;

    public PlayerData(UUID playerUuid) {
        this.playerUuid = playerUuid;
        this.ownedSouls = new ArrayList<>();
        this.mana = 100;
    }

    public UUID getPlayerUuid() { return playerUuid; }
    public List<Soul> getOwnedSouls() { return ownedSouls; }
    public void addSoul(Soul soul) { this.ownedSouls.add(soul); }
    public void removeSoul(Soul soul) { this.ownedSouls.remove(soul); }
    public int getMana() { return mana; }
    public void setMana(int mana) { this.mana = mana; }
}