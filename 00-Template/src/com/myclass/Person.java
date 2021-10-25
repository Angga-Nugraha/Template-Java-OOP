package com.myclass;

public class Person {
    public String name;
    public int pass;

    //constructor
    public Person(String iName, int iPass){
        this.name = iName;
        this.pass = iPass;
    }
    
    public void show(){
        System.out.println(this.name);
        System.out.println(this.pass);
    }
}
