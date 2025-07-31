package com.servo.MultiThreading.Synchronization;

public class Counter {
    private int count = 0;

    // Synchronized keyword restrict the access of value to one thread at a time.
    // If one thread running the increment function then the other thread will wait.
    public synchronized void increment(){
        count = count + 1;
        // If I want to make a certain section in the code to be Synchronized then we can
        // declare a Synchronized block inside we can add certain section of code to be Synchronized
        synchronized(this){

        }
    }

     
    public int getCount(){
        return count;
    }
}
