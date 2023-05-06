package com.codurance.katalyst;

public class Money {

    private int quantity;
    private MoneyValue value;
    protected Money(int quantity, MoneyValue value){
        this.quantity = quantity;
        this.value = value;
    }
    public static Money create(int quantity, MoneyValue value) {
        return new Money(quantity, value);
    }
    
}
