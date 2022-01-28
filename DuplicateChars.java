package com.company;
import java.util.*;


public class DuplicateChars {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String inp = scn.next();

        HashMap<Character,Integer> h = new HashMap<Character,Integer>();

        if(inp.length() == 0)
            System.out.println("String is empty");
        else{
            char[] a = inp.toCharArray();

            for(int i=0;i<inp.length();i++)
            {
                if(h.containsKey(a[i])){
                    h.put(a[i],h.get(a[i])+1);
                }
                else{
                    h.put(a[i],1);
                }
            }
            //h.forEach((k,v) -> System.out.println(k + "  has repeated" + v + " times."));

            Iterator<Character> it= h.keySet().iterator();
            while(it.hasNext())
            {
                char k = it.next();
                if(h.get(k) > 1)
                    System.out.println(k + "  has repeated " + h.get(k) + " times.");
            }
        }

    }
}
