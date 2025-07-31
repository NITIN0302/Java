package com.servo.MultiThreading.Locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BalanceLock {
    public int balance = 100;

    public final Lock lock = new ReentrantLock();

    public synchronized void withDrawl(int amount) {
        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                if (balance >= amount) {
                    try {
                        Thread.sleep(3000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " Completed Withdrawl " + balance);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    } finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + " Insufficient balance");
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " Lock not accuired");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
