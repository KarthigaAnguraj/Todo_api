package com.example.todo_api.service;

import org.springframework.stereotype.Service;

import com.example.todo_api.model.TodoModel1;
import com.example.todo_api.repo.TodoRepository;
import java.util.List;
@Service 
public class Todoserviceimplement implements TodoService {

    private TodoRepository todoRepo;

    public Todoserviceimplement(TodoRepository todoRepo) {
        this.todoRepo = todoRepo;
    }
    
    public TodoModel1 createTodo(TodoModel1 task)
    {
        return todoRepo.save(task);
    }
   
    public List<TodoModel1> getAllTodo(){
        return todoRepo.findAll();
    }
    @Override 
   public TodoModel1 updateTodo(Long id, TodoModel1 task) {

    TodoModel1 exTodo = todoRepo.findById(id).orElse(null);

    if (exTodo == null) {
        return null;
    }

    exTodo.setTask(task.getTask());

    return todoRepo.save(exTodo);
}
    @Override 
    public void deleteTodo(Long id)
    {
       todoRepo.deleteById(id);
         
    }

}