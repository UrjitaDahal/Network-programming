package com.mycompany.networklab2;

import java.net.*;
import java.io.*;

public class Number44 {
    public static void main(String[] args) {
        try {
            InetAddress group = InetAddress.getByName("224.0.0.1");
            MulticastSocket ms = new MulticastSocket(4446);
            
            
            NetworkInterface ni = NetworkInterface.getByInetAddress(InetAddress.getLocalHost());
            InetSocketAddress groupAddress = new InetSocketAddress(group, 4446);
            
            ms.joinGroup(groupAddress, ni);
            
            System.out.println("Sniffer is running... waiting for multicast messages...");
            
            byte[] buf = new byte[1024];
            while (true) {
                DatagramPacket p = new DatagramPacket(buf, buf.length);
                ms.receive(p); 
                String received = new String(p.getData(), 0, p.getLength());
                System.out.println("Sniffed Data: " + received);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}