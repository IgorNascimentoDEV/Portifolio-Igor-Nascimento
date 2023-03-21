package com.todo.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todo.todolist.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{

}
