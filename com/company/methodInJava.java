package com.company;

class Sum{
    public int sum(int a,int b){
        return a+b;
    }
}


public class methodInJava {
    public static void main(String[] args){
        Sum obj = new Sum();
        int sum = obj.sum(5,10);
        System.out.println("sum = " + sum);

    }
}
