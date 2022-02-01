package com.company;
import java.util.*;

public class SumNum {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        //to avoid any kind of overflow
        if(n%2 == 0)
            System.out.println((n/2)*(n+1));
        else
            System.out.println(((n+1)/2)*n);
    }
}
