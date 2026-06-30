package com.example.TodoAPISpring.service;

import com.example.TodoAPISpring.utils.TimeMonitor;
import org.springframework.stereotype.Service;

@Service("anotherTodoService")
public class AnotherTodoService implements TodoService{

    /*
    join point : point in a program(doSomething method) where a behavior/advice(Time Monitor) can be inserted
eg., method, field allocation, exception
     */
    @TimeMonitor
    @Override
    public String doSomething() {
        return "another";
    }
}
