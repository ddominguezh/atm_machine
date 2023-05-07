package com.codurance.katalyst;

import java.util.List;

public class ATM {

    private DistributionOfMoney distribution;
    private Screen screen;
    public ATM(Screen screen, DistributionOfMoney distribution){
        this.screen = screen;
        this.distribution = distribution;
    }

    public void withdraw(int quantity) {
        List<Money> draw = new MoneyCalculator(quantity, this.distribution).breakdown();
        draw.forEach(money -> this.screen.write(money.toString() + "\n"));
    }
    
}
