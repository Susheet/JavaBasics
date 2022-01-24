package com.company;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class client {
    public static void main(String[] args) throws Exception{
        int n,temp;
        Scanner sc = new Scanner(System.in);
        Socket s = new Socket("192.168.1.40",1211);
        Scanner sc1 = new Scanner(s.getInputStream());
        System.out.println("enter no:");
        n = sc.nextInt();
        PrintStream p = new PrintStream(s.getOutputStream());
        p.println(n);
        temp = sc1.nextInt();
        System.out.println(temp);
    }
}
