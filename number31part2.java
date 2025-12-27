
package com.mycompany.networklab2;
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class number31part2 {
    public static void main(String[] args) {
      
        try (Socket socket = new Socket("localhost", 8888)) {
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            DataInputStream in = new DataInputStream(socket.getInputStream());
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a number to check if it's Prime: ");
            int number = sc.nextInt();

           
            out.writeInt(number);

           
            boolean isPrime = in.readBoolean();

            if (isPrime) {
                System.out.println(number + " is a Prime Number.");
            } else {
                System.out.println(number + " is NOT a Prime Number.");
            }

        } catch (IOException e) {
            System.out.println("Client Error: " + e.getMessage());
        }
    }
}
