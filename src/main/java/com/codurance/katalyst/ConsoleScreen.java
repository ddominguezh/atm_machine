package com.codurance.katalyst;

public class ConsoleScreen implements Screen {

    @Override
    public void write(String value) {
        System.out.print(value);
    }
    
}
