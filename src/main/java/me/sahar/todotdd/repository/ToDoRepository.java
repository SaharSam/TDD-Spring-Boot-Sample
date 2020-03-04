package me.sahar.todotdd.repository;

import me.sahar.todotdd.entity.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("toDoRepository")
public interface ToDoRepository extends JpaRepository<ToDo, Long> {

}