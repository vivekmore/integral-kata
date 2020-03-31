package com.example.demo.command;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

import com.example.demo.domain.User;

@ShellComponent
public class PostCommand {
    
    @ShellMethod
    public String postMessage(User user, String message) {
        return "done";
    }
}
