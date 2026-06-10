package com.example.TodoAPISpring.service;

import org.springframework.stereotype.Service;

@Service("anotherTodoService")
public class AnotherTodoService implements TodoService{
    @Override
    public String doSomething() {
        return "another";
    }
}
