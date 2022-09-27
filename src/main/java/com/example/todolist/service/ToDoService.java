package com.example.todolist.service;

import com.example.todolist.model.ToDo;
import com.example.todolist.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ToDoService {
    @Autowired
    ToDoRepository repository;
    public ToDo getToDoById(Long pk){
        return repository.getToDoById(pk);
    }
    public List<ToDo> getAllToDo(){
        return repository.findAll();
    }
    public ToDo createToDo(ToDo newTodo){
        return repository.save(newTodo);
    }
    public void deleteToDo(Long pk){
        repository.deleteById(pk);
    }
    public ToDo updateToDo(Long pk, ToDo updated){
        ToDo toUpdate = repository.getToDoById(pk);
        toUpdate.setRef(updated.getRef());
        return toUpdate;
    }
}
