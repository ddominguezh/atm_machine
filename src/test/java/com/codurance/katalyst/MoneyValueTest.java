package com.codurance.katalyst;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MoneyValueTest {
    
    @Test
    public void configure_five_hundred_bill(){
        assertEquals(500, MoneyValue.FIVE_HUNDRED.amount());
        assertEquals("1 bill of 500", MoneyValue.FIVE_HUNDRED.toString(1));
        assertEquals("2 bills of 500", MoneyValue.FIVE_HUNDRED.toString(2));
    }
}
