package com.example.todolist.controller;

import com.example.todolist.dao.ToDoDao;
import com.example.todolist.ds.ToDo;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@ToString
public class ToDoController {

    @Autowired
    private ToDoDao toDoDao;

    @RequestMapping("/")
    public String listToDo(Model model){
        model.addAttribute("todos",toDoDao.findAll());
        model.addAttribute("todo",new ToDo());
        return "index";
    }

    @PostMapping("/save-todo")
    public String saveToDo(ToDo todo){
        toDoDao.save(todo);
        return "redirect:/";

    }

}
