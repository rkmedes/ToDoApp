package org.example.service;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
    List<String> todoList;

    public TodoService() {
        this.todoList = new ArrayList<>();
    }

    public void create(String input) {
        todoList.add(input);
    }

    public List<String> read(int numberOfElements) {
        if (numberOfElements < 0)
            return null;
        if (numberOfElements >= todoList.size()) {
            return todoList;
        }
        return todoList.subList(0, numberOfElements);
    }

    public void update(String from, String to) {
        todoList.remove(from);
        todoList.add(to);
    }

    public void delete(int input) {
        if (input < 0 || input >= todoList.size())
            return;
        todoList.remove(input);
    }
}
