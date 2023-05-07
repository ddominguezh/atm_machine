package com.codurance.katalyst;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoneyCalculator {
    
    private int quantity;
    private DistributionOfMoney distribution;
    
    public MoneyCalculator(int quantity, DistributionOfMoney distribution){
        this.quantity = quantity;
        this.distribution = distribution;
    }
    List<Money> breakdown(){
        ArrayList<Money> breakdown = new ArrayList<Money>();
        Arrays.asList(MoneyValue.values()).forEach(money ->{
            int maxQuantity = quantity / money.amount();
            if(maxQuantity > 0){
                if(!distribution.contains(maxQuantity, money)){
                    maxQuantity = distribution.quantity(money);
                }
                if(maxQuantity > 0){
                    breakdown.add(Money.create(maxQuantity, money));
                    quantity = quantity - (maxQuantity * money.amount());
                    distribution.withdraw(maxQuantity, money);
                }
            }
        });
        if(quantity > 0){
            throw new InsufficientMoneyException();
        }
        return breakdown;
    }
}
