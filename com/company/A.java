package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class A {
    public static void main(String args[]) throws Exception{
        System.out.println("Enter your name");
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        String name = obj.readLine();

        System.out.println(name);

    }

}
