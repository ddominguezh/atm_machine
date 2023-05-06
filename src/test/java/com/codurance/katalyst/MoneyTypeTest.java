package com.codurance.katalyst;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MoneyTypeTest {
    
    @Test
    public void get_singular_bill(){
        assertEquals("bill", MoneyType.BILL.by(1));
    }
}
