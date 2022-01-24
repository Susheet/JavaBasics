package com.company;

abstract class AbstractBaseClass{
    abstract void fun();
}

class Derivedclass extends AbstractBaseClass{
    void fun(){
        System.out.println("welcome");
    }
}

public class Abstract_example {
    public static void main(String[] args){
        Derivedclass obj = new Derivedclass();
        obj.fun();

        //reference var for abstract
        AbstractBaseClass abs;
        abs = obj;
        abs.fun();
    }
}
