package com.servo.Reflection;

public class Cat
{
    private String name;
    public String breed;

    public Cat(){}
    public Cat(String name,String breed){
        this.name = name;
        this.breed = breed;
    }

    private void meow(){
        System.out.println("Meow");
    }

    public void getName(String people){
        System.out.println(people);
    }
}
