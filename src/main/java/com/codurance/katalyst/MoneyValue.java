package com.codurance.katalyst;

public enum MoneyValue {
    FIVE_HUNDRED(500, MoneyType.BILL),
    TWO_HUNDRED(200, MoneyType.BILL),
    ONE_HUNDRED(100, MoneyType.BILL),
    FIFTY(50, MoneyType.BILL),
    TWENTY(20, MoneyType.BILL),
    TEN(10, MoneyType.BILL),
    FIVE(5, MoneyType.BILL),
    TWO(2, MoneyType.COIN),
    ONE(1, MoneyType.COIN);
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
        return quantity + " " + this.type.by(quantity) + " of " + this.amount + ".";
    }
}
