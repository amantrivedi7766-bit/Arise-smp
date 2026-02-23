package com.arisesmp.models;

public enum SoulRank {
    BASIC,
    ELITE,
    KNIGHT,
    COMMANDER,
    GENERAL;

    public String getDisplayName() {
        return name().substring(0, 1).toUpperCase() + name().substring(1).toLowerCase();
    }
}