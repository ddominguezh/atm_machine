package com.codurance.katalyst;

public enum MoneyType {
    BILL("bill", "bills"),
    COIN("coin", "coins");
    private String singular;
    private String plural;
    MoneyType(String singular, String plural){
        this.singular = singular;
        this.plural = plural;
    }
    public String by(int quantity) {
        assert(quantity >= 1);
        if(quantity == 1){
            return this.singular;
        }
        return this.plural;
    }

}
