package com.company;

import java.lang.reflect.Array;

public class MultipleException {
    public static void main(String[] args){
        try{
            int a[] = new int[5];
            a[5] = 30/0;
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic expression occurs");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out of Bounds exception occurs");
        }
        catch(Exception e){
            System.out.println("General exception occurs");
        }
        System.out.println("Rest code");
    }
}
