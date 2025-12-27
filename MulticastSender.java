package com.mycompany.networklab2;

import java.net.*;
//number44
public class MulticastSender {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();
        String message = "Hello Multicast Group!";
        byte[] buf = message.getBytes();
        
        InetAddress group = InetAddress.getByName("224.0.0.1");
        DatagramPacket p = new DatagramPacket(buf, buf.length, group, 4446);
        
        System.out.println("Sending message to multicast group...");
        ds.send(p);
        ds.close();
    }
}