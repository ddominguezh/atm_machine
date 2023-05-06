package com.codurance.katalyst;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConsoleScreenTest {
    
    private ByteArrayOutputStream outputStream;

    @BeforeEach
    public void setUp(){
        this.outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(this.outputStream));
    }

    @Test
    public void write_line(){
        ConsoleScreen screen = new ConsoleScreen();
        screen.write("2 bills of 200.");
        assertEquals("2 bills of 200.", this.outputStream.toString());
    }
    
}
