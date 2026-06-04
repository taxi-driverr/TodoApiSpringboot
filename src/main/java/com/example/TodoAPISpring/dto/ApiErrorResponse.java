package com.example.TodoAPISpring.dto;
/*
* DTO stands for Data Transfer Object. It is a design pattern used
* to create simple Java classes
* meant solely for carrying data between processes or over a network.
* */
public class ApiErrorResponse {
    private String message;
    public ApiErrorResponse(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
