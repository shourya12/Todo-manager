//package com.lcwd.todo.todomanager.services;
//
//import com.lcwd.todo.todomanager.model.Todo;
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Component
//public class todoServices implements todoServiceImp{
//    List<Todo> ar = new ArrayList<>();
//
//
//    @Override
//    public List<Todo> getAllTodo() {
//        return ar;
//    }
//
//    public Todo getTodoId(int id) {
//
//        for(Todo t:ar)
//        {
//            if(t.getId() ==id)
//            {
//                return t;
//            }
//        }
//
//        return null;
//    }
//
//    @Override
//    public Todo updateTodosById(int id, Todo newTodo) {
//        return null;
//    }
//
//
//    public Todo updateTodosById(Todo newTodo, int id) {
//        for(Todo t:ar)
//        {
//            if(t.getId()==id)
//            {
//                t.setId(newTodo.getId());
//                t.setName(newTodo.getName());
//                t.setContent(newTodo.getContent());
//                t.setStatus(newTodo.getStatus());
//                return t;
//            }
//        }
//
//        return null;
//    }
//
//    public String deleteTodos(int id) {
//
//        for(Todo t:ar)
//        {
//            if(t.getId()==id)
//            {
//                ar.remove(t);
//                return "";
//            }
//
//        }
//
//        return "";
//    }
//}
