package com.codurance.katalyst;

import java.util.List;

public class DistributionOfMoney {

    private List<Money> money;
    public DistributionOfMoney(List<Money> money) {
        this.money = money;
    }
    public boolean contains(int quantity, MoneyValue value) {
        return money.stream().filter(money -> money.equals(value) && money.quantity() >= quantity).findAny().isPresent();
    }
    
}
