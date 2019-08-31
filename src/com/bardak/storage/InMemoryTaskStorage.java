package com.bardak.storage;

import com.bardak.domain.Task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class InMemoryTaskStorage implements TaskStorage {

    private Map<String, Task> map = new HashMap<>();

    @Override
    public void saveTask(Task task) {
        map.put(task.getName(), task);
    }

    @Override
    public ArrayList<Task> getAll() {
        ArrayList<Task> list = new ArrayList<>();
        for (Map.Entry<String, Task> out : map.entrySet()) {
            list.add(out.getValue());
        }

        return list;
    }

    @Override
    public Task getByName(String name) {
        return map.get(name) ;
    }
}
