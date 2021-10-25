package com.myclass;

public class User {
    String name;
    int pass;

    //constructor
    public User(String iName, int iPass){
        this.name = iName;
        this.pass = iPass;
    }
    
    public void show(){
        System.out.println(this.name);
        System.out.println(this.pass);
    }
}
