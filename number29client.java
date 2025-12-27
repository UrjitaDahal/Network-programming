
package com.mycompany.networklab2;
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class number29client {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost", 5000);
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        DataInputStream in = new DataInputStream(s.getInputStream());
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for factorial: ");
        int num = sc.nextInt();
        
        out.writeInt(num); 
        long result = in.readLong();
        System.out.println("Factorial from Server: " + result);
        
        s.close();
    }
}
