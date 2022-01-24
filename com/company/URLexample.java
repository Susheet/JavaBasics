package com.company;

import java.net.URL;

public class URLexample {
    public static void main(String[] args) throws Exception{
        URL obj = new URL("https://www.knowledgegate.in/index.html");

        System.out.println(obj.getProtocol());
        System.out.println(obj.getHost());
        System.out.println(obj.getPort());
        System.out.println(obj.getFile());
    }
}
