package com.company;
import java.util.*;

public class FourthLargestNo {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        ArrayList<Integer> inp = new ArrayList<Integer>();
        System.out.println("Enter numbers:");
        while(scn.hasNextInt()){
            inp.add(scn.nextInt());
        }
        Collections.sort(inp);

        System.out.println(inp.get(inp.size() - 4));
    }
}
