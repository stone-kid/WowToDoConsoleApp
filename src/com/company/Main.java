package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// ToDoRepository  repo = new ToDoRepository();

        TodoBase raid = new RaidTodo();
        System.out.println(raid);
        TodoBase mythicDungeonTodo = new MythicDungeonTodo();
        System.out.println(mythicDungeonTodo);
        System.out.println(raid.equals(mythicDungeonTodo));
        ArrayList<TodoBase> todos = new ArrayList<TodoBase>();
        todos.add(raid);
        todos.add(mythicDungeonTodo);
        System.out.println(todos);
        }
}
