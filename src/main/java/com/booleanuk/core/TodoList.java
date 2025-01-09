package com.booleanuk.core;

import java.util.ArrayList;
import java.util.Collections;

public class TodoList {
    ArrayList<Task> tasks = new ArrayList<>();

    public boolean addTask(Task task) {
        tasks.add(task);
        return true;
    }

    public void printTasks() {
        System.out.println("Current tasks:");
        for(Task task : this.tasks) {
            System.out.println(task.taskName + " : " + task.isCompeted);
        }
        System.out.println();
    }

    public boolean changeStatus(Task task) {
        if(!tasks.contains(task)) return false;
        task.isCompeted = !task.isCompeted;
        return true;
    }

    public ArrayList<Task> getCompletedTasks() {
        ArrayList<Task> completedTasks = new ArrayList<>();
        for(Task task : this.tasks) {
            if(task.isCompeted) completedTasks.add(task);
        }
        return completedTasks;
    }

    public ArrayList<Task> getIncompleteTasks() {
        ArrayList<Task> incompleteTasks = new ArrayList<>();
        for(Task task : this.tasks) {
            if(!task.isCompeted) incompleteTasks.add(task);
        }
        return incompleteTasks;
    }

    public Task getTask(String taskName) {
        for(Task task : this.tasks) {
            if(task.taskName.equals(taskName)) return task;
        } return null;
    }

    public boolean removeTask(String taskName) {
        for(Task task : this.tasks) {
            if(task.taskName.equals(taskName)) {
                this.tasks.remove(task);
                return true;
            }
        }
        return false;
    }

    public void printTasksAscending() {
        ArrayList<Task> sortedTasks = new ArrayList<>(this.tasks);
        sortedTasks.sort(((o1, o2) -> o1.getTaskName().compareTo(o2.getTaskName())));
        System.out.println("All tasks (descending):");
        for(Task task : sortedTasks) {
            System.out.println(task.taskName + " : " + task.isCompeted);
        }
    }

    public void printTasksDescending() {
        ArrayList<Task> sortedTasks = new ArrayList<>(this.tasks);
        sortedTasks.sort(((o2, o1) -> o1.getTaskName().compareTo(o2.getTaskName())));
        System.out.println("All tasks (descending):");
        for(Task task : sortedTasks) {
            System.out.println(task.taskName + " : " + task.isCompeted);
        }
    }
}
