package com.codurance.katalyst;

import java.util.List;

public class ATM {

    Screen screen;
    public ATM(Screen screen){
        this.screen = screen;
    }

    public void withdraw(int quantity) {
        List<Money> draw = new MoneyCalculator(quantity).breakdown();
        draw.forEach(money -> this.screen.write(money.toString()));
    }
    
}
