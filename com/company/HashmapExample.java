package com.company;
import java.util.HashMap;

public class HashmapExample {
    public static void main(String[] args)
    {
        HashMap<String,Integer> happy = new HashMap<String,Integer>();
        happy.put("a",10);
        happy.put("b",3);
        happy.put("c",88);

        System.out.println(happy);
        System.out.println(happy.get("c"));

        HashMap<String,String> fun = new HashMap<String,String>();
        fun.put("Sk","fun");
        fun.put("Dk","fun2");
        fun.put("Pk","123");

        System.out.println(fun.containsValue("123"));
     }
}
