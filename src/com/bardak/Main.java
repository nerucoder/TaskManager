package com.bardak;

import com.bardak.service.TaskService;
import com.bardak.storage.InMemoryTaskStorage;
import com.bardak.storage.TaskStorage;

public class Main {
    public static void main(String args[]) {
        TaskStorage storage = new InMemoryTaskStorage();
        TaskService service = new TaskService(storage);
        service.addTask("one", "two");
        service.addTask("two", "own");
        service.showAll();
        service.markAsDone("one");
        System.out.println("***************");
        service.showAll();
    }
}
