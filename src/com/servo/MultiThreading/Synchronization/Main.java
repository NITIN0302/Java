package com.servo.MultiThreading.Synchronization;

public class Main {
    public static void main(String[] args){
        Counter counter = new Counter();
        MyThread mt1 = new MyThread(counter);
        MyThread mt2 = new MyThread(counter);
        mt1.start();
        mt2.start();
        try{
            mt1.join();
            mt2.join();
        }catch(InterruptedException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println(counter.getCount());
    }


}
