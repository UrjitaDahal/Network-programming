
package com.mycompany.networklab2;

import java.net.*;
public class number38part1 {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(7000);
        byte[] buf = new byte[1024];
        while(true) {
            DatagramPacket p = new DatagramPacket(buf, buf.length);
            ds.receive(p);
            ds.send(new DatagramPacket(p.getData(), p.getLength(), p.getAddress(), p.getPort()));
        }
    }
}
