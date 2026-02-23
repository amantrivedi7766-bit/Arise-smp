package com.arisesmp.models;

import java.util.UUID;

public class Task {
    private final UUID taskId;
    private final String taskName;
    private boolean completed;

    public Task(String taskName) {
        this.taskId = UUID.randomUUID();
        this.taskName = taskName;
        this.completed = false;
    }

    public UUID getTaskId() { return taskId; }
    public String getTaskName() { return taskName; }
    public boolean isCompleted() { return completed; }
    public void setCompleted(boolean completed) { this.completed = completed; }
}