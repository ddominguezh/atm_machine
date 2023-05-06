package com.codurance.katalyst;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MoneyTypeTest {
    
    @Test
    public void get_type_money_when_quantity_is_one(){
        assertEquals("bill", MoneyType.BILL.by(1));
    }

}
