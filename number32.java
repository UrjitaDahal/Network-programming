
package com.mycompany.networklab2;
import java.net.*;
import java.io.*;

public class number32 {
    public static void main(String[] args) {
        try {
           
            Socket socket = new Socket();

           
            socket.setSoTimeout(5000);

            
            socket.setTcpNoDelay(true);

            
            socket.setKeepAlive(true);

           
            socket.setSoLinger(true, 30);

            
            System.out.println("Connecting to google.com...");
            socket.connect(new InetSocketAddress("www.google.com", 80));

            
            System.out.println("--- Client Socket Options Set ---");
            System.out.println("TCP_NODELAY: " + socket.getTcpNoDelay());
            System.out.println("SO_TIMEOUT: " + socket.getSoTimeout());
            System.out.println("SO_KEEPALIVE: " + socket.getKeepAlive());
            System.out.println("SO_LINGER: " + socket.getSoLinger());

            socket.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
