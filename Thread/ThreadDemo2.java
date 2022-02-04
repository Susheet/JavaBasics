package com.company.Thread;

class MyThread2 extends Thread{

    public void run(){

        try{
            this.join(); //calling and executing thread is same ie Thread0 ; This is deadlock
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }

        for(int i=1;i<=5;i++) {
            System.out.println(i+" "+Thread.currentThread().getName());
        }
    }
}

public class ThreadDemo2 {
    public static void main(String[] args) throws InterruptedException{
        MyThread2 th2 = new MyThread2();
        th2.start();
        th2.join();
        for(int i=1;i<=5;i++){
            System.out.println(i+" "+Thread.currentThread().getName());
        }
    }
}
