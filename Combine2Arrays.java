package com.company;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Combine2Arrays {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();

        a.add(1);
        a.add(5);
        a.add(2);

        ArrayList<Integer> b = new ArrayList<>();

        b.add(3);
        b.add(6);
        b.add(4);

        a.addAll(b);
        System.out.println("Combined array"+a);

        Collections.sort(a);
        System.out.println("Sorted array" + a);

        //filtering an arraylist
        a.removeIf(n -> (n % 2 != 0));
        System.out.println(a);
    }
}
