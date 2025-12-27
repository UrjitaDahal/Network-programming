
package com.mycompany.networklab2;
import java.io.*;
import java.net.*;
import java.util.Scanner;
public class number28server {
   public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(1234);
        System.out.println("Server waiting for client...");
        Socket s = ss.accept();
        
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        Scanner sc = new Scanner(System.in);

        String clientMsg, serverMsg;
        while (true) {
            if ((clientMsg = in.readLine()) != null) {
                System.out.println("Client: " + clientMsg);
                if (clientMsg.equalsIgnoreCase("bye")) break;
            }
            System.out.print("Server: ");
            serverMsg = sc.nextLine();
            out.println(serverMsg);
            if (serverMsg.equalsIgnoreCase("bye")) break;
        }
        s.close();
        ss.close();
    } 
}
