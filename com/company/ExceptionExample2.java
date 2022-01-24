package com.company;

public class ExceptionExample2 {
    public static void main(String[] args){
        try{
            int data = 50/0;
            System.out.println("rest code");
        }
        catch(ArithmeticException e){
            System.out.println("arithmetic exception "+e);
        }
        catch(Exception e){
            System.out.println("general exception" + e);
        }

        System.out.println("End code");
    }

}
