package com.servo.Polymorphism;

public class Parent
{
    public void PrintDetails(){
        System.out.println("Parent Details Are Printed");
    }

    //    This is not function overloading this will throw error

    //     public String PrintDetails(){
    //         System.out.println("Parent Details Are Printed");
    //     }

    public String PrintDetails(String name){
        System.out.println("Parent name is : " + name);
        return name;
    }
}
