package com.company;

class Course{
    String courseName;
    int videoCount;
}

public class ArrayOfObjects {
    public static void main(String[] args){
        Course[] c;
        c = new Course[3];

        c[0] =  new Course();
        c[0].courseName = "java";
        c[0].videoCount = 70;

        c[1] =  new Course();
        c[1].courseName = "Python";
        c[1].videoCount = 50;

        c[2] =  new Course();
        c[2].courseName = "C++";
        c[2].videoCount = 60;
        
        for(int i=0; i < c.length;i++){
            System.out.println("Courses : " + c[i].courseName + " " + "videoCount: " + c[i].videoCount);
        }
    }
}
