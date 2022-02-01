package com.company;
import java.util.*;
public class Add2No {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();

        int no_of_digit = 7;
//        int temp1 = a;
//        int temp2 = b;
//        int count = 0,count2=0;
//
//        while(temp1/10 > 0){
//            count ++;
//            temp1 /= 10;
//        }
//        while(temp2/10 > 10){
//            count++;
//            temp2 /= 10;
//        }
//
//        no_of_digit = (count > count2) ? count: count2;
//
        int sum = a + b;

        String str = String.format("%0"+no_of_digit+"d",sum);
        System.out.println(str);
    }
}
