package com.example.todo.controller;

import com.example.todo.model.Todo;
import com.example.todo.service.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// annotation is controller
// controller-to send the output in this class
// create todo, delete todo, update, fetch(crud opertion)
@RestController
@RequestMapping("/api/v1/todo-app")
public class TodoController {
    private final TodoService todoService;   // http://localhost:8080/api/v1/todo.app/find-all
    public TodoController(TodoService todoService){
        this.todoService=todoService;
    }

@PostMapping
    public void addTodo(@RequestBody Todo todo){

}
@GetMapping("")
    public Todo findTodoById(@PathVariable int id){
        return null;
}
@GetMapping("find-all")
    public List<Todo> findAllTodo(){   // controller is talking to the service layer
    return todoService.findAll();

}
@PutMapping
    public void updateTodo(@PathVariable int id, @RequestBody Todo todo){

}
@DeleteMapping
    public void deleteTodo(@PathVariable int id){

}
}





