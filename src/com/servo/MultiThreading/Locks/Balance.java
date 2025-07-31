package com.servo.MultiThreading.Locks;

public class Balance {
    public int balance = 100;

    // This is the example of intrinsic lock
    public synchronized void withDrawl(int amount){
        if(balance >= amount) {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " Completed Withdrawl " + balance);
        }
        else{
            System.out.println(Thread.currentThread().getName() + " Insufficient balance");
        }



    }
}
