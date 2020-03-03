package me.sahar.todotdd.service;

import me.sahar.todotdd.entity.ToDo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ToDoService {

    public List<ToDo> findAll() {
        return new ArrayList<>();
    }
}
