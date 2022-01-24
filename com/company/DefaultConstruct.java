package com.company;

class Courses{
    String courseName;
    Courses(){
        courseName = "Java skills";
        System.out.println("Courses are best");
    }
}
public class DefaultConstruct {
    public static void main(String[] args){
        Courses c = new Courses();
    }
}
