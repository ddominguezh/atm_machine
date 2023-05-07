package com.codurance.katalyst;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DistributionOfMoneyTest {
    
    private DistributionOfMoney distribution;

    @BeforeEach
    public void setUp(){
        distribution = DistributionOfMoneyMother.create();
    }

    @Test
    public void contains_enough_money(){
        assertTrue(this.distribution.contains(2, MoneyValue.TWO_HUNDRED));
    }

    @Test
    public void not_contains_enough_money(){
        assertFalse(this.distribution.contains(501, MoneyValue.ONE));
    }

    @Test
    public void with_draw_money(){
        assertTrue(this.distribution.contains(3, MoneyValue.TWO_HUNDRED));
        this.distribution.withdraw(1, MoneyValue.TWO_HUNDRED);
        assertFalse(this.distribution.contains(3, MoneyValue.TWO_HUNDRED));
        assertTrue(this.distribution.contains(2, MoneyValue.TWO_HUNDRED));
        this.distribution.withdraw(1, MoneyValue.TWO_HUNDRED);
        assertFalse(this.distribution.contains(2, MoneyValue.TWO_HUNDRED));
        assertTrue(this.distribution.contains(1, MoneyValue.TWO_HUNDRED));
        this.distribution.withdraw(1, MoneyValue.TWO_HUNDRED);
        assertFalse(this.distribution.contains(1, MoneyValue.TWO_HUNDRED));
    }

    @Test
    public void get_quantity(){
        assertEquals(3, this.distribution.quantity(MoneyValue.TWO_HUNDRED));
        this.distribution.withdraw(3, MoneyValue.TWO_HUNDRED);
        assertEquals(0, this.distribution.quantity(MoneyValue.TWO_HUNDRED));
    }
}
