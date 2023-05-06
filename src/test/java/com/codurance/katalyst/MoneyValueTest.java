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

    @Test
    public void configure_two_hundred_bill(){
        assertEquals(200, MoneyValue.TWO_HUNDRED.amount());
        assertEquals("1 bill of 200", MoneyValue.TWO_HUNDRED.toString(1));
        assertEquals("2 bills of 200", MoneyValue.TWO_HUNDRED.toString(2));
    }

    @Test
    public void configure_one_hundred_bill(){
        assertEquals(100, MoneyValue.ONE_HUNDRED.amount());
        assertEquals("1 bill of 100", MoneyValue.ONE_HUNDRED.toString(1));
        assertEquals("2 bills of 100", MoneyValue.ONE_HUNDRED.toString(2));
    }

    @Test
    public void configure_fifty_bill(){
        assertEquals(50, MoneyValue.FIFTY.amount());
        assertEquals("1 bill of 50", MoneyValue.FIFTY.toString(1));
        assertEquals("2 bills of 50", MoneyValue.FIFTY.toString(2));
    }

    @Test
    public void configure_twenty_bill(){
        assertEquals(20, MoneyValue.TWENTY.amount());
        assertEquals("1 bill of 20", MoneyValue.TWENTY.toString(1));
        assertEquals("2 bills of 20", MoneyValue.TWENTY.toString(2));
    }

    @Test
    public void configure_ten_bill(){
        assertEquals(10, MoneyValue.TEN.amount());
        assertEquals("1 bill of 10", MoneyValue.TEN.toString(1));
        assertEquals("2 bills of 10", MoneyValue.TEN.toString(2));
    }

    @Test
    public void configure_five_bill(){
        assertEquals(5, MoneyValue.FIVE.amount());
        assertEquals("1 bill of 5", MoneyValue.FIVE.toString(1));
        assertEquals("2 bills of 5", MoneyValue.FIVE.toString(2));
    }

    @Test
    public void configure_two_coin(){
        assertEquals(2, MoneyValue.TWO.amount());
        assertEquals("1 coin of 2", MoneyValue.TWO.toString(1));
        assertEquals("2 coins of 2", MoneyValue.TWO.toString(2));
    }

    @Test
    public void configure_one_coin(){
        assertEquals(1, MoneyValue.ONE.amount());
        assertEquals("1 coin of 1", MoneyValue.ONE.toString(1));
        assertEquals("2 coins of 1", MoneyValue.ONE.toString(2));
    }
}
