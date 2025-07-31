package com.servo.MultiThreading.ExecutorFrameWork;

import java.util.concurrent.*;

public class ExecutorFrame {

    public static int factorial(int number){
        int i = 1;
        int res = 1;
        while(i <= number){
            res *= i;
            i++;
        }
        return res;
    }
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(10);
        for(int i=0;i<10;i++){
            int finalI = i;
            executor.submit(()->{
                long result = factorial(finalI);
                System.out.println("Factorail of " + finalI + " " + result);
            });
        }
        executor.shutdown();
        long end = System.currentTimeMillis();
        try {
            executor.awaitTermination(100,TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Total Time : " + (end - start));
    }
}
