package com.company.Thread;

class MyThread3 implements Runnable
{
    @Override
    public void run() {
        for(int i=1;i<=5;i++)
            System.out.println(i);
    }
}

public class ThreadDemo3 {
    public static  void main(String[] args){
        MyThread3 th = new MyThread3();
        Thread th1 = new Thread(th);
        th1.start();



    }
}
