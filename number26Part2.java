package com.mycompany.networklab2;
import java.io.*;
import java.net.*;
public class number26Part2 {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 9999);
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        out.println("Hello Echo");
        System.out.println("Server said: " + in.readLine());
    }
}
