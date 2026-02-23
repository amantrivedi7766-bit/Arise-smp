package com.arisesmp.models;

import java.util.UUID;

public class Soul {
    private final UUID soulId;
    private String name;
    private SoulRank rank;
    private final UUID ownerId;

    public Soul(String name, SoulRank rank, UUID ownerId) {
        this.soulId = UUID.randomUUID();
        this.name = name;
        this.rank = rank;
        this.ownerId = ownerId;
    }

    public UUID getSoulId() { return soulId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public SoulRank getRank() { return rank; }
    public void setRank(SoulRank rank) { this.rank = rank; }
    public UUID getOwnerId() { return ownerId; }
}