package com.servo.Collections;

public class Human implements Cloneable {
    public String name;
    public int age;

    public Human(int age,String name){
        this.name = name;
        this.age = age;
    }

    public void printDetails(){
        System.out.println(this.age + " " + this.name);
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
