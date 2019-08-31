package com.bardak.service;

import com.bardak.storage.TaskStorage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommandConsoleService {
    private BufferedReader reader;
    private TaskService taskService;

    public CommandConsoleService(TaskService taskService) {
        reader = new BufferedReader(new InputStreamReader(System.in));
        this.taskService = taskService;
    }

    public void getMenu() {
        String mainMenu = "Привет, UserName!\n1. Показать все задачи\n2. Получить задачу по имени\n3. Добавить задачу\n4. Пометить задачу выполненной";
        System.out.println(mainMenu);
    }

    public String getUserInput() {
        try {
            return reader.readLine();
        } catch (IOException e) {
            System.out.println("Ты чё охуел! Пиши нормально!");
            return getUserInput();
        }
    }

    public void handleCommand(String input) {
        String name;
        String description;
        switch (input) {
            case ("1"):
                taskService.showAll();
                break;
            case ("2"):
                System.out.println("Фича пилится");
                break;
            case ("3"):
                name = getName();
                description = getDescription();
                if (!name.equals("") && !description.equals("")) {
                    taskService.addTask(name, description);
                }
                else {
                    System.out.println("Ошибка ввода!");
                }
                break;
            case ("4"):
                name = getName();
                if (!name.equals("")) {
                    taskService.markAsDone(name);
                }
            default:
                break;
        }
    }

    private String getName() {
        try {
            return reader.readLine();
        } catch (IOException e) {
            return "";
        }
    }

    private String getDescription() {
        try {
            return reader.readLine();
        } catch (Exception e) {
            return "";
        }
    }
}
