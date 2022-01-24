package com.company;

import java.io.File;
import java.io.Serializable;
import java.io.*;

class test1 implements Serializable{
    int i;
}

public class SerializableExample {
    public static void main(String[] args) throws Exception{
        test1 obj = new test1();
        obj.i = 12;

        File f = new File("obj.txt");
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);

        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);

        test1 obja = (test1)ois.readObject();
        System.out.println("value : " + obja.i);
    }
}
