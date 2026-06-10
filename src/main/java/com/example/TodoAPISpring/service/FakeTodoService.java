package com.example.TodoAPISpring.service;


import org.springframework.stereotype.Service;

@Service  /*IoC - we handed over our responsibility of creating objects to spring,
it initializes and manages objects which are called beans by means of
IoC containers - BeanFactory and applicationContext
*/
public class FakeTodoService implements TodoService{
    @Override
    public String doSomething() {
        return "something";
    }
}
