package com.lcwd.todo.todomanager.repositories;

import com.lcwd.todo.todomanager.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface todoRepository extends JpaRepository<Todo,Integer> {
}
