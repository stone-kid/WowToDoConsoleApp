package com.company;

public class Main {

    public static void main(String[] args) {
	// ToDoRepository  repo = new ToDoRepository();

        TodoBase obj = new RaidTodo();
        System.out.println(obj);
        TodoBase obj2 = new RaidTodo();
        System.out.println(obj2);
        System.out.println(obj.equals(obj2));
        }
}
