package com.codurance.katalyst;

import java.util.ArrayList;
import java.util.List;

public class MoneyCalculator {
    
    List<Money> breakdown(int quantity){
        ArrayList<Money> breakdown = new ArrayList<Money>();
        if(quantity == 1){
            breakdown.add(Money.create(1, MoneyValue.ONE));
        }
        if(quantity == 2){
            breakdown.add(Money.create(1, MoneyValue.TWO));
        }
        return breakdown;
    }
}
