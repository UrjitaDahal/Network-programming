
package com.mycompany.networklab2;
import java.io.*;
import java.net.*;
public class number27Part2 {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 1313);
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        System.out.println("Current time: " + in.readLine());
    }
}
