package com.company;

abstract class Shape{
    double s1,s2;
    Shape(double a, double b){
        s1 = a;
        s2 = b;
    }
    abstract double area();
}

class Rectangle extends Shape{
    Rectangle(double a, double b){
        super(a,b);
    }
    double area(){
        return s1*s2;
    }
}

class Triangle extends Shape{
    Triangle(double a,double b){
        super(a,b);
    }
    double area(){
        return 0.5*s1*s2;
    }

}

public class Abstract_example2 {
    public static void main(String[] args){
        Shape obj = new Rectangle(5,10);
        System.out.println("area of rectangle = " + obj.area());

        obj = new Triangle(5,10);
        System.out.println("area of triangle = " + obj.area());
    }
}
