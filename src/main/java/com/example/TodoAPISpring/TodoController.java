package com.example.TodoAPISpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoController {
    private static List<Todo> todoList;

    public TodoController(){
        todoList = new ArrayList<>();
        todoList.add(new Todo(1, false, "todo 1", 1));
        todoList.add(new Todo(2, false, "todo 2", 2));
    }

    @GetMapping("/todos")
    public List<Todo> getTodoList(){
        return todoList;
    }
}
