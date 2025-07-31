package com.servo.MultiThreading.Basic;

public class World extends Thread{
    public void run(){
        try {
            Thread.sleep(5000);
            System.out.println("World");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
