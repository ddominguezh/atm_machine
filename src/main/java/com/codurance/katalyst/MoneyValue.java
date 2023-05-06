package com.codurance.katalyst;

public enum MoneyValue {
    FIVE_HUNDRED(500, MoneyType.BILL);
    private int amount;
    private MoneyType type;
    MoneyValue(int amount, MoneyType type){
        this.amount = amount;
        this.type = type;
    }
    public int amount(){
        return this.amount;
    }
    public String toString(int quantity){
        return quantity + " " + this.type.by(quantity) + " of " + this.amount;
    }
}
