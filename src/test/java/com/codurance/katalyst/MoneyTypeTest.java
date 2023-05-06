package com.codurance.katalyst;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Random;

import org.junit.jupiter.api.Test;

public class MoneyTypeTest {
    
    @Test
    public void get_type_money_when_quantity_is_one(){
        assertEquals("bill", MoneyType.BILL.by(1));
        assertEquals("coin", MoneyType.COIN.by(1));
    }

    @Test
    public void get_type_money_when_quantity_is_greater_that_one(){
        assertEquals("bills", MoneyType.BILL.by(new Random().nextInt() + 2));
        assertEquals("coins", MoneyType.COIN.by(new Random().nextInt() + 2));
    }
}
