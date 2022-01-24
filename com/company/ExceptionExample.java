package com.company;

public class ExceptionExample {
    public static void main(String[] args){
        try{
            int arr[] = {1,2,3,4,5};
            int x = arr[5]*2;
            System.out.println("not ru");
        }

        catch(ArrayIndexOutOfBoundsException obj){
            System.out.println("exception of Array Index");
            System.out.println(obj);
        }

        catch(IndexOutOfBoundsException obj){
            System.out.println("exception of Index");
            System.out.println(obj);
        }
    }
}
