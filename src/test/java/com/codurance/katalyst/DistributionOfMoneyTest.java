package com.codurance.katalyst;

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
        List<Money> money = new ArrayList<>(){
            {
               add(Money.create(2, MoneyValue.FIVE_HUNDRED));
               add(Money.create(3, MoneyValue.TWO_HUNDRED));
               add(Money.create(5, MoneyValue.ONE_HUNDRED));
               add(Money.create(12, MoneyValue.FIFTY));
               add(Money.create(20, MoneyValue.TWENTY));
               add(Money.create(50, MoneyValue.TEN));
               add(Money.create(100, MoneyValue.FIVE));
               add(Money.create(250, MoneyValue.TWO));
               add(Money.create(500, MoneyValue.ONE));
            }
        };
        distribution = new DistributionOfMoney(money);
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
}
