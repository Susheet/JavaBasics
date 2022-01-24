package com.company;

public class stringStoreDiffer {
    public static void main(String[] args){
        String name = "Java";
        String newName = "Java";

        if( name == newName)
            System.out.println("same");

        String myName = new String("Java");
        if (name == myName)
            System.out.printf("same");
        else
            System.out.println("not same");

        name = "Python";
        if( name == newName)
            System.out.println("same");

    }
}
