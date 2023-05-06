package com.codurance.katalyst;

import java.util.ArrayList;
import java.util.List;

public class MoneyCalculator {
    
    List<Money> breakdown(int quantity){
        return new ArrayList<Money>(){
            {
                add(Money.create(1, MoneyValue.ONE));
            }
        };
    }
}
