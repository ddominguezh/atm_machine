package com.codurance.katalyst;

import java.util.ArrayList;
import java.util.List;

public class DistributionOfMoneyMother {
    
    public static DistributionOfMoney create(){
        List<Money> money = new ArrayList<Money>(){
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
        return new DistributionOfMoney(money);
    }
}
