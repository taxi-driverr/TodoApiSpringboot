package com.example.TodoAPISpring;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/*
* as spring executes our code, annotations in spring are to indicate spring
* which code to execute,
* example : @GetMapping - if a get request comes execute this.
* what is the use case of code,
* example : @RestController - this class acts as a controller.
* where to find data,
* example : @RequestBody - the data comes in body of http request,
* @PathVariable - the data comes as url param
* what to do,
* example - @ResponseBody - return the data in http response body.
* */

@RestController
@RequestMapping("/api/v1/todos")
public class TodoController {
    private static List<Todo> todoList;

    public TodoController(){
        todoList = new ArrayList<>();
        todoList.add(new Todo(1, false, "todo 1", 1));
        todoList.add(new Todo(2, false, "todo 2", 2));
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Todo> getTodoList(){
        return todoList;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Todo createTodoList(@RequestBody Todo newTodo){
        todoList.add(newTodo);
        return newTodo;
    }
/*
instead of ResponseStatus annotation we can use ResponseEntity class to
return the http status code along with data in the body.
*/
    @GetMapping("/{todoId}")
    public ResponseEntity<Todo> getTodoList(@PathVariable int todoId){
        for(Todo toDo : todoList) {
            if (toDo.getId() == todoId)
                return ResponseEntity.status(HttpStatus.OK).body(toDo);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}
