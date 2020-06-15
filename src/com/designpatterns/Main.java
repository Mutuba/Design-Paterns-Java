package com.designpatterns;

import com.designpatterns.momento.Editor;
import com.designpatterns.momento.History;

public class Main {

    public static void main(String[] args) throws Exception {
        TaxCalculator calculator = getCalculator();
        calculator.calculateTax();
        var account = new Account();
        account.deposit(50);
//       float bal= account.getBalance();
//       System.out.println("This is the balance " + bal);
        var editor = new Editor();
        var history = new History();
        editor.setContent("a");
        history.push(editor.createState());
    }

    public static TaxCalculator getCalculator(){
        return new TaxCalculator2019();
    }
}
