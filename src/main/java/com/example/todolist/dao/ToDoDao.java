package com.example.todolist.dao;

import com.example.todolist.ds.ToDo;
import org.springframework.data.repository.CrudRepository;

public interface ToDoDao extends CrudRepository<ToDo,Integer> {
}
