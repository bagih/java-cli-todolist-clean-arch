package com.bagih.todolist.service;

import com.bagih.todolist.entity.Todo;

import java.util.List;

public interface TodoService {
    void getAllTodos();

    void addTodo(String todo);

    void removeTodo(int id);

    void getTodoById(int id);
}
