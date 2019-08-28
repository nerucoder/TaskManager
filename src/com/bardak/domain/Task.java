package com.bardak.domain;

public class Task {
    private String name;
    private String desription;
    private boolean done;

    public Task(String name, String desription, boolean done) {
        this.name = name;
        this.desription = desription;
        this.done = done;
    }

    @Override
    public String toString() {
        return name + " - " + desription + " - " + done;
    }

    public void markAsDone() {
        this.done = true;
    }

    public String getName() {
        return name;
    }
}
