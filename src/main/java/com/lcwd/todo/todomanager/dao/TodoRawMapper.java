//package com.lcwd.todo.todomanager.dao;
//
//import com.lcwd.todo.todomanager.model.Todo;
//import org.springframework.jdbc.core.RowMapper;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//public class TodoRawMapper implements RowMapper<Todo> {
//    @Override
//    public Todo mapRow(ResultSet rs, int rowNum) throws SQLException {
//
//        Todo todo1 = new Todo();
//        todo1.setId(rs.getInt("id"));
//        todo1.setName(rs.getString("name"));
//        todo1.setContent(rs.getString("content"));
//        todo1.setStatus(rs.getString("status"));
//        return todo1;
//    }
//}
