package com.designpatterns;

public class Main {

    public static void main(String[] args) throws Exception {
        TaxCalculator calculator = getCalculator();
        calculator.calculateTax();
        var account = new Account();
        account.deposit(50);
       float bal= account.getBalance();
       System.out.println("This is the balance " + bal);
    }

    public static TaxCalculator getCalculator(){
        return new TaxCalculator2019();
    }
}
