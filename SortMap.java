package com.company;
import java.util.*;
import java.util.stream.Collectors;

public class SortMap {
    public static void main(String[] args){
        HashMap<Character,Integer> h = new HashMap<Character,Integer>();

        for(int i=1;i<=10;i++)
        {
            char c = (char) ((64+i));
            h.put(c,i);
        }
        System.out.println(h);

        Set<Map.Entry<Character, Integer>>  es = h.entrySet();
        List<Map.Entry<Character, Integer>> l = new ArrayList<>(es);

        Collections.sort(l, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {

                return o1.getValue().compareTo(o2.getValue());
            }
        });

        l.forEach(s->{
            System.out.println(s.getKey() + " " + s.getValue());
        });

        Map<Object,Object> result = l.stream().filter(map->map.getValue() >= 5)
                .collect(Collectors.toMap(map->map.getKey(),map->map.getValue()));

        System.out.println(result);
    }
}
