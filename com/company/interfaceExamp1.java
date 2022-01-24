package com.company;

interface meraInterface{
    void fun();
}

class myClass1 implements  meraInterface{
    public void fun(){
        System.out.println("in class 1");
    }
}

class myClass2 implements  meraInterface{
    public void fun(){
        System.out.println("in class 2");
    }
}

public class interfaceExamp1 {
    public static void main(String[] args){
        meraInterface obj = new myClass1();
        obj.fun();
        obj = new myClass2();
        obj.fun();
    }
}
