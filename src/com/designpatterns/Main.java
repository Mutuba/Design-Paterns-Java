package com.designpatterns;

import com.designpatterns.momento.Editor;
import com.designpatterns.momento.History;

import java.util.Arrays;

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
        editor.setContent("b");
        history.push(editor.createState());
        editor.setContent("c");
        // currently b is the ladt item in history hence it will be pooped out and set as current editor state
        editor.restore(history.pop());
        System.out.println("Current editor state " + editor.getContent());

        var states = history.getStates();
        for (int i=0;i<states.size(); i++){
            System.out.println("History " + states.get(i).getContent());
        }


    }
    public static TaxCalculator getCalculator(){
        return new TaxCalculator2019();
    }
}
