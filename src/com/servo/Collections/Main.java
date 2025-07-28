package com.servo.Collections;

public class Main{
    public static void main(String[] args) throws CloneNotSupportedException {
        Human h1 = new Human(12,"Shubham");
        h1.printDetails();
        Human h2 = (Human)h1.clone();
        h2.printDetails();
    }
}
