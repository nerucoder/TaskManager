package com.bardak.storage;

import com.bardak.domain.Task;

import java.util.ArrayList;

public interface TaskStorage {
    public void saveTask(Task task);
    public ArrayList<Task> getAll();
    public Task getByName(String name);
}
