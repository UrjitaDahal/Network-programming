
package com.mycompany.networklab2;
import java.net.*;
import java.io.*;

public class number33 {
    public static void main(String[] args) {
        try {
            
            ServerSocket serverSocket = new ServerSocket();

           
            serverSocket.setReuseAddress(true);

           
            serverSocket.setReceiveBufferSize(64 * 1024);

            
            serverSocket.setSoTimeout(10000);

           
            serverSocket.bind(new InetSocketAddress(5555));

            System.out.println("--- Server Socket Options Set ---");
            System.out.println("Server listening on port 5555...");
            System.out.println("SO_REUSEADDR: " + serverSocket.getReuseAddress());
            System.out.println("Receive Buffer Size: " + serverSocket.getReceiveBufferSize());
            System.out.println("Accept Timeout: " + serverSocket.getSoTimeout());

           
            try {
                Socket client = serverSocket.accept();
                System.out.println("Client connected!");
                client.close();
            } catch (SocketTimeoutException e) {
                System.out.println("Timed out waiting for a client connection.");
            }

            serverSocket.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
