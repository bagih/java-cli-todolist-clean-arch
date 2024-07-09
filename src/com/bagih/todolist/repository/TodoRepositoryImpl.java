package com.bagih.todolist.repository;

import com.bagih.todolist.entity.Todo;

import java.util.ArrayList;
import java.util.List;

public class TodoRepositoryImpl implements TodoRepostory{

    public static List<Todo> todos = new ArrayList<>();

    @Override
    public List<Todo> getAllTodo() {
        return todos;
    }

    @Override
    public Todo getTodoById(int id) {
        try{
            return todos.get(id);
        } catch (Exception e){
            return null;
        }
    }

    @Override
    public boolean addTodo(Todo todo) {
        return todos.add(todo);
    }

    @Override
    public boolean removeTodo(int index) {
        try{
            todos.remove(index);
            return true;
        } catch (Exception e){
            return false;
        }
    }
}
