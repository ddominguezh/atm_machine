package com.codurance.katalyst;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ATMTest {

    private ByteArrayOutputStream outputStream;
    private DistributionOfMoney distribution;

    @BeforeEach
    public void setUp(){
        this.outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(this.outputStream));
        distribution = DistributionOfMoneyMother.create();
    }

    @Test
    public void withdraw_money_from_the_ATM(){
        ATM atm = new ATM(new ConsoleScreen(), this.distribution);
        atm.withdraw(434);

        StringBuffer expected = new StringBuffer();
        expected.append("2 bills of 200.\n");
        expected.append("1 bill of 20.\n");
        expected.append("1 bill of 10.\n");
        expected.append("2 coins of 2.\n");

        assertEquals(expected.toString(), this.outputStream.toString());
    }

    @Test
    public void withdraw_money_from_the_ATM_with_distribution_of_money(){
        ATM atm = new ATM(new ConsoleScreen(), this.distribution);
        atm.withdraw(1725);

        StringBuffer expected = new StringBuffer();
        expected.append("2 bills of 500.\n");
        expected.append("3 bills of 200.\n");
        expected.append("1 bill of 100.\n");
        expected.append("1 bill of 20.\n");
        expected.append("1 bill of 5.\n");

        atm.withdraw(1825);
        expected.append("4 bills of 100.\n");
        expected.append("12 bills of 50.\n");
        expected.append("19 bills of 20.\n");
        expected.append("44 bills of 10.\n");
        expected.append("1 bill of 5.\n");

        assertEquals(expected.toString(), this.outputStream.toString());
    }
}
