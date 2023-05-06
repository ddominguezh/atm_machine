package com.codurance.katalyst;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ATMTest {

    private ByteArrayOutputStream outputStream;

    @BeforeEach
    public void setUp(){
        this.outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(this.outputStream));
    }

    @Test
    public void withdraw_money_from_the_ATM(){
        ATM atm = new ATM(new ConsoleScreen());
        atm.withdraw(434);

        StringBuffer expected = new StringBuffer();
        expected.append("2 bills of 200.\n");
        expected.append("1 bill of 20.\n");
        expected.append("1 bill of 10.\n");
        expected.append("2 coins of 2.");

        assertEquals(expected.toString(), this.outputStream.toString());
    }
}
