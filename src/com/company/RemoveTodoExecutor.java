package com.company;

public class RemoveTodoExecutor implements TodoExecutor{

    @Override
    public boolean Execute(TodoBase todo, ToDoRepository repo) {
        return repo.RemoveTodo(todo);

    }

}
