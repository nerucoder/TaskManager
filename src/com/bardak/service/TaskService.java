package com.bardak.service;

import com.bardak.domain.Task;
import com.bardak.storage.TaskStorage;

import java.util.ArrayList;

public class TaskService {
    private TaskStorage storage;

    public TaskService(TaskStorage storage) {
        this.storage = storage;
    }

    public void addTask(String name, String description) {
        Task task = new Task(name, description, false);
        storage.saveTask(task);
    }

    public void showAll() {
        ArrayList<Task> allTasks = storage.getAll();
        for (Task task : allTasks) {
            System.out.println(task);
        }
    }

    public void markAsDone(String name) {
        Task task = storage.getByName(name);
        task.markAsDone();
        storage.saveTask(task);
    }
}
