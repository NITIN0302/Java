package com.servo.Polymorphism;

public class Main {
    public static void main(String[] args){
        Parent ch = new Child();
        ch.PrintDetails();

        /*
           Here the PrintDetails in the child class will run
           because right side is Child it will handle the versioning
        */
    }
}
