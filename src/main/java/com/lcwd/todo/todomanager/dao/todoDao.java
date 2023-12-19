//package com.lcwd.todo.todomanager.dao;
//
//
//
//
//import com.lcwd.todo.todomanager.model.Todo;
//import com.lcwd.todo.todomanager.services.todoServiceImp;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Component;
//
//import java.util.*;
//
//@Component
//public class todoDao{
//
//
//    private JdbcTemplate jdbcTemplate;
//
//    public todoDao(@Autowired JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//
//        String query="create table if not exists todo(id int(9),name varchar(50),content varchar(50),status varchar(50))";
//        int val=jdbcTemplate.update(query);
//        System.out.println(val);
//    }
//
//    public JdbcTemplate getJdbcTemplate() {
//        return jdbcTemplate;
//    }
//
//
//
//
//
//    public Todo saveTodo(Todo todo)
//    {
//        String query="insert into todo(id,name,content,status) values(?,?,?,?)";
//        int val=jdbcTemplate.update(query, todo.getId(),todo.getName(),todo.getContent(),todo.getStatus());
//        System.out.print(val);
//
//            return todo;
//    }
//
//    public Todo getTodoById(int id)
//    {
//        String query="select * from todo where id=?";
//        //Map<String, Object> todo =jdbcTemplate.queryForMap(query,id);
//
//        Todo todo=jdbcTemplate.queryForObject(query,new TodoRawMapper(),id);
//
////        Todo todo1 = new Todo();
////        todo1.setId((int)todo.get("id"));
////        todo1.setName((String) todo.get("name"));
////        todo1.setContent((String) todo.get("content"));
////        todo1.setStatus((String) todo.get("status"));
////
//        return todo;
//
//    }
//
//    public List<Todo> getAllTodo()
//    {
//        String query="select * from todo";
//        List<Todo> t=jdbcTemplate.query(query,new TodoRawMapper());
//
//        return t;
//    }
//
//    public Todo updateTodoById(int id,Todo todo)
//    {
//        String query="update todo set id=?,name=?,content=?,status=? where id=?";
//        jdbcTemplate.update(query,todo.getId(),todo.getName(),todo.getContent(),todo.getStatus(),id);
//        String query1="select * from todo where id=?";
//        Map<String,Object> map=jdbcTemplate.queryForMap(query1,todo.getId());
//        Todo todo1=new Todo();
//        todo1.setId((int) map.get("id"));
//        todo1.setName((String) map.get("name"));
//        todo1.setContent((String) map.get("content"));
//        todo1.setStatus((String) map.get("status"));
//
//        return todo1;
//
//    }
//
//    public String deleteTodoById(int id)
//    {
//        String query="delete from todo where id=?";
//        int val=jdbcTemplate.update(query,id);
//        return "Deleted.....";
//    }
//
//
//}
