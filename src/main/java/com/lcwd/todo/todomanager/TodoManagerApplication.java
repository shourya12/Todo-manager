package com.lcwd.todo.todomanager;

//import com.lcwd.todo.todomanager.dao.todoDao;
import com.lcwd.todo.todomanager.model.Todo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@SpringBootApplication
public class TodoManagerApplication  {

	//@Autowired
	//private todoDao tododao;
	//Logger logger= LoggerFactory.getLogger(TodoManagerApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(TodoManagerApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		//JdbcTemplate jdbcTemplate= tododao.getJdbcTemplate();
//		//logger.info(String.valueOf(jdbcTemplate));
////		Todo todo = new Todo();
////		todo.setId(124);
////		todo.setName("Bhupendra");
////		todo.setContent("hi my name is Bhupendra");
////		todo.setStatus("InActive");
////		tododao.saveTodo(todo);
//
////		Todo t= tododao.getTodoById(123);
//
////		List<Todo> t =tododao.getAllTodo();
////		for(int i=0;i<t.size();i++)
////		{
////			System.out.println(t.get(i));
////		}
////		Todo to= new Todo();
////		to.setId(456);
////		to.setName("priya");
////		to.setContent("hi my name is priya");
////		to.setStatus("Active");
////
////		Todo td=tododao.updateTodoById(123,to);
////		String respose=tododao.deleteTodoById(124);
////		System.out.println(respose);
//		//System.out.println(t);
//	}
}
