package com.servo.MultiThreading.ThreadCommunication;

class SharedResource{
    private int data;
    private boolean hasData;

    public void produce(int value){
        while(hasData){
            try{
                wait();
            }catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        data = value;
        hasData = true;
        notify();
    }

    public int consume(){
        while(!hasData){
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        hasData = false;
        return data;
    }

}

class Producer implements Runnable{

    private SharedResource resource;

    public Producer(SharedResource resource){
        this.resource = resource;
    }
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            resource.produce(i);
        }
    }
}


class Consumer implements Runnable{

    private SharedResource resource;

    public Consumer(SharedResource resource){
        this.resource = resource;
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            int value = resource.consume();
            System.out.println("Resource Consumed : " + value);
        }
    }

}

public class ThreadCommunication
{
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Thread ProduceThread = new Thread(new Producer(resource));
        Thread ConsumeThread = new Thread(new Consumer(resource));
        ProduceThread.start();
        ConsumeThread.start();
    }
}
