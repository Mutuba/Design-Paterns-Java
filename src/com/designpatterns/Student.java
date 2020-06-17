package com.designpatterns;

public  class Student{
    private int age;
    private String name;

    public Student(int age, String name){
        this.age=age;
        this.name=name;
    }
    // returns the format when instnace is called in sout.
    @Override
    public String toString(){
        return "student "+name+", age:" +age;
    }
}
