package com.codurance.katalyst;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MoneyTest {
    
    @Test
    public void print_money_value(){
        Money money = Money.create(2, MoneyValue.FIVE_HUNDRED);
        assertEquals("2 bills of 500.", money.toString());
    }

    @Test
    public void money_equals_to_value(){
        assertTrue(Money.create(1, MoneyValue.ONE).equals(MoneyValue.ONE));
    }
}
