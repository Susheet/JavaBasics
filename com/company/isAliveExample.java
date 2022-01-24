package com.company;

class Alive extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Is this thread alive: " + isAlive());
        }
        System.out.println("Exiting Alive class");
    }
}

public class isAliveExample {
    public static void main(String[] args){
        Alive obj = new Alive();

        obj.start();
        try{
            obj.join();
        }
        catch(Exception e){}
        System.out.println("Object alive or not : " + obj.isAlive());
    }
}
