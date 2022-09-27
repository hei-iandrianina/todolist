package com.example.todolist.repository;

import com.example.todolist.model.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ToDoRepository extends JpaRepository<ToDo, Long> {
    ToDo getToDoById(Long pk);
    List<ToDo> findAll();
    void deleteById(Long pk);

}
