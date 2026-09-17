package com.example.todo_api.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.todo_api.model.TodoModel1;
public interface TodoRepository extends JpaRepository<TodoModel1,Long>{
    

}
