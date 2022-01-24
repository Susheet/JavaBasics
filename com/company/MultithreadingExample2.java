package com.company;

class Test implements Runnable{
    public void run(){
        for(int i=0;i<5;i++)
            System.out.println("Test Thread");
    }
}

public class MultithreadingExample2 {
    public static void main(String[] args){
        Test t = new Test();
        Thread obj = new Thread(t);
        obj.start();
        for(int i=0;i<5;i++)
            System.out.println("Main thread");
    }
}
