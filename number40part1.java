
package com.mycompany.networklab2;

import java.net.*;
public class number40part1 {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(5000);
        byte[] buf = new byte[1024];
        while(true) {
            DatagramPacket p = new DatagramPacket(buf, buf.length);
            ds.receive(p);
            System.out.println("Client: " + new String(p.getData(), 0, p.getLength()));
        }
    }
}
