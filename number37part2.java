
package com.mycompany.networklab2;
import java.net.*;
import java.nio.*;
import java.nio.channels.*;
import java.util.Scanner;

public class number37part2 {
    public static void main(String[] args) throws Exception {
        InetSocketAddress hostAddress = new InetSocketAddress("localhost", 9999);
        SocketChannel client = SocketChannel.open(hostAddress);

        System.out.println("Connected to Server. Enter message:");
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();

        ByteBuffer buffer = ByteBuffer.wrap(message.getBytes());
        client.write(buffer);
        
        System.out.println("Message sent.");
        client.close(); 
    }
}
