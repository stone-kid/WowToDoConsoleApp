package com.company;

public class AddTodoExecutor implements TodoExecutor{

    @Override
    public boolean Execute(TodoBase todo, ToDoRepository repo) {
        return repo.AddTodo(todo);

    }

}
