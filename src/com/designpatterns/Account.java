package com.designpatterns;

public class Account {
    private float balance;

    public void deposit(float amount) throws Exception{
        if(amount>0)
            balance+=amount;
        else
            throw new Exception("Account balanca cannot be zero.");
    }

    public void withdraw(float amount){
       balance-=amount;
    }

    public float getBalance(){
        return balance;
    }
}
