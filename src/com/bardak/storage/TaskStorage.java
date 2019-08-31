package com.bardak.storage;

import com.bardak.domain.Task;

import java.util.ArrayList;

public interface TaskStorage {
    void saveTask(Task task);
    ArrayList<Task> getAll();
    Task getByName(String name);
}
