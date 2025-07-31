package com.servo.MultiThreading.Basic;

public class Hello implements Runnable{
    @Override
    public void run() {
        for(;;){
            System.out.println("Hello");
        }
    }
}
