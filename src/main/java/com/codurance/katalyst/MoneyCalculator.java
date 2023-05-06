package com.codurance.katalyst;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoneyCalculator {
    
    private int quantity;
    public MoneyCalculator(int quantity){
        this.quantity = quantity;
    }
    List<Money> breakdown(){
        ArrayList<Money> breakdown = new ArrayList<Money>();
        Arrays.asList(MoneyValue.values()).forEach(money ->{
            if(quantity / money.amount() > 0){
                breakdown.add(Money.create(quantity / money.amount(), money));
                quantity = quantity % money.amount();
            }
        });
        return breakdown;
    }
}
