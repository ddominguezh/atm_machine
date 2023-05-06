package com.codurance.katalyst;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class MoneyCalculatorTest {
    
    @Test
    public void get_breakdown_when_quantity_is_one(){
        List<Money> breakdown = new MoneyCalculator(1).breakdown();
        assertEquals(1, breakdown.size());
        assertEquals("1 coin of 1", breakdown.get(0).toString());
    }

    @Test
    public void get_breakdown_when_quantity_is_two(){
        List<Money> breakdown = new MoneyCalculator(2).breakdown();
        assertEquals(1, breakdown.size());
        assertEquals("1 coin of 2", breakdown.get(0).toString());
    }

    @Test
    public void get_breakdown_when_quantity_is_five(){
        List<Money> breakdown = new MoneyCalculator(5).breakdown();
        assertEquals(1, breakdown.size());
        assertEquals("1 bill of 5", breakdown.get(0).toString());
    }

    @Test
    public void get_breakdown_when_quantity_is_four(){
        List<Money> breakdown = new MoneyCalculator(4).breakdown();
        assertEquals(1, breakdown.size());
        assertEquals("2 coins of 2", breakdown.get(0).toString());
    }

    @Test
    public void get_breakdown_when_quantity_is_three(){
        List<Money> breakdown = new MoneyCalculator(3).breakdown();
        assertEquals(2, breakdown.size());
        assertEquals("1 coin of 2", breakdown.get(0).toString());
        assertEquals("1 coin of 1", breakdown.get(1).toString());
    }
}
