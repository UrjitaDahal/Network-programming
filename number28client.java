
package com.mycompany.networklab2;
import java.io.*;
import java.net.*;
import java.util.Scanner;
public class number28client {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost", 1234);
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        Scanner sc = new Scanner(System.in);

        String clientMsg, serverMsg;
        while (true) {
            System.out.print("Client: ");
            clientMsg = sc.nextLine();
            out.println(clientMsg);
            if (clientMsg.equalsIgnoreCase("bye")) break;

            if ((serverMsg = in.readLine()) != null) {
                System.out.println("Server: " + serverMsg);
                if (serverMsg.equalsIgnoreCase("bye")) break;
            }
        }
        s.close();
    }
}
