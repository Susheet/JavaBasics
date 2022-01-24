package com.company;

class Point{
    double x;
    double y;

    //parameterised constructor
    Point(double a, double b){
        x = a;
        y = b;
    }

    void show(){
        System.out.println("x = " + x + " " + "y = " + y);
    }
}


public class ParamConstruct {
    public static void main(String[] args){
        Point p = new Point(10,20);
        p.show();
    }
}
