package com.codurance.katalyst;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class MoneyCalculatorTest {
    
    @Test
    public void get_breakdown_when_quantity_is_one(){
        List<Money> breakdown = new MoneyCalculator().breakdown(1);
        assertEquals(1, breakdown.size());
        assertEquals("1 coin of 1", breakdown.get(0).toString());
    }
}
