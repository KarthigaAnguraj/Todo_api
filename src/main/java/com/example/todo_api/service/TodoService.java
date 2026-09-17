package com.example.todo_api.service;
import com.example.todo_api.model.TodoModel1;
import java.util.List;
public interface TodoService {
    public TodoModel1 createTodo(TodoModel1 task);
    List<TodoModel1> getAllTodo();
    public TodoModel1 updateTodo(Long id,TodoModel1 task);
    public void deleteTodo(Long id);

}
