package com.todo.todolist.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.todo.todolist.model.Todo;
import com.todo.todolist.repository.TodoRepository;

@RestController
@RequestMapping("/api/todos")
public class TodoController {

	@Autowired
	private TodoRepository todoRepository;
	
	
	@PostMapping
	public Todo save(@RequestBody Todo todo) {
		return todoRepository.save(todo);
	}
	
	

	@GetMapping("{id}")
	public Todo getById(@PathVariable Long id) {
		return todoRepository
				.findById(id)
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
	}
}
