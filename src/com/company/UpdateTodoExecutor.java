package com.company;

public class UpdateTodoExecutor implements TodoExecutor{

    @Override
    public boolean Execute(TodoBase todo, ToDoRepository repo) {
         repo.UpdateTodo(todo);

         return true;
    }
}
