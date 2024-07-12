package org.example;

import org.example.service.TodoService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter printWriter = new PrintWriter(System.out);
        TodoService todoService = new TodoService();
        while (true) {
            String input = bufferedReader.readLine();
            String[] arr = input.split(" ");
            if (arr[0].equalsIgnoreCase("stop")) {
                break;
            } else if (arr[0].equalsIgnoreCase("create")) {
                todoService.create(arr[1]);
            } else if (arr[0].equalsIgnoreCase("read")) {
                printWriter.println(todoService.read(Integer.parseInt(arr[1])));
            } else if (arr[0].equalsIgnoreCase("update")) {
                todoService.update(arr[1], arr[2]);
            } else if (arr[0].equalsIgnoreCase("delete")) {
                todoService.delete(Integer.parseInt(arr[1]));
            }
        }
        bufferedReader.close();
        printWriter.close();
    }
}