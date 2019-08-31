package com.bardak;

import com.bardak.service.CommandConsoleService;
import com.bardak.service.TaskService;
import com.bardak.storage.InMemoryTaskStorage;
import com.bardak.storage.TaskStorage;

public class Main {
    public static void main(String args[]) {
        TaskStorage storage = new InMemoryTaskStorage();
        TaskService service = new TaskService(storage);
        CommandConsoleService commandConsoleService = new CommandConsoleService(service);
        while (true) {
            commandConsoleService.getMenu();
            commandConsoleService.handleCommand(commandConsoleService.getUserInput());
        }
    }
}
