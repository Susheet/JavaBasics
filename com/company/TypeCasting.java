package com.company;

public class TypeCasting {

    public static void main(String[] args){
        byte b;
        int i = 65;
        double d = 1234.567;
        float f = 34.56f;
        char c = 'A';

        c = (char)i; //explicit type casting as c is 2 bytes smaller than i 4 bytes;
        System.out.println("i = " + i + " " + "c = " + c);

        i = (int)d;
        System.out.println("d = " + d + " i = " + i);

        i = (int)f;
        System.out.println("f = " + f + " i = " + i);

        b = (byte)d;
        System.out.println("b = " + b + " d = " + d);

        d = i; //implicit type casting as d is 8 bytes larger than i 4 bytes smaller
        System.out.println("d = " + d + " i = " + i);
    }
}
