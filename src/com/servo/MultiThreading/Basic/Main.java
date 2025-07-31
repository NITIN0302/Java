package com.servo.MultiThreading.Basic;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        World w = new World();
        w.start();
        w.join(); //Will wait for the w thread to complete then it will start the execution of
        for(int i=0;i<10;i++){
            System.out.println("Main" + i);
        }
    }
}
