package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class TodoListTest {
    @Test
    public void addTaskSuccessfullyTest() {
        TodoList todoList = new TodoList();
        Task newTask = new Task("laundry", true);
        Assertions.assertTrue(todoList.addTask(newTask));
    }

    /*@Test
    public void addTaskUnsuccessfullyTest() {
        TodoList tasks = new TodoList();
        Task newTask = new Task("laundry", true);
        Assertions.assertTrue(tasks.addTask(newTask));
    }
    */

    @Test
    public void changeStatusSuccessfullyTest() {
        TodoList todoList = new TodoList();
        Task newTask = new Task("laundry", true);
        todoList.addTask(newTask);
        Assertions.assertTrue(todoList.changeStatus("laundry"));
    }

    @Test
    public void changeStatusUnsuccessfullyTest() {
        TodoList todoList = new TodoList();
        Task newTask = new Task("laundry", true);
        todoList.addTask(newTask);
        Assertions.assertFalse(todoList.changeStatus("buy groceries"));
    }

    @Test
    public void getCompletedTasksTest() {
        TodoList todoList = new TodoList();
        todoList.addTask(new Task("laundry", true));
        todoList.addTask(new Task("running", false));
        todoList.addTask(new Task("buy groceries", true));
        ArrayList<Task> completeTasksCheck = new ArrayList<>() {{
                add(new Task("laundry", true));
                add(new Task("buy groceries", true));
        }};
        Assertions.assertArrayEquals(completeTasksCheck, todoList.tasks);
    }

    @Test
    public void getIncompleteTasksTest() {
        TodoList todoList = new TodoList();
        todoList.addTask(new Task("laundry", true));
        todoList.addTask(new Task("running", false));
        todoList.addTask(new Task("buy groceries", false));
        ArrayList<Task> completeTasksCheck = new ArrayList<>() {{
            add(new Task("running", false));
            add(new Task("buy groceries", false));
        }};
        Assertions.assertArrayEquals(completeTasksCheck, todoList.tasks);
    }

    @Test
    public void getTaskSuccessfullyTest() {
        TodoList todoList = new TodoList();
        todoList.addTask(new Task("laundry", true));
        todoList.addTask(new Task("running", false));
        todoList.addTask(new Task("buy groceries", false));
        Task task = new Task("laundry", true);
        Assertions.assertEquals(task, todoList.getTask(task));
    }

    @Test
    public void getTaskUnsuccessfullyTest() {
        TodoList todoList = new TodoList();
        todoList.addTask(new Task("laundry", true));
        todoList.addTask(new Task("running", false));
        todoList.addTask(new Task("buy groceries", false));
        Task task = new Task("fishing", false);
        Assertions.assertNull(task, todoList.getTask(task));
    }

    @Test
    public void removeTaskSuccessfullyTest() {
        TodoList todoList = new TodoList();
        todoList.addTask(new Task("laundry", true));
        todoList.addTask(new Task("running", false));
        todoList.addTask(new Task("buy groceries", false));
        Task task = new Task("laundry", true);
        Assertions.assertTrue(todoList.getTask(task));
    }

    @Test
    public void removeTaskUnsuccessfullyTest() {
        TodoList todoList = new TodoList();
        todoList.addTask(new Task("laundry", true));
        todoList.addTask(new Task("running", false));
        todoList.addTask(new Task("buy groceries", false));
        Task task = new Task("fishing", false);
        Assertions.assertFalse(todoList.getTask(task));
    }
}
