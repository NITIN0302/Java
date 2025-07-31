package com.servo.MultiThreading.Locks;

public class Main {
    public static void main(String[] args){
//        Balance sbi = new Balance();
//        Runnable task = new Runnable() {
//            @Override
//            public void run() {
//                sbi.withDrawl(50);
//            }
//        };
//
//        Thread t1 = new Thread(task);
//        Thread t2 = new Thread(task);
//        t1.start();
//        t2.start();


        BalanceLock sbi = new BalanceLock();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                sbi.withDrawl(50);
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();
    }
}
