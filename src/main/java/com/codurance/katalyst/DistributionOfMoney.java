package com.codurance.katalyst;

import java.util.List;
import java.util.Optional;

public class DistributionOfMoney {

    private List<Money> money;
    public DistributionOfMoney(List<Money> money) {
        this.money = money;
    }
    public boolean contains(int quantity, MoneyValue value) {
        return money.stream().filter(money -> money.equals(value) && money.quantity() >= quantity).findAny().isPresent();
    }
    public void withdraw(int quantity, MoneyValue value) {
        if(this.contains(quantity, value)){
            Optional<Money> actual = money.stream().filter(money -> money.equals(value)).findFirst();
            if(actual.isPresent()){
                this.money.remove(actual.get());
                this.money.add(Money.create(actual.get().quantity() - quantity, actual.get().value()));
            }
        }
    }
    public int quantity(MoneyValue value){
        Optional<Money> actual = money.stream().filter(money -> money.equals(value)).findFirst();
        if(actual.isPresent()){
            return actual.get().quantity();
        }
        return 0;
    }
}
