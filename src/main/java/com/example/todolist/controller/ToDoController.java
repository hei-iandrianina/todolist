package com.example.todolist.controller;

import com.example.todolist.model.ToDo;
import com.example.todolist.repository.ToDoRepository;
import com.example.todolist.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ToDoController {
    @Autowired
    ToDoService service;
    @GetMapping("/")
    public static String hello(){
        return "Hello Joe";
    }
    @GetMapping("/todo/{id}")
    public ToDo getToDobyId(@PathVariable("id") Long pk){
        return service.getToDoById(pk);
    }

    @GetMapping("/todo")
    public List<ToDo> getAllToDo(){
        return service.getAllToDo();
    }

    @PostMapping("/todo")
    public ToDo createToDo(@RequestBody ToDo newTodo){
        return service.createToDo(newTodo);
    };

    @DeleteMapping("/todo/{id}")
    public void deleteToDo(@PathVariable("id") Long pk){
        service.deleteToDo(pk);
    }

    @PutMapping("/todo/{id}")
    public ToDo updateTodo(@PathVariable("id") Long pk, @RequestBody ToDo updated){
        return service.updateToDo(pk, updated);
    }
}
