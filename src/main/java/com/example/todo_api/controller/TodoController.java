package com.example.todo_api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.todo_api.model.TodoModel1;
import com.example.todo_api.service.TodoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController 
//https://localhost:8080/todos
@RequestMapping ("/todos")
public  class TodoController {
    private TodoService todoSer;

    public TodoController(TodoService todoSer)
    {
        this.todoSer=todoSer;
    }
    //https://localhost:8080/todos/createTodo
    @PostMapping("/createTodo")
    public TodoModel1 createTodo(@RequestBody TodoModel1 task)
    {
        return todoSer.createTodo(task);
    }
    @GetMapping("/getTodo")
   public List<TodoModel1> getAllTodo(){
        return todoSer.getAllTodo();
    }
    @PutMapping("/updateTodo/{id}")
    public TodoModel1 updateTodo(@PathVariable Long id,@RequestBody TodoModel1 task)
    {
        return todoSer.updateTodo(id, task);
    }
@DeleteMapping ("/deleteTodo/{id}")
    public String deleteTodo(@PathVariable Long id)
    {
        todoSer.deleteTodo(id);
        return "ur task has been deleted";
    }
    
}
