package com.codurance.katalyst;

public class InsufficientMoneyException extends RuntimeException {
    
    public InsufficientMoneyException(){
        super("The ATM machine has not enough money, please go to the nearest atm machine.");
    }
}
