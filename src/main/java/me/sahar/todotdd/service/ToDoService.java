package me.sahar.todotdd.service;

import me.sahar.todotdd.entity.ToDo;
import me.sahar.todotdd.repository.ToDoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ToDoService {
    private ToDoRepository toDoRepository;

    public ToDoService(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    public List<ToDo> findAll() {
        return toDoRepository.findAll();
    }

    public ToDo save(ToDo toDo) {
        return toDoRepository.save(toDo);
    }
}
