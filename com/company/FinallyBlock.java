package com.company;

public class FinallyBlock {
    public static void main(String[] args){
        try{
            System.out.println("I am in try");
            System.exit(1);
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("I am in finally");
        }
    }
}
