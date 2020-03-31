package com.example.demo.command;

import org.springframework.stereotype.Component;

@Component
public class Dummy {
    
    public int square(int i) {
        return i * i;
    }
}
