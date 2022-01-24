package com.company;

class A1 extends Thread{
    public void run(){
        for(int i=0;i<5;i++)
            System.out.println("A 's " + i);

        System.out.println("Exiting A");
    }
}

class B1 extends Thread{
    public void run(){
        for(int i=0;i<5;i++)
            System.out.println("B 's " + i);

        System.out.println("Exiting B");
    }
}

public class Multithreadingexample {
    public static void main(String[] args){
        A1 obja = new A1();
        B1 objb = new B1();

        obja.start();
        objb.start();
    }

}
