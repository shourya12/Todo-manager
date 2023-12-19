package com.lcwd.todo.todomanager.services;

import com.lcwd.todo.todomanager.model.Todo;

import java.util.ArrayList;
import java.util.List;

public interface todoServiceImp {

    public void save(Todo todo);
    public List<Todo> getAllTodo();
    public Todo getTodoId(int id);
    public void updateTodosById(int id,Todo newTodo);

    public void deleteTodos(int id);
}
