package com.lcwd.todo.todomanager.services;

//import com.lcwd.todo.todomanager.dao.todoDao;
import com.lcwd.todo.todomanager.model.Todo;
import com.lcwd.todo.todomanager.repositories.todoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class todoServicesImpl implements todoServiceImp{

    @Autowired
    todoRepository todorepository;

    public void save(Todo todo)
    {
        todorepository.save(todo);
    }
    @Override
    public List<Todo> getAllTodo() {

        List<Todo> todos=todorepository.findAll();
        return todos;
    }

    @Override
    public Todo getTodoId(int id) {
         Todo todo=todorepository.findById(id).orElseThrow(()->new RuntimeException("User with Id not found"));
         return todo;
    }

    @Override
    public void updateTodosById(int id,Todo newTodo) {
        Todo todo=todorepository.findById(id).orElseThrow(()-> new RuntimeException("User with id not find"));
        newTodo.setId(todo.getId());
        newTodo.setName(todo.getName());
        newTodo.setStatus(todo.getStatus());
        newTodo.setContent(todo.getContent());

        todorepository.save(todo);
    }

    @Override
    public void deleteTodos(int id) {
        todorepository.findById(id);

    }
}
