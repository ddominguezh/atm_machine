package com.codurance.katalyst;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class MoneyCalculatorTest {
    
    @Test
    public void get_money_when_quantity_is_one(){
        List<Money> moneys = new MoneyCalculator().breakdown(1);
        assertEquals(1, moneys.size());
        assertEquals("1 coin of 1", moneys.get(0).toString());
    }
}
