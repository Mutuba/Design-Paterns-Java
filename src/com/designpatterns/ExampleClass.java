package com.designpatterns;

import java.util.ArrayList;
import java.util.List;

public class ExampleClass {

    public static void main(String[] args) {

        //Element is String, Integer,or other primitive type
        List<String> sList = new ArrayList<String>();
        sList.add("string1");
        sList.add("string2");
        System.out.println(sList);

        //Element is custom type
        Student st1=new Student(15,"Tom");
        Student st2=new Student(16,"Kate");
        List<Student> stList=new ArrayList<Student>();
        stList.add(st1);
        stList.add(st2);
        // overridden toString() is called for representation
        System.out.println(stList);
    }
}

// expected output

//[string1, string2]
//[student Tom age:15, student Kate age:16]
