package com.company;

import java.util.ArrayList;

public class ToDoRepository {

    private ArrayList<TodoBase> todos;

    public ToDoRepository() {

        todos = new ArrayList<TodoBase>();
    }


    public boolean AddTodo(TodoBase todo) {

        boolean addResult = todos.add(todo);
        return addResult;

    }

    public boolean RemoveTode(TodoBase todo) {
        boolean removeResult = todos.remove(todo);
        return removeResult;

    }

    public void UpdateTodo(TodoBase todo) {

        int index = todos.indexOf(todo);
        todos.set(index, todo);

    }

    public TodoBase FindTodo(String id) throws CloneNotSupportedException {
        for (TodoBase todo : todos) {
            if (todo.getId().equals(id)) {
                return (TodoBase) todo.clone();
            }
        }
        return null;
    }

    public ArrayList<TodoBase> getTodos() throws CloneNotSupportedException {

        ArrayList<TodoBase> clonedTodo = new ArrayList<>();
        for (TodoBase todo : todos) {
            clonedTodo.add((TodoBase) todo.clone());
        }

        return new ArrayList<>(todos);

    }


}
