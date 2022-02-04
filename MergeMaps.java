package com.company;
import java.util.*;

public class MergeMaps {
    public static void main(String[] args){
        HashMap<Character,Integer> mp1 = new HashMap<Character,Integer>();
        HashMap<Character,Integer> mp2 = new HashMap<Character,Integer>();
        HashMap<Character,Integer> mp3 = new HashMap<Character,Integer>();
        HashMap<Character,Integer> filteredmap = new HashMap<Character,Integer>();

        for(int i=1;i<=5;i++){
            char c = (char)(64+i);
            mp1.put(c,i);
        }

        for(int i=6;i<=10;i++){
            char c = (char)(64+i);
            mp2.put(c,i);
        }

        mp3.putAll(mp1);
        mp3.putAll(mp2);

        System.out.println(mp3);

        for(Map.Entry<Character,Integer> m : mp3.entrySet()){
            if(m.getValue()%2 == 0)
                filteredmap.put(m.getKey(),m.getValue());
        }

        System.out.println(filteredmap);
    }

}
