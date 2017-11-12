package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        // ToDoRepository  repo = new ToDoRepository();

        ToDoRepository repo = new ToDoRepository();
        TodoBase raid = new RaidTodo();
        System.out.println(repo.getTodos());
        ArrayList<TodoExecutor> executors = new ArrayList<>();

        executors.add(new AddTodoExecutor());
        executors.add(new UpdateTodoExecutor());
        executors.add(new RemoveTodoExecutor());


        for (TodoExecutor executor : executors) {
            executor.Execute(raid, repo);
            System.out.println(repo.getTodos());
        }
    }
}
