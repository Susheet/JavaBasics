package com.company;

public class AccessModifierExample {
    public static void main(String[] args){
        MyEmployee e1 = new MyEmployee();
        e1.id = 1;
        e1.name = "Susheet";

        //e1.salary;
        e1.setSalary(1000);
        int s = e1.getSalary();
        System.out.println(s);
    }
}

