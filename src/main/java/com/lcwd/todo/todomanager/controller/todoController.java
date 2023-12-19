package com.lcwd.todo.todomanager.controller;

import com.lcwd.todo.todomanager.model.Todo;
import com.lcwd.todo.todomanager.services.todoServicesImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/todos")
public class todoController {
    Logger logger= LoggerFactory.getLogger(todoController.class);
    @Autowired
    todoServicesImpl todoservices;

    Random random  = new Random();

    @PostMapping("/save")
    public void saveTodo(@RequestBody Todo todo)
    {
        todoservices.save(todo);

    }
    @GetMapping("/all")
    public ResponseEntity<List<Todo>> getTodo()
    {

        List<Todo> todo1=todoservices.getAllTodo();

        return new ResponseEntity<>(todo1,CREATED);
    }

    @GetMapping("/{todoId}")
    public ResponseEntity<Todo> getTodoById(@PathVariable("todoId") int id)
    {
        Todo todo1= null;
        try {
            todo1 = todoservices.getTodoId(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return new ResponseEntity<>(todo1,OK);
    }

    @PutMapping("/{newId}")
    public void updateTodo(@RequestBody Todo newTodo,@PathVariable("newId") int id)
    {
           todoservices.updateTodosById(id,newTodo);

    }

    @DeleteMapping("/{Id}")
    public void delete(@PathVariable("Id") int id)
    {
               todoservices.deleteTodos(id);

    }
}
