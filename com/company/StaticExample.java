package com.company;

class StaticDemo{
    static void staticfunc(){
        System.out.println("this is the static function");
    }
}

public class StaticExample {
//    static{
//        System.out.println("static block");
//    }
    public static void main(String[] args){
        StaticDemo.staticfunc();

        StaticDemo sd = new StaticDemo();
        sd.staticfunc();
    }

}
