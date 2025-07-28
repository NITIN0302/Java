package com.servo.Abstract;

public class Main {
    public static void main(String[] args){

    //   Parent p = new Parent(); this is not allowed however we can call
    //   the constructor of the parent class using the super keyword from
    //   Child class constructor
        Child ch = new Child();
        ch.PrintData();
        ch.getDetails();
    }
}
