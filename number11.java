
package com.mycompany.networklab2;
import java.net.*;

public class number11 {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.facebook.com/24GhantaNepal");
        System.out.println("Protocol: " + url.getProtocol());
        System.out.println("Host: " + url.getHost());
        System.out.println("Port: " + url.getPort());
        System.out.println("Path: " + url.getPath());
        System.out.println("Query: " + url.getQuery());
        System.out.println("Ref: " + url.getRef());
    }
}
