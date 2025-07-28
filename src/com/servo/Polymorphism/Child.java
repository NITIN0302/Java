package com.servo.Polymorphism;

public class Child extends Parent{
    @Override
    public void PrintDetails(){
        System.out.println("Child Details Are Printed");
    }

    @Override
    public String PrintDetails(String name){
        System.out.println("Child name :" + name);
        return name;
    }
}
