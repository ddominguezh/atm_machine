package com.codurance.katalyst;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoneyCalculator {
    
    List<Money> breakdown(int quantity){
        ArrayList<Money> breakdown = new ArrayList<Money>();
        Arrays.asList(MoneyValue.values()).forEach(money ->{
            if(money.amount() == quantity){
                breakdown.add(Money.create(1, money));
            }
        });
        return breakdown;
    }
}
