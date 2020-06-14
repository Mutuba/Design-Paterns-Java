package com.designpatterns;

public class User {
    public String name;
    public int age;

    public User(String name, int age){
        this.name=name;
    }
    public void sayHello(){
        System.out.println("Hi am " + name);
    }
}
