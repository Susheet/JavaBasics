package com.company.Thread;

class MyThread extends Thread{

    public void run(){
//        int c;
//        c = 10/0;

        Thread th = Thread.currentThread();
        String name = th.getName();

        for(int i=0;i<=5;i++) {
            System.out.println(i + " " + name);
            try {
                Thread.sleep(250);
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}

public class ThreadDemo1 {
    public static void main(String[] args){
        MyThread th1 = new MyThread();
        //MyThread th2 = new MyThread();
        //th1.run();
        //th2.start();
        th1.start();
        Thread th = Thread.currentThread();
        String name = th.getName();
        for(int i=0;i<=5;i++)
        {
            System.out.println(i + " " + name);
            try {
                Thread.sleep(250);
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }

        }

    }
}
